package org.ec.mh.entity;

import java.util.Date;

public class MHArticleAttachment {
    private Integer id;

    private Integer articleId;

    private String fileType;

    private String fileName;

    private String filePath;

    private Integer downloadCount;

    private Date createdAt;

    private Date updatedAt;

    public MHArticleAttachment(Integer id, Integer articleId, String fileType, String fileName, String filePath, Integer downloadCount, Date createdAt, Date updatedAt) {
        this.id = id;
        this.articleId = articleId;
        this.fileType = fileType;
        this.fileName = fileName;
        this.filePath = filePath;
        this.downloadCount = downloadCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MHArticleAttachment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
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