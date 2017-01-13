package com.rongyi.pay.core.ali.service;


import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.ali.model.builder.*;
import com.rongyi.pay.core.ali.model.result.*;

/**
 * Created by liuyangkly on 15/7/29.
 */
public interface AlipayTradeService {

    // 当面付2.0流程支付
    AlipayF2FPayResult tradePay(AlipayTradePayRequestBuilder builder,AliConfigure aliConfigure);

    // 当面付2.0消费查询
     AlipayF2FQueryResult queryTradeResult(AlipayTradeQueryRequestBuilder builder,AliConfigure aliConfigure);

    // 当面付2.0消费退款
     AlipayF2FRefundResult tradeRefund(AlipayTradeRefundRequestBuilder builder,AliConfigure aliConfigure);

    // 当面付2.0预下单(生成二维码)
     AlipayF2FPrecreateResult tradePrecreate(AlipayTradePrecreateRequestBuilder builder,AliConfigure aliConfigure);

    // 统一收单创建订单(生成交易单号)
    AlipayF2CreateResult tradeCreate(AlipayTradeCreateRequestBuilder builder,AliConfigure aliConfigure);


}
