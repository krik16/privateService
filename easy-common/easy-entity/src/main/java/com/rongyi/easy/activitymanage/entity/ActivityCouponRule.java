package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;
import java.util.Date;

public class ActivityCouponRule implements Serializable {
    private Integer id;

    private Integer activityId;

    private Byte entryLimit;

    private Byte entryLimitMallshop;

    private Byte isDeleted;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    private String activityRule;

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

    public Byte getEntryLimit() {
        return entryLimit;
    }

    public void setEntryLimit(Byte entryLimit) {
        this.entryLimit = entryLimit;
    }

    public Byte getEntryLimitMallshop() {
        return entryLimitMallshop;
    }

    public void setEntryLimitMallshop(Byte entryLimitMallshop) {
        this.entryLimitMallshop = entryLimitMallshop;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
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
}