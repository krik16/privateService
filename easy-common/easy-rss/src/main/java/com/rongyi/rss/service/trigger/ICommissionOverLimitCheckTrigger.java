package com.rongyi.rss.service.trigger;

/**
 * kejun
 * 2016/6/30 18:00
 **/
public interface ICommissionOverLimitCheckTrigger {

    /**
     * 佣金返佣超出上限检查
     */
    void overLimitCheckTrigger();
}
