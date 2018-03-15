package org.ec.mh.dao.mapper;

import java.util.List;
import org.ec.mh.entity.MHPetitionLetterAttachment;

public interface MHPetitionLetterAttachmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHPetitionLetterAttachment record);

    MHPetitionLetterAttachment selectByPrimaryKey(Integer id);

    List<MHPetitionLetterAttachment> selectAll();

    int updateByPrimaryKey(MHPetitionLetterAttachment record);
}