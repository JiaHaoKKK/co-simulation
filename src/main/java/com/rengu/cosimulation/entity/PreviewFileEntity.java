package com.rengu.cosimulation.entity;

import java.io.Serializable;

/**
 * Created by chicheng on 2017/12/27.
 */
public class PreviewFileEntity implements Serializable {
    //  预览文件ID
    private String fileId;
    //  预览文件地址
    private String filePath;
    //  预览文件的大小
    private long fileSize;
    //  压缩包文件树结构
    private String fileTree;
    //  文件类型
    private String originalMIMEType;
    //  转换文件名字
    private String conventedFileName;

    public String getOriginalMIMEType() {
        return originalMIMEType;
    }

    public void setOriginalMIMEType(String originalMIMEType) {
        this.originalMIMEType = originalMIMEType;
    }

    public String getFileId() {

        return fileId;
    }

    public void setFileId(String fileId) {

        this.fileId = fileId;
    }

    public String getFilePath() {

        return filePath;
    }

    public void setFilePath(String filePath) {

        this.filePath = filePath;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileTree() {
        return fileTree;
    }

    public void setFileTree(String fileTree) {
        this.fileTree = fileTree;
    }

    public String getConventedFileName() {
        return conventedFileName;
    }

    public void setConventedFileName(String conventedFileName) {
        this.conventedFileName = conventedFileName;
    }
}
