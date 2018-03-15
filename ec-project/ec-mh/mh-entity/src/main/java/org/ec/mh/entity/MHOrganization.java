package org.ec.mh.entity;

import java.util.Date;

public class MHOrganization {
    private Integer id;

    private Integer parentId;

    private String name;

    private Date createdAt;

    private Date updatedAt;

    public MHOrganization(Integer id, Integer parentId, String name, Date createdAt, Date updatedAt) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MHOrganization() {
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