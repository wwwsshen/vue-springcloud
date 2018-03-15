package org.ec.mh.entity;

import java.util.Date;

public class MHArticle {
    private Integer id;

    private Integer articleTypeId;

    private Integer userId;

    private String title;

    private String source;

    private Boolean isShow;

    private Boolean isStick;

    private Integer viewCount;

    private String tags;

    private Date createdAt;

    private Date updatedAt;

    private String content;

    public MHArticle(Integer id, Integer articleTypeId, Integer userId, String title, String source, Boolean isShow, Boolean isStick, Integer viewCount, String tags, Date createdAt, Date updatedAt, String content) {
        this.id = id;
        this.articleTypeId = articleTypeId;
        this.userId = userId;
        this.title = title;
        this.source = source;
        this.isShow = isShow;
        this.isStick = isStick;
        this.viewCount = viewCount;
        this.tags = tags;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.content = content;
    }

    public MHArticle() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Boolean getIsStick() {
        return isStick;
    }

    public void setIsStick(Boolean isStick) {
        this.isStick = isStick;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}