package org.ec.mh.dto.MH0105;

import org.ec.utils.dto.ResponseDTO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * MH0105/A05 信件详情: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/3/8
 */
public class MH0105A05DTO extends ResponseDTO {

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
}
