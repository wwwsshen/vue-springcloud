package org.ec.mh.dto.MH0105;

import org.ec.utils.dto.ResponseDTO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * MH0105/A01 公开信件列表获取（分页&查询）: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0105A01DTO extends ResponseDTO {

    /**
     * 信件ID
     */
    private Integer id;

    /**
     * 信件标题
     */
    private String title;

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
     * 获取 信件标题
     * @return title 信件标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置 信件标题
     * @param title 信件标题
     */
    public void setTitle(String title) {
        this.title = title;
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
}
