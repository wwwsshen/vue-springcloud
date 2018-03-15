package org.ec.mh.dto.MH0102;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;

/**
 * MH0102/A03 目录统计数据获取: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/26
 */
public class MH0102A03InputDTO extends RequestDTO {

    /**
     * 板块ID
     */
    @NotNull
    private Integer articleTypeId;


    /**
     * 获取 板块ID
     * @return articleTypeId 板块ID
     */
    @ApiModelProperty(value = "板块ID", name = "articleTypeId", dataType = "Integer")
    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    /**
     * 设置 板块ID
     * @param articleTypeId 板块ID
     */
    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }
}
