package com.rongyi.easy.activitymanage.entity;

import java.util.Date;

public class ActivityInfo {
    private Integer id;

    private String name;

    private Date startAt;

    private Date endAt;

    private Byte type;

    private String synTarget;

    private Byte stockDeductType;

    private Byte stockUpdateType;

    private Byte isShipping;

    private Integer limitCount;

    private Byte status;

    private Byte publishChannel;

    private Integer cancelTime;

    private String createUser;

    private String updateUser;

    private Date createAt;

    private Date updateAt;

    private Byte isDeleted;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getSynTarget() {
        return synTarget;
    }

    public void setSynTarget(String synTarget) {
        this.synTarget = synTarget;
    }

    public Byte getStockDeductType() {
        return stockDeductType;
    }

    public void setStockDeductType(Byte stockDeductType) {
        this.stockDeductType = stockDeductType;
    }

    public Byte getStockUpdateType() {
        return stockUpdateType;
    }

    public void setStockUpdateType(Byte stockUpdateType) {
        this.stockUpdateType = stockUpdateType;
    }

    public Byte getIsShipping() {
        return isShipping;
    }

    public void setIsShipping(Byte isShipping) {
        this.isShipping = isShipping;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getPublishChannel() {
        return publishChannel;
    }

    public void setPublishChannel(Byte publishChannel) {
        this.publishChannel = publishChannel;
    }

    public Integer getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Integer cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}