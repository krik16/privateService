package com.rongyi.easy.tradecenter;

import com.rongyi.core.util.Util;

import java.io.Serializable;
import java.util.Date;

/**
 * 哈根达斯 - 记录表
 *
 * @author wangjh7
 * @date 2016-08-8
 */
public class TradeValidRecordHgdz implements Serializable {
    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    private String dealId;

    private String couponId;

    private String couponCode;

    private Integer status;

    private Date statusChangeTime;

    private String seller;

    private String shop;

    private Date createAt;

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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStatusChangeTime() {
        return statusChangeTime;
    }

    public void setStatusChangeTime(Date statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
    }

    @Override
    public String toString() {
        return "TradeValidRecordHgdz{" +
                "couponCode='" + Util.hideString(couponCode) + '\'' +
                ", dealId='" + dealId + '\'' +
                ", couponId='" + couponId + '\'' +
                ", status=" + status +
                ", statusChangeTime=" + statusChangeTime +
                ", seller='" + seller + '\'' +
                ", shop='" + shop + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}