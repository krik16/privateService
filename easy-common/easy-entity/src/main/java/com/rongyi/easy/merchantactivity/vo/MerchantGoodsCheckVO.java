package com.rongyi.easy.merchantactivity.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/19
 * TIME : 22:28
 * ideaworkspace.
 */
public class MerchantGoodsCheckVO implements Serializable {
    private Integer activityGoodsId;

    private Integer status;

    private String record;

    private String createBy;

    private String createUser;

    private Date createAt;

    public Integer getActivityGoodsId() {
        return activityGoodsId;
    }

    public void setActivityGoodsId(Integer activityGoodsId) {
        this.activityGoodsId = activityGoodsId;
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

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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
                .append("activityGoodsId", activityGoodsId)
                .append("status", status)
                .append("record", record)
                .append("createBy", createBy)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .toString();
    }
}
