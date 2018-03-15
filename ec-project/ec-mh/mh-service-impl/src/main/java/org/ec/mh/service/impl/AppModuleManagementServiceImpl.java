package org.ec.mh.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import io.swagger.annotations.Authorization;
import org.ec.mh.dao.MHDaoConfiguration;
import org.ec.mh.dao.mapper.AppModuleMapper;
import org.ec.mh.dao.mapper.AppModuleMapperExtra;
import org.ec.mh.dao.mapper.ModuleMapperExtra;
import org.ec.mh.dto.AppModuleDTO;
import org.ec.mh.dto.LimitShowDTO;
import org.ec.mh.entity.AppModule;
import org.ec.mh.entity.AppModuleAssignment;
import org.ec.mh.service.AppModuleManagementService;
import org.ec.mh.service.RoleAndRolePermService;
import org.ec.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class AppModuleManagementServiceImpl implements AppModuleManagementService {
	
	@Resource(name = "appModuleMapper")
	private AppModuleMapper appModuleMapper;
	
	@Resource(name = "appModuleMapperExtra")
	private AppModuleMapperExtra appModuleMapperExtra;
	
	@Resource(name="moduleMapperExtra")
	private ModuleMapperExtra moduleMapperExtra;
	
	//@Resource(name="roleAndRolePermService")
	@Autowired
	private RoleAndRolePermService roleService;
	
	
	@Override
	public List<Map<String, Object>> getAppModules(LimitShowDTO lsDTO, AppModuleDTO amDTO) {
		
		return appModuleMapperExtra.getAppModules(amDTO.getModuleName(), lsDTO.calculateStart(), lsDTO.getLimit());
	}

	@Override
	public int getNumOfAppModule(AppModuleDTO amDTO) {
		List<Map<String, Object>> result = appModuleMapperExtra.getAppModules(amDTO.getModuleName(), -1, -1);
		
		return result == null ? 0 : result.size();
	}

	@Override
	@Transactional
	public boolean addAppModule(AppModuleDTO amDTO) {
		AppModule appModule = appModuleDTO2AppModule(amDTO);
		appModule.setId(StringUtil.createTimestamp());
		return appModuleMapper.insert(appModule) == 1;
	}

	@Override
	@Transactional
	public boolean updateAppModule(AppModuleDTO amDTO) {
		AppModule appModule = appModuleDTO2AppModule(amDTO);
		
		return appModuleMapper.updateByPrimaryKeySelective(appModule) == 1;
	}
	
	private AppModule appModuleDTO2AppModule(AppModuleDTO amDTO) {
		AppModule appModule = new AppModule();
		
		appModule.setId(amDTO.getId());
		appModule.setAppModuleName(amDTO.getModuleName());
		appModule.setSerialNumber(amDTO.getSerialNumber());
		
		return appModule;
	}

	@Override
	public Map<String, Object> getAppModule(String code) {
		
		return appModuleMapperExtra.getAppModule(code);
	}

	@Override
	public List<Map<String, Object>> getAllRoles() {
		
		return appModuleMapperExtra.getAllRoles();
	}

	@Override
	public List<Map<String, Object>> getAllModules() {
		
		return appModuleMapperExtra.getAllModules();
	}

	@Override
	public List<Map<String, Object>> getAssignedModules(String roleId) {
		
		return appModuleMapperExtra.getAssignedModules(roleId);
	}

	@Override
	@Transactional
	public boolean assignModuleToRole(String roleId, String[] ids) {
		appModuleMapperExtra.deleteAppModuleAssignments(roleId);
		if (ids != null && ids.length != 0) {
			List<AppModuleAssignment> list = getAppModuleAssignments(roleId, ids);
			return appModuleMapperExtra.addAppModuleAssignments(list) == ids.length;
		}
		
		return true;
	}
	
	private List<AppModuleAssignment> getAppModuleAssignments(String roleId, String[] ids) {
		List<AppModuleAssignment> list = new ArrayList<>(ids.length);
		for (String id : ids) {
			AppModuleAssignment ama = new AppModuleAssignment();
			ama.setId(StringUtil.createTimestamp());
			ama.setAppModuleId(id);
			ama.setRoleId(roleId);
			list.add(ama);
		}
		
		return list;
	}

	@Override
	@Transactional
	public boolean deleteAppModules(String[] ids) {
		appModuleMapperExtra.deleteAppModuleAssignmentByModuleIds(ids);
		return appModuleMapperExtra.deleteAppModules(ids) >= ids.length;
	}

	/************************重构**********************/
	/**
	 * 2017-10-27
	 * @author songxingguo
	 */
	
	/**
	 * 模块查找
	 */
	@Override
	public Map<String, Object> searchModuleById(String moduleId){
		Map<String, Object> modules = appModuleMapperExtra.search(moduleId);
		if(modules.size()==0)
			return null;
		return modules;
	}
	
	/**
	 * 模块修改
	 */
	@Override
	public boolean updateModule(AppModuleDTO appModuleDTO){
		AppModule module = appModuleDTO.toAppModule();
		//更新信息
		appModuleMapper.updateByPrimaryKeySelective(module);
		return true;
	}

	/**
	 * 模块新增
	 */
	@Override
	public boolean addModule(AppModuleDTO appModuleDTO) {
		if (StringUtil.isNullOrEmpty(appModuleDTO.getParentCode()))
			appModuleDTO.setParentCode(null);
		
		Map<String, Object> maxCode = moduleMapperExtra.findMaxCodeByParentCode(appModuleDTO.getParentCode());
		
		AppModule module = appModuleDTO.toAppModule();
		
		module.setId(StringUtil.createTimestamp());
		if(maxCode !=null && !maxCode.isEmpty())
			module.setModuleCode(BeanUtil.getTreeCode(maxCode.get("maxCode").toString()));
		else
			module.setModuleCode(BeanUtil.getTreeCodeForInit(appModuleDTO.getParentCode()));
		module.setHasChild(SystemConstants.FALSE_0);
		
		//生成层级
		int level = creatLevel0(appModuleDTO.getParentCode());
		module.setLevel0(level);
		//生成是否有孩子
		module.setHasChild((byte)0);
		int newOrder = getMaxShowOrder(appModuleDTO.getParentCode());
		module.setShowOrder(newOrder);
		if(appModuleMapper.insertSelective(module)<=0)
			return false;
		setParentHasChild(appModuleDTO.getParentCode(), (byte) 1);
		return true;
	}

	/**
	 * 模块删除
	 */
	@Override
	public boolean deleteByIdsAndChild(String[] codes) {
		return appModuleMapperExtra.deleteByParent(codes)>0;
	}
	
	/**
	 * 新增的时候寻找最大的序号
	 */
	private int getMaxShowOrder(String parent){
		int num = 0;
		Map<String, Object> findOrder = appModuleMapperExtra.findModule(parent);
		if(findOrder != null && !findOrder.isEmpty())
			num = Integer.parseInt(findOrder.get("showOrder").toString())+1;
		
		return num;
	}
	
	/**
	 * 模块列表中数据上移
	 */
	@Override
	public boolean moveUp(int showOrder,String id,String parentCode){
		if (StringUtil.isNullOrEmpty(parentCode))
			parentCode = null;
		
		Map<String, Object> biggerData = appModuleMapperExtra.findBigger(showOrder,parentCode);
		if(biggerData == null || biggerData.isEmpty())
			return false;
		
		return swapShowOrder(id,showOrder,biggerData.get("id").toString(),Integer.parseInt(biggerData.get("show_order").toString()));
	}
	
	/**
	 * 交换需要上移或下移的两个showOrder的值
	 */
	//@Authorization
	private boolean swapShowOrder(String id, int showOrder, String otherId,
			int otherShowOrder) {
		AppModule module = getModuelForShowOrder(id, otherShowOrder);
		AppModule otherModule = getModuelForShowOrder(otherId, showOrder);
		
		return appModuleMapper.updateByPrimaryKeySelective(module) > 0 
				&& appModuleMapper.updateByPrimaryKeySelective(otherModule) > 0;
	}
	
	private AppModule getModuelForShowOrder(String id, int showOrder) {
		AppModule module = new AppModule();
		module.setId(id);
		module.setShowOrder(showOrder);
		
		return module;
	}
	
	/**
	 * 模块列表中数据下移
	 */
	@Override
	public boolean moveDown(int showOrder, String id, String parentCode) {
		if (StringUtil.isNullOrEmpty(parentCode))
			parentCode = null;
		
		Map<String, Object> smallerData = appModuleMapperExtra.findSmaller(showOrder,parentCode);
		if(smallerData == null || smallerData.isEmpty())
			return false;
		return swapShowOrder(id,showOrder,smallerData.get("id").toString(),Integer.parseInt(smallerData.get("show_order").toString()));
	}
	
	/**
	 * 进入下一级目录
	 */
	@Override
	public List<Map<String, Object>> goNextCatalog(String parentCode,LimitShowDTO limitShowDTO){
		List<Map<String,Object>> modules = appModuleMapperExtra.goNextPage(parentCode, limitShowDTO.calculateStart(), limitShowDTO.calculateEnd());
		System.out.println(modules);
		if (modules.size() > 0) {
			return modules;
		} else {
			return null;
		}
	}
	
	/**
	 * 进入下一级目录并查询进入后符合的数据条数(该方法已失效，无用)
	 */
	@Override
	public Object goNextCatalogNum(String parentCode){		
		List<Map<String, Object>> modules = 
				appModuleMapperExtra.goNextPage(parentCode, -1, -1);
		return modules == null ? 0 : modules.size();
	}
	
	/**
	 * 根据parentCode生成level0
	 * */
	//@Authorization
	private int creatLevel0(String parentCode) {
		if (appModuleMapperExtra.selectLevel0(parentCode).length==0)
			return 0;
		String[] level0 = appModuleMapperExtra.selectLevel0(parentCode);
		return Integer.parseInt(level0[0]);
	}
	
	/**
	 * 修改父节点的hasChild属性
	 * */
	private void setParentHasChild(String parentCode,Byte hasChild) {
		if (parentCode != null)
			appModuleMapperExtra.updateHasChild(parentCode, hasChild);
	}
	
	/**
	 * 查找模块的数量
	 */
	@Override
	public Object findCountOfModules(String moduleName,String parentCode) {
		List<Map<String, Object>> modules = 
				appModuleMapperExtra.findModulesWithLimit(moduleName,parentCode, -1, -1);
		return modules == null ? 0 : modules.size();
	}
	
	/**
	 * 根据条件查找模块
	 */
	@Override
	public List<Map<String, Object>> findModulesWithLimit(String moduleName,String parentCode,
			LimitShowDTO limitShowDTO) {
		
		return appModuleMapperExtra.
				findModulesWithLimit(moduleName,parentCode, limitShowDTO.calculateStart(), limitShowDTO.calculateEnd());
	}

	/**
	 * 判断模块名是否重复
	 * */
	@Override
	public boolean judgeRepition(String moduleName) {
		if (appModuleMapperExtra.judgeRepition(moduleName) == null 
				|| appModuleMapperExtra.judgeRepition(moduleName).size() == 0)
			return true;
		
		return false;
	}

	@Override
	public List<Map<String, Object>> findModules(String moduleName,String level,
			LimitShowDTO limitShowDTO) {
		return appModuleMapperExtra.findModules(moduleName,level,limitShowDTO.calculateStart(), limitShowDTO.calculateEnd());
	}

	@Override
	public Object searchModuleCount(String moduleName,String parentCode) {
		List<Map<String, Object>> modules = 
				appModuleMapperExtra.searchModuleCount(moduleName,parentCode, -1, -1);
		return modules == null ? 0 : modules.size();
	}
	
	@Override
	public List<Map<String, Object>> getAssignedLevel1ModulesByUserId(String userId) {

		return appModuleMapperExtra.getLevel1ModulesByRoleIds(roleService
				.getRolesByUserId(userId));
	}

	@Override
	public List<Map<String, Object>> getAssignedLevel2ModulesByUserId(String userId) {

		return appModuleMapperExtra.getLevel2ModulesByRoleIds(roleService
				.getRolesByUserId(userId));
	}
	
	/**
	 * 获取app端模块
	 * @author songxingguo
	 * @return
	 */
	@Override
	public List<Map<String, Object>> getAppModuels(String userId, 
			String org, String type) {
		List<Map<String, Object>> appModuels = findAppModuelsByUserId(org, userId);
		
		//数据列表展示
		if(appModuels.size()==0 || type.equals(Constant.LIST_FORMAT)){
			return appModuels;
		}
		
		return CommonMethod.convert(appModuels);
	}
	
	/**
	 * 根据userId查找用户的所有app模块
	 * @param org
	 * @param userId
	 * @return
	 */
	private List<Map<String, Object>> findAppModuelsByUserId(String org, String userId) {
		return appModuleMapperExtra
				.findAppModuelsByUserId(org, roleService
						.getRolesByUserId(userId));
	}
	
}
