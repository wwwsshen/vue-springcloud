package org.ec.mh.dto.MH0102;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;

/**
 * MH0102/A02 目录文章获取（分页）: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/26
 */
public class MH0102A02InputDTO extends RequestDTO {

    /**
     * 板块ID
     */
    @NotNull
    private Integer articleTypeId;

    /**
     * 当前页
     */
    private Integer page;

    /**
     * 分页大小
     */
    private Integer pageSize;


    /**
     * 获取 板块ID
     * @return articleTypeId 板块ID
     */
    @ApiModelProperty(value = "板块ID", name = "articleTypeId", dataType = "Integer")
    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    /**
     * 设置 板块ID
     * @param articleTypeId 板块ID
     */
    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    /**
     * 获取 当前页
     * @return page 当前页
     */
    @ApiModelProperty(value = "当前页", name = "page", dataType = "Integer")
    public Integer getPage() {
        return page;
    }

    /**
     * 设置 当前页
     * @param page 当前页
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 获取 分页大小
     * @return pageSize 分页大小
     */
    @ApiModelProperty(value = "分页大小", name = "pageSize", dataType = "Integer")
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置 分页大小
     * @param pageSize 分页大小
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
