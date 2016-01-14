package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;

/**
 * Created by xgq on 2015/7/17.
 */
public class CustomerOrderListParam extends PageParam implements Serializable {

    private Integer customerId; // 顾客Id

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
