package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by yangyang on 2016/9/20.
 */
public class RelevanDTO implements Serializable {
    private String relevanceId; //店铺或者分类id

    private String relevanceName;//名称

    private Integer type;//1 分类 2店铺

    /**
     * 二级分类id
     */
    private String secCategoryId;
    /**
     * 二级分类名称
     */
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
                .append("type", type)
                .append("secCategoryId", secCategoryId)
                .append("secCategoryName", secCategoryName)
                .toString();
    }
}