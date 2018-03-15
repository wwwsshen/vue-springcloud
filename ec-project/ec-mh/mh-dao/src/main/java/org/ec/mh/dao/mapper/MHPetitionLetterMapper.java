package org.ec.mh.dao.mapper;

import java.util.List;
import org.ec.mh.entity.MHPetitionLetter;

public interface MHPetitionLetterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHPetitionLetter record);

    MHPetitionLetter selectByPrimaryKey(Integer id);

    List<MHPetitionLetter> selectAll();

    int updateByPrimaryKey(MHPetitionLetter record);
}