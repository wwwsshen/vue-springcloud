package org.ec.mh.dto.MH0104;

import org.ec.utils.dto.RequestDTO;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * MH0104/A01 站内搜索（分页）: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0104A01InputDTO extends RequestDTO {

    /**
     * 当前页
     */
    private Integer page;

    /**
     * 分页大小
     */
    private Integer pageSize;

    /**
     * 关键字
     */
    @NotBlank
    private String keyword;


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

    /**
     * 获取 关键字
     * @return keyword 关键字
     */
    @ApiModelProperty(value = "关键字", name = "keyword", dataType = "String")
    public String getKeyword() {
        return keyword;
    }

    /**
     * 设置 关键字
     * @param keyword 关键字
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
