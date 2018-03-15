package org.ec.mh.dto.MH0201;

import org.ec.utils.dto.ResponseDTO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * MH0201/A02 文章列表获取（分页&查询）: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0201A02DTO extends ResponseDTO {

    /**
     * 文章ID
     */
    private Integer id;

    /**
     * 文章分类
     */
    private String articleTypeName;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章来源
     */
    private String source;

    /**
     * 作者
     */
    private String author;

    /**
     * 是否显示
     */
    private Integer show;

    /**
     * 是否板块置顶
     */
    private Integer stick;

    /**
     * 阅读统计
     */
    private Integer viewCount;

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
     * 获取 文章分类
     * @return articleTypeName 文章分类
     */
    public String getArticleTypeName() {
        return articleTypeName;
    }

    /**
     * 设置 文章分类
     * @param articleTypeName 文章分类
     */
    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName;
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
     * 获取 文章来源
     * @return source 文章来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置 文章来源
     * @param source 文章来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取 作者
     * @return author 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置 作者
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
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
     * 获取 阅读统计
     * @return viewCount 阅读统计
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * 设置 阅读统计
     * @param viewCount 阅读统计
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
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
