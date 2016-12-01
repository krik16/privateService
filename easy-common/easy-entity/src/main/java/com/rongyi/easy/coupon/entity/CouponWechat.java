package com.rongyi.easy.coupon.entity;

import java.io.Serializable;
import java.util.Date;

public class CouponWechat implements Serializable {
    private Integer id;

    private String couponId;

    /**
     * 微信公众号 appId
     */
    private String wechatAppid;

    /**
     * 微信公众号，服务名
     */
    private String wechatServiceName;

    /**
     * 0:自营的微信。1：上级的微信。2：商场的微信
     */
    private Byte wechatType;

    /**
     * 0:不展示；1：展示.是否展示在卡券运营中控制
     */
    private Byte isShow;

    private Date createAt;

    private Date updateAt;

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

    public String getWechatAppid() {
        return wechatAppid;
    }

    public void setWechatAppid(String wechatAppid) {
        this.wechatAppid = wechatAppid;
    }

    public String getWechatServiceName() {
        return wechatServiceName;
    }

    public void setWechatServiceName(String wechatServiceName) {
        this.wechatServiceName = wechatServiceName;
    }

    public Byte getWechatType() {
        return wechatType;
    }

    public void setWechatType(Byte wechatType) {
        this.wechatType = wechatType;
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CouponWechat{");
        sb.append("id=").append(id);
        sb.append(", couponId='").append(couponId).append('\'');
        sb.append(", wechatAppid='").append(wechatAppid).append('\'');
        sb.append(", wechatServiceName='").append(wechatServiceName).append('\'');
        sb.append(", wechatType=").append(wechatType);
        sb.append(", isShow=").append(isShow);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateAt=").append(updateAt);
        sb.append('}');
        return sb.toString();
    }
}
