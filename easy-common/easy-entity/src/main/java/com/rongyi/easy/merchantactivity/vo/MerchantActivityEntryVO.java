package com.rongyi.easy.merchantactivity.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/19
 * TIME : 17:31
 * ideaworkspace.
 */
public class MerchantActivityEntryVO implements Serializable {
    private String relevanceId;
    private String relevanceName;
    private Integer relevanceType;
    private String secCategoryId;
    private String secCategoryName;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("relevanceId", relevanceId)
                .append("relevanceName", relevanceName)
                .append("relevanceType", relevanceType)
                .append("secCategoryId", secCategoryId)
                .append("secCategoryName", secCategoryName)
                .toString();
    }
}
