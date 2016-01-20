package com.rongyi.easy.activitymanage.entity;

import java.util.Date;

public class GoodsCheckRecord {
    private Integer id;

    private Integer activityGoodsId;

    private Byte status;

    private String record;

    private String createUser;

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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
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
}