package org.ec.mh.dto.MH0207;

import org.ec.utils.dto.ResponseDTO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;

/**
 * MH0207/A02 信件详细信息获取: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/3/8
 */
public class MH0207A02DTO extends ResponseDTO {

    /**
     * 信件ID
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 信件办理状态
     */
    private Integer status;

    /**
     * 发信人姓名
     */
    private String addresserName;

    /**
     * 发信人手机号码
     */
    private String addresserMobile;

    /**
     * 发信人电子邮件
     */
    private String addresserEmail;

    /**
     * 发信人联系地址
     */
    private String addresserAddress;

    /**
     * 提交到单位
     */
    private String toOrganization;

    /**
     * 提交时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdAt;

    /**
     * 办理单位
     */
    private String handleOrganization;

    /**
     * 办理回复时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date finishedAt;

    /**
     * 办理回复结果
     */
    private String handleContent;

    /**
     * 是否公开
     */
    private Integer open;

    /**
     * 信件附件
     */
    private List<MH0207A02S01DTO> attachments;

    /**
     * 信件转发记录
     */
    private List<MH0207A02S02DTO> transfers;

    /**
     * 当前用户是否可操作
     */
    private boolean canHandle;


    /**
     * 获取 信件ID
     * @return id 信件ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 信件ID
     * @param id 信件ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取 内容
     * @return content 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置 内容
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取 信件办理状态
     * @return status 信件办理状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 信件办理状态
     * @param status 信件办理状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 发信人姓名
     * @return addresserName 发信人姓名
     */
    public String getAddresserName() {
        return addresserName;
    }

    /**
     * 设置 发信人姓名
     * @param addresserName 发信人姓名
     */
    public void setAddresserName(String addresserName) {
        this.addresserName = addresserName;
    }

    /**
     * 获取 发信人手机号码
     * @return addresserMobile 发信人手机号码
     */
    public String getAddresserMobile() {
        return addresserMobile;
    }

    /**
     * 设置 发信人手机号码
     * @param addresserMobile 发信人手机号码
     */
    public void setAddresserMobile(String addresserMobile) {
        this.addresserMobile = addresserMobile;
    }

    /**
     * 获取 发信人电子邮件
     * @return addresserEmail 发信人电子邮件
     */
    public String getAddresserEmail() {
        return addresserEmail;
    }

    /**
     * 设置 发信人电子邮件
     * @param addresserEmail 发信人电子邮件
     */
    public void setAddresserEmail(String addresserEmail) {
        this.addresserEmail = addresserEmail;
    }

    /**
     * 获取 发信人联系地址
     * @return addresserAddress 发信人联系地址
     */
    public String getAddresserAddress() {
        return addresserAddress;
    }

    /**
     * 设置 发信人联系地址
     * @param addresserAddress 发信人联系地址
     */
    public void setAddresserAddress(String addresserAddress) {
        this.addresserAddress = addresserAddress;
    }

    /**
     * 获取 提交到单位
     * @return toOrganization 提交到单位
     */
    public String getToOrganization() {
        return toOrganization;
    }

    /**
     * 设置 提交到单位
     * @param toOrganization 提交到单位
     */
    public void setToOrganization(String toOrganization) {
        this.toOrganization = toOrganization;
    }

    /**
     * 获取 提交时间
     * @return createdAt 提交时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置 提交时间
     * @param createdAt 提交时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取 办理单位
     * @return handleOrganization 办理单位
     */
    public String getHandleOrganization() {
        return handleOrganization;
    }

    /**
     * 设置 办理单位
     * @param handleOrganization 办理单位
     */
    public void setHandleOrganization(String handleOrganization) {
        this.handleOrganization = handleOrganization;
    }

    /**
     * 获取 办理回复时间
     * @return finishedAt 办理回复时间
     */
    public Date getFinishedAt() {
        return finishedAt;
    }

    /**
     * 设置 办理回复时间
     * @param finishedAt 办理回复时间
     */
    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * 获取 办理回复结果
     * @return handleContent 办理回复结果
     */
    public String getHandleContent() {
        return handleContent;
    }

    /**
     * 设置 办理回复结果
     * @param handleContent 办理回复结果
     */
    public void setHandleContent(String handleContent) {
        this.handleContent = handleContent;
    }

    /**
     * 获取 是否公开
     * @return open 是否公开
     */
    public Integer getOpen() {
        return open;
    }

    /**
     * 设置 是否公开
     * @param open 是否公开
     */
    public void setOpen(Integer open) {
        this.open = open;
    }

    /**
     * 获取 信件附件
     * @return attachments 信件附件
     */
    public List<MH0207A02S01DTO> getAttachments() {
        return attachments;
    }

    /**
     * 设置 信件附件
     * @param attachments 信件附件
     */
    public void setAttachments(List<MH0207A02S01DTO> attachments) {
        this.attachments = attachments;
    }

    /**
     * 获取 信件转发记录
     * @return transfers 信件转发记录
     */
    public List<MH0207A02S02DTO> getTransfers() {
        return transfers;
    }

    /**
     * 设置 信件转发记录
     * @param transfers 信件转发记录
     */
    public void setTransfers(List<MH0207A02S02DTO> transfers) {
        this.transfers = transfers;
    }

    /**
     * 获取 当前用户是否可操作
     * @return canHandle 当前用户是否可操作
     */
    public boolean getCanHandle() {
        return canHandle;
    }

    /**
     * 设置 当前用户是否可操作
     * @param canHandle 当前用户是否可操作
     */
    public void setCanHandle(boolean canHandle) {
        this.canHandle = canHandle;
    }
}
