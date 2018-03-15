package org.ec.mh.dto.MH0204;

import org.ec.utils.dto.RequestDTO;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * MH0204/A02 导航栏新增提交: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0204A02InputDTO extends RequestDTO {

    /**
     * 父级导航ID
     */
    private Integer parentId;

    /**
     * 标题
     */
    @NotBlank
    private String title;

    /**
     * 链接
     */
    @NotBlank
    private String link;

    /**
     * 排序
     */
    @NotNull
    private Integer sort;


    /**
     * 获取 父级导航ID
     * @return parentId 父级导航ID
     */
    @ApiModelProperty(value = "父级导航ID", name = "parentId", dataType = "Integer")
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置 父级导航ID
     * @param parentId 父级导航ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 标题
     * @return title 标题
     */
    @ApiModelProperty(value = "标题", name = "title", dataType = "String")
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
    @ApiModelProperty(value = "链接", name = "link", dataType = "String")
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
     * 获取 排序
     * @return sort 排序
     */
    @ApiModelProperty(value = "排序", name = "sort", dataType = "Integer")
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
