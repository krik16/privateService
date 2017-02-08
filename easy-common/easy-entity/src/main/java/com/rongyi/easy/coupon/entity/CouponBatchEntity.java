package com.rongyi.easy.coupon.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class CouponBatchEntity implements Serializable {
    private Integer id;

    private String couponId;

    private String couponName;

    private String batchNo;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("batchNo", batchNo)
                .append("couponId", couponId)
                .append("couponName", couponName)
                .append("isDeleted", isDeleted)
                .toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}