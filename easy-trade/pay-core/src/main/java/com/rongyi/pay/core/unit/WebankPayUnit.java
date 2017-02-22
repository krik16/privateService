package com.rongyi.pay.core.unit;

import com.rongyi.pay.core.webank.config.WebankWechatConfigure;
import com.rongyi.pay.core.webank.param.WebankWechatPunchCardPayParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sujuan on 2017/2/15.
 */
public class WebankPayUnit {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebankPayUnit.class);

    /**
     * 微众 微信刷卡支付
     * @param weibankPunchCardPayReqData 业务请求参数
     * @param weibankConfigure 商户配置参数
     */
    public static void webankWechatPunchCardPay(WebankWechatPunchCardPayParam param, WebankWechatConfigure configure) {
        LOGGER.info("微众刷卡支付 param:{},configure:{}",param,configure);
        //检查参数
        ParamUnit.checkWebankWechatPunchCardPay(param,configure);

    }
}
