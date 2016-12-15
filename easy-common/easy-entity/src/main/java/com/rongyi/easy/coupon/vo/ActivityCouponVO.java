package com.rongyi.easy.coupon.vo;

import java.io.Serializable;

/**
 * Description: 红包领取 返回 独享
 * Author: yb
 * DATE: 2016/12/15 17:48
 * Package:com.rongyi.easy.coupon.vo
 * Project:easy-api
 */
public class ActivityCouponVO implements Serializable{
    //红包、抵扣券是否领取成功
    private boolean receiveResult;
    //卡券id
    private String couponId;
    //卡券名称
    private String couponName;
    //红包抵扣的价格，抵扣券中抵扣的价格
    private Double money;
    //抵扣券满多少可用的价格
    private Double conditionPrice;
    // 0：满减 （抵扣券）；1：立减 (红包)
    private Integer preferentialType;

    public boolean isReceiveResult() {
        return receiveResult;
    }

    public void setReceiveResult(boolean receiveResult) {
        this.receiveResult = receiveResult;
    }

    public String getCouponId() {
        return couponId;
    }

    public Integer getPreferentialType() {
        return preferentialType;
    }

    public void setPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getConditionPrice() {
        return conditionPrice;
    }

    public void setConditionPrice(Double conditionPrice) {
        this.conditionPrice = conditionPrice;
    }
}
