package org.ec.mh.dao.mapper;

import java.util.List;
import org.ec.mh.entity.MHNavigationBar;

public interface MHNavigationBarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHNavigationBar record);

    MHNavigationBar selectByPrimaryKey(Integer id);

    List<MHNavigationBar> selectAll();

    int updateByPrimaryKey(MHNavigationBar record);
}