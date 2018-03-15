package org.ec.mh.dto.MH0207;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;

/**
 * MH0207/A05 修改信件状态: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0207A05InputDTO extends RequestDTO {

    /**
     * 信件ID
     */
    @NotNull
    private Integer id;


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
}
