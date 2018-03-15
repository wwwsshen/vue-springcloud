package org.ec.mh.dto.MH0201;

import org.ec.utils.dto.ResponseDTO;

/**
 * MH0201/A05 文章编辑数据获取: 附件
 * 设计者:   张坤祥
 * 更新日期: 2018/2/27
 */
public class MH0201A05S01DTO extends ResponseDTO {

    /**
     * 附件ID
     */
    private Integer id;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 文件路径
     */
    private String filePath;


    /**
     * 获取 附件ID
     * @return id 附件ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 附件ID
     * @param id 附件ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * 获取 文件类型
     * @return fileType 文件类型
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * 设置 文件类型
     * @param fileType 文件类型
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * 获取 文件路径
     * @return filePath 文件路径
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置 文件路径
     * @param filePath 文件路径
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
