package org.ec.mh.dto.MH0101;

import org.ec.utils.dto.ResponseDTO;

/**
 * MH0101/A03 办事服务入口数据获取: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/26
 */
public class MH0101A03DTO extends ResponseDTO {

    /**
     * 名称
     */
    private String name;

    /**
     * 图标
     */
    private String iconPath;

    /**
     * 链接地址
     */
    private String link;


    /**
     * 获取 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 图标
     * @return iconPath 图标
     */
    public String getIconPath() {
        return iconPath;
    }

    /**
     * 设置 图标
     * @param iconPath 图标
     */
    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
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
}
