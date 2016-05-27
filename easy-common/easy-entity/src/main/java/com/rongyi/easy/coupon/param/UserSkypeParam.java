package com.rongyi.easy.coupon.param;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * Description:用户抵扣券参数
 * Author: 袁波
 * DATE: 2016/5/5 12:43
 * Package:com.rongyi.easy.coupon.param
 * Project:easy-market
 */
public class UserSkypeParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;
    /**
     * 抵扣券的类型；0：抵扣券（满减）；1：立减（红包）；
     */
    private Integer type;
    /**
     * 领取结束时间
     */
    private Date receiveEndAt;

    /**
     * 领取开始时间
     */
    private Date receiveStartAt;

    /**
     * 活动类型
     */
    private Integer activityType;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 活动名称
     */
    private String activityName;

    private String couponCode;

    private String couponId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getReceiveEndAt() {
        if (receiveEndAt == null) {
            Calendar todayEnd = Calendar.getInstance();
            todayEnd.set(Calendar.HOUR, 23);
            todayEnd.set(Calendar.MINUTE, 59);
            todayEnd.set(Calendar.SECOND, 59);
            todayEnd.set(Calendar.MILLISECOND, 999);
            return todayEnd.getTime();
        }
        return receiveEndAt;
    }

    public void setReceiveEndAt(Date receiveEndAt) {
        this.receiveEndAt = receiveEndAt;
    }

    public Date getReceiveStartAt() {
        if(receiveStartAt==null){
            Calendar todayStart = Calendar.getInstance();
            todayStart.set(Calendar.HOUR, 0);
            todayStart.set(Calendar.MINUTE, 0);
            todayStart.set(Calendar.SECOND, 0);
            todayStart.set(Calendar.MILLISECOND, 0);
            return todayStart.getTime();
        }
        return receiveStartAt;
    }

    public void setReceiveStartAt(Date receiveStartAt) {
        this.receiveStartAt = receiveStartAt;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserSkypeParam{");
        sb.append("userId='").append(userId).append('\'');
        sb.append(", type=").append(type);
        sb.append(", receiveEndAt=").append(receiveEndAt);
        sb.append(", receiveStartAt=").append(receiveStartAt);
        sb.append(", activityType=").append(activityType);
        sb.append(", activityId=").append(activityId);
        sb.append(", activityName='").append(activityName).append('\'');
        sb.append(", couponCode='").append(couponCode).append('\'');
        sb.append(", couponId='").append(couponId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
