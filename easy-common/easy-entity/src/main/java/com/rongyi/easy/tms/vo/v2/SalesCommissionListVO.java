package com.rongyi.easy.tms.vo.v2;

import com.rongyi.easy.rmmm.vo.PageVO;

import java.io.Serializable;
import java.util.List;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author: ZhengYl
 * Description:  
 * time:  2016/3/15
 * History: 变更记录       
 *
 */

public class SalesCommissionListVO extends PageVO implements Serializable {

    List<SalesCommissionVO> salesCommissionVOs;

    public List<SalesCommissionVO> getSalesCommissionVOs() {
        return salesCommissionVOs;
    }

    public void setSalesCommissionVOs(List<SalesCommissionVO> salesCommissionVOs) {
        this.salesCommissionVOs = salesCommissionVOs;
    }

    @Override
    public String toString() {
        return "SalesCommissionListVO{" +
                "salesCommissionVOs=" + salesCommissionVOs +
                '}';
    }
}
