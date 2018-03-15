package org.ec.mh.dto.MH0207;

import org.ec.utils.dto.ResponseDTO;

/**
 * MH0207/A02 信件详细信息获取: 信件附件
 * 设计者:   张坤祥
 * 更新日期: 2018/3/8
 */
public class MH0207A02S01DTO extends ResponseDTO {

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 附件位置
     */
    private String filePath;

    /**
     * 附件大小
     */
    private Float size;


    /**
     * 获取 文件名
     * @return fileName 文件名
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置 文件名
     * @param fileName 文件名
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 获取 附件位置
     * @return filePath 附件位置
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置 附件位置
     * @param filePath 附件位置
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 获取 附件大小
     * @return size 附件大小
     */
    public Float getSize() {
        return size;
    }

    /**
     * 设置 附件大小
     * @param size 附件大小
     */
    public void setSize(Float size) {
        this.size = size;
    }
}
