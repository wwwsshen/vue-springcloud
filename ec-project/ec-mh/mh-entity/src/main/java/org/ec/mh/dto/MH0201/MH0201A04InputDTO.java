package org.ec.mh.dto.MH0201;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * MH0201/A04 文章编辑提交: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0201A04InputDTO extends RequestDTO {

    /**
     * 文章分类ID
     */
    @NotNull
    private Integer articleTypeId;

    /**
     * 文章来源
     */
    @NotBlank
    private String source;

    /**
     * 是否列显示
     */
    private Integer show;

    /**
     * 是否板块置顶
     */
    private Integer stick;

    /**
     * 标题
     */
    @NotBlank
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 附件
     */
    private List<MultipartFile> files;

    /**
     * 文章更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    /**
     * 删除附件ID
     */
    private String deleteFileIds;


    /**
     * 获取 文章分类ID
     * @return articleTypeId 文章分类ID
     */
    @ApiModelProperty(value = "文章分类ID", name = "articleTypeId", dataType = "Integer")
    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    /**
     * 设置 文章分类ID
     * @param articleTypeId 文章分类ID
     */
    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    /**
     * 获取 文章来源
     * @return source 文章来源
     */
    @ApiModelProperty(value = "文章来源", name = "source", dataType = "String")
    public String getSource() {
        return source;
    }

    /**
     * 设置 文章来源
     * @param source 文章来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取 是否列显示
     * @return show 是否列显示
     */
    @ApiModelProperty(value = "是否列显示", name = "show", dataType = "Integer")
    public Integer getShow() {
        return show;
    }

    /**
     * 设置 是否列显示
     * @param show 是否列显示
     */
    public void setShow(Integer show) {
        this.show = show;
    }

    /**
     * 获取 是否板块置顶
     * @return stick 是否板块置顶
     */
    @ApiModelProperty(value = "是否板块置顶", name = "stick", dataType = "Integer")
    public Integer getStick() {
        return stick;
    }

    /**
     * 设置 是否板块置顶
     * @param stick 是否板块置顶
     */
    public void setStick(Integer stick) {
        this.stick = stick;
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
     * 获取 内容
     * @return content 内容
     */
    @ApiModelProperty(value = "内容", name = "content", dataType = "String")
    public String getContent() {
        return content;
    }

    /**
     * 设置 内容
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取 附件
     * @return files 附件
     */
    @ApiModelProperty(value = "附件", name = "files", dataType = "List<MultipartFile>")
    public List<MultipartFile> getFiles() {
        return files;
    }

    /**
     * 设置 附件
     * @param files 附件
     */
    public void setFiles(List<MultipartFile> files) {
        this.files = files;
    }

    /**
     * 获取 文章更新时间
     * @return updatedAt 文章更新时间
     */
    @ApiModelProperty(value = "文章更新时间", name = "updatedAt", dataType = "Date")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置 文章更新时间
     * @param updatedAt 文章更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 获取 删除附件ID
     * @return deleteFileIds 删除附件ID
     */
    @ApiModelProperty(value = "删除附件ID", name = "deleteFileIds", dataType = "String")
    public String getDeleteFileIds() {
        return deleteFileIds;
    }

    /**
     * 设置 删除附件ID
     * @param deleteFileIds 删除附件ID
     */
    public void setDeleteFileIds(String deleteFileIds) {
        this.deleteFileIds = deleteFileIds;
    }
}
