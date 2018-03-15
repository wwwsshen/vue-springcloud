package org.ec.mh.dto.MH0204;

import org.ec.utils.dto.ResponseDTO;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * MH0204/A03 导航栏详细数据获取: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0204A03DTO extends ResponseDTO {

    /**
     * ID
     */
    private Integer id;

    /**
     * 上级导航ID
     */
    private Integer parentId;

    /**
     * 标题
     */
    private String name;

    /**
     * 链接地址
     */
    private String link;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updatedAt;


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
     * 获取 上级导航ID
     * @return parentId 上级导航ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置 上级导航ID
     * @param parentId 上级导航ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 标题
     * @return name 标题
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 标题
     * @param name 标题
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 链接地址
     * @return link 链接地址
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置 链接地址
     * @param link 链接地址
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 获取 排序
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
}
