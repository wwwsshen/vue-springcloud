package org.ec.mh.service;

import java.util.List;
import java.util.Map;

import org.ec.mh.dto.LimitShowDTO;
import org.ec.mh.dto.RoleAndPermDTO;
import org.ec.mh.entity.LoginInfoDTO;

public interface RoleAndRolePermService {
	/**
	 * 新增角色以及角色权限
	 * @param
	 * */
	boolean addRoleAndRolePerm(RoleAndPermDTO roleAndPermDTO, LoginInfoDTO loginInfoDTO, String pointList);
	
	/**
	 * 更新角色以及角色权限
	 * */
	boolean updateRoleAndRolePerm(RoleAndPermDTO roleAndPermDTO, LoginInfoDTO loginInfoDTO, String pointList);

	/**
	 * 删除角色以及角色权限
	 * */
	Map<String, Object> deleteRoleByIds(String[] roleIds);
	
	/**
	 * 通过id查询角色以及角色权限
	 * */
	Map<String, Object> findRoleAndPermById(String roleId, LoginInfoDTO loginInfoDTo);

	/**
	 * 通过角色名字以及限制显示的条件来输出角色信息
	 * */
	List<Map<String, Object>> findRolesWithLimit(String roleName, LimitShowDTO limitShowDTO, String orgCode);

	/**
	 * 获取角色总条数
	 * */
	int findCountOfRoles(String roleName, String orgCode);
	
	/**
	 * 获取权限明细
	 * @param typeCode：登录类型
	 * @return
	 */
	List<Map<String, Object>> authorityList(String typeCode);
	
	/**
	 * 获取用户的所有角色
	 * @param userId
	 * @return
	 */
	String[] getRolesByUserId(String userId);
	
	List<Map<String,Object>> findPermissionPointByOrg(String org, LoginInfoDTO userInfo);
	
	List<Map<String,Object>> findPermissionPointByRole(String roleId, LoginInfoDTO userInfo);
	
	List<Map<String,Object>> findPermissionPointList(String roleId, LoginInfoDTO userInfo);
	
	List<Map<String,Object>> getPermissionPointDetail(String roleId, LoginInfoDTO userInfo);
}
