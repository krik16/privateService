package com.rongyi.easy.baogang;

/**
 * Created by shaozhou on 2016/11/8.
 */
public class AttmentParam {
    private String fileUrl;//文件base64流字符串
    private String fileName;//文件名

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "AttmentParam{" +
                "fileUrl='" + fileUrl + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
