package com.rongyi.pay.core.webank.config;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众支付配置信息
 * Created by sujuan on 2017/2/16.
 */
public class WebankConfigure extends BaseData{

    private static final long serialVersionUID = -5637779923920190007L;
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

    //支付宝撤销订单请求url
    private String alipayReverseTradeUrl ;

    //支付宝退款请求url
    private String alipayRefundUrl ;

    //支付宝退款查询url
    private String alipayRefundQueryUrl ;

    //支付宝生成签名key 50分钟失效
    private String ticket ;

    //微信p12证书路径
    private String wechatKeyStorePath ;

    //微信jks证书路径
    private String wechatTrustStorePath;

    //微信p12证书密码
    private String wechatKeyStorePwd ;

    //支付宝获取token请求地址
    private String alipayGetTokenUrl ;

    //支付宝获取ticket请求地址
    private String alipayGetTicketUrl;

    //用于获取支付宝token的 appId
    private String appId ;

    //appId的密钥
    private String secret ;

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

    public String getAlipayReverseTradeUrl() {
        return alipayReverseTradeUrl;
    }

    public void setAlipayReverseTradeUrl(String alipayReverseTradeUrl) {
        this.alipayReverseTradeUrl = alipayReverseTradeUrl;
    }

    public String getAlipayRefundUrl() {
        return alipayRefundUrl;
    }

    public void setAlipayRefundUrl(String alipayRefundUrl) {
        this.alipayRefundUrl = alipayRefundUrl;
    }

    public String getAlipayRefundQueryUrl() {
        return alipayRefundQueryUrl;
    }

    public void setAlipayRefundQueryUrl(String alipayRefundQueryUrl) {
        this.alipayRefundQueryUrl = alipayRefundQueryUrl;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getWechatKeyStorePath() {
        return wechatKeyStorePath;
    }

    public void setWechatKeyStorePath(String wechatKeyStorePath) {
        this.wechatKeyStorePath = wechatKeyStorePath;
    }

    public String getWechatTrustStorePath() {
        return wechatTrustStorePath;
    }

    public void setWechatTrustStorePath(String wechatTrustStorePath) {
        this.wechatTrustStorePath = wechatTrustStorePath;
    }

    public String getWechatKeyStorePwd() {
        return wechatKeyStorePwd;
    }

    public void setWechatKeyStorePwd(String wechatKeyStorePwd) {
        this.wechatKeyStorePwd = wechatKeyStorePwd;
    }

    public String getAlipayGetTokenUrl() {
        return alipayGetTokenUrl;
    }

    public void setAlipayGetTokenUrl(String alipayGetTokenUrl) {
        this.alipayGetTokenUrl = alipayGetTokenUrl;
    }

    public String getAlipayGetTicketUrl() {
        return alipayGetTicketUrl;
    }

    public void setAlipayGetTicketUrl(String alipayGetTicketUrl) {
        this.alipayGetTicketUrl = alipayGetTicketUrl;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "WebankConfigure{" +
                "key='" + key + '\'' +
                ", ticket='" + ticket + '\'' +
                ", wechatKeyStorePath='" + wechatKeyStorePath + '\'' +
                ", wechatTrustStorePath='" + wechatTrustStorePath + '\'' +
                ", wechatKeyStorePwd='" + wechatKeyStorePwd + '\'' +
                ", appId='" + appId + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
