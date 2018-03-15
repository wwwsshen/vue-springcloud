package org.ec.mh.dao.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;


public interface RoleAndRolePermMapper {
	/**
	 * 批量删除
	 * */
	int bactchDeleteRoles(
            @Param("roleIds")
                    String[] roleIds);
	
	/**
	 * 根据id查找角色
	 * */
	Map<String, Object> findRoleById(
            @Param("id")
                    String roleId);
	
	/**
	 * 通过角色名字以及限制显示的条件来查询角色信息
	 * */
	List<Map<String, Object>> findRolesWithLimit(
            @Param("roleName")
                    String roleName,
            @Param("roleType")
                    Byte roleType,
            @Param("orgCode")
                    String orgCode,
            @Param("start")
                    int start,
            @Param("end")
                    int end);
}
