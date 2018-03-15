package org.ec.mh.dto.MH0207;

import org.ec.utils.dto.ResponseDTO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * MH0207/A01 信件列表获取（分页&查询）: 信件
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0207A01S01DTO extends ResponseDTO {

    /**
     * ID
     */
    private Integer id;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 提交到单位
     */
    private String toOrganization;

    /**
     * 处理单位
     */
    private String handleOrganization;

    /**
     * 标题
     */
    private String title;

    /**
     * 是否公开
     */
    private Integer open;

    /**
     * 提交时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdAt;

    /**
     * 办理回复时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date finishedAt;


    /**
     * 获取 ID
     * @return id ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 ID
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 状态
     * @return status 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取 处理单位
     * @return handleOrganization 处理单位
     */
    public String getHandleOrganization() {
        return handleOrganization;
    }

    /**
     * 设置 处理单位
     * @param handleOrganization 处理单位
     */
    public void setHandleOrganization(String handleOrganization) {
        this.handleOrganization = handleOrganization;
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
}
