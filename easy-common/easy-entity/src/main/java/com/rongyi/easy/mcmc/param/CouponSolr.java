package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * Created by xuying on 2016/1/25.
 */
public class CouponSolr implements Serializable{
    private String couponId;
    private long startTime; //开始时间
    private long endTime; //结束时间

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
