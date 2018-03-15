package org.ec.mh.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.ec.mh.entity.AppModuleAssignment;


/**
 * @author tanyong
 * 2017-9-26
 * */
public interface AppModuleMapperExtra {

	List<Map<String, Object>> getAppModules(
            @Param("moduleName") String moduleName,
            @Param("start") int calculateStart,
            @Param("limit") int limit);

	Map<String, Object> getAppModule(
            @Param("id") String code);

	List<Map<String, Object>> getAllRoles();

	List<Map<String, Object>> getAllModules();

	List<Map<String, Object>> getAssignedModules(
            @Param("roleId") String roleId);

	int deleteAppModuleAssignments(
            @Param("roleId") String roleId);

	int addAppModuleAssignments(
            @Param("list") List<AppModuleAssignment> list);

	int deleteAppModuleAssignmentByModuleIds(
            @Param("ids") String[] ids);

	int deleteAppModules(
            @Param("ids") String[] ids);

	Map<String, Object> getUserInfosByUserId(
            @Param("userId") String curUserid);

	List<Map<String, Object>> getLevel1ModulesByRoleIds(
            @Param("roleIds") String[] roleIds);
	
	List<Map<String, Object>> getLevel2ModulesByRoleIds(
            @Param("roleIds") String[] roleIds);

	String getRoleIdsFromOrganization(
            @Param("org") String string);
	
	/************************重构**********************/
	/**
	 * 2017-10-27
	 * @author songxingguo
	 */
	
	Map<String, Object> search(
            @Param("moduleId")
                    String moduleId);
	
	Map<String, Object> findMaxCodeByParentCode(
            @Param("parentCode")
                    String parentCode);
	
	int deleteByParent(
            @Param("codes")
                    String[] codes);
	
	Map<String, Object> findModule(
            @Param("parent")
                    String parent);
	
	Map<String, Object> findBigger(
            @Param("showOrder")
                    int showOrder,
            @Param("parentCode")
                    String parentCode);
	
	Map<String, Object> findSmaller(
            @Param("showOrder")
                    int showOrder,
            @Param("parentCode")
                    String parentCode);
	
	List<Map<String, Object>> goNextPage(
            @Param("parentCode")
                    String parentCode,
            @Param("start")
                    int start,
            @Param("end")
                    int end);
	
	String[] selectLevel0(
            @Param("parentCode")
                    String parentCode);
	
	void updateHasChild(
            @Param("parentCode")
                    String parentCode,
            @Param("hasChild")
                    Byte hasChild);
	
	List<Map<String, Object>> findModulesWithLimit(
            @Param("moduleName")
                    String moduleName,
            @Param("parentCode")
                    String parentCode,
            @Param("start")
                    int start,
            @Param("end")
                    int end);
	
	List<Map<String, Object>> judgeRepition(
            @Param("moduleName")
                    String moduleName);
	
	List<Map<String, Object>> findModules(
            @Param("moduleName")
                    String moduleName,
            @Param("level")
                    String level,
            @Param("start")
                    int start,
            @Param("end")
                    int end);
	
	List<Map<String, Object>> searchModuleCount(
            @Param("moduleName")
                    String moduleName,
            @Param("parentCode")
                    String parentCode,
            @Param("start")
                    int start,
            @Param("end")
                    int end);
	
	/**
	 * 根据当前登录用户的组织结构id查询该用户所属的app模块
	 * @param roleArray 
	 * */
	List<Map<String, Object>> findAppModuelsByUserId(
            @Param("org")
                    String org,
            @Param("roleArray")
                    String[] roleArray);
}
