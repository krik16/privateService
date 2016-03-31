package com.rongyi.easy.activity.entity.vo;

import java.io.Serializable;

public class PushListVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int status;
    private int pageSize;
    private int pageNo;

    public PushListVo() {
        pageSize = 15;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public String toString() {
        return "PushListVo [name=" + name + ", status=" + status + ", pageSize=" + pageSize
            + ", pageNo=" + pageNo + "]";
    }

    public PushListVo(int status) {
        this.status = status;
    }

    public PushListVo(String name, int status, int pageSize, int pageNo) {
        this.name = name;
        this.status = status;
        this.pageSize = pageSize;
        this.pageNo = pageNo;
    }
}
