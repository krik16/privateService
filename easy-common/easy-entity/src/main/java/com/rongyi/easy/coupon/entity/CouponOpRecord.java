package com.rongyi.easy.coupon.entity;

import java.util.Date;

public class CouponOpRecord {
    private Integer id;

    private String couponId;

    private String couponName;

    private String operateContent;

    private Integer userId;

    private String userName;

    private Date createAt;

    private String mallId;

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

    public String getOperateContent() {
        return operateContent;
    }

    public void setOperateContent(String operateContent) {
        this.operateContent = operateContent;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CouponOpRecord{");
        sb.append("id=").append(id);
        sb.append(", couponId='").append(couponId).append('\'');
        sb.append(", couponName='").append(couponName).append('\'');
        sb.append(", operateContent='").append(operateContent).append('\'');
        sb.append(", userId=").append(userId);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", createAt=").append(createAt);
        sb.append(", mallId='").append(mallId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
