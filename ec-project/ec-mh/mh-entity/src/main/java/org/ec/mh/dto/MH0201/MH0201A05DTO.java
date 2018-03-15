package org.ec.mh.dto.MH0201;

import org.ec.utils.dto.ResponseDTO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;

/**
 * MH0201/A05 文章编辑数据获取: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0201A05DTO extends ResponseDTO {

    /**
     * 文章ID
     */
    private Integer id;

    /**
     * 文章分类ID
     */
    private Integer articleTypeId;

    /**
     * 来源
     */
    private String source;

    /**
     * 是否显示
     */
    private Integer show;

    /**
     * 是否板块置顶
     */
    private Integer stick;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updatedAt;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 附件
     */
    private List<MH0201A05S01DTO> attachments;


    /**
     * 获取 文章ID
     * @return id 文章ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 文章ID
     * @param id 文章ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 文章分类ID
     * @return articleTypeId 文章分类ID
     */
    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    /**
     * 设置 文章分类ID
     * @param articleTypeId 文章分类ID
     */
    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
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
     * 获取 是否显示
     * @return show 是否显示
     */
    public Integer getShow() {
        return show;
    }

    /**
     * 设置 是否显示
     * @param show 是否显示
     */
    public void setShow(Integer show) {
        this.show = show;
    }

    /**
     * 获取 是否板块置顶
     * @return stick 是否板块置顶
     */
    public Integer getStick() {
        return stick;
    }

    /**
     * 设置 是否板块置顶
     * @param stick 是否板块置顶
     */
    public void setStick(Integer stick) {
        this.stick = stick;
    }

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
     * 获取 更新时间
     * @return updatedAt 更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置 更新时间
     * @param updatedAt 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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
    public List<MH0201A05S01DTO> getAttachments() {
        return attachments;
    }

    /**
     * 设置 附件
     * @param attachments 附件
     */
    public void setAttachments(List<MH0201A05S01DTO> attachments) {
        this.attachments = attachments;
    }
}
