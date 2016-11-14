package com.rongyi.easy.activitymanage.param;

import java.io.Serializable;

/**
 * Created by yangyang on 2016/9/22.
 */
public class CheckResGoods implements Serializable {
    private Integer activityGoodsId;
    private String reason;//原因
    private Integer status;//0未审核1未通过、退回2通过3撤销报名4强制撤销
    private Integer type;//原因类型
    private String userId;//审核人

    public Integer getActivityGoodsId() {
        return activityGoodsId;
    }

    public void setActivityGoodsId(Integer activityGoodsId) {
        this.activityGoodsId = activityGoodsId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

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
}
