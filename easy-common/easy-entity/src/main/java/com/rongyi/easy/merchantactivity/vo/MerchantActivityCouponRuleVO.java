package com.rongyi.easy.merchantactivity.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/19
 * TIME : 17:29
 * ideaworkspace.
 */
public class MerchantActivityCouponRuleVO implements Serializable {
    private Integer id;
    private String name;

    private String activityRule;
    private Integer type;
    private Date startAt;
    private Date endAt;
    private String synTarget;
    private Integer entryLimit;
    private Integer entryLimitMallShop;
    private Date enrollEndAt;
    private Date enrollStartAt;
   private List<MerchantActivityEntryVO> entryRules = new ArrayList<MerchantActivityEntryVO>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivityRule() {
        return activityRule;
    }

    public void setActivityRule(String activityRule) {
        this.activityRule = activityRule;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public String getSynTarget() {
        return synTarget;
    }

    public void setSynTarget(String synTarget) {
        this.synTarget = synTarget;
    }

    public Integer getEntryLimit() {
        return entryLimit;
    }

    public void setEntryLimit(Integer entryLimit) {
        this.entryLimit = entryLimit;
    }

    public Integer getEntryLimitMallShop() {
        return entryLimitMallShop;
    }

    public void setEntryLimitMallShop(Integer entryLimitMallShop) {
        this.entryLimitMallShop = entryLimitMallShop;
    }

    public Date getEnrollEndAt() {
        return enrollEndAt;
    }

    public void setEnrollEndAt(Date enrollEndAt) {
        this.enrollEndAt = enrollEndAt;
    }

    public Date getEnrollStartAt() {
        return enrollStartAt;
    }

    public void setEnrollStartAt(Date enrollStartAt) {
        this.enrollStartAt = enrollStartAt;
    }

    public List<MerchantActivityEntryVO> getEntryRules() {
        return entryRules;
    }

    public void setEntryRules(List<MerchantActivityEntryVO> entryRules) {
        this.entryRules = entryRules;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("activityRule", activityRule)
                .append("type", type)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("synTarget", synTarget)
                .append("entryLimit", entryLimit)
                .append("entryLimitMallShop", entryLimitMallShop)
                .append("enrollEndAt", enrollEndAt)
                .append("enrollStartAt", enrollStartAt)
                .append("entryRules", entryRules)
                .toString();
    }
}
