package org.ec.mh.dto.MH0201;

import org.ec.utils.dto.RequestDTO;
import io.swagger.annotations.ApiModelProperty;

/**
 * MH0201/A02 文章列表获取（分页&查询）: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0201A02InputDTO extends RequestDTO {

    /**
     * 当前页
     */
    private Integer page;

    /**
     * 分页大小
     */
    private Integer pageSize;

    /**
     * 分类ID
     */
    private Integer articleTypeId;

    /**
     * 关键字
     */
    private String keyWord;


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
     * 获取 分类ID
     * @return articleTypeId 分类ID
     */
    @ApiModelProperty(value = "分类ID", name = "articleTypeId", dataType = "Integer")
    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    /**
     * 设置 分类ID
     * @param articleTypeId 分类ID
     */
    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    /**
     * 获取 关键字
     * @return keyWord 关键字
     */
    @ApiModelProperty(value = "关键字", name = "keyWord", dataType = "String")
    public String getKeyWord() {
        return keyWord;
    }

    /**
     * 设置 关键字
     * @param keyWord 关键字
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
}
