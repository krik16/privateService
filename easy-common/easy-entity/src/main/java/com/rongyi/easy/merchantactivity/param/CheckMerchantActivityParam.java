package com.rongyi.easy.merchantactivity.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.merchantactivity.param ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/20
 * TIME : 10:30
 * ideaworkspace.
 */
public class CheckMerchantActivityParam implements Serializable {

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 审核记录
     */
    private String record;

    /**
     * 类型  1 同意申请撤销 2 拒绝申请撤销 3 强制下线
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
