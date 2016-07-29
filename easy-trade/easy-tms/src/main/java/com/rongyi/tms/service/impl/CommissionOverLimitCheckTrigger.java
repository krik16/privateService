package com.rongyi.tms.service.impl;

import com.rongyi.rss.service.trigger.ICommissionOverLimitCheckTrigger;
import com.rongyi.tms.service.SalesCommissionService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * kejun
 * 2016/6/30 18:01
 **/
public class CommissionOverLimitCheckTrigger implements ICommissionOverLimitCheckTrigger{

    @Autowired
    SalesCommissionService salesCommissionService;

    @Override
    public void overLimitCheckTrigger() {

        salesCommissionService.statisticsCheckLimitTrigger();
    }
}
