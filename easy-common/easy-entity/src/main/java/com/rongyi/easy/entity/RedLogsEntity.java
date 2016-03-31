package com.rongyi.easy.entity;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  注册领取红包接口
 * time:  2015/9/22
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/9/22              1.0            创建文件
 *
 */

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.io.Serializable;
import java.util.Date;

@Entity(value = "red_logs", noClassnameStored = true)
public class RedLogsEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;// 表id

    @Property("phone")
    private String phone; //手机号

    @Property("channel")
    private String channel; //来源渠道 HGDSLHJ(哈根达斯)||（QMCAIFU）全民财富

    @Property("is_red")
    private String isred;////0领取成功 1领取失败 2重复领取(失败状态)

    @Property("is_rongyi")
    private String isrongyi;//0注册会员 1老的容易会员

    @Property("user_id")
    private String userId;//领取员会的Id

    @Property("coupon_id")
    private String couponId;//优惠，红包Id

    @Property("remarks")
    private String remarks;//备注

    @Property("created_at")
    private Date createdAt; //创建时间


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
