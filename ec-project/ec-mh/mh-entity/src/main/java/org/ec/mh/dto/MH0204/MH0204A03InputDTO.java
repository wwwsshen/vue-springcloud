package org.ec.mh.dto.MH0204;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;

/**
 * MH0204/A03 导航栏详细数据获取: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0204A03InputDTO extends RequestDTO {

    /**
     * 导航栏ID
     */
    @NotNull
    private Integer id;


    /**
     * 获取 导航栏ID
     * @return id 导航栏ID
     */
    @ApiModelProperty(value = "导航栏ID", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    /**
     * 设置 导航栏ID
     * @param id 导航栏ID
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
