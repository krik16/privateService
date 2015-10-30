package com.rongyi.easy.coupon.param;

import java.io.Serializable;

/**
 * 用户红包参数
 */
public class UserRedenvelopeParam implements Serializable {
    private Integer pageSize = 10;
    private Integer currentPage;
    private String userId;
    private String userName;
    private String productId;
    private Integer status;
    private String orderBy;
    private Boolean isExpired;//是否过期

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Boolean getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(Boolean isExpired) {
        this.isExpired = isExpired;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public int getOffset() {
        if (currentPage == null || currentPage < 0)
            this.currentPage = 0;
        return this.currentPage * this.pageSize;
    }
}
