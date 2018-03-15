package org.ec.mh.dto.MH0201;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

/**
 * MH0201/A01 文章新建提交: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0201A01InputDTO extends RequestDTO {

    /**
     * 文章ID
     */
    @NotNull
    private Integer id;

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
     * 获取 文章ID
     * @return id 文章ID
     */
    @ApiModelProperty(value = "文章ID", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    /**
     * 设置 文章ID
     * @param id 文章ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
}
