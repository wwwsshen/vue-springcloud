package org.ec.mh.dto.MH0105;

import org.ec.utils.dto.ResponseDTO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;

/**
 * MH0105/A04 信件登记提交: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0105A04DTO extends ResponseDTO {

    /**
     * 信件ID
     */
    private Integer id;

    /**
     * 查询编号
     */
    private String queryNumber;

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
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 信件附件
     */
    private List<MH0105A04S01DTO> attachments;


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
     * 获取 查询编号
     * @return queryNumber 查询编号
     */
    public String getQueryNumber() {
        return queryNumber;
    }

    /**
     * 设置 查询编号
     * @param queryNumber 查询编号
     */
    public void setQueryNumber(String queryNumber) {
        this.queryNumber = queryNumber;
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
     * 获取 信件附件
     * @return attachments 信件附件
     */
    public List<MH0105A04S01DTO> getAttachments() {
        return attachments;
    }

    /**
     * 设置 信件附件
     * @param attachments 信件附件
     */
    public void setAttachments(List<MH0105A04S01DTO> attachments) {
        this.attachments = attachments;
    }
}
