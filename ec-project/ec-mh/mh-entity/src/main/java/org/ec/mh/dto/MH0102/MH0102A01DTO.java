package org.ec.mh.dto.MH0102;

import org.ec.utils.dto.ResponseDTO;
import java.util.List;

/**
 * MH0102/A01 目录数据获取: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/26
 */
public class MH0102A01DTO extends ResponseDTO {

    /**
     * 分类ID
     */
    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 子分类
     */
    private List<MH0102A01S01DTO> children;


    /**
     * 获取 分类ID
     * @return id 分类ID
     */
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

    /**
     * 获取 分类名称
     * @return name 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 分类名称
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 子分类
     * @return children 子分类
     */
    public List<MH0102A01S01DTO> getChildren() {
        return children;
    }

    /**
     * 设置 子分类
     * @param children 子分类
     */
    public void setChildren(List<MH0102A01S01DTO> children) {
        this.children = children;
    }
}
