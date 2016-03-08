package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;
import java.util.Date;

public class ActivityEntryRule  implements Serializable {
    private Integer id;

    private Integer activityId;

    private String relevanceId;

    private String relevanceName;

    private Byte relevanceType;

    private String createBy;

    private Date createAt;

    private Byte isDeleted;

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

    public String getRelevanceId() {
        return relevanceId;
    }

    public void setRelevanceId(String relevanceId) {
        this.relevanceId = relevanceId;
    }

    public String getRelevanceName() {
        return relevanceName;
    }

    public void setRelevanceName(String relevanceName) {
        this.relevanceName = relevanceName;
    }

    public Byte getRelevanceType() {
        return relevanceType;
    }

    public void setRelevanceType(Byte relevanceType) {
        this.relevanceType = relevanceType;
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

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}