package com.rongyi.easy.mcmc.vo;


import java.io.Serializable;

/**
 * Created by yaoyiwei on 2016/11/14.
 */
public class GiftPaymentVO implements Serializable {
    private String id;
    // 支付方式（1.兑换 2.换购）
    private Integer type;
    // 用户等级
    private String level;
    // 所需积分
    private Integer point;
    // 所需金额
    private Double money;

    // 是否生效（1.是 0.否）
    private Integer isEffective;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }

    @Override
    public String toString() {
        return "GiftPaymentVO{" +
                "type=" + type +
                ", level='" + level + '\'' +
                ", point=" + point +
                ", money=" + money +
                ", isEffective=" + isEffective +
                '}';
    }
}
