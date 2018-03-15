package org.ec.mh.dto.MH0102;

import org.ec.utils.dto.ResponseDTO;

/**
 * MH0102/A03 目录统计数据获取: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/26
 */
public class MH0102A03DTO extends ResponseDTO {

    /**
     * 文章总数
     */
    private Integer totalCount;

    /**
     * 浏览总数
     */
    private Integer viewCount;


    /**
     * 获取 文章总数
     * @return totalCount 文章总数
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * 设置 文章总数
     * @param totalCount 文章总数
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 获取 浏览总数
     * @return viewCount 浏览总数
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * 设置 浏览总数
     * @param viewCount 浏览总数
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }
}
