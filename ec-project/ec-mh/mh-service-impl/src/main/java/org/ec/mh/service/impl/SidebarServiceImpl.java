package org.ec.mh.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.ec.mh.dao.mapper.SidebarMapper;
import org.ec.mh.entity.LoginInfoDTO;
import org.ec.mh.service.AppModuleManagementService;
import org.ec.mh.service.RoleAndRolePermService;
import org.ec.mh.service.SidebarService;
import org.ec.utils.CommonMethod;
import org.ec.utils.Constant;
import org.ec.utils.SystemConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author tanyong
 * */
@Service
public class SidebarServiceImpl implements SidebarService {
	@Resource(name="sidebarMapper")
	private SidebarMapper sidebarMapper;
	
	//@Resource(name="roleAndRolePermService")
	@Autowired
	private RoleAndRolePermService roleService;
	
	//@Resource(name = "appModuleManagementService")
	@Autowired
	private AppModuleManagementService appModuleService;

	@Override
	public List<Map<String, Object>> findModuelsByOrg(String org,
													  LoginInfoDTO userInfo, String type) {
		if(!userInfo.getCurUserid().endsWith(SystemConstants.ADMIN_UID)){
			org=" ";
		}

		List<Map<String, Object>> moduels = getModuels(userInfo
				.getCurUserid(), org, type);
		
		List<Map<String, Object>> appModuels = appModuleService.getAppModuels(userInfo
				.getCurUserid(), org, type);
		
		List<Map<String, Object>> list = new ArrayList<>();

		if (moduels != null) {
			list.addAll(moduels);
		}
		
		if (appModuels != null) {
			list.addAll(appModuels);
		}
		
		return list;
	}
	
	/**
	 * 根据当前登录用户的组织结构id查询该用户Pc所属模块
	 * @author songxingguo
	 * 2017.10.29
	 * */
	@Override
	public List<Map<String, Object>> findModuelsByOrgForPc(String org,
			LoginInfoDTO loginInfoDTO) {
		if(!loginInfoDTO.getCurUserid().endsWith(SystemConstants.ADMIN_UID)){
			org=" ";
		}
		
		List<Map<String, Object>> moduels = getModuels(loginInfoDTO
				.getCurUserid(), org, Constant.HIERARCHICAL_FORMAT);
		
		return moduels;
	}
	
	/**
	 * 获取pc端模块
	 * @author songxingguo
	 * @return
	 */
	private List<Map<String, Object>> getModuels(String userId, 
			String org, String type) {                                       
		
		List<Map<String, Object>> moduels = sidebarMapper
				.findModuelsByOrg(userId, org, roleService
						.getRolesByUserId(userId));
		
		//类型不为0,直接返回否则转换 
		if(moduels.size()==0 || type.equals(Constant.LIST_FORMAT)){
			return moduels;
		}
		
		return CommonMethod.convert(moduels);
	}
	

	/**
	 * 得到移动端的主要导航
	 */
	@Override
	public List<Map<String, Object>> getMainNavigation(String org,
			LoginInfoDTO userInfo, int type) {
		return null;
	}
}
