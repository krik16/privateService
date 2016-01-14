package com.rongyi.easy.mallshop.customer;

import com.rongyi.easy.rmmm.vo.PageVO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xgq on 2015/7/17.
 */
public class CustomerOrderListVO extends PageVO implements Serializable {
    private List<CustomerOrderVO> orderVOList;

    public List<CustomerOrderVO> getOrderVOList() {
        return orderVOList;
    }

    public void setOrderVOList(List<CustomerOrderVO> orderVOList) {
        this.orderVOList = orderVOList;
    }
}
