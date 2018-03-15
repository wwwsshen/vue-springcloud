package org.ec.mh.dao.mapper;

import org.ec.mh.entity.MHArticleType;

import java.util.List;

public interface MHArticleTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHArticleType record);

    MHArticleType selectByPrimaryKey(Integer id);

    List<MHArticleType> selectAll();

    int updateByPrimaryKey(MHArticleType record);
}