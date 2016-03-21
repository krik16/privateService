package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

public class ActivityEntryRule  implements Serializable {
    private Integer id;

    private Integer activityId;

    private String relevanceId;

    private String relevanceName;

    private Integer relevanceType;

    private String secCategoryId;

    private String secCategoryName;


    private String createBy;

    private Date createAt;

    private Boolean isDeleted;

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

    public Integer getRelevanceType() {
        return relevanceType;
    }

    public void setRelevanceType(Integer relevanceType) {
        this.relevanceType = relevanceType;
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
    public String getSecCategoryId() {
        return secCategoryId;
    }

    public void setSecCategoryId(String secCategoryId) {
        this.secCategoryId = secCategoryId;
    }

    public String getSecCategoryName() {
        return secCategoryName;
    }

    public void setSecCategoryName(String secCategoryName) {
        this.secCategoryName = secCategoryName;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("relevanceId", relevanceId)
                .append("relevanceName", relevanceName)
                .append("relevanceType", relevanceType)
                .append("secCategoryId", secCategoryId)
                .append("secCategoryName", secCategoryName)
                .append("createBy", createBy)
                .append("createAt", createAt)
                .append("isDeleted", isDeleted)
                .toString();
    }
}