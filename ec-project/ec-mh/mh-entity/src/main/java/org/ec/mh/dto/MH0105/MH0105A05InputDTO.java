package org.ec.mh.dto.MH0105;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;

/**
 * MH0105/A05 信件详情: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/3/8
 */
public class MH0105A05InputDTO extends RequestDTO {

    /**
     * ID
     */
    @NotNull
    private Integer id;


    /**
     * 获取 ID
     * @return id ID
     */
    @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    /**
     * 设置 ID
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
