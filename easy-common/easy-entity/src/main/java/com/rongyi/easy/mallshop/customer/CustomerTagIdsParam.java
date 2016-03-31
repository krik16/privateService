package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xgq on 2015/7/16.
 */
public class CustomerTagIdsParam implements Serializable {
    /**
     * 顾客Id
     */
    private Integer customerId;
    /**
     * 删除标签列表
     */
    private List<Integer> tagIdList;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public List<Integer> getTagIdList() {
        return tagIdList;
    }

    public void setTagIdList(List<Integer> tagIdList) {
        this.tagIdList = tagIdList;
    }
}
