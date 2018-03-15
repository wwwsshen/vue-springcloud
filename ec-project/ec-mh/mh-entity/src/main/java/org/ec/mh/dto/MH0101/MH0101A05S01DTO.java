package org.ec.mh.dto.MH0101;

import org.ec.utils.dto.ResponseDTO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * MH0101/A05 板块文章获取: 文章
 * 设计者:   张坤祥
 * 更新日期: 2018/2/26
 */
public class MH0101A05S01DTO extends ResponseDTO {

    /**
     * 文章ID
     */
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 是否置顶
     */
    private Boolean stick;

    /**
     * 发布日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
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
     * 获取 是否置顶
     * @return stick 是否置顶
     */
    public Boolean getStick() {
        return stick;
    }

    /**
     * 设置 是否置顶
     * @param stick 是否置顶
     */
    public void setStick(Boolean stick) {
        this.stick = stick;
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
}
