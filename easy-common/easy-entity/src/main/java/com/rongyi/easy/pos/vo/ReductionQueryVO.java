package com.rongyi.easy.pos.vo;

import com.rongyi.easy.pos.entity.ReductionUnitEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 获取满减活动请求返回结果
 *
 * @author wangjh7
 * @date 2017-02-28
 */
public class ReductionQueryVO implements Serializable {
    // 活动Id
    private String activityId;
    // 活动名称
    private String activityName;
    // 	优惠方式，1:减金额，2:打折
    private Integer reductionType;
    // 优惠金额，单位：元
    private Double totalReductionFee;
    // 匹配的金额（满多少元）
    private Double amount;
    // 匹配的折扣（减少多少元，或者打几折，1折=1）
    private Double rebate;
    // 最大减免金额
    private Double maxFee;
    // 商品分摊费用
    private List<ReductionUnitEntity> unitList;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getMaxFee() {
        return maxFee;
    }

    public void setMaxFee(Double maxFee) {
        this.maxFee = maxFee;
    }

    public Double getRebate() {
        return rebate;
    }

    public void setRebate(Double rebate) {
        this.rebate = rebate;
    }

    public Double getTotalReductionFee() {
        return totalReductionFee;
    }

    public void setTotalReductionFee(Double totalReductionFee) {
        this.totalReductionFee = totalReductionFee;
    }

    public Integer getReductionType() {
        return reductionType;
    }

    public void setReductionType(Integer reductionType) {
        this.reductionType = reductionType;
    }

    public List<ReductionUnitEntity> getUnitList() {
        return unitList;
    }

    public void setUnitList(List<ReductionUnitEntity> unitList) {
        this.unitList = unitList;
    }

    @Override
    public String toString() {
        return "ReductionQueryVO{" +
                "activityId='" + activityId + '\'' +
                ", activityName='" + activityName + '\'' +
                ", reductionType=" + reductionType +
                ", totalReductionFee=" + totalReductionFee +
                ", amount=" + amount +
                ", rebate=" + rebate +
                ", maxFee=" + maxFee +
                ", unitList=" + unitList +
                '}';
    }
}
