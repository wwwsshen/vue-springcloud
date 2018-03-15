package org.ec.mh.dto.MH0103;

import org.ec.utils.dto.ResponseDTO;

/**
 * MH0103/A01 文章详情数据获取: 附件
 * 设计者:   张坤祥
 * 更新日期: 2018/2/26
 */
public class MH0103A01S01DTO extends ResponseDTO {

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 下载次数
     */
    private Integer downloadCount;


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

    /**
     * 获取 下载次数
     * @return downloadCount 下载次数
     */
    public Integer getDownloadCount() {
        return downloadCount;
    }

    /**
     * 设置 下载次数
     * @param downloadCount 下载次数
     */
    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }
}
