package org.ec.mh.dto.MH0204;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * MH0204/A04 导航栏编辑提交: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0204A04InputDTO extends RequestDTO {

    /**
     * ID
     */
    @NotNull
    private Integer id;

    /**
     * 父级导航ID
     */
    private Integer parentId;

    /**
     * 标题
     */
    @NotBlank
    private String name;

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
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;


    /**
     * 获取 ID
     * @return id ID
     */
    @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
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
     * @return name 标题
     */
    @ApiModelProperty(value = "标题", name = "name", dataType = "String")
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
