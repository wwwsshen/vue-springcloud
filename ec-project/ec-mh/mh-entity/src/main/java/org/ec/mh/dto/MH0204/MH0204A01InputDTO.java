package org.ec.mh.dto.MH0204;

import org.ec.utils.dto.RequestDTO;
import io.swagger.annotations.ApiModelProperty;

/**
 * MH0204/A01 导航栏列表获取: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0204A01InputDTO extends RequestDTO {

    /**
     * 是否包含子导航栏目
     */
    private Integer withChildren;


    /**
     * 获取 是否包含子导航栏目
     * @return withChildren 是否包含子导航栏目
     */
    @ApiModelProperty(value = "是否包含子导航栏目", name = "withChildren", dataType = "Integer")
    public Integer getWithChildren() {
        return withChildren;
    }

    /**
     * 设置 是否包含子导航栏目
     * @param withChildren 是否包含子导航栏目
     */
    public void setWithChildren(Integer withChildren) {
        this.withChildren = withChildren;
    }
}
