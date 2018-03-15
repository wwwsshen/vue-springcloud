package org.ec.mh.dao.mapper;

import java.util.List;
import org.ec.mh.entity.MHFriendlyLink;

public interface MHFriendlyLinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHFriendlyLink record);

    MHFriendlyLink selectByPrimaryKey(Integer id);

    List<MHFriendlyLink> selectAll();

    int updateByPrimaryKey(MHFriendlyLink record);
}