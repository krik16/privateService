package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;

/**
 * Created by xgq on 2015/7/16.
 */
public class CustomerTagVO implements Serializable {
    /**
     * 表ID
     */
    private Integer id;

    /**
     * 标签名
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

}
