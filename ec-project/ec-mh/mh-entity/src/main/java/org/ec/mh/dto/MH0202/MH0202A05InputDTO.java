package org.ec.mh.dto.MH0202;

import org.ec.utils.dto.RequestDTO;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;

/**
 * MH0202/A05 文章分类删除: 请求参数
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0202A05InputDTO extends RequestDTO {

    /**
     * 分类ID
     */
    @NotNull
    private Integer id;


    /**
     * 获取 分类ID
     * @return id 分类ID
     */
    @ApiModelProperty(value = "分类ID", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    /**
     * 设置 分类ID
     * @param id 分类ID
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
