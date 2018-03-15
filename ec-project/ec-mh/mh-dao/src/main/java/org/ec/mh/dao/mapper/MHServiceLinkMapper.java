package org.ec.mh.dao.mapper;

import java.util.List;
import org.ec.mh.entity.MHServiceLink;

public interface MHServiceLinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHServiceLink record);

    MHServiceLink selectByPrimaryKey(Integer id);

    List<MHServiceLink> selectAll();

    int updateByPrimaryKey(MHServiceLink record);
}