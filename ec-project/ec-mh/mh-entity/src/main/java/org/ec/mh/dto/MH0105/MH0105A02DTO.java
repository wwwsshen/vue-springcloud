package org.ec.mh.dto.MH0105;

import org.ec.utils.dto.ResponseDTO;

/**
 * MH0105/A02 信件办理结果查询: 返回结果
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0105A02DTO extends ResponseDTO {

    /**
     * 查询编号
     */
    private String queryNumber;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 信件内容
     */
    private MH0105A02S01DTO petitionLetter;


    /**
     * 获取 查询编号
     * @return queryNumber 查询编号
     */
    public String getQueryNumber() {
        return queryNumber;
    }

    /**
     * 设置 查询编号
     * @param queryNumber 查询编号
     */
    public void setQueryNumber(String queryNumber) {
        this.queryNumber = queryNumber;
    }

    /**
     * 获取 手机号码
     * @return mobile 手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置 手机号码
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取 信件内容
     * @return petitionLetter 信件内容
     */
    public MH0105A02S01DTO getPetitionLetter() {
        return petitionLetter;
    }

    /**
     * 设置 信件内容
     * @param petitionLetter 信件内容
     */
    public void setPetitionLetter(MH0105A02S01DTO petitionLetter) {
        this.petitionLetter = petitionLetter;
    }
}
