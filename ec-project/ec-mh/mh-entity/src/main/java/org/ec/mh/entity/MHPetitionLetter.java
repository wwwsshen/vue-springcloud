package org.ec.mh.entity;

import java.util.Date;

public class MHPetitionLetter {
    private Integer id;

    private String title;

    private Integer toOrganizationId;

    private Boolean status;

    private String addresserName;

    private String addresserMobile;

    private String addresserEmail;

    private String addresserAddress;

    private String queryNumber;

    private Integer handleOrganizationId;

    private Date finishedAt;

    private Boolean isOpen;

    private Date createdAt;

    private Date updatedAt;

    private String content;

    private String handleContent;

    public MHPetitionLetter(Integer id, String title, Integer toOrganizationId, Boolean status, String addresserName, String addresserMobile, String addresserEmail, String addresserAddress, String queryNumber, Integer handleOrganizationId, Date finishedAt, Boolean isOpen, Date createdAt, Date updatedAt, String content, String handleContent) {
        this.id = id;
        this.title = title;
        this.toOrganizationId = toOrganizationId;
        this.status = status;
        this.addresserName = addresserName;
        this.addresserMobile = addresserMobile;
        this.addresserEmail = addresserEmail;
        this.addresserAddress = addresserAddress;
        this.queryNumber = queryNumber;
        this.handleOrganizationId = handleOrganizationId;
        this.finishedAt = finishedAt;
        this.isOpen = isOpen;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.content = content;
        this.handleContent = handleContent;
    }

    public MHPetitionLetter() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getToOrganizationId() {
        return toOrganizationId;
    }

    public void setToOrganizationId(Integer toOrganizationId) {
        this.toOrganizationId = toOrganizationId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getAddresserName() {
        return addresserName;
    }

    public void setAddresserName(String addresserName) {
        this.addresserName = addresserName == null ? null : addresserName.trim();
    }

    public String getAddresserMobile() {
        return addresserMobile;
    }

    public void setAddresserMobile(String addresserMobile) {
        this.addresserMobile = addresserMobile == null ? null : addresserMobile.trim();
    }

    public String getAddresserEmail() {
        return addresserEmail;
    }

    public void setAddresserEmail(String addresserEmail) {
        this.addresserEmail = addresserEmail == null ? null : addresserEmail.trim();
    }

    public String getAddresserAddress() {
        return addresserAddress;
    }

    public void setAddresserAddress(String addresserAddress) {
        this.addresserAddress = addresserAddress == null ? null : addresserAddress.trim();
    }

    public String getQueryNumber() {
        return queryNumber;
    }

    public void setQueryNumber(String queryNumber) {
        this.queryNumber = queryNumber == null ? null : queryNumber.trim();
    }

    public Integer getHandleOrganizationId() {
        return handleOrganizationId;
    }

    public void setHandleOrganizationId(Integer handleOrganizationId) {
        this.handleOrganizationId = handleOrganizationId;
    }

    public Date getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
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

    public String getHandleContent() {
        return handleContent;
    }

    public void setHandleContent(String handleContent) {
        this.handleContent = handleContent == null ? null : handleContent.trim();
    }
}