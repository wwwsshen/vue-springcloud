package org.ec.mh.dto.MH0207;

import org.ec.utils.dto.ResponseDTO;

/**
 * MH0207/A02 信件详细信息获取: 信件转发记录
 * 设计者:   张坤祥
 * 更新日期: 2018/3/8
 */
public class MH0207A02S02DTO extends ResponseDTO {

    /**
     * 转发人用户ID
     */
    private Integer userId;

    /**
     * 转发人姓名
     */
    private String userName;

    /**
     * 转发自组织
     */
    private String fromOrganization;

    /**
     * 转发至组织
     */
    private String toOrganization;

    /**
     * 转发理由
     */
    private String reason;


    /**
     * 获取 转发人用户ID
     * @return userId 转发人用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置 转发人用户ID
     * @param userId 转发人用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取 转发人姓名
     * @return userName 转发人姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 转发人姓名
     * @param userName 转发人姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取 转发自组织
     * @return fromOrganization 转发自组织
     */
    public String getFromOrganization() {
        return fromOrganization;
    }

    /**
     * 设置 转发自组织
     * @param fromOrganization 转发自组织
     */
    public void setFromOrganization(String fromOrganization) {
        this.fromOrganization = fromOrganization;
    }

    /**
     * 获取 转发至组织
     * @return toOrganization 转发至组织
     */
    public String getToOrganization() {
        return toOrganization;
    }

    /**
     * 设置 转发至组织
     * @param toOrganization 转发至组织
     */
    public void setToOrganization(String toOrganization) {
        this.toOrganization = toOrganization;
    }

    /**
     * 获取 转发理由
     * @return reason 转发理由
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置 转发理由
     * @param reason 转发理由
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
