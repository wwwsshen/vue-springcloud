package org.ec.mh.dto.MH0102;

import org.ec.utils.dto.ResponseDTO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * MH0102/A02 目录文章获取（分页）: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/26
 */
public class MH0102A02DTO extends ResponseDTO {

    /**
     * 文章标题
     */
    private String title;

    /**
     * 来源
     */
    private String source;

    /**
     * 发布日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createdAt;

    /**
     * 是否板块置顶
     */
    private Boolean isStick;


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
     * 获取 发布日期
     * @return createdAt 发布日期
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置 发布日期
     * @param createdAt 发布日期
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取 是否板块置顶
     * @return isStick 是否板块置顶
     */
    public Boolean getIsStick() {
        return isStick;
    }

    /**
     * 设置 是否板块置顶
     * @param isStick 是否板块置顶
     */
    public void setIsStick(Boolean isStick) {
        this.isStick = isStick;
    }
}
