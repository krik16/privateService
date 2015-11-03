package com.rongyi.easy.coupon.param;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> develop-yuzhijian

/**
 * 用户红包参数
 */
public class UserRedenvelopeParam implements Serializable {
<<<<<<< HEAD
    private int pageSize = 10;
    private int currentPage = 0;
    private String userId;
    private String productId;
    private Integer status;
    private String orderBy;
    private List<Integer> statusList;
=======
    private Integer pageSize = 10;
    private Integer currentPage;
    private String userId;
    private String userName;
    private String productId;
    private Integer status;
    private String orderBy;
    private Boolean isExpired;//是否过期
    private Integer relatedType;// 全场[0] 商品[1]
>>>>>>> develop-yuzhijian

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

<<<<<<< HEAD
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
=======

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
>>>>>>> develop-yuzhijian
        this.currentPage = currentPage;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

<<<<<<< HEAD

    public List<Integer> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Integer> statusList) {
        this.statusList = statusList;
=======
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

    public Integer getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(Integer relatedType) {
        this.relatedType = relatedType;
    }

    public int getOffset() {
        if (currentPage == null || currentPage < 0)
            this.currentPage = 0;
        return this.currentPage * this.pageSize;
>>>>>>> develop-yuzhijian
    }
}
