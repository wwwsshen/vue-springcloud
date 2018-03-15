package org.ec.mh.service;

import org.ec.mh.entity.MHArticleType;

import java.util.List;

public interface MH0202Service extends MHBaseService {
    boolean addMHArticleType(MHArticleType articleType);

    boolean editMHArticleType(MHArticleType articleType);

    List<MHArticleType> findAllMHArticleTypes();

    MHArticleType getMHArticleType(int id);

    boolean deleteMHArticleType(int id);
}