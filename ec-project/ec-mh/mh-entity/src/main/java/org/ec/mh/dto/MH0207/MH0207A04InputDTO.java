package org.ec.mh.dto.MH0207;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * MH0207/A04 信件办理结果提交: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0207A04InputDTO extends RequestDTO {

    /**
     * 信件ID
     */
    @NotNull
    private Integer id;

    /**
     * 是否公开
     */
    @NotNull
    private Integer open;

    /**
     * 回复内容
     */
    @NotBlank
    private String handleContent;


    /**
     * 获取 信件ID
     * @return id 信件ID
     */
    @ApiModelProperty(value = "信件ID", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    /**
     * 设置 信件ID
     * @param id 信件ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 是否公开
     * @return open 是否公开
     */
    @ApiModelProperty(value = "是否公开", name = "open", dataType = "Integer")
    public Integer getOpen() {
        return open;
    }

    /**
     * 设置 是否公开
     * @param open 是否公开
     */
    public void setOpen(Integer open) {
        this.open = open;
    }

    /**
     * 获取 回复内容
     * @return handleContent 回复内容
     */
    @ApiModelProperty(value = "回复内容", name = "handleContent", dataType = "String")
    public String getHandleContent() {
        return handleContent;
    }

    /**
     * 设置 回复内容
     * @param handleContent 回复内容
     */
    public void setHandleContent(String handleContent) {
        this.handleContent = handleContent;
    }
}
