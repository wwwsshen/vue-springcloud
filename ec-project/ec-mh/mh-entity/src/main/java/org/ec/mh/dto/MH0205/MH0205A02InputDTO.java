package org.ec.mh.dto.MH0205;

import org.ec.utils.dto.RequestDTO;
import org.hibernate.validator.constraints.NotBlank;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;

/**
 * MH0205/A02 友情链接新增提交: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0205A02InputDTO extends RequestDTO {

    /**
     * 名称
     */
    @NotBlank(message = "名称不能为空")
    private String name;

    /**
     * 链接
     */
    @NotBlank(message = "链接不能为空")
    private String link;

    /**
     * 排序
     */
    @NotNull(message = "排序不能为空")
    private Integer sort;


    /**
     * 获取 名称
     * @return name 名称
     */
    @ApiModelProperty(value = "名称", name = "name", dataType = "String")
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
