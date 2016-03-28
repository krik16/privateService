package com.rongyi.easy.merchantactivity.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/16
 * TIME : 13:52
 * ideaworkspace.
 */
public class MerchantActivityCountVO implements Serializable {
    /**所有活动数量*/
    private Integer allActivityCount;
    /**今日新增的活动数量*/
    private Integer nowAddActivityCount;
    /**申请撤销中的活动数量*/
    private Integer revokingActivityCount;
    /**自营活动(现在等于 所有活动数量)*/
    private Integer supportActivityCount;
    /**参与活动*/
    private Integer joinActivityCount;
    /**进行中活动*/
    private Integer conductingActivityCount;
    /**结束活动*/
    private Integer endActivityCount;
    /**下线活动*/
    private Integer OfflineActivityCount;

    public Integer getAllActivityCount() {
        return allActivityCount;
    }

    public void setAllActivityCount(Integer allActivityCount) {
        this.allActivityCount = allActivityCount;
    }

    public Integer getNowAddActivityCount() {
        return nowAddActivityCount;
    }

    public void setNowAddActivityCount(Integer nowAddActivityCount) {
        this.nowAddActivityCount = nowAddActivityCount;
    }

    public Integer getRevokingActivityCount() {
        return revokingActivityCount;
    }

    public void setRevokingActivityCount(Integer revokingActivityCount) {
        this.revokingActivityCount = revokingActivityCount;
    }

    public Integer getSupportActivityCount() {
        this.supportActivityCount= this.allActivityCount;
        return supportActivityCount;
    }

    public void setSupportActivityCount(Integer supportActivityCount) {
        this.supportActivityCount = supportActivityCount;
    }

    public Integer getJoinActivityCount() {
        return joinActivityCount;
    }

    public void setJoinActivityCount(Integer joinActivityCount) {
        this.joinActivityCount = joinActivityCount;
    }

    public Integer getConductingActivityCount() {
        return conductingActivityCount;
    }

    public void setConductingActivityCount(Integer conductingActivityCount) {
        this.conductingActivityCount = conductingActivityCount;
    }

    public Integer getEndActivityCount() {
        return endActivityCount;
    }

    public void setEndActivityCount(Integer endActivityCount) {
        this.endActivityCount = endActivityCount;
    }

    public Integer getOfflineActivityCount() {
        return OfflineActivityCount;
    }

    public void setOfflineActivityCount(Integer offlineActivityCount) {
        OfflineActivityCount = offlineActivityCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("allActivityCount", allActivityCount)
                .append("nowAddActivityCount", nowAddActivityCount)
                .append("revokingActivityCount", revokingActivityCount)
                .append("supportActivityCount", supportActivityCount)
                .append("joinActivityCount", joinActivityCount)
                .append("conductingActivityCount", conductingActivityCount)
                .append("endActivityCount", endActivityCount)
                .append("OfflineActivityCount", OfflineActivityCount)
                .toString();
    }
}
