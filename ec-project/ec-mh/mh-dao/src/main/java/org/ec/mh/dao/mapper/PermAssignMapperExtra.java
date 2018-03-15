package org.ec.mh.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import org.ec.mh.entity.AppModuleAssignment;
import org.ec.mh.entity.PermissionAssign;

/**
 * 额外的权限分配的mapper
 * */
public interface PermAssignMapperExtra {
	/**
	 * 批量插入角色或者组织结构分配的权限
	 * */
	int batchInsertPerm(
            @Param("pas")
                    List<PermissionAssign> pas);
	
	/**
	 * 批量插入角色的app权限
	 * */
	int batchInsertPermForApp(
            @Param("amas")
                    List<AppModuleAssignment> amas);
	
	/**
	 * 通过拥有者删除分配的权限
	 * */
	int delePermByOwner(
            @Param("ownerType")
                    String ownerType,
            @Param("ownerTypeCode")
                    String ownerTypeCode);
	
	/**
	 * 通过角色id删除分配的权限
	 * */
	int delePermByRole(
            @Param("roleId")
                    String roleId);
	
	
	/**
	 * 通过拥有者批量删除分配的权限
	 * */
	int batchDelePermByOwner(
            @Param("ownerType")
                    String ownerType,
            @Param("ownerTypeCodes")
                    String[] ownerTypeCodes);
	
	/**
	 * 通过拥有者code与拥有者类型获取一个moduleId数组
	 * */
	List<Map<String, Object>> findModuleIdByOwner(
            @Param("ownerType")
                    String ownerType,
            @Param("ownerTypeCode")
                    String ownerTypeCode);

	/**
	 * 判断角色是否占用
	 * */
	List<String> isTakeUp(
            @Param("roleIds")
                    String[] roleIds);
	
	List<Map<String, Object>> authorityList(@Param("typeCode") String typeCode);
	
	/**
	 * 获取用户所有角色
	 * @param userId
	 * @return
	 */
	List<Map<String, Object>> getRoles(String userId);
}
