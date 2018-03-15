package org.ec.mh.entity;

import java.util.Date;

public class MHPetitionLetterAttachment {
    private Integer id;

    private Integer titlepetitionLetterId;

    private String fileName;

    private String filePath;

    private Integer size;

    private Date createdAt;

    private Date updatedAt;

    public MHPetitionLetterAttachment(Integer id, Integer titlepetitionLetterId, String fileName, String filePath, Integer size, Date createdAt, Date updatedAt) {
        this.id = id;
        this.titlepetitionLetterId = titlepetitionLetterId;
        this.fileName = fileName;
        this.filePath = filePath;
        this.size = size;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MHPetitionLetterAttachment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTitlepetitionLetterId() {
        return titlepetitionLetterId;
    }

    public void setTitlepetitionLetterId(Integer titlepetitionLetterId) {
        this.titlepetitionLetterId = titlepetitionLetterId;
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
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