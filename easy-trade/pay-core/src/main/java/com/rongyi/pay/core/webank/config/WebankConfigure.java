package com.rongyi.pay.core.webank.config;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众支付配置信息
 * Created by sujuan on 2017/2/16.
 */
public class WebankConfigure extends BaseData{

    //商户密钥key
    private String key ;

    //刷卡支付请求url
    private String wechatPunchCardPayUrl;

    //刷卡支付订单查询请求Url
    private String wechatPunchCardPayQueryOrderUrl;

    //冲正订单（撤销订单）请求Url
    private String wechatPunchCardPayReverseOrderUrl;

    //微信退款接口地址
    private String wechatPunchCardRefundUrl;

    //微信退款接口查询地址
    private String wechatPunchCardRefundQueryUrl;

    //支付宝条码支付请求url
    private String alipayPunchCardPayUrl;

    //支付宝订单查询请求url
    private String alipayQueryTradeUrl ;

    private static WebankConfigure webankConfigure;

    private WebankConfigure(){}

    public static synchronized WebankConfigure getInstance() {
        if (webankConfigure == null) {
            webankConfigure = new WebankConfigure();
        }
        return webankConfigure;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getWechatPunchCardPayUrl() {
        return wechatPunchCardPayUrl;
    }

    public void setWechatPunchCardPayUrl(String wechatPunchCardPayUrl) {
        this.wechatPunchCardPayUrl = wechatPunchCardPayUrl;
    }

    public String getWechatPunchCardPayQueryOrderUrl() {
        return wechatPunchCardPayQueryOrderUrl;
    }

    public void setWechatPunchCardPayQueryOrderUrl(String wechatPunchCardPayQueryOrderUrl) {
        this.wechatPunchCardPayQueryOrderUrl = wechatPunchCardPayQueryOrderUrl;
    }

    public String getWechatPunchCardPayReverseOrderUrl() {
        return wechatPunchCardPayReverseOrderUrl;
    }

    public void setWechatPunchCardPayReverseOrderUrl(String wechatPunchCardPayReverseOrderUrl) {
        this.wechatPunchCardPayReverseOrderUrl = wechatPunchCardPayReverseOrderUrl;
    }

    public static WebankConfigure getWebankConfigure() {
        return webankConfigure;
    }

    public static void setWebankConfigure(WebankConfigure webankConfigure) {
        WebankConfigure.webankConfigure = webankConfigure;
    }

    public String getWechatPunchCardRefundUrl() {
        return wechatPunchCardRefundUrl;
    }

    public void setWechatPunchCardRefundUrl(String wechatPunchCardRefundUrl) {
        this.wechatPunchCardRefundUrl = wechatPunchCardRefundUrl;
    }

    public String getWechatPunchCardRefundQueryUrl() {
        return wechatPunchCardRefundQueryUrl;
    }

    public void setWechatPunchCardRefundQueryUrl(String wechatPunchCardRefundQueryUrl) {
        this.wechatPunchCardRefundQueryUrl = wechatPunchCardRefundQueryUrl;
    }

    public String getAlipayPunchCardPayUrl() {
        return alipayPunchCardPayUrl;
    }

    public void setAlipayPunchCardPayUrl(String alipayPunchCardPayUrl) {
        this.alipayPunchCardPayUrl = alipayPunchCardPayUrl;
    }

    public String getAlipayQueryTradeUrl() {
        return alipayQueryTradeUrl;
    }

    public void setAlipayQueryTradeUrl(String alipayQueryTradeUrl) {
        this.alipayQueryTradeUrl = alipayQueryTradeUrl;
    }
}
