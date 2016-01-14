package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xgq on 2015/7/20.
 */
public class GroupCustomerVO implements Serializable {
    private CustomerGroupVO customerGroupVO;
    private List<CustomerSimpleVO> customerSimpleVOs;

    public CustomerGroupVO getCustomerGroupVO() {
        return customerGroupVO;
    }

    public void setCustomerGroupVO(CustomerGroupVO customerGroupVO) {
        this.customerGroupVO = customerGroupVO;
    }

    public List<CustomerSimpleVO> getCustomerSimpleVOs() {
        return customerSimpleVOs;
    }

    public void setCustomerSimpleVOs(List<CustomerSimpleVO> customerSimpleVOs) {
        this.customerSimpleVOs = customerSimpleVOs;
    }
}
