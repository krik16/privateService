package com.rongyi.rpb.common.pay.weixin.model;

import java.io.Serializable;

/**
 * Created by kejun on 2016/1/13.
 */
public class PaySignData {

    public String payNo;

    public Integer totalFee;

    public String body;

    public Integer orderType;

    public String timeStart;

    public String timeExpire;

    public String publicCode;

    public String openId;

    public String mallId;

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getPublicCode() {
        return publicCode;
    }

    public void setPublicCode(String publicCode) {
        this.publicCode = publicCode;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    @Override
    public String toString() {
        return "PaySignData{" +
                "payNo='" + payNo + '\'' +
                ", totalFee=" + totalFee +
                ", body='" + body + '\'' +
                ", orderType=" + orderType +
                ", timeStart='" + timeStart + '\'' +
                ", timeExpire='" + timeExpire + '\'' +
                ", publicCode='" + publicCode + '\'' +
                ", openId='" + openId + '\'' +
                ", mallId='" + mallId + '\'' +
                '}';
    }
}
