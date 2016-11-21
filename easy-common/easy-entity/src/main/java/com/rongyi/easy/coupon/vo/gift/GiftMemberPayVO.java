package com.rongyi.easy.coupon.vo.gift;

import java.io.Serializable;

/**
 * Description:
 * Author: yb
 * DATE: 2016/11/21 11:14
 * Package:com.rongyi.easy.coupon.vo.gift
 * Project:easy-coupon
 */
public class GiftMemberPayVO implements Serializable {

    /**
     * 用户等级
     */
    private String level;

    /**
     * 所需积分
     */
    private Integer point;

    /**
     * 所需金额
     */
    private Integer money;

    /**
     * 是否生效（1是，0否）
     */
    private Byte isBuy;

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

    public Byte getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(Byte isBuy) {
        this.isBuy = isBuy;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GiftMemberPayVO{");
        sb.append("level='").append(level).append('\'');
        sb.append(", point=").append(point);
        sb.append(", money=").append(money);
        sb.append(", isBuy=").append(isBuy);
        sb.append('}');
        return sb.toString();
    }
}
