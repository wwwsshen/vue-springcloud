package org.ec.mh.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import org.ec.mh.dto.PermissionPointDTO;
import org.ec.mh.dto.RolePermissionPointDTO;

public interface PermissionPointMapperExtra {
	
	/*新增权限点*/
	int insert(@Param("list") List<PermissionPointDTO> dtos);
	
	/* 查重 */
	int validateSame(@Param("code") String code);
	
	/* 删除模块对应的权限点 */
	int deleteByParent(@Param("codes") String[] codes);
	
	List<Map<String,Object>> getPermissionPoint(@Param("moduleId") String moduleId);
	
	List<Map<String,Object>> getAllPermissionPoint(
            @Param("org")
                    String org,
            @Param("roleArray")
                    String[] roleArray);
	List<Map<String,Object>> getModuleByRole(@Param("org")
                                                     String org,
                                             @Param("roleArray")
                                                     String[] roleArray);
	
	/**
	 * 通过拥有者code与拥有者类型获取一个moduleId数组
	 * */
	List<Map<String, Object>> findModuleIdByOwner(
            @Param("ownerType")
                    String ownerType,
            @Param("ownerTypeCode")
                    String ownerTypeCode);
	
	/**
	 * 通过拥有者code与拥有者类型获取一个权限点列表
	 * */
	List<Map<String, Object>> getPermissionPointByOwner(
            @Param("ownerType")
                    String ownerType,
            @Param("ownerTypeCode")
                    String ownerTypeCode);
	
	int deletePointByOwner(@Param("ownerType")
                                   String ownerType,
                           @Param("ownerTypeCode")
                                   String ownerTypeCode);
	
	int addPointForRole(@Param("pas") List<RolePermissionPointDTO> dtos);

	List<Map<String,Object>> getPermissionPointByRole(@Param("ownerType")
                                                              String ownerType,
                                                      @Param("ownerTypeCode")
                                                              String ownerTypeCode);
	

	/**
	 * 通过拥有者批量删除分配的权限
	 * */
	int deletePointByRole(
            @Param("ownerType")
                    String ownerType,
            @Param("ownerTypeCodes")
                    String[] ownerTypeCodes);
	
	/*更新权限点*/
	int update(@Param("list") List<PermissionPointDTO> dtos);
	
	/*删除权限点*/
	int deleteById(@Param("ids") String[] ids);
	

List<Map<String,Object>> getPointByRoleAndModule(
        @Param("ownerTypeCode")
                String[] ownerTypeCode,
        @Param("moduleCode")
                String moduleCode);
	
	Map<String,Object> findRoleId(
            @Param("userId")
                    String userId);
	
}
