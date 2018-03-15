package org.ec.mh.dto.MH0203;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.multipart.MultipartFile;

/**
 * MH0203/A03 轮播图设置更新: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0203A03InputDTO extends RequestDTO {

    /**
     * ID
     */
    @NotNull
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 链接
     */
    private String link;

    /**
     * 图片
     */
    private MultipartFile file;

    /**
     * 排序
     */
    private Integer sort;


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
     * 获取 图片
     * @return file 图片
     */
    @ApiModelProperty(value = "图片", name = "file", dataType = "MultipartFile")
    public MultipartFile getFile() {
        return file;
    }

    /**
     * 设置 图片
     * @param file 图片
     */
    public void setFile(MultipartFile file) {
        this.file = file;
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
