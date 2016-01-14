package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;

/**
 * Created by xgq on 2015/7/21.
 */
public class PageParam implements Serializable {
    private int currentPage; // 从0页开始

    private int pageSize;  // 每页数据显示数量

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getRecordStart() {
        return this.currentPage * this.pageSize;
    }
}
