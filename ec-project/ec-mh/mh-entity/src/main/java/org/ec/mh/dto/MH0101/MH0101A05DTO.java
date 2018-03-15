package org.ec.mh.dto.MH0101;

import org.ec.utils.dto.ResponseDTO;
import java.util.List;

/**
 * MH0101/A05 板块文章获取: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/26
 */
public class MH0101A05DTO extends ResponseDTO {

    /**
     * 板块ID
     */
    private Integer articleTypeId;

    /**
     * 板块名
     */
    private String articleTypeName;

    /**
     * 文章
     */
    private List<MH0101A05S01DTO> articles;


    /**
     * 获取 板块ID
     * @return articleTypeId 板块ID
     */
    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    /**
     * 设置 板块ID
     * @param articleTypeId 板块ID
     */
    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    /**
     * 获取 板块名
     * @return articleTypeName 板块名
     */
    public String getArticleTypeName() {
        return articleTypeName;
    }

    /**
     * 设置 板块名
     * @param articleTypeName 板块名
     */
    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName;
    }

    /**
     * 获取 文章
     * @return articles 文章
     */
    public List<MH0101A05S01DTO> getArticles() {
        return articles;
    }

    /**
     * 设置 文章
     * @param articles 文章
     */
    public void setArticles(List<MH0101A05S01DTO> articles) {
        this.articles = articles;
    }
}
