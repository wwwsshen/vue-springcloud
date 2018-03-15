package org.ec.mh.dto.MH0105;

import org.ec.utils.dto.RequestDTO;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import org.ec.utils.RegexpPattern;
import io.swagger.annotations.ApiModelProperty;

/**
 * MH0105/A02 信件办理结果查询: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0105A02InputDTO extends RequestDTO {

    /**
     * 查询编码
     */
    @NotBlank
    @Pattern(regexp = RegexpPattern.ALPHANUMERIC)
    private String queryNumber;

    /**
     * 手机号码
     */
    @NotBlank
    @Pattern(regexp = RegexpPattern.MOBILE)
    private String mobile;

    /**
     * 验证码
     */
    @NotBlank
    private String verificationCode;


    /**
     * 获取 查询编码
     * @return queryNumber 查询编码
     */
    @ApiModelProperty(value = "查询编码", name = "queryNumber", dataType = "String")
    public String getQueryNumber() {
        return queryNumber;
    }

    /**
     * 设置 查询编码
     * @param queryNumber 查询编码
     */
    public void setQueryNumber(String queryNumber) {
        this.queryNumber = queryNumber;
    }

    /**
     * 获取 手机号码
     * @return mobile 手机号码
     */
    @ApiModelProperty(value = "手机号码", name = "mobile", dataType = "String")
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置 手机号码
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取 验证码
     * @return verificationCode 验证码
     */
    @ApiModelProperty(value = "验证码", name = "verificationCode", dataType = "String")
    public String getVerificationCode() {
        return verificationCode;
    }

    /**
     * 设置 验证码
     * @param verificationCode 验证码
     */
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
