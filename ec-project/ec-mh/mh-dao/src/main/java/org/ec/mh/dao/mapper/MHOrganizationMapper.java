package org.ec.mh.dao.mapper;

import java.util.List;
import org.ec.mh.entity.MHOrganization;

public interface MHOrganizationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHOrganization record);

    MHOrganization selectByPrimaryKey(Integer id);

    List<MHOrganization> selectAll();

    int updateByPrimaryKey(MHOrganization record);
}