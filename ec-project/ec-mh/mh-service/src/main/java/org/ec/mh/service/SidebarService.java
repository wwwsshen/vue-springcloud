package org.ec.mh.service;

import java.util.List;
import java.util.Map;


import org.ec.mh.entity.LoginInfoDTO;

public interface SidebarService {
	/**
	 * 根据当前登录用户的组织结构id查询该用户所属模块
	 * */
	List<Map<String, Object>> findModuelsByOrg(String org, LoginInfoDTO userInfo, String type);
	
	/**
	 * 根据当前登录用户的组织结构id查询该用户所属pc的模块
	 * */
	List<Map<String, Object>> findModuelsByOrgForPc(String org, LoginInfoDTO loginInfoDTO);
	
	/**
	 * 得到移动端的主要导航
	 * @param org
	 * @param userInfo
	 * @param type
	 * @return
	 */
	List<Map<String, Object>> getMainNavigation(String org, LoginInfoDTO userInfo, int type);
}
