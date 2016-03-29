package com.rongyi.easy.mallshop.customer;

import com.rongyi.easy.rmmm.vo.PageVO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xgq on 2015/7/20.
 */
public class CustomerGroupPageVO extends PageVO implements Serializable {
	private static final long serialVersionUID = 2747695612643585791L;
	private List<CustomerGroupVO> list;

    public List<CustomerGroupVO> getList() {
        return list;
    }

    public void setList(List<CustomerGroupVO> list) {
        this.list = list;
    }
}
