package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ActivityCouponRule implements Serializable {

    private Integer id;

    private Integer activityId;

    private Integer entryLimit;

    private Integer entryLimitMallshop;

    private Boolean isDeleted;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    private String activityRule;
    /**
     * 规则信息表
     */
    private List<ActivityEntryRule> activityEntryRuleList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }


    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getActivityRule() {
        return activityRule;
    }

    public void setActivityRule(String activityRule) {
        this.activityRule = activityRule;
    }

    public Integer getEntryLimit() {
        return entryLimit;
    }

    public void setEntryLimit(Integer entryLimit) {
        this.entryLimit = entryLimit;
    }

    public Integer getEntryLimitMallshop() {
        return entryLimitMallshop;
    }

    public void setEntryLimitMallshop(Integer entryLimitMallshop) {
        this.entryLimitMallshop = entryLimitMallshop;
    }

    public List<ActivityEntryRule> getActivityEntryRuleList() {
        return activityEntryRuleList;
    }

    public void setActivityEntryRuleList(List<ActivityEntryRule> activityEntryRuleList) {
        this.activityEntryRuleList = activityEntryRuleList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("entryLimit", entryLimit)
                .append("entryLimitMallshop", entryLimitMallshop)
                .append("isDeleted", isDeleted)
                .append("createBy", createBy)
                .append("createAt", createAt)
                .append("updateBy", updateBy)
                .append("updateAt", updateAt)
                .append("activityRule", activityRule)
                .append("activityEntryRuleList", activityEntryRuleList)
                .toString();
    }
}