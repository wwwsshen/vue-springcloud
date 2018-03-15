package org.ec.mh.dto.MH0105;

import org.ec.utils.dto.RequestDTO;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import org.ec.utils.RegexpPattern;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

/**
 * MH0105/A04 信件登记提交: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0105A04InputDTO extends RequestDTO {

    /**
     * 发信人姓名
     */
    @NotBlank
    @Pattern(regexp = RegexpPattern.HANZI)
    private String addresserName;

    /**
     * 发信人手机号码
     */
    @NotBlank
    @Pattern(regexp = RegexpPattern.MOBILE)
    private String addresserMobile;

    /**
     * 发信人电子邮件
     */
    @NotBlank
    @Email
    private String addresserEmail;

    /**
     * 发信人联系地址
     */
    private String addresserAddress;

    /**
     * 提交到单位ID
     */
    @NotNull
    private Integer toOrganizationId;

    /**
     * 附件
     */
    private List<MultipartFile> files;


    /**
     * 获取 发信人姓名
     * @return addresserName 发信人姓名
     */
    @ApiModelProperty(value = "发信人姓名", name = "addresserName", dataType = "String")
    public String getAddresserName() {
        return addresserName;
    }

    /**
     * 设置 发信人姓名
     * @param addresserName 发信人姓名
     */
    public void setAddresserName(String addresserName) {
        this.addresserName = addresserName;
    }

    /**
     * 获取 发信人手机号码
     * @return addresserMobile 发信人手机号码
     */
    @ApiModelProperty(value = "发信人手机号码", name = "addresserMobile", dataType = "String")
    public String getAddresserMobile() {
        return addresserMobile;
    }

    /**
     * 设置 发信人手机号码
     * @param addresserMobile 发信人手机号码
     */
    public void setAddresserMobile(String addresserMobile) {
        this.addresserMobile = addresserMobile;
    }

    /**
     * 获取 发信人电子邮件
     * @return addresserEmail 发信人电子邮件
     */
    @ApiModelProperty(value = "发信人电子邮件", name = "addresserEmail", dataType = "String")
    public String getAddresserEmail() {
        return addresserEmail;
    }

    /**
     * 设置 发信人电子邮件
     * @param addresserEmail 发信人电子邮件
     */
    public void setAddresserEmail(String addresserEmail) {
        this.addresserEmail = addresserEmail;
    }

    /**
     * 获取 发信人联系地址
     * @return addresserAddress 发信人联系地址
     */
    @ApiModelProperty(value = "发信人联系地址", name = "addresserAddress", dataType = "String")
    public String getAddresserAddress() {
        return addresserAddress;
    }

    /**
     * 设置 发信人联系地址
     * @param addresserAddress 发信人联系地址
     */
    public void setAddresserAddress(String addresserAddress) {
        this.addresserAddress = addresserAddress;
    }

    /**
     * 获取 提交到单位ID
     * @return toOrganizationId 提交到单位ID
     */
    @ApiModelProperty(value = "提交到单位ID", name = "toOrganizationId", dataType = "Integer")
    public Integer getToOrganizationId() {
        return toOrganizationId;
    }

    /**
     * 设置 提交到单位ID
     * @param toOrganizationId 提交到单位ID
     */
    public void setToOrganizationId(Integer toOrganizationId) {
        this.toOrganizationId = toOrganizationId;
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
