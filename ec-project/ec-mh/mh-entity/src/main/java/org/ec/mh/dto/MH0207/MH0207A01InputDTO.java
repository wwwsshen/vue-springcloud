package org.ec.mh.dto.MH0207;

import org.ec.utils.dto.RequestDTO;
import io.swagger.annotations.ApiModelProperty;

/**
 * MH0207/A01 信件列表获取（分页&查询）: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0207A01InputDTO extends RequestDTO {

    /**
     * 当前页
     */
    private Integer page;

    /**
     * 分页大小
     */
    private Integer pageSize;

    /**
     * 信件状态
     */
    private Integer status;

    /**
     * 提交到单位ID
     */
    private Integer toOrganizationId;

    /**
     * 处理单位ID
     */
    private Integer handleOrganizationId;

    /**
     * 提交人姓名或手机号码
     */
    private String keyWordAddresser;

    /**
     * 标题或内容
     */
    private String keyWord;


    /**
     * 获取 当前页
     * @return page 当前页
     */
    @ApiModelProperty(value = "当前页", name = "page", dataType = "Integer")
    public Integer getPage() {
        return page;
    }

    /**
     * 设置 当前页
     * @param page 当前页
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 获取 分页大小
     * @return pageSize 分页大小
     */
    @ApiModelProperty(value = "分页大小", name = "pageSize", dataType = "Integer")
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置 分页大小
     * @param pageSize 分页大小
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获取 信件状态
     * @return status 信件状态
     */
    @ApiModelProperty(value = "信件状态", name = "status", dataType = "Integer")
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 信件状态
     * @param status 信件状态
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取 处理单位ID
     * @return handleOrganizationId 处理单位ID
     */
    @ApiModelProperty(value = "处理单位ID", name = "handleOrganizationId", dataType = "Integer")
    public Integer getHandleOrganizationId() {
        return handleOrganizationId;
    }

    /**
     * 设置 处理单位ID
     * @param handleOrganizationId 处理单位ID
     */
    public void setHandleOrganizationId(Integer handleOrganizationId) {
        this.handleOrganizationId = handleOrganizationId;
    }

    /**
     * 获取 提交人姓名或手机号码
     * @return keyWordAddresser 提交人姓名或手机号码
     */
    @ApiModelProperty(value = "提交人姓名或手机号码", name = "keyWordAddresser", dataType = "String")
    public String getKeyWordAddresser() {
        return keyWordAddresser;
    }

    /**
     * 设置 提交人姓名或手机号码
     * @param keyWordAddresser 提交人姓名或手机号码
     */
    public void setKeyWordAddresser(String keyWordAddresser) {
        this.keyWordAddresser = keyWordAddresser;
    }

    /**
     * 获取 标题或内容
     * @return keyWord 标题或内容
     */
    @ApiModelProperty(value = "标题或内容", name = "keyWord", dataType = "String")
    public String getKeyWord() {
        return keyWord;
    }

    /**
     * 设置 标题或内容
     * @param keyWord 标题或内容
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
}
