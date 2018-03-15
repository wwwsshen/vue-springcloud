package org.ec.mh.entity;

import java.util.Date;

public class MHPetitionLetterTransfer {
    private Integer id;

    private Integer titlepetitionLetterId;

    private Integer userId;

    private Integer fromOrganizationId;

    private Integer toOrganizationId;

    private Date createdAt;

    private Date updatedAt;

    private String reason;

    public MHPetitionLetterTransfer(Integer id, Integer titlepetitionLetterId, Integer userId, Integer fromOrganizationId, Integer toOrganizationId, Date createdAt, Date updatedAt, String reason) {
        this.id = id;
        this.titlepetitionLetterId = titlepetitionLetterId;
        this.userId = userId;
        this.fromOrganizationId = fromOrganizationId;
        this.toOrganizationId = toOrganizationId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.reason = reason;
    }

    public MHPetitionLetterTransfer() {
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFromOrganizationId() {
        return fromOrganizationId;
    }

    public void setFromOrganizationId(Integer fromOrganizationId) {
        this.fromOrganizationId = fromOrganizationId;
    }

    public Integer getToOrganizationId() {
        return toOrganizationId;
    }

    public void setToOrganizationId(Integer toOrganizationId) {
        this.toOrganizationId = toOrganizationId;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}