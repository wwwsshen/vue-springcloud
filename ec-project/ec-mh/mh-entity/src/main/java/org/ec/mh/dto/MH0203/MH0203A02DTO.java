package org.ec.mh.dto.MH0203;

import org.ec.utils.dto.ResponseDTO;

/**
 * MH0203/A02 轮播图设置新增: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0203A02DTO extends ResponseDTO {

    /**
     * ID
     */
    private Integer id;


    /**
     * 获取 ID
     * @return id ID
     */
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
