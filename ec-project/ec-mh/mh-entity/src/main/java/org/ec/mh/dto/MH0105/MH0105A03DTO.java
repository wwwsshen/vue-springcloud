package org.ec.mh.dto.MH0105;

import org.ec.utils.dto.ResponseDTO;

/**
 * MH0105/A03 信件提交单位数据获取（下拉菜单用）: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0105A03DTO extends ResponseDTO {

    /**
     * 单位ID
     */
    private Integer id;

    /**
     * 单位名称
     */
    private String name;


    /**
     * 获取 单位ID
     * @return id 单位ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 单位ID
     * @param id 单位ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 单位名称
     * @return name 单位名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 单位名称
     * @param name 单位名称
     */
    public void setName(String name) {
        this.name = name;
    }
}
