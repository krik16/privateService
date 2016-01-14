package com.rongyi.easy.coupon.param;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 卡券订单参数
 * <p/>
 * 名词解释： 卡券：包括优惠券、红包
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
    private String userPhone;// 用户手机号
    private String userSrc;// 用户渠道
    private String commodityId;// 商品id
    private Integer discount;// 折扣价,属于红包字段 精确到分
    private List<String> couponCodes;//券码列表。用于一个订单多张卡券（中秋哈根达斯活动）


    /**
     * 0普通单
     * 1 “0元单”
     * 2扫码领券
     * 3短信push
     * 4翻牌购
     */
    private Byte business;

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

    public Byte getBusiness() {
        return business;
    }

    public void setBusiness(Byte business) {
        this.business = business;
    }

    public List<String> getCouponCodes() {
        return couponCodes;
    }

    public void setCouponCodes(List<String> couponCodes) {
        this.couponCodes = couponCodes;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("activityName", activityName)
                .append("couponId", couponId)
                .append("couponCode", couponCode)
                .append("userId", userId)
                .append("userSrc", userSrc)
                .append("couponCodes", couponCodes)
                .append("business", business)
                .append("discount", discount)
                .append("commodityId", commodityId)
                .toString();
    }
}