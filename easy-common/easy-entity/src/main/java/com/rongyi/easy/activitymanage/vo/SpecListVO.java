package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * create by com.rongyi.easy.activitymanage.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/2/17
 * TIME : 18:42
 * ideaworkspace.
 */
public class SpecListVO implements Serializable {
    private List<SpecVO> specList;
    private List<SpecValueVO> specValue;
    private Integer joinCount;
    private String activityPrice;
    private Integer subsidyType;
    private Integer subsidyPrice;

    public List<SpecVO> getSpecList() {
        return specList;
    }

    public void setSpecList(List<SpecVO> specList) {
        this.specList = specList;
    }

    public List<SpecValueVO> getSpecValue() {
        return specValue;
    }

    public void setSpecValue(List<SpecValueVO> specValue) {
        this.specValue = specValue;
    }

    public Integer getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(Integer joinCount) {
        this.joinCount = joinCount;
    }

    public String getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(String activityPrice) {
        this.activityPrice = activityPrice;
    }

    public Integer getSubsidyType() {
        return subsidyType;
    }

    public void setSubsidyType(Integer subsidyType) {
        this.subsidyType = subsidyType;
    }

    public Integer getSubsidyPrice() {
        return subsidyPrice;
    }

    public void setSubsidyPrice(Integer subsidyPrice) {
        this.subsidyPrice = subsidyPrice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("specList", specList)
                .append("specValue", specValue)
                .append("joinCount", joinCount)
                .append("activityPrice", activityPrice)
                .append("subsidyType", subsidyType)
                .append("subsidyPrice", subsidyPrice)
                .toString();
    }
}
