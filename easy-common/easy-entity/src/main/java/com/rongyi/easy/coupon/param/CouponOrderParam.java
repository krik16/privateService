package com.rongyi.easy.coupon.param;

import java.io.Serializable;

/**
 * 卡券订单参数
 * <p/>
 * 名词解释： 卡券：包括优惠券、现金券
 *
 * @author Breggor
 */
public class CouponOrderParam implements Serializable {

    private static final long serialVersionUID = 1L;
    private String activityId;// 活动id
    private String activityName;// 活动名字
    private String couponId;// 卡券Id
    private String couponCode;// 卡券码号
    private String userId;// 用户Id
    private String userSrc;// 用户渠道

    public CouponOrderParam() {
    }

    public CouponOrderParam(String couponId, String couponCode, String userId, String userSrc) {
        this.couponId = couponId;
        this.couponCode = couponCode;
        this.userId = userId;
        this.userSrc = userSrc;
    }

    public CouponOrderParam(String activityId, String activityName, String couponId, String couponCode, String userId, String userSrc) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.couponId = couponId;
        this.couponCode = couponCode;
        this.userId = userId;
        this.userSrc = userSrc;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserSrc() {
        return userSrc;
    }

    public void setUserSrc(String userSrc) {
        this.userSrc = userSrc;
    }
}
