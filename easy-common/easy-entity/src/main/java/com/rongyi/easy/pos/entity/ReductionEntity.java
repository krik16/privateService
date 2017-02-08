package com.rongyi.easy.pos.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 满减活动
 *
 * @author wangjh7
 * @date 2017-01-19
 */
public class ReductionEntity implements Serializable {
    private int id;
    // 活动Id
    private String activityId;
    // 活动名称、标题
    private String activityName;
    private Date startDate;
    private Date endDate;
    //条件类型，1:满金额，2:满件数
    private int conditionType;
    // 优惠方式，1:减金额，2:打折
    private int reductionType;
    // 门槛类型1:指定门槛，2:逐级
    private int ruleType;
    // 优惠范围1:全场
    private int ruleRange;
    // 限定规则1:所有人、2:会员
    private int ruleMember;
    // 参与终端：1:POS，2:非POS
    private int rulePlatform;
    //  订单号
    private String orderNo;
    // 规则
    private List<ReductionRuleEntity> reductionRuleEntityList;

    public int getConditionType() {
        return conditionType;
    }

    public void setConditionType(int conditionType) {
        this.conditionType = conditionType;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

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

    public List<ReductionRuleEntity> getReductionRuleEntityList() {
        return reductionRuleEntityList;
    }

    public void setReductionRuleEntityList(List<ReductionRuleEntity> reductionRuleEntityList) {
        this.reductionRuleEntityList = reductionRuleEntityList;
    }

    public int getReductionType() {
        return reductionType;
    }

    public void setReductionType(int reductionType) {
        this.reductionType = reductionType;
    }

    public int getRuleMember() {
        return ruleMember;
    }

    public void setRuleMember(int ruleMember) {
        this.ruleMember = ruleMember;
    }

    public int getRulePlatform() {
        return rulePlatform;
    }

    public void setRulePlatform(int rulePlatform) {
        this.rulePlatform = rulePlatform;
    }

    public int getRuleRange() {
        return ruleRange;
    }

    public void setRuleRange(int ruleRange) {
        this.ruleRange = ruleRange;
    }

    public int getRuleType() {
        return ruleType;
    }

    public void setRuleType(int ruleType) {
        this.ruleType = ruleType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ReductionEntity{" +
                "activityId='" + activityId + '\'' +
                ", id=" + id +
                ", activityName='" + activityName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", conditionType=" + conditionType +
                ", reductionType=" + reductionType +
                ", ruleType=" + ruleType +
                ", ruleRange=" + ruleRange +
                ", ruleMember=" + ruleMember +
                ", rulePlatform=" + rulePlatform +
                ", orderNo='" + orderNo + '\'' +
                ", reductionRuleEntityList=" + reductionRuleEntityList +
                '}';
    }
}
