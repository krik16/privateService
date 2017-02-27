package com.rongyi.rpb.unit;

import com.rongyi.pay.core.webank.config.WwConfigure;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * 支付配置初始化
 * conan
 * 2017/2/27 11:17
 **/
@Repository
public class PayConfigInitUnit {

    private static final Logger log = LoggerFactory.getLogger(PayConfigInitUnit.class);

    //微众商户密钥key
    private String webankKey ;

    //微众微信刷卡支付请求url
    private String wechatPunchCardPayUrl;

    //微众微信刷卡支付订单查询请求Url
    private String wechatPunchCardPayQueryOrderUrl;

    //微众微信冲正订单（撤销订单）请求Url
    private String wechatPunchCardPayReverseOrderUrl;


    public void init(){

        //初始化微众微信支付配置
        initWwConfigure();
    }

    private WwConfigure initWwConfigure(){

        WwConfigure wwConfigure = WwConfigure.getInstance();
        if(StringUtils.isNotEmpty(wwConfigure.getKey())) {
            log.info("初始化微众银行支付配置");
            wwConfigure.setKey(this.webankKey);
            wwConfigure.setPunchCardPayUrl(this.wechatPunchCardPayUrl);
            wwConfigure.setPunchCardPayQueryOrderUrl(this.wechatPunchCardPayQueryOrderUrl);
            wwConfigure.setPunchCardPayReverseOrderUrl(this.wechatPunchCardPayReverseOrderUrl);
        }
        return wwConfigure;

    }

    public void setWebankKey(String webankKey) {
        this.webankKey = webankKey;
    }

    public void setWechatPunchCardPayUrl(String wechatPunchCardPayUrl) {
        this.wechatPunchCardPayUrl = wechatPunchCardPayUrl;
    }

    public void setWechatPunchCardPayQueryOrderUrl(String wechatPunchCardPayQueryOrderUrl) {
        this.wechatPunchCardPayQueryOrderUrl = wechatPunchCardPayQueryOrderUrl;
    }

    public void setWechatPunchCardPayReverseOrderUrl(String wechatPunchCardPayReverseOrderUrl) {
        this.wechatPunchCardPayReverseOrderUrl = wechatPunchCardPayReverseOrderUrl;
    }
}
