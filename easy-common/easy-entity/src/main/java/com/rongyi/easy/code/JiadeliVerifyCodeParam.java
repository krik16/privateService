package com.rongyi.easy.code;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/12/22.
 */
public class JiadeliVerifyCodeParam implements Serializable {
    private String deviceNo;//终端号
    private String shopNo;//商户号
    private String couponCode;//券码
    private String channel;//JIADELI
    private String bizCode;//客户的业务订单号

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    @Override
    public String toString() {
        return "JiadeliVerifyCodeParam{" +
                "deviceNo='" + deviceNo + '\'' +
                ", shopNo='" + shopNo + '\'' +
                ", couponCode='" + couponCode + '\'' +
                ", channel='" + channel + '\'' +
                ", bizCode='" + bizCode + '\'' +
                '}';
    }
}
