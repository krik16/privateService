package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.Date;

public class ActivityDetailVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer detailId; // 优惠Id

    private String code; // 优惠券码

    private String itemName; // 优惠券名称

    private Integer status; // 使用状态

    private Date startTime; // 有效期始

    private Date endTime; // 有效期止

    private String couponId;//卡券Id

    private double origPrice; //原价

    private double currPrice;//现价


    @Deprecated
    public Integer getActivityDetailId() {
        return detailId;
    }

    @Deprecated
    public void setActivityDetailId(Integer activityDetailId) {
        this.detailId = activityDetailId;
    }

    @Deprecated
    public String getActivityCode() {
        return code;
    }

    @Deprecated
    public void setActivityCode(String activityCode) {
        this.code = activityCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(double origPrice) {
        this.origPrice = origPrice;
    }

    public double getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(double currPrice) {
        this.currPrice = currPrice;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}