package org.ec.mh.dto.MH0103;

import org.ec.utils.dto.ResponseDTO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;

/**
 * MH0103/A01 文章详情数据获取: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/26
 */
public class MH0103A01DTO extends ResponseDTO {

    /**
     * 文章标题
     */
    private String title;

    /**
     * 来源
     */
    private String source;

    /**
     * 时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdAt;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 附件
     */
    private List<MH0103A01S01DTO> attachments;


    /**
     * 获取 文章标题
     * @return title 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置 文章标题
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取 来源
     * @return source 来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置 来源
     * @param source 来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取 时间
     * @return createdAt 时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置 时间
     * @param createdAt 时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取 文章内容
     * @return content 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置 文章内容
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取 附件
     * @return attachments 附件
     */
    public List<MH0103A01S01DTO> getAttachments() {
        return attachments;
    }

    /**
     * 设置 附件
     * @param attachments 附件
     */
    public void setAttachments(List<MH0103A01S01DTO> attachments) {
        this.attachments = attachments;
    }
}
