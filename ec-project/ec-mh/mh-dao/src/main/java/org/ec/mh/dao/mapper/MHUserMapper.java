package org.ec.mh.dao.mapper;

import java.util.List;
import org.ec.mh.entity.MHUser;

public interface MHUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHUser record);

    MHUser selectByPrimaryKey(Integer id);

    List<MHUser> selectAll();

    int updateByPrimaryKey(MHUser record);
}