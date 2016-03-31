package com.rongyi.easy.malllife.param;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/9/23
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/9/23              1.0            创建文件
 *
 */


import java.io.Serializable;
import java.util.Date;

public class RedLogs implements Serializable {


    private static final long serialVersionUID = 1L;


    private String phone; //手机号

    private String channel; //来源渠道 HGDSLHJ(哈根达斯)||（QMCAIFU）全民财富

    private String isred;//0领取成功 1领取失败 2重复领取(失败状态)

    private String isrongyi;//0注册会员 1老的容易会员

    private String userId;//领取员会的Id

    private String couponId;//优惠，红包Id

    private String remarks;//备注



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getIsred() {
        return isred;
    }

    public void setIsred(String isred) {
        this.isred = isred;
    }

    public String getIsrongyi() {
        return isrongyi;
    }

    public void setIsrongyi(String isrongyi) {
        this.isrongyi = isrongyi;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


}
