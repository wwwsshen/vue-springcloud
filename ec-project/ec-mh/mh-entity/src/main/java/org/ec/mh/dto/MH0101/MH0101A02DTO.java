package org.ec.mh.dto.MH0101;

import org.ec.utils.dto.ResponseDTO;

/**
 * MH0101/A02 轮播图数据获取: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/26
 */
public class MH0101A02DTO extends ResponseDTO {

    /**
     * 标题
     */
    private String title;

    /**
     * 链接
     */
    private String link;

    /**
     * 图片
     */
    private String imagePath;


    /**
     * 获取 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取 链接
     * @return link 链接
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置 链接
     * @param link 链接
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 获取 图片
     * @return imagePath 图片
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * 设置 图片
     * @param imagePath 图片
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
