package org.ec.mh.dto.MH0201;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;

/**
 * MH0201/A03 文章删除: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0201A03InputDTO extends RequestDTO {

    /**
     * 文章ID
     */
    @NotNull
    private Integer id;


    /**
     * 获取 文章ID
     * @return id 文章ID
     */
    @ApiModelProperty(value = "文章ID", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    /**
     * 设置 文章ID
     * @param id 文章ID
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
