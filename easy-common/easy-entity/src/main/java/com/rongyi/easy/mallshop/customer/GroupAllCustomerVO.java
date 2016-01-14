package com.rongyi.easy.mallshop.customer;

import com.rongyi.easy.rmmm.vo.PageVO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xgq on 2015/7/20.
 */
public class GroupAllCustomerVO extends PageVO implements Serializable {
    private List<GroupCustomerVO> list;

    public List<GroupCustomerVO> getList() {
        return list;
    }

    public void setList(List<GroupCustomerVO> list) {
        this.list = list;
    }
}
