package org.ec.mh.dto.MH0102;

import org.ec.utils.dto.RequestDTO;
import io.swagger.annotations.ApiModelProperty;

/**
 * MH0102/A01 目录数据获取: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/26
 */
public class MH0102A01InputDTO extends RequestDTO {

    /**
     * 是否包含子目录
     */
    private Integer withChildren;


    /**
     * 获取 是否包含子目录
     * @return withChildren 是否包含子目录
     */
    @ApiModelProperty(value = "是否包含子目录", name = "withChildren", dataType = "Integer")
    public Integer getWithChildren() {
        return withChildren;
    }

    /**
     * 设置 是否包含子目录
     * @param withChildren 是否包含子目录
     */
    public void setWithChildren(Integer withChildren) {
        this.withChildren = withChildren;
    }
}
