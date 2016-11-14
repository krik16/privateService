package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 活动审核记录
 */
public class ActivityCheckRecord implements Serializable {
    private Integer id;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 审核状态 [1] 不通过 [2] 通过
     */
    private Integer status;

    private Integer type;

    /**
     * 审核记录
     */
    private String record;

    /**
     * 审核人
     */
    private String createUser;

    /**
     * 审核时间
     */
    private Date createAt;

    private Integer activityGoodsId;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getActivityGoodsId() {
        return activityGoodsId;
    }

    public void setActivityGoodsId(Integer activityGoodsId) {
        this.activityGoodsId = activityGoodsId;
    }

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("status", status)
                .append("record", record)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("type", type)
                .append("activityGoodsId", activityGoodsId)
                .toString();
    }
}