package com.rongyi.tms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.rongyi.rss.service.trigger.ISalesCommissionTrigger;
import com.rongyi.tms.service.SalesCommissionService;

public class SalesCommissionTrigger implements ISalesCommissionTrigger {

    @Autowired
    private SalesCommissionService service;

    /**
     * 商家
     */
    @Override
    public void statisticsCommissionAmountTrigger() {
        service.statisticsCommissionAmountTrigger(1);
    }

    /**
     * 买手
     */
    @Override
    public void statisticsBuyerCommissionAmountTrigger() {
        service.statisticsCommissionAmountTrigger(2);
    }

}
