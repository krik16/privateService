package com.rongyi.easy.merchantactivity.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.merchantactivity.param ideaworkspace :author lijing
 * 申请撤销活动  和取消申请活动
 * User:lijing
 * DATE : 2016/3/19
 * TIME : 16:02
 * ideaworkspace.
 */
public class RevokeOrCannelMerchantActivityParam implements Serializable {
    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 审核记录
     */
    private String record;

    /**
     * 类型  1 表示申请撤销 2表示取消申请
     */
    private Integer type;

    /**
     * 人的名称
     */
    private String createUser;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("record", record)
                .append("type", type)
                .append("createUser", createUser)
                .toString();
    }
}
