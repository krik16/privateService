package com.rongyi.easy.coupon.entity.mysql;

import java.util.Date;

public class CouponRejectRecord {
    private Integer id;

    /**
     * 卡券id
     */
    private Integer couponId;

    /**
     * 未通过或者下架原因
     */
    private String reason;

    /**
     * 审核[verify], 下架[offstock]
     */
    private String type;

    /**
     * 创建时间
     */
    private Date createAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}