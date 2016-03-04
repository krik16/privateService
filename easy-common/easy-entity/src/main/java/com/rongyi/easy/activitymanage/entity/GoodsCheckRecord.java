package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品审核记录
 */
public class GoodsCheckRecord implements Serializable {
    private Integer id;

    /**
     * 活动商品关联表id
     */
    private Integer activityGoodsId;

    /**
     * 审核状态 [1] 不通过 [2] 通过
     */
    private Integer status;

    /**
     * 商品审核记录
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
                .append("activityGoodsId", activityGoodsId)
                .append("status", status)
                .append("record", record)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .toString();
    }
}