package com.rongyi.easy.coupon.param;

import java.io.Serializable;

/**
 * Description:
 * Author: yb
 * DATE: 2017/2/7 11:39
 * Package:com.rongyi.easy.coupon.param
 * Project:message-center
 */
public class OutCouponDetailQueryParam implements Serializable {
    private Integer currentPage;
    private Integer pageSize;
    private Integer status;
    private String useEndAt;
    private String useStartAt;
    private String couponId;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OutCouponDetailQueryParam{");
        sb.append("currentPage=").append(currentPage);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", status=").append(status);
        sb.append(", useEndAt='").append(useEndAt).append('\'');
        sb.append(", useStartAt='").append(useStartAt).append('\'');
        sb.append(", couponId='").append(couponId).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Integer getCurrentPage() {
        return currentPage==null?1:currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize==null?10:pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUseEndAt() {
        return useEndAt;
    }

    public void setUseEndAt(String useEndAt) {
        this.useEndAt = useEndAt;
    }

    public String getUseStartAt() {
        return useStartAt;
    }

    public void setUseStartAt(String useStartAt) {
        this.useStartAt = useStartAt;
    }
}
