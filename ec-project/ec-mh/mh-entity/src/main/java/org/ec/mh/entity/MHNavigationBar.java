package org.ec.mh.entity;

import java.util.Date;

public class MHNavigationBar {
    private Integer id;

    private Integer parentId;

    private String name;

    private String link;

    private Integer sort;

    private Date createdAt;

    private Date updatedAt;

    public MHNavigationBar(Integer id, Integer parentId, String name, String link, Integer sort, Date createdAt, Date updatedAt) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.link = link;
        this.sort = sort;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MHNavigationBar() {
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
}