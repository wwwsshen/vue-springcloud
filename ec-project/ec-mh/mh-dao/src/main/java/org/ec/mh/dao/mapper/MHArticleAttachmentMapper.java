package org.ec.mh.dao.mapper;

import java.util.List;
import org.ec.mh.entity.MHArticleAttachment;

public interface MHArticleAttachmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHArticleAttachment record);

    MHArticleAttachment selectByPrimaryKey(Integer id);

    List<MHArticleAttachment> selectAll();

    int updateByPrimaryKey(MHArticleAttachment record);
}