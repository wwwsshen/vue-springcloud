package org.ec.mh.entity;

import org.ec.utils.Entity;

import java.util.Date;
import java.util.List;

public class MHArticleType extends Entity {
    private Integer id;

    private Integer parentId;

    private String name;

    private Integer showAtHome;

    private Integer sort;

    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    private Integer articleCount;

    private List<MHArticleType> children;

//    public MHArticleType(Integer id, Integer parentId, String name, Boolean showAtHome, Integer sort, Date deletedAt, Date createdAt, Date updatedAt, Integer articleCount) {
//        this.id = id;
//        this.parentId = parentId;
//        this.name = name;
//        this.showAtHome = showAtHome;
//        this.sort = sort;
//        this.deletedAt = deletedAt;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//        this.articleCount = articleCount;
//    }

    public MHArticleType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getShowAtHome() {
        return showAtHome;
    }

    public void setShowAtHome(Integer showAtHome) {
        this.showAtHome = showAtHome;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }

    public List<MHArticleType> getChildren() {
        return children;
    }

    public void setChildren(List<MHArticleType> children) {
        this.children = children;
    }
}