package org.ec.mh.service;

import org.ec.mh.dto.LimitShowDTO;
import org.ec.mh.dto.ModuleDTO;
import org.ec.mh.entity.LoginInfoDTO;

import java.util.List;
import java.util.Map;

public interface ModuleService {
    /**
     * @description 添加成功返回，否则返回null
     */
    boolean addModule(ModuleDTO moduleDTO, String opearations);

    /**
     * @description 更新成功返回，否则返回null
     */
    boolean updateModule(ModuleDTO moduleDTO,String operation);

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
     * 获取导航栏和我的中心都存在的模块
     * */
    List<Map<String, Object>> getModuleCodes(LoginInfoDTO loginInfoDTO);

    List<Map<String, Object>> getPageNavigation(String parentCode,
                                                LoginInfoDTO loginInfoDTO);

    List<Map<String, Object>> getModuleForRole(String orgCode, LoginInfoDTO loginInfoDTO);

    /*查找权限点是否重复*/
    boolean validateSame(String code);

    List<Map<String,Object>> getPermissionPoint(String moduleId);

    List<Map<String,Object>> getPointByRoleAndModule(String moduleCode,LoginInfoDTO loginInfoDTO);
}
