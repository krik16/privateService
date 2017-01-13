package com.rongyi.pay.core.ali.model.result;

import com.rongyi.pay.core.ali.model.TradeStatus;
import com.rongyi.pay.core.ali.service.response.AlipayTradeCreateResponse;

/**
 * Created by liuyangkly on 15/8/27.
 */
public class AlipayF2CreateResult implements Result {
    private TradeStatus tradeStatus;
    private AlipayTradeCreateResponse response;

    public AlipayF2CreateResult(AlipayTradeCreateResponse response) {
        this.response = response;
    }

    public void setTradeStatus(TradeStatus tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public void setResponse(AlipayTradeCreateResponse response) {
        this.response = response;
    }

    public TradeStatus getTradeStatus() {
        return tradeStatus;
    }

    public AlipayTradeCreateResponse getResponse() {
        return response;
    }

    @Override
    public boolean isTradeSuccess() {
        return response != null &&
                TradeStatus.SUCCESS.equals(tradeStatus);
    }
}
