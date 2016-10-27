package com.rongyi.easy.usercenter.dto.malllife;

import java.io.Serializable;

/*
 * Description:  
 * time:  2016/10/12
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * yuzhijian             2016/10/12              1.0            创建文件
 * Author   yuzhijian@rongyi.com || yuxia2217@163.com
 * Copyright (C),上海容易网电子商务有限公司
 */
public class YkCodeDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /** id */
    private int id;

    private String codeNo; //码表

    private int version;

    private String userId; //用户ID

    private int status; //状态


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(String codeNo) {
        this.codeNo = codeNo;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
