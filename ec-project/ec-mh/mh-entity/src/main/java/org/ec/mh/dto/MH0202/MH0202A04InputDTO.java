package org.ec.mh.dto.MH0202;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * MH0202/A04 文章分类编辑提交: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0202A04InputDTO extends RequestDTO {

    /**
     * 分类ID
     */
    @NotNull
    private Integer id;

    /**
     * 分类名称
     */
    @NotBlank
    private String name;

    /**
     * 父级分类ID
     */
    private Integer parentId;

    /**
     * 排序
     */
    @NotNull
    private Integer sort;

    /**
     * 是否首页显示
     */
    private Integer showAtHome;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;


    /**
     * 获取 分类ID
     * @return id 分类ID
     */
    @ApiModelProperty(value = "分类ID", name = "id", dataType = "Integer")
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
     * 获取 分类名称
     * @return name 分类名称
     */
    @ApiModelProperty(value = "分类名称", name = "name", dataType = "String")
    public String getName() {
        return name;
    }

    /**
     * 设置 分类名称
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 父级分类ID
     * @return parentId 父级分类ID
     */
    @ApiModelProperty(value = "父级分类ID", name = "parentId", dataType = "Integer")
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置 父级分类ID
     * @param parentId 父级分类ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    /**
     * 获取 是否首页显示
     * @return showAtHome 是否首页显示
     */
    @ApiModelProperty(value = "是否首页显示", name = "showAtHome", dataType = "Integer")
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
     * 获取 更新时间
     * @return updatedAt 更新时间
     */
    @ApiModelProperty(value = "更新时间", name = "updatedAt", dataType = "Date")
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
