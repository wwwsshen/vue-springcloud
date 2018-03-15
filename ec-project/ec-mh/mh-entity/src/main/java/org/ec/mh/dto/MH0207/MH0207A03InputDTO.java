package org.ec.mh.dto.MH0207;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * MH0207/A03 转发其他单位: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0207A03InputDTO extends RequestDTO {

    /**
     * 信件ID
     */
    @NotNull
    private Integer id;

    /**
     * 转发到单位ID
     */
    @NotNull
    private Integer toOrganizationId;

    /**
     * 转发理由
     */
    @NotBlank
    private String reason;


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
     * 获取 转发到单位ID
     * @return toOrganizationId 转发到单位ID
     */
    @ApiModelProperty(value = "转发到单位ID", name = "toOrganizationId", dataType = "Integer")
    public Integer getToOrganizationId() {
        return toOrganizationId;
    }

    /**
     * 设置 转发到单位ID
     * @param toOrganizationId 转发到单位ID
     */
    public void setToOrganizationId(Integer toOrganizationId) {
        this.toOrganizationId = toOrganizationId;
    }

    /**
     * 获取 转发理由
     * @return reason 转发理由
     */
    @ApiModelProperty(value = "转发理由", name = "reason", dataType = "String")
    public String getReason() {
        return reason;
    }

    /**
     * 设置 转发理由
     * @param reason 转发理由
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
