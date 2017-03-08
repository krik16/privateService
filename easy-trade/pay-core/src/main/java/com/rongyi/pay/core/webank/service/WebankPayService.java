package com.rongyi.pay.core.webank.service;

import com.rongyi.pay.core.webank.config.WwConfigure;
import com.rongyi.pay.core.webank.model.WwPunchCardQueryOrderReqData;
import com.rongyi.pay.core.webank.model.WwPunchCardReqData;
import com.rongyi.pay.core.webank.model.WwPunchCardResData;
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
    public WwPunchCardResData wechatPunchCardPay(WwPunchCardPayParam reqData, WwConfigure configure) throws Exception{
        LOGGER.info("微众微信刷卡支付service");
        //将参数封装成微众参数
        WwPunchCardReqData punchCardParam = new WwPunchCardReqData(reqData, configure);
        //生成签名
        String sign = Signature.getSign(punchCardParam, configure.getKey());
        LOGGER.info("生成的签名sign:{}", sign);
        punchCardParam.setSign(sign);
        String result = HttpUtil.httpPOSTJson(configure.getPunchCardPayUrl(),punchCardParam);
        LOGGER.info("微众微信刷卡支付返回结果 result:", result);
        return(WwPunchCardResData) Util.getObjectFromString(result, WwPunchCardResData.class);
    }

    public WwPunchCardResData wechatPunchCardQueryOrder(WwPunchCardQueryOrderReqData reqData, WwConfigure configure) throws Exception{
        LOGGER.info("微众微信刷卡支付订单查询 reqData:{},configure:{}", reqData, configure);
        //生成签名
        String sign = Signature.getSign(reqData, configure.getKey());
        LOGGER.info("生成的签名sign:{}", sign);
        reqData.setSign(sign);
        String result = HttpUtil.httpPOSTJson(configure.getPunchCardPayQueryOrderUrl(), reqData);
        LOGGER.info("微众微信刷卡支付订单查询返回结果result:{}",result);
        return (WwPunchCardResData) Util.getObjectFromString(result, WwPunchCardResData.class);
    }

    public static void main(String args[]) {
        WwPunchCardReqData param = new WwPunchCardReqData();
        param.setAttach("adfafd");
        param.setSub_appid("45546656465");
        param.setGoods_tag("");
        String sign = Signature.getSign(param, "66666666666");
        System.out.println(sign);
    }

}
