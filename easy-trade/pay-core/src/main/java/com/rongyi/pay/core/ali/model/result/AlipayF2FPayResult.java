package com.rongyi.pay.core.ali.model.result;


import com.alipay.api.response.AlipayTradePayResponse;
import com.rongyi.pay.core.ali.model.TradeStatus;
import com.rongyi.pay.core.util.BaseData;

/**
 * Created by liuyangkly on 15/8/26.
 */
public class AlipayF2FPayResult extends BaseData implements Result{
    private TradeStatus tradeStatus;
    private com.alipay.api.response.AlipayTradePayResponse response;

    public AlipayF2FPayResult(AlipayTradePayResponse response) {
        this.response = response;
    }

    public void setTradeStatus(TradeStatus tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public void setResponse(com.alipay.api.response.AlipayTradePayResponse response) {
        this.response = response;
    }

    public TradeStatus getTradeStatus() {
        return tradeStatus;
    }

    public com.alipay.api.response.AlipayTradePayResponse getResponse() {
        return response;
    }

    @Override
    public boolean isTradeSuccess() {
        return response != null &&
                TradeStatus.SUCCESS.equals(tradeStatus);
    }
}
