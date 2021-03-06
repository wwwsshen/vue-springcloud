package org.ec.mh.dto.MH0203;

import org.ec.utils.dto.ResponseDTO;

/**
 * MH0203/A01 轮播图列表数据获取: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0203A01DTO extends ResponseDTO {

    /**
     * ID
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 链接
     */
    private String link;

    /**
     * 图片
     */
    private String imagePath;

    /**
     * 排序
     */
    private Integer sort;


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
     * 获取 链接
     * @return link 链接
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置 链接
     * @param link 链接
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 获取 图片
     * @return imagePath 图片
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * 设置 图片
     * @param imagePath 图片
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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
}
