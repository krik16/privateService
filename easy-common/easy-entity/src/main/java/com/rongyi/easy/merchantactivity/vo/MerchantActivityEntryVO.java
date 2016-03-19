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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("relevanceId", relevanceId)
                .append("relevanceName", relevanceName)
                .append("relevanceType", relevanceType)
                .toString();
    }
}
