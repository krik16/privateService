package com.rongyi.easy.coupon.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/28 14:41.
 */
public class MerchantListQueryParam {
    private Integer couponType;
    private Integer status;
    private Date publishStartTime;
    private Date publishEndTime;
    private String like;

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPublishStartTime() {
        return publishStartTime;
    }

    public void setPublishStartTime(Date publishStartTime) {
        this.publishStartTime = publishStartTime;
    }

    public Date getPublishEndTime() {
        return publishEndTime;
    }

    public void setPublishEndTime(Date publishEndTime) {
        this.publishEndTime = publishEndTime;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("couponType", couponType).append("status", status).append("publishStartTime", publishStartTime).append("publishEndTime", publishEndTime).append("like", like).toString();
    }
}
