package org.ec.mh.entity;

import java.util.Date;

public class MHSearchLog {
    private Integer id;

    private Integer source;

    private String keyword;

    private Integer count;

    private Date createdAt;

    private Date updatedAt;

    public MHSearchLog(Integer id, Integer source, String keyword, Integer count, Date createdAt, Date updatedAt) {
        this.id = id;
        this.source = source;
        this.keyword = keyword;
        this.count = count;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MHSearchLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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