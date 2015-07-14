package com.rongyi.easy.coupon.old_vo;

import java.io.Serializable;


public class OldCouponCodeVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String activityId;//优惠券Id
    private String title;//优惠券名称
    private String activityCode;//优惠券码
    private Integer status;//使用状态：1-未使用、2-已使用、3-退款中、已退款、已过期
    private String startTime;//有效期始
    private String endTime;//有效期止

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

}
