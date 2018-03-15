package org.ec.mh.entity;

import java.util.Date;

public class MHServiceLink {
    private Integer id;

    private String name;

    private String iconPath;

    private String link;

    private Integer sort;

    private Date createdAt;

    private Date updatedAt;

    public MHServiceLink(Integer id, String name, String iconPath, String link, Integer sort, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.iconPath = iconPath;
        this.link = link;
        this.sort = sort;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MHServiceLink() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath == null ? null : iconPath.trim();
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