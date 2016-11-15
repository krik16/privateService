package com.rongyi.easy.coupon.vo.gift;

import java.io.Serializable;

/**
 * Description:
 * Author: yb
 * DATE: 2016/11/15 14:50
 * Package:com.rongyi.easy.coupon.vo.gift
 * Project:easy-coupon
 */
public class GiftPaymentVO implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 卡券id
     */
    private String couponId;
    /**
     * 会员等级 v1 v2 v3 v4
     */
    private String level;
    /**
     * 所需积分
     */
    private Integer point;
    /**
     * 所需的钱，单位 ：分
     */
    private Integer money;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GiftPaymentVO{");
        sb.append("couponId='").append(couponId).append('\'');
        sb.append(", level='").append(level).append('\'');
        sb.append(", point=").append(point);
        sb.append(", money=").append(money);
        sb.append('}');
        return sb.toString();
    }
}
