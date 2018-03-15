package org.ec.mh.dto.MH0206;

import org.ec.utils.dto.RequestDTO;
import org.hibernate.validator.constraints.NotBlank;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import org.springframework.web.multipart.MultipartFile;

/**
 * MH0206/A02 办事服务入口新增提交: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0206A02InputDTO extends RequestDTO {

    /**
     * 名称
     */
    @NotBlank
    private String name;

    /**
     * 链接地址
     */
    @NotBlank
    private String link;

    /**
     * 排序
     */
    @NotNull
    private Integer sort;

    /**
     * 图标
     */
    private MultipartFile icon;


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
     * 获取 链接地址
     * @return link 链接地址
     */
    @ApiModelProperty(value = "链接地址", name = "link", dataType = "String")
    public String getLink() {
        return link;
    }

    /**
     * 设置 链接地址
     * @param link 链接地址
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
     * 获取 图标
     * @return icon 图标
     */
    @ApiModelProperty(value = "图标", name = "icon", dataType = "MultipartFile")
    public MultipartFile getIcon() {
        return icon;
    }

    /**
     * 设置 图标
     * @param icon 图标
     */
    public void setIcon(MultipartFile icon) {
        this.icon = icon;
    }
}
