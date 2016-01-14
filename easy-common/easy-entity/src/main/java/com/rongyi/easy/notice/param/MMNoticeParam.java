package com.rongyi.easy.notice.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class MMNoticeParam implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String jsessionid;//用户登录的sessionId

    private int currentPage;

    private String shopId;//店铺mongoId

    private int pageSize;

    public String getJsessionid() {
        return jsessionid;
    }

    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }

    public String getShopId() {
        return shopId;
    }


    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

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

    public MMNoticeParam(String jsessionid, int currentPage, String shopId, int pageSize) {
        this.jsessionid = jsessionid;
        this.currentPage = currentPage;
        this.shopId = shopId;
        this.pageSize = pageSize;
    }

    public MMNoticeParam() {

    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("jsessionid", jsessionid).append("currentPage", currentPage).append("shopId", shopId).append("pageSize", pageSize).toString();
    }
}
