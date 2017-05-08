package com.rongyi.easy.pos.entity;

import java.io.Serializable;

/**
 * 满减活动规则
 *
 * @author wangjh7
 * @date 2017-01-19
 */
public class ReductionRuleEntity implements Serializable {
    // 满多少（单位分）
    private Integer amount;
    // 折扣（减少多少，或者打几折）
    private Integer rabate;
    // 最高金额
    private Integer maxFee;
    // 子规则
    private ReductionSubRuleEntity reductionSubRuleEntity;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getMaxFee() {
        if (null == maxFee) {
            return 0;
        }
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

    public ReductionSubRuleEntity getReductionSubRuleEntity() {
        return reductionSubRuleEntity;
    }

    public void setReductionSubRuleEntity(ReductionSubRuleEntity reductionSubRuleEntity) {
        this.reductionSubRuleEntity = reductionSubRuleEntity;
    }

    @Override
    public String toString() {
        return "ReductionRuleEntity{" +
                "amount=" + amount +
                ", rabate=" + rabate +
                ", maxFee=" + maxFee +
                ", reductionSubRuleEntity=" + reductionSubRuleEntity +
                '}';
    }
}
