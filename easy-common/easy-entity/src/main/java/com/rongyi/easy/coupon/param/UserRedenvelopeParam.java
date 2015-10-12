package com.rongyi.easy.coupon.param;

import java.io.Serializable;

/**
 * 用户红包参数
 */
public class UserRedenvelopeParam implements Serializable {
    private int pageSize = 10;
    private int currentPage = 0;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
