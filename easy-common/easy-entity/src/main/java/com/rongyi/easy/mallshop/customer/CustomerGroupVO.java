package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;

/**
 * Created by xgq on 2015/7/16.
 */
public class CustomerGroupVO implements Serializable {
    /**
     * 表ID
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

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

    public CustomerGroup toCustomerGroup() {
        CustomerGroup customerGroup = new CustomerGroup();
        customerGroup.setName(this.name);
        customerGroup.setId(this.id);
        return customerGroup;
    }
}
