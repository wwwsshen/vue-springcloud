package org.ec.mh.service;

import org.ec.mh.dto.AppModuleDTO;
import org.ec.mh.dto.LimitShowDTO;

import java.util.List;
import java.util.Map;


public interface AppModuleManagementService {

	List<Map<String, Object>> getAppModules(LimitShowDTO lsDTO, AppModuleDTO amDTO);

	int getNumOfAppModule(AppModuleDTO amDTO);

	boolean addAppModule(AppModuleDTO amDTO);

	boolean updateAppModule(AppModuleDTO amDTO);

	Map<String, Object> getAppModule(String id);

	List<Map<String, Object>> getAllRoles();

	List<Map<String, Object>> getAllModules();

	List<Map<String, Object>> getAssignedModules(String roleId);

	boolean assignModuleToRole(String roleId, String[] ids);

	boolean deleteAppModules(String[] ids);

	/************************重构**********************/
	/**
	 * 2017-10-27
	 * @author songxingguo
	 */
	
	/**
	 * @description 添加成功返回，否则返回null
	 */
	boolean addModule(AppModuleDTO appModuleDTO);

	/**
	 * @description 更新成功返回，否则返回null
	 */
	boolean updateModule(AppModuleDTO appModuleDTO);
	
	/**
	 * @description 查询成功返回，否则返回null
	 */
	/*List<Map<String, Object>> searchModule(ModuleDTO moduleDTO);*/

	/**
	 * @description 删除模块下的所有节点，并成功则返回删除数，否则返回0
	 */
	boolean deleteByIdsAndChild(String[] codes);

	boolean moveUp(int showOrder, String id, String parentCode);

	boolean moveDown(int showOrder, String id, String parentCode);

	Map<String, Object> searchModuleById(String moduleId);

	List<Map<String, Object>> goNextCatalog(String parentCode,
                                            LimitShowDTO limitShowDTO);

	Object goNextCatalogNum(String parentCode);

	/**
	 * 判断模块名是否重复
	 * */
	boolean judgeRepition(String moduleName);

	List<Map<String, Object>> findModules(String moduleName,
                                          String level, LimitShowDTO limitShowDTO);
	
	Object searchModuleCount(String moduleName, String parentCode);

	Object findCountOfModules(String moduleName, String parentCode);

	List<Map<String, Object>> findModulesWithLimit(String moduleName,
                                                   String parentCode, LimitShowDTO limitShowDTO);
	
	/**
	 * 根据userId查找用户的app一级模块
	 * @param curUserid
	 * @return
	 */
	List<Map<String, Object>> getAssignedLevel1ModulesByUserId(String curUserid);

	/**
	 * 根据userId查找用户的app二级模块
	 * @param curUserid
	 * @return
	 */
	List<Map<String, Object>> getAssignedLevel2ModulesByUserId(String curUserid);
	

	/**
	 * 根据userId获取用户所有app模块
	 * @param userId
	 * @param org
	 * @param type
	 * @return
	 */
	List<Map<String, Object>> getAppModuels(String userId,
                                            String org, String type);
}
