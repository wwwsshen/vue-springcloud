package org.ec.mh.dto.MH0202;

import org.ec.utils.dto.ResponseDTO;

/**
 * MH0202/A01 文章分类列表获取: 子分类
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0202A01S01DTO extends ResponseDTO {

    /**
     * 分类ID
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 是否首页显示
     */
    private Integer showAtHome;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 文章数量统计
     */
    private Integer articleCount;


    /**
     * 获取 分类ID
     * @return id 分类ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 分类ID
     * @param id 分类ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 是否首页显示
     * @return showAtHome 是否首页显示
     */
    public Integer getShowAtHome() {
        return showAtHome;
    }

    /**
     * 设置 是否首页显示
     * @param showAtHome 是否首页显示
     */
    public void setShowAtHome(Integer showAtHome) {
        this.showAtHome = showAtHome;
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
     * 获取 文章数量统计
     * @return articleCount 文章数量统计
     */
    public Integer getArticleCount() {
        return articleCount;
    }

    /**
     * 设置 文章数量统计
     * @param articleCount 文章数量统计
     */
    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }
}
