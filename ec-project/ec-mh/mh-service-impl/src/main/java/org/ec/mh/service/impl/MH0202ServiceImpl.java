package org.ec.mh.service.impl;

import org.ec.mh.dao.mapper.MHArticleTypeMapper;
import org.ec.mh.dto.MH0202.MH0202A01DTO;
import org.ec.mh.entity.MHArticleType;
import org.ec.mh.service.MH0202Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class MH0202ServiceImpl implements MH0202Service {

    private final MHArticleTypeMapper mhArticleTypeMapper;

    @Autowired
    public MH0202ServiceImpl(MHArticleTypeMapper mhArticleTypeMapper) {
        this.mhArticleTypeMapper = mhArticleTypeMapper;
    }

    @Override
    public boolean addMHArticleType(MHArticleType articleType) {
        return this.mhArticleTypeMapper.insert(articleType) > 0;
    }

    @Override
    public boolean editMHArticleType(MHArticleType articleType) {
        return mhArticleTypeMapper.updateByPrimaryKey(articleType) > 0;

    }

    @Override
    public List<MHArticleType> findAllMHArticleTypes() {
        return mhArticleTypeMapper.selectAll();
    }

    @Override
    public MHArticleType getMHArticleType(int id) {
        return mhArticleTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean deleteMHArticleType(int id) {
        return mhArticleTypeMapper.deleteByPrimaryKey(id) > 0;
    }
}
