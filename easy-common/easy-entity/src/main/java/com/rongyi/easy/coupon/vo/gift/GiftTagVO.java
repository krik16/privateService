package com.rongyi.easy.coupon.vo.gift;

import java.io.Serializable;

/**
 * Description:
 * Author: yb
 * DATE: 2016/11/21 11:19
 * Package:com.rongyi.easy.coupon.vo.gift
 * Project:easy-coupon
 */
public class GiftTagVO implements Serializable {
    private String couponId;
    private Integer tagId;
    private Integer giftId;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GiftTagVO{");
        sb.append("couponId='").append(couponId).append('\'');
        sb.append(", tagId=").append(tagId);
        sb.append(", giftId=").append(giftId);
        sb.append('}');
        return sb.toString();
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }
}
