
package org.ec.mh.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.ec.mh.dto.ModuleDTO;
import org.ec.mh.entity.Module;


public interface ModuleMapperExtra {
	List<Map<String, Object>> insert(
            @Param("value")
					Module value);

	List<Map<String, Object>> select(
            @Param("module")
					ModuleDTO moduleDTO);

	void deleteByIds(Class<Module> class1, String moduleIds);

	int deleteByParent(
            @Param("codes")
                    String[] codes);

	int selectModuleCode(
            @Param("showOrder")
                    String string);

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

	Map<String, Object> findMaxCodeByParentCode(
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

	Map<String, Object> search(
            @Param("moduleId")
                    String moduleId);

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
                    int end
    );

	String[] selectLevel0(
            @Param("parentCode")
                    String parentCode);
	
	List<Map<String, Object>> getModuleCodes(
            @Param("userId")
                    String userId,
            @Param("systemName")
                    String systemName);
	
	List<Map<String, Object>> getPageNavigation(@Param("parentCode")
                                                        String parentCode,
                                                @Param("userId")
                                                        String userId,
                                                @Param("roleArray")
                                                        String[] roleArray);

	
	List<Map<String, Object>> getModuleForRole(@Param("orgCode")
                                                       String orgCode);
}
