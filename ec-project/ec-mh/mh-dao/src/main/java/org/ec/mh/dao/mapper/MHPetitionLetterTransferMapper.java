package org.ec.mh.dao.mapper;

import java.util.List;
import org.ec.mh.entity.MHPetitionLetterTransfer;

public interface MHPetitionLetterTransferMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHPetitionLetterTransfer record);

    MHPetitionLetterTransfer selectByPrimaryKey(Integer id);

    List<MHPetitionLetterTransfer> selectAll();

    int updateByPrimaryKey(MHPetitionLetterTransfer record);
}