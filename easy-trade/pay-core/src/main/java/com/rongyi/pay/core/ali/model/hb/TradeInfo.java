package com.rongyi.pay.core.ali.model.hb;

/**
 * Created by liuyangkly on 15/9/28.
 */
public interface TradeInfo {
    // 获取交易状态
    public HbStatus getStatus();

    // 获取交易时间
    public double getTimeConsume();
}
