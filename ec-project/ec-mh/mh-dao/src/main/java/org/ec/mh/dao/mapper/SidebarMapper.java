package org.ec.mh.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SidebarMapper {
	/**
	 * 根据当前登录用户的组织结构id查询该用户所属模块
	 * @param roleArray 
	 * */
	List<Map<String, Object>> findModuelsByOrg(
            @Param("userId")
                    String userId,
            @Param("org")
                    String org,
            @Param("roleArray")
                    String[] roleArray);
}
