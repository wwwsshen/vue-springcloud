package org.ec.mh.dao.mapper;

import java.util.List;
import org.ec.mh.entity.MHSearchLog;

public interface MHSearchLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHSearchLog record);

    MHSearchLog selectByPrimaryKey(Integer id);

    List<MHSearchLog> selectAll();

    int updateByPrimaryKey(MHSearchLog record);
}