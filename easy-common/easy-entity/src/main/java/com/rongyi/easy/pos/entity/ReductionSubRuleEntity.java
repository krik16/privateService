package com.rongyi.easy.pos.entity;

import java.io.Serializable;

/**
 * 满减活动规则（子，迭代）
 *
 * @author wangjh7
 * @date 2017-01-19
 */
public class ReductionSubRuleEntity implements Serializable {
    // 满多少（单位分）
    private Integer amount;
    // 折扣（减少多少，或者打几折）
    private Integer rabate;
    // 最高金额
    private Integer maxFee;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getMaxFee() {
        return maxFee;
    }

    public void setMaxFee(Integer maxFee) {
        this.maxFee = maxFee;
    }

    public Integer getRabate() {
        return rabate;
    }

    public void setRabate(Integer rabate) {
        this.rabate = rabate;
    }

    @Override
    public String toString() {
        return "ReductionSubRuleEntity{" +
                "amount=" + amount +
                ", rabate=" + rabate +
                ", maxFee=" + maxFee +
                '}';
    }
}
