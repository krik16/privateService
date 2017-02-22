package com.rongyi.pay.core.webank.service;

import com.rongyi.pay.core.webank.config.WebankWechatConfigure;
import com.rongyi.pay.core.webank.model.WechatPunchCardReqData;
import com.rongyi.pay.core.webank.param.WebankWechatPunchCardPayParam;
import com.rongyi.pay.core.webank.util.HttpUtil;
import com.rongyi.pay.core.webank.util.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sujuan on 2017/2/17.
 */
public class WebankPayService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebankPayService.class);

    /**
     * 微众微信刷卡支付 B扫C
     * @param reqData 业务参数
     * @param configure 配置参数
     */
    public void wechatPushCardPay(WebankWechatPunchCardPayParam reqData, WebankWechatConfigure configure) {
        LOGGER.info("微众微信刷卡支付service");
        //将参数封装成微众参数
        WechatPunchCardReqData punchCardParam = new WechatPunchCardReqData(reqData, configure);
        //生成签名
        String sign = Signature.getSign(punchCardParam, configure.getKey());
        LOGGER.info("生成的签名 sign:{}", sign);
        punchCardParam.setSign(sign);
        String result = HttpUtil.httpPOSTJson(configure.getUrl(),punchCardParam);


    }

    public static void main(String args[]) {
        WechatPunchCardReqData param = new WechatPunchCardReqData();
        param.setAttach("adfafd");
        param.setSub_appid("45546656465");
        param.setGoods_tag("");
        String sign = Signature.getSign(param, "66666666666");
        System.out.println(sign);
    }

}
