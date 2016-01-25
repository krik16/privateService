package com.rongyi.easy.activitymanage.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.activitymanage.param easy-api :author lijing
 * User:lijing
 * DATE : 2016/1/25
 * TIME : 14:15
 * easy-api.
 */
public class SearchActivityParam extends PagingParam {
    /**描述:
     * 0.待审核
     * 1.不通过
     2.未开始
     3.进行中
     4.已结束
     5.强下线
     */
    private Integer status;

    /**活动类型 3代表及商品类活动*/
    private Integer type;

    /**推广渠道查询条件     匹配字符*/
    private String synTarget;

    /**活动时间 0代表开始时间   1代表活动结束时间*/
    private Integer activityTimeType;
    /**开始时间*/
    private Date startAt;
    /**结束时间*/
    private Date endAt;
    /**活动名称*/
    private String name;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSynTarget() {
        return synTarget;
    }

    public void setSynTarget(String synTarget) {
        this.synTarget = synTarget;
    }

    public Integer getActivityTimeType() {
        return activityTimeType;
    }

    public void setActivityTimeType(Integer activityTimeType) {
        this.activityTimeType = activityTimeType;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("status", status)
                .append("type", type)
                .append("synTarget", synTarget)
                .append("activityTimeType", activityTimeType)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("name", name)
                .toString();
    }
}
