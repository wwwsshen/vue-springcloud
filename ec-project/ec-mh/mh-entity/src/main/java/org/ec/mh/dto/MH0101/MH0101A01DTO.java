package org.ec.mh.dto.MH0101;

import org.ec.utils.dto.ResponseDTO;
import java.util.List;

/**
 * MH0101/A01 导航栏数据获取: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0101A01DTO extends ResponseDTO {

    /**
     * 标题
     */
    private String name;

    /**
     * 链接地址
     */
    private String link;

    /**
     * 子导航目录
     */
    private List<MH0101A01S01DTO> children;


    /**
     * 获取 标题
     * @return name 标题
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 标题
     * @param name 标题
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 链接地址
     * @return link 链接地址
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置 链接地址
     * @param link 链接地址
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 获取 子导航目录
     * @return children 子导航目录
     */
    public List<MH0101A01S01DTO> getChildren() {
        return children;
    }

    /**
     * 设置 子导航目录
     * @param children 子导航目录
     */
    public void setChildren(List<MH0101A01S01DTO> children) {
        this.children = children;
    }
}
