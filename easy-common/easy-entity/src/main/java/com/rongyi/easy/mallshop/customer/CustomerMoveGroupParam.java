package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;

/**
 * Created by xgq on 2015/7/17.
 */
public class CustomerMoveGroupParam implements Serializable {
    private Integer targetGroupId;
    private Integer customerId;

    public Integer getTargetGroupId() {
        return targetGroupId;
    }

    public void setTargetGroupId(Integer targetGroupId) {
        this.targetGroupId = targetGroupId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
