package com.rongyi.easy.notice.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class MMNoticeParam implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String jsessionid;//用户登录的sessionId

    private int currentpage;

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

    public int getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(int currentpage) {
        this.currentpage = currentpage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public MMNoticeParam(String jsessionid, int currentpage, String shopId, int pageSize) {
        this.jsessionid = jsessionid;
        this.currentpage = currentpage;
        this.shopId = shopId;
        this.pageSize = pageSize;
    }

    public MMNoticeParam() {

    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("jsessionid", jsessionid).append("currentpage", currentpage).append("shopId", shopId).append("pageSize", pageSize).toString();
    }
}
