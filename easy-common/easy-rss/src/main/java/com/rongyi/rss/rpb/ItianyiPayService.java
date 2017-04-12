package com.rongyi.rss.rpb;

import com.rongyi.core.Exception.TradePayException;

import java.util.Map;

/**
 * 天翼支付服务接口
 * Created by sujuan on 2017/4/11.
 */
public interface ItianyiPayService {

    /**
     * 普通支付退款
     * orderNo 订单号
     * refundAmount 退款金额(单位分)
     * wechatConfigureVo 支付参数
     **/
    Map<String, Object> refund(String orderNo, int refundAmount) throws TradePayException;

}
