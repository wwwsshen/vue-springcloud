package org.ec.mh.dao.mapper;

import java.util.List;
import org.ec.mh.entity.MHArticle;

public interface MHArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHArticle record);

    MHArticle selectByPrimaryKey(Integer id);

    List<MHArticle> selectAll();

    int updateByPrimaryKey(MHArticle record);
}