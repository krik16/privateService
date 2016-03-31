package com.rongyi.easy.notice.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class NoticeQueryParam implements Serializable {
    private static final int PAGESIZE = 10;
    private static final int CURRENTPAGE = 1;
    /**
     * 当前页
     */
    private int currentPage;
    /**
     * 每页显示的数量
     */
    private int pageSize;
    /**
     * lilmit (0)
     */
    private int offset;
    /**
     * 店铺id
     */
    private String shopId;
    private String shopName;
    private Integer publishStatus;
    private Integer checkStatus;
    private Integer noticeStatus;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("currentPage", currentPage).append("pageSize", pageSize).append("offset", offset).append("shopId", shopId).append("shopName", shopName).append("publishStatus", publishStatus).append("checkStatus", checkStatus).append("whoUse", whoUse).append("noticeStatus",noticeStatus).toString();
    }

    public Integer getWhoUse() {
        return whoUse;
    }

    public void setWhoUse(Integer whoUse) {
        this.whoUse = whoUse;
    }

    private Integer whoUse;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public int getCurrentPage() {
        return currentPage == 0 ? CURRENTPAGE : currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize == 0 ? PAGESIZE : pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return (this.getCurrentPage() - 1) * this.getPageSize();
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public static int getPagesize() {
        return PAGESIZE;
    }

    public static int getCurrentpage() {
        return CURRENTPAGE;
    }

    public Integer getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(Integer noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public NoticeQueryParam() {
    }

    public NoticeQueryParam(String shopId, Integer publishStatus, int currentPage, int pageSize) {
        this.shopId = shopId;
        this.publishStatus = publishStatus;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }
}
