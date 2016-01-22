package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

public class ActivityGoodsRule implements Serializable {
    private Integer id;

    private Integer activityId;

    private Integer stockDeductType;

    private Integer stockUpdateType;

    private Boolean isShipping;

    private Integer limitCount;

    private Integer cancelTime;

    private Date createAt;

    private Date updateAt;

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

    public Integer getStockDeductType() {
        return stockDeductType;
    }

    public void setStockDeductType(Integer stockDeductType) {
        this.stockDeductType = stockDeductType;
    }

    public Integer getStockUpdateType() {
        return stockUpdateType;
    }

    public void setStockUpdateType(Integer stockUpdateType) {
        this.stockUpdateType = stockUpdateType;
    }

    public Boolean getIsShipping() {
        return isShipping;
    }

    public void setIsShipping(Boolean isShipping) {
        this.isShipping = isShipping;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public Integer getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Integer cancelTime) {
        this.cancelTime = cancelTime;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("stockDeductType", stockDeductType)
                .append("stockUpdateType", stockUpdateType)
                .append("isShipping", isShipping)
                .append("limitCount", limitCount)
                .append("cancelTime", cancelTime)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .toString();
    }
}