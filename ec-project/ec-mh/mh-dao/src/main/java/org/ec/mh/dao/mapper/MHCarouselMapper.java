package org.ec.mh.dao.mapper;

import java.util.List;
import org.ec.mh.entity.MHCarousel;

public interface MHCarouselMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MHCarousel record);

    MHCarousel selectByPrimaryKey(Integer id);

    List<MHCarousel> selectAll();

    int updateByPrimaryKey(MHCarousel record);
}