package com.rongyi.easy.coupon.param;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户红包参数
 */
public class UserRedenvelopeParam implements Serializable {
    private int pageSize = 10;
    private int currentPage = 1;
    private int offset = 0;
    private String userId;
    private String productId;
    private Integer status;
    private String orderBy;
    private Date validEndAt;//验码截止时间

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

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Date getValidEndAt() {
        return validEndAt;
    }

    public void setValidEndAt(Date validEndAt) {
        this.validEndAt = validEndAt;
    }

    public int getOffset() {
        return this.currentPage * this.pageSize;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
