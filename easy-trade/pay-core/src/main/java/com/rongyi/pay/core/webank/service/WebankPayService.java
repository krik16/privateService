package com.rongyi.pay.core.webank.service;

import com.rongyi.pay.core.webank.config.WebankConfigure;
import com.rongyi.pay.core.webank.model.*;
import com.rongyi.pay.core.webank.param.WaPunchCardPayParam;
import com.rongyi.pay.core.webank.param.WwPunchCardPayParam;
import com.rongyi.pay.core.webank.util.HttpUtil;
import com.rongyi.pay.core.webank.util.Signature;
import com.rongyi.pay.core.webank.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 微众接口调用
 * Created by sujuan on 2017/2/17.
 */
public class WebankPayService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebankPayService.class);

    /**
     * 微众微信刷卡支付 B扫C
     * @param reqData 业务参数
     * @param configure 配置参数
     * @return 返回结果
     */
    public WwPunchCardResData wechatPunchCardPay(WwPunchCardPayParam reqData, WebankConfigure configure) throws Exception{
        LOGGER.info("微众微信刷卡支付service");
        //将参数封装成微众参数
        WwPunchCardReqData punchCardParam = new WwPunchCardReqData(reqData);
        //生成签名
        String sign = Signature.getWechatSign(punchCardParam, configure.getKey());
        punchCardParam.setSign(sign);
        String result = HttpUtil.sendPostClient(configure.getWechatPunchCardPayUrl(),punchCardParam,configure);
        LOGGER.info("微众微信刷卡支付返回结果 result:", result);
        return(WwPunchCardResData) Util.getObjectFromString(result, WwPunchCardResData.class);
    }

    /**
     * 微众微信支付刷卡支付订单查询
     * @param reqData 请求参数
     * @param configure 配置参数
     * @return 返回结果
     * @throws Exception
     */
    public WwPunchCardResData wechatPunchCardQueryOrder(WwPunchCardQueryOrderReqData reqData, WebankConfigure configure) throws Exception{
        LOGGER.info("微众微信刷卡支付订单查询 reqData:{},configure:{}", reqData, configure);
        //生成签名
        String sign = Signature.getWechatSign(reqData, configure.getKey());
        reqData.setSign(sign);
        String result = HttpUtil.httpPOSTJson(configure.getWechatPunchCardPayQueryOrderUrl(), reqData);
        LOGGER.info("微众微信刷卡支付订单查询返回结果result:{}",result);
        return (WwPunchCardResData) Util.getObjectFromString(result, WwPunchCardResData.class);
    }

    /**
     * 微众微信刷卡支付撤销订单
     * @param reqData 请求参数
     * @param configure 配置参数
     * @return 返回结果
     */
    public WwPunchCardReverseResData wechatPunchCardReverse(WwPunchCardReverseReqData reqData, WebankConfigure configure) throws Exception{
        LOGGER.info("微众微信刷卡支付撤销订单 reqData:{},configure:{}", reqData, configure);
        //生成签名
        String sign = Signature.getWechatSign(reqData, configure.getKey());
        reqData.setSign(sign);
        String result = HttpUtil.httpPOSTJson(configure.getWechatPunchCardPayReverseOrderUrl(), reqData);
        LOGGER.info("微众微信刷卡支付撤销订单返回结果 result:{}",result);
        return (WwPunchCardReverseResData) Util.getObjectFromString(result, WwPunchCardReverseResData.class);
    }

    public WwPunchCardRefundResData wechatPunchCardRefund(WwpunchCardRefundReqData reqData, WebankConfigure configure) throws Exception{
        LOGGER.info("微众微信刷卡支付退款 reqData:{},configure:{}",reqData,configure);
        //生成签名
        String sign = Signature.getWechatSign(reqData, configure.getKey());
        reqData.setSign(sign);
        String result = HttpUtil.httpPOSTJson(configure.getWechatPunchCardRefundUrl(), reqData);
        LOGGER.info("微众微信刷卡支付退款请求返回结果result:{}",result);
        return (WwPunchCardRefundResData)Util.getObjectFromString(result,WwPunchCardRefundResData.class);
    }

    public WwPunchCardRefundResData wechatPunchCardRefundQuery(WwpunchCardRefundReqData reqData, WebankConfigure configure) throws Exception{
        LOGGER.info("微众微信刷卡支付退款查询 reqData:{},configure:{}",reqData,configure);
        //生成签名
        String sign = Signature.getWechatSign(reqData, configure.getKey());
        reqData.setSign(sign);
        String result = HttpUtil.httpPOSTJson(configure.getWechatPunchCardRefundQueryUrl(), reqData);
        LOGGER.info("微众微信刷卡支付退款查询请求返回结果result:{}",result);
        return (WwPunchCardRefundResData)Util.getObjectFromString(result,WwPunchCardRefundResData.class);
    }

    public WaPunchCardPayResData alipayPunchCardPay(WaPunchCardPayParam param, WebankConfigure configure) throws Exception{
        LOGGER.info("微众支付宝刷卡支付 param:{},configure:{}", param, configure);
        WaPunchCardPayReqData reqData = new WaPunchCardPayReqData(param);
        String result = HttpUtil.httpPOSTJson(configure.getAlipayPunchCardPayUrl(), reqData);
        LOGGER.info("微众支付宝刷卡支付返回结果result:{}",result);
        return (WaPunchCardPayResData) Util.getObjectFromString(result, WwPunchCardResData.class);
    }

    public WaQueryTradeResData alipayQueryTrade(WaQueryTradeReqData reqData, WebankConfigure configure) throws Exception{
        LOGGER.info("微众支付宝订单查询 reqData:{},configure:{}",reqData,configure);
        String result = HttpUtil.httpPOSTJson(configure.getAlipayQueryTradeUrl(), reqData);
        return (WaQueryTradeResData) Util.getObjectFromString(result, WaQueryTradeResData.class);
    }

    public static void main(String args[]) {
        WwPunchCardReqData param = new WwPunchCardReqData();
        param.setAttach("adfafd");
        param.setSub_appid("45546656465");
        param.setGoods_tag("");
        String sign = Signature.getWechatSign(param, "66666666666");
        System.out.println(sign);
    }

}
