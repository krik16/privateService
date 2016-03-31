package com.rongyi.easy.coupon.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 用户抵扣券参数
 */
public class UserRebateParam implements Serializable {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 卡券id
     */
    private String couponId;

    /**
     * 券码
     */
    private String couponCode;

    /**
     * 领取渠道
     */
    private Integer channel;

    /**
     * 活动id
     */
    private String activityId;

    /**
     * 活动名字
     */
    private String activityName;

    private Integer pageSize;

    private Integer currentPage;

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

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
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

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userId", userId)
                .append("couponId", couponId)
                .append("couponCode", couponCode)
                .append("channel", channel)
                .append("activityId", activityId)
                .append("activityName", activityName)
                .append("pageSize", pageSize)
                .append("currentPage", currentPage)
                .toString();
    }
}