package com.rongyi.easy.coupon.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class CouponParam implements Serializable {


    /**
     * 当前页
     */
    private Integer currentPage;

    /**
     * 页大小
     */
    private Integer pageSize;

    /**
     * 店铺ID
     */
    private String shopId;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 券码
     */
    private String couponCode;

    /**
     * 券Id
     */
    private String couponId;

    /**
     * 是否下架
     */
    private Boolean isOffStock;

    private Map<String, String> orderBy = new HashMap<>();

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }


    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Map<String, String> getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Map<String, String> orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsOffStock() {
        return isOffStock;
    }

    public void setIsOffStock(Boolean isOffStock) {
        this.isOffStock = isOffStock;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .append("shopId", shopId)
                .append("status", status)
                .append("couponCode", couponCode)
                .append("couponId", couponId)
                .append("isOffStock", isOffStock)
                .append("orderBy", orderBy)
                .toString();
    }
}
