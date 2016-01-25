package com.rongyi.easy.coupon.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by lqy on 2015/11/25.
 */
public class UserRedenvelopWillExpireVO implements Serializable {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 将要过期的红包数量
     */
    private Integer redpacketCount;

    /**
     * 将要过期的平台抵扣券数量
     */
    private Integer rebateCount;

    /**
     * 用户手机号
     */
    private String phone;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getRedpacketCount() {
        return redpacketCount;
    }

    public void setRedpacketCount(Integer redpacketCount) {
        this.redpacketCount = redpacketCount;
    }

    public Integer getRebateCount() {
        return rebateCount;
    }

    public void setRebateCount(Integer rebateCount) {
        this.rebateCount = rebateCount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userId", userId)
                .append("redpacketCount", redpacketCount)
                .append("rebateCount", rebateCount)
                .append("phone", phone)
                .toString();
    }
}
