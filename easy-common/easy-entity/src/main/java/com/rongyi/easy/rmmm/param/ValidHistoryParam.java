package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class ValidHistoryParam implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String currentPage; // 从1页开始
    private String pageSize; // 每页数据显示数量
    private Integer date;// 时间（0所有时间，1当天，2当周，3当月，4昨天）
    private Integer status;//1我的核销 2店铺核销
    private Integer type;//0:店铺券；2：礼品券；1：活动券
    private String shopId;
    private String mallId;
    private String checkAccount;
    private Integer checkUserId;

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getCheckAccount() {
        return checkAccount;
    }

    public void setCheckAccount(String checkAccount) {
        this.checkAccount = checkAccount;
    }

    public Integer getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ValidHistoryParam{");
        sb.append("currentPage='").append(currentPage).append('\'');
        sb.append(", pageSize='").append(pageSize).append('\'');
        sb.append(", date=").append(date);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", shopId='").append(shopId).append('\'');
        sb.append(", mallId='").append(mallId).append('\'');
        sb.append(", checkAccount='").append(checkAccount).append('\'');
        sb.append(", checkUserId=").append(checkUserId);
        sb.append('}');
        return sb.toString();
    }
}
