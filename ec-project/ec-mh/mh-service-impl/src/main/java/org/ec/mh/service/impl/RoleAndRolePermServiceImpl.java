package org.ec.mh.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.ec.mh.dao.mapper.PermAssignMapperExtra;
import org.ec.mh.dao.mapper.PermissionPointMapperExtra;
import org.ec.mh.dao.mapper.RoleAndRolePermMapper;
import org.ec.mh.dao.mapper.RoleMapper;
import org.ec.mh.dto.LimitShowDTO;
import org.ec.mh.dto.RoleAndPermDTO;
import org.ec.mh.dto.RolePermissionPointDTO;
import org.ec.mh.entity.AppModuleAssignment;
import org.ec.mh.entity.LoginInfoDTO;
import org.ec.mh.entity.PermissionAssign;
import org.ec.mh.entity.Role;
import org.ec.mh.service.RoleAndRolePermService;
import org.ec.utils.JSONUtil;
import org.ec.utils.StringUtil;
import org.ec.utils.SystemConstants;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Service
public class RoleAndRolePermServiceImpl implements RoleAndRolePermService {
	@Resource(name="roleMapper")
	private RoleMapper roleMapper;
	
	@Resource(name="roleAndRolePermMapper")
	private RoleAndRolePermMapper roleAndRolePermMapper;
	
	@Resource(name="permAssignMapperExtra")
	private PermAssignMapperExtra permAssignMapperExtra;
	
	@Resource(name="permissionPointMapperExtra")
	private PermissionPointMapperExtra permissionPointMapperExtra;
	
	// 默认不取反
	private static final Byte DEFAULT_IS_NO = 0;
	
	// moduleCodes的键
	private static final String MODULE_IDS_KEY = "modules";
	/**
	 * 实现逻辑：通过当前userid获取到角色的组织结构id，然后再插入到role表中，
	 * 同时进行角色权限的添加
	 * */
	@Override
	@Transactional
	public boolean addRoleAndRolePerm(RoleAndPermDTO roleAndPermDTO,
									  LoginInfoDTO loginInfoDTO, String pointList) {
		if(roleAndPermDTO.getRoleId()!=null){
			batchInsertRolePerm(roleAndPermDTO.getRoleId(), roleAndPermDTO.getModuleIds(),pointList);
		}
	
		roleAndPermDTO.setRoleId(StringUtil.createTimestamp());
		Role role = roleAndPermDTO.toRole();
		role.setOrgId(loginInfoDTO.getCurOrgId());

		// 影响的行数小于等于0，说明新增失败
		if(roleMapper.insertSelective(role) <= 0)
			return false;
		

		// 进行权限的分配
		batchInsertRolePerm(role.getId(), roleAndPermDTO.getModuleCodes(),pointList);
		//分配app权限
		batchInsertRolePermForApp(role.getId(), roleAndPermDTO.getAppModuleCodes());
		
		return true;
	}
	
	// 新增角色权限
	private int batchInsertRolePerm(String roleId, String[] moduleCodes,String pointList) {
		if (moduleCodes == null) {
			return -1;
		}
		
		List<RolePermissionPointDTO> list =new ArrayList<RolePermissionPointDTO>();
		JSONArray  array = null;
		
		if(pointList!=null){
			array = JSONUtil.parseForegroundJSONArrayStr(pointList);
		}
		
		return permAssignMapperExtra.batchInsertPerm(
				createPermissionAssigns(roleId, moduleCodes,list,array));
	}
	
	/**
	 * 通过角色id与模块id数组生成权限分配实体
	 * */
	private List<PermissionAssign> createPermissionAssigns(String roleId, String[] moduleCodes, List<RolePermissionPointDTO> list, JSONArray  array) {
		List<PermissionAssign> pas = new ArrayList<PermissionAssign>();
		
		for(String moduleCode : moduleCodes) {
			PermissionAssign pa = new PermissionAssign();
			pa.setId(StringUtil.createTimestamp());
			pa.setIsNo(DEFAULT_IS_NO);
			pa.setOwnerType(SystemConstants.OWNER_TYPE_IN_PA_IS_ROLE);
			pa.setOwnerTypeCode(roleId);
			pa.setModuleCode(moduleCode);
			pas.add(pa);
			if(array!=null){
				addPermissionPoint(list,pa,array);
			}
		}
		
		if(list.size()>0)
			permissionPointMapperExtra.addPointForRole(list);
		
		return pas;
	}
	
	/**
	 * 新增app角色权限
	 * @param roleId
	 * @param appModuleCodes
	 * @return
	 */
	private int batchInsertRolePermForApp(String roleId, String[] appModuleCodes) {
		if (appModuleCodes == null) {
			return -1;
		}
		
		return permAssignMapperExtra.batchInsertPermForApp(
				createAppModuleAssignment(roleId, appModuleCodes));
	}
	
	/**
	 * 通过角色id和模块id生成角色
	 * @param roleId
	 * @param appModuleCodes
	 * @return
	 */
	private List<AppModuleAssignment> createAppModuleAssignment(String roleId, String[] appModuleCodes) {

		List<AppModuleAssignment> amas = new ArrayList<>();
		
		for (String appModuleCode : appModuleCodes) {
			
			AppModuleAssignment ama = new AppModuleAssignment();
			ama.setId(StringUtil.createTimestamp());
			ama.setRoleId(roleId);
			ama.setAppModuleId(appModuleCode);
			
			amas.add(ama);
		}
		
		return amas;
	}

	@Override
	@Transactional
	public boolean updateRoleAndRolePerm(RoleAndPermDTO roleAndPermDTO,
			LoginInfoDTO loginInfoDTO,String pointList) {
		Role role = roleAndPermDTO.toRole();
		role.setOrgId(loginInfoDTO.getCurOrgId());
		
		// 更新角色信息
		roleMapper.updateByPrimaryKey(role);
		// 删除之前分配的权限
		updatePermissionPoint(SystemConstants.OWNER_TYPE_IN_PA_IS_ROLE, role.getId());
		permAssignMapperExtra.delePermByOwner(SystemConstants.OWNER_TYPE_IN_PA_IS_ROLE, role.getId());
		//删除app权限
		permAssignMapperExtra.delePermByRole(role.getId());
		
		// 新增现有权限
		batchInsertRolePerm(role.getId(), roleAndPermDTO.getModuleCodes(),pointList);
		//分配app权限
		batchInsertRolePermForApp(role.getId(), roleAndPermDTO.getAppModuleCodes());
		
		
		return true;
	}

	@Override
	@Transactional
	public Map<String, Object> deleteRoleByIds(String[] roleIds) {
		List<String> usedRoles = permAssignMapperExtra.isTakeUp(roleIds);
		List<String> noUsedRoles =  new ArrayList<>();
		Map<String, Object> state = new HashMap<String, Object>();

		if (!usedRoles.isEmpty()) {
			
			//获得没占用角色
			for (int i = 0; i < roleIds.length; i++) {
				if (usedRoles.contains(roleIds[i])) {
					continue;
				}
				
				noUsedRoles.add(roleIds[i]);
			}
			
			//List转为数组
			String[] noUsed = new String[noUsedRoles.size()];	
			for (int i = 0; i < noUsedRoles.size(); i++) {
				noUsed[i] = noUsedRoles.get(i);
			}
			
			roleIds = noUsed;
		}
		
		if (roleIds.length != 0) {
			roleAndRolePermMapper.bactchDeleteRoles(roleIds);
			permissionPointMapperExtra.deletePointByRole(SystemConstants.OWNER_TYPE_IN_PA_IS_ROLE, roleIds);
			permAssignMapperExtra.batchDelePermByOwner(SystemConstants.OWNER_TYPE_IN_PA_IS_ROLE, roleIds);
		}

		state.put("success", roleIds.length);
		state.put("fail", usedRoles.size());
		
		return state;
	}

	@Override
	@Transactional
	public Map<String, Object> findRoleAndPermById(String roleId,LoginInfoDTO loginInfoDTo) {

		Map<String, Object> role = roleAndRolePermMapper.findRoleById(roleId);
		
		if(null == role || !role.containsKey("id") || null == role.get("id"))
			return null;
		
		List<Map<String, Object>> modules = permAssignMapperExtra.
				findModuleIdByOwner(SystemConstants.OWNER_TYPE_IN_PA_IS_ROLE, roleId);
		
		if(modules != null && !modules.isEmpty())
			role.put(MODULE_IDS_KEY, modules);

		return role;
	}

	@Override
	public List<Map<String, Object>> findRolesWithLimit(String roleName,
														LimitShowDTO limitShowDTO, String orgCode) {
		Byte type=SystemConstants.EXTRA_ROLE_TYPE;
		
		if(orgCode.endsWith(SystemConstants.PM_ROLE_ID)){
			type=SystemConstants.EXTRA_ROLE_TYPE;
			if(limitShowDTO.getCurPage()==-1 || limitShowDTO.getLimit()==-1){
				type=SystemConstants.BASE_ROLE_TYPE;
			}
		}
		
		return roleAndRolePermMapper.
				findRolesWithLimit(roleName, type, orgCode, limitShowDTO.calculateStart(), limitShowDTO.getLimit());
	}

	@Override
	public int findCountOfRoles(String roleName, String orgCode) {

		List<Map<String, Object>> roles = 
				roleAndRolePermMapper.findRolesWithLimit(roleName, SystemConstants.EXTRA_ROLE_TYPE, orgCode, -1, -1);
		return roles == null ? 0 : roles.size();
	}

	/**
	 * 获取权限明细
	 */
	@Override
	public List<Map<String, Object>> authorityList(String typeCode) {
		List<Map<String, Object>> result=permAssignMapperExtra.authorityList(typeCode);
		
		//数据整合
		if(result.size()!=0){
			
		}
		
		return null;
	}
	
	/**
	 * 获取用户的所有角色
	 * @param userId
	 * @return
	 */
	@Override
	public String[] getRolesByUserId(String userId) {
		List<Map<String, Object>> roleList = permAssignMapperExtra
				.getRoles(userId);
		
		return roleList.get(0).get("roleId")
				.toString().split(",");
	}

	@Override
	public List<Map<String, Object>> findPermissionPointByOrg(String org,
			LoginInfoDTO userInfo) {
		if(!userInfo.getCurUserid().endsWith(SystemConstants.ADMIN_UID)){
			org=" ";
		}

		String[] roleArray = getRolesByUserId(userInfo.getCurUserid());
		List<Map<String, Object>> moduels =permissionPointMapperExtra.getModuleByRole(org,roleArray );
				
		List<Map<String, Object>> points = permissionPointMapperExtra.getAllPermissionPoint(org, roleArray);

		return getList(moduels,points);
		
	}

	@Override
	public List<Map<String, Object>> findPermissionPointByRole(String roleId,
			LoginInfoDTO userInfo) {
		
		Map<String, Object> role = roleAndRolePermMapper.findRoleById(roleId);
		
		if(null == role || !role.containsKey("id") || null == role.get("id"))
			return null;
		
		List<Map<String, Object>> modules = permissionPointMapperExtra.
				findModuleIdByOwner(SystemConstants.OWNER_TYPE_IN_PA_IS_ROLE, roleId);
		
		List<Map<String, Object>> points = permissionPointMapperExtra.getPermissionPointByOwner(SystemConstants.OWNER_TYPE_IN_PA_IS_ROLE, roleId);	
		
		return getList(modules,points);

	}
	
	private void addToList(List<Map<String, Object>> list,List<Map<String, Object>> source){
		if (source != null) {
			list.addAll(source);
		}
	}
	
	private List<Map<String, Object>>  getList(List<Map<String, Object>>...lists){
		List<Map<String, Object>> list = new ArrayList<>();
		for(int i=0;i<lists.length;i++){
			addToList(list,lists[i]);
		}
		
		return list;
	}
	
	public void updatePermissionPoint(String type,String code){
		permissionPointMapperExtra.deletePointByOwner(type, code);
	}
	
	private void addPermissionPoint(List<RolePermissionPointDTO> list,PermissionAssign pa,JSONArray  array){
		for(int i=0;i<array.size();i++){
			if(pa.getModuleCode().equals(array.getJSONObject(i).getString("moduleCode"))){
				RolePermissionPointDTO p = (RolePermissionPointDTO)JSONObject.toJavaObject(array.getJSONObject(i), RolePermissionPointDTO.class);
				p.setId(StringUtil.createTimestamp());
				p.setAssignId(pa.getId());
				list.add(p);
			}
		}	
	}

	@Override
	public List<Map<String, Object>> findPermissionPointList(String roleId,
			LoginInfoDTO userInfo) {
		
		Map<String, Object> role = roleAndRolePermMapper.findRoleById(roleId);
		
		if(null == role || !role.containsKey("id") || null == role.get("id"))
			return null;
		
		return permissionPointMapperExtra.getPermissionPointByRole(SystemConstants.OWNER_TYPE_IN_PA_IS_ROLE, roleId);
	}

	@Override
	public List<Map<String, Object>> getPermissionPointDetail(String roleId,
			LoginInfoDTO userInfo) {
		
		Map<String, Object> role = roleAndRolePermMapper.findRoleById(roleId);
		
		if(null == role || !role.containsKey("id") || null == role.get("id"))
			return null;
		
		List<Map<String, Object>> modules = permissionPointMapperExtra.
				findModuleIdByOwner(SystemConstants.OWNER_TYPE_IN_PA_IS_ROLE, roleId);
		
		List<Map<String, Object>> points = permissionPointMapperExtra.getPermissionPointByRole(SystemConstants.OWNER_TYPE_IN_PA_IS_ROLE, roleId);
		
		return 	convertFormat(modules,points);
	}
		
		private List<Map<String,Object>> convertFormat(List<Map<String, Object>> mo,List<Map<String, Object>> pe){
			for(int i=0;i<mo.size();i++){
				String mouduleCode = mo.get(i).get("moduleCode").toString();
				List<Map<String, Object>> rs = new ArrayList<>();
				for(int j=0;j<pe.size();j++){
					String parentCode = pe.get(j).get("parentCode").toString();
					if(mouduleCode.equals(parentCode)){
						 rs.add(pe.get(j));
					}
				}
				
				mo.get(i).put("children", rs);
			}
			
			return mo;
	}
	
}















