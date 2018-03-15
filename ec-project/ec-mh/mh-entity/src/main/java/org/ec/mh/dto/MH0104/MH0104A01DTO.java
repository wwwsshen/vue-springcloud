package org.ec.mh.dto.MH0104;

import org.ec.utils.dto.ResponseDTO;
import java.util.List;

/**
 * MH0104/A01 站内搜索（分页）: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0104A01DTO extends ResponseDTO {

    /**
     * 搜索用时
     */
    private Integer costTime;

    /**
     * 搜索结果
     */
    private List<MH0104A01S01DTO> results;


    /**
     * 获取 搜索用时
     * @return costTime 搜索用时
     */
    public Integer getCostTime() {
        return costTime;
    }

    /**
     * 设置 搜索用时
     * @param costTime 搜索用时
     */
    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    /**
     * 获取 搜索结果
     * @return results 搜索结果
     */
    public List<MH0104A01S01DTO> getResults() {
        return results;
    }

    /**
     * 设置 搜索结果
     * @param results 搜索结果
     */
    public void setResults(List<MH0104A01S01DTO> results) {
        this.results = results;
    }
}
