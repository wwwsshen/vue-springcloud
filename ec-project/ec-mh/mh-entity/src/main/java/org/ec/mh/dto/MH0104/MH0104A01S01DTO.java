package org.ec.mh.dto.MH0104;

import org.ec.utils.dto.ResponseDTO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * MH0104/A01 站内搜索（分页）: 搜索结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0104A01S01DTO extends ResponseDTO {

    /**
     * 文章ID
     */
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章分类
     */
    private String articleType;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 发布时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdAt;


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
     * 获取 文章分类
     * @return articleType 文章分类
     */
    public String getArticleType() {
        return articleType;
    }

    /**
     * 设置 文章分类
     * @param articleType 文章分类
     */
    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    /**
     * 获取 摘要
     * @return summary 摘要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置 摘要
     * @param summary 摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取 发布时间
     * @return createdAt 发布时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置 发布时间
     * @param createdAt 发布时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
