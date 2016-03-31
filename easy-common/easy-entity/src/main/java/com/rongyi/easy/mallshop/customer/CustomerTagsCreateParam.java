package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xgq on 2015/7/16.
 */
public class CustomerTagsCreateParam implements Serializable {
    /**
     * 顾客Id
     */
    private Integer customerId;

    /**
     * 新建标签列表
     */
    private List<String> nameList;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

}
