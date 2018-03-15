package org.ec.mh.dto.MH0207;

import org.ec.utils.dto.ResponseDTO;
import java.util.List;

/**
 * MH0207/A01 信件列表获取（分页&查询）: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/28
 */
public class MH0207A01DTO extends ResponseDTO {

    /**
     * 未办理条数
     */
    private Integer unfinishedCount;

    /**
     * 信件
     */
    private List<MH0207A01S01DTO> petitionLetters;


    /**
     * 获取 未办理条数
     * @return unfinishedCount 未办理条数
     */
    public Integer getUnfinishedCount() {
        return unfinishedCount;
    }

    /**
     * 设置 未办理条数
     * @param unfinishedCount 未办理条数
     */
    public void setUnfinishedCount(Integer unfinishedCount) {
        this.unfinishedCount = unfinishedCount;
    }

    /**
     * 获取 信件
     * @return petitionLetters 信件
     */
    public List<MH0207A01S01DTO> getPetitionLetters() {
        return petitionLetters;
    }

    /**
     * 设置 信件
     * @param petitionLetters 信件
     */
    public void setPetitionLetters(List<MH0207A01S01DTO> petitionLetters) {
        this.petitionLetters = petitionLetters;
    }
}
