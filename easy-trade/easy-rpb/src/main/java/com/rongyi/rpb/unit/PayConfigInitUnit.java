package com.rongyi.rpb.unit;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.tianyi.config.TianyiConfigure;
import com.rongyi.pay.core.unit.WebankPayUnit;
import com.rongyi.pay.core.webank.config.WebankConfigure;
import com.rongyi.pay.core.webank.model.WaAccessTokenResData;
import com.rongyi.pay.core.webank.model.WaTicketResData;
import com.rongyi.rss.malllife.service.IRedisService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * 支付配置初始化
 * conan
 * 2017/2/27 11:17
 **/
public class PayConfigInitUnit {

    @Autowired
    IRedisService redisService;

    private static final Logger log = LoggerFactory.getLogger(PayConfigInitUnit.class);

    //微众商户密钥key
    private String webankKey ;

    //微众微信刷卡支付请求url
    private String wechatPunchCardPayUrl;

    //微众微信刷卡支付订单查询请求Url
    private String wechatPunchCardPayQueryOrderUrl;

    //微众微信冲正订单（撤销订单）请求Url
    private String wechatPunchCardPayReverseOrderUrl;

    //微众微信退款接口请求Url
    private String wechatPunchCardRefundUrl;

    //微众微信退款查询请求Url
    private String wechatPunchCardRefundQueryUrl;

    //微众p12证书目录
    private String wechatKeyStorePath;

    //微众jks证书目录
    private String wechatTrustStorePath;

    //微众p12证书密码
    private String wechatKeyStorePwd;


    //微信公众号支付通知地址
    private String wechatScanNotifyUrl ;

    //微信公众号支付请求地址
    private String wechatScanPayUrl ;

    //微信公众号订单查询请求地址
    private String wechatScanQueryUrl ;

    //微众支付宝appId
    private String appId;

    //微众支付宝secret
    private String secret;

    //微众支付宝获取token Url
    private String alipayGetTokenUrl;

    //微众支付宝获取ticket Url
    private String alipayGetTicketUrl;

    //微众支付宝ticket
    private String ticket;

    //微众支付宝刷卡支付url
    private String alipayPunchCardPayUrl;

    //微众支付宝刷卡支付查询url
    private String alipayQueryTradeUrl;

    //微众支付宝撤销支付url
    private String alipayReverseTradeUrl;

    //微众支付宝退款url
    private String alipayRefundUrl;

    //微众支付宝退款查询url
    private String alipayRefundQueryUrl;

    //支付宝c扫B请求地址
    private String alipayScanPayUrl;

    //翼支付退款通知地址
    private String tianyiRefundNotifyUrl;

    //翼支付通知地址
    private String tianyiPayNotifyUrl;
    
    // 微众对账单下载
    private String webankStatementUrl;
    public void init(){

        //初始化微众相关配置
        initWwConfigure();

        //初始化天翼配置
        initTianConfig() ;
    }

    private WebankConfigure initWwConfigure(){

        WebankConfigure configure = WebankConfigure.getInstance();
        if(StringUtils.isEmpty(configure.getKey())) {
            log.info("初始化微众银行支付配置");
            configure.setKey(this.webankKey);
            configure.setWechatPunchCardPayUrl(this.wechatPunchCardPayUrl);
            configure.setWechatPunchCardPayQueryOrderUrl(this.wechatPunchCardPayQueryOrderUrl);
            configure.setWechatPunchCardPayReverseOrderUrl(this.wechatPunchCardPayReverseOrderUrl);

            configure.setKey(this.webankKey);
            configure.setWechatPunchCardPayQueryOrderUrl(this.wechatPunchCardPayQueryOrderUrl);
            configure.setWechatPunchCardPayReverseOrderUrl(this.wechatPunchCardPayReverseOrderUrl);
            configure.setWechatPunchCardRefundUrl(this.wechatPunchCardRefundUrl);
            configure.setWechatPunchCardRefundQueryUrl(this.wechatPunchCardRefundQueryUrl);
            configure.setWechatScanNotifyUrl(this.wechatScanNotifyUrl);
            configure.setWechatScanPayUrl(this.wechatScanPayUrl);
            configure.setWechatScanQueryUrl(this.wechatScanQueryUrl);

            configure.setWechatKeyStorePath(this.wechatKeyStorePath);
            configure.setWechatTrustStorePath(this.wechatTrustStorePath);
            configure.setWechatKeyStorePwd(this.wechatKeyStorePwd);

            configure.setAppId(this.appId);
            configure.setSecret(this.secret);
            configure.setAlipayGetTokenUrl(this.alipayGetTokenUrl);
            configure.setAlipayGetTicketUrl(this.alipayGetTicketUrl);

            configure.setAlipayPunchCardPayUrl(this.alipayPunchCardPayUrl);
            configure.setAlipayQueryTradeUrl(this.alipayQueryTradeUrl);
            configure.setAlipayReverseTradeUrl(this.alipayReverseTradeUrl);
            configure.setAlipayRefundUrl(this.alipayRefundUrl);
            configure.setAlipayRefundQueryUrl(this.alipayRefundQueryUrl);
            configure.setAlipayScanPayUrl(this.alipayScanPayUrl);
            configure.setWebankStatementUrl(this.webankStatementUrl);
            log.info("初始化微众银行支付配置完成,config={}",configure);
        }
        configure.setTicket(this.ticket);
        return configure;

    }

    private TianyiConfigure initTianConfig() {
        TianyiConfigure tianyiConfigure = TianyiConfigure.getInstance();
        if (StringUtils.isEmpty(tianyiConfigure.getBackMerchantUrl())) {
            tianyiConfigure.setBackMerchantUrl(this.tianyiPayNotifyUrl);
            tianyiConfigure.setRefundBackUrl(this.tianyiRefundNotifyUrl);
        }
        return tianyiConfigure;
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


    public void setWechatPunchCardRefundUrl(String wechatPunchCardRefundUrl) {
        this.wechatPunchCardRefundUrl = wechatPunchCardRefundUrl;
    }

    public void setWechatPunchCardRefundQueryUrl(String wechatPunchCardRefundQueryUrl) {
        this.wechatPunchCardRefundQueryUrl = wechatPunchCardRefundQueryUrl;
    }


    public void setWechatKeyStorePath(String wechatKeyStorePath) {
        this.wechatKeyStorePath = wechatKeyStorePath;
    }

    public void setWechatTrustStorePath(String wechatTrustStorePath) {
        this.wechatTrustStorePath = wechatTrustStorePath;
    }

    public void setWechatKeyStorePwd(String wechatKeyStorePwd) {
        this.wechatKeyStorePwd = wechatKeyStorePwd;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setAlipayGetTokenUrl(String alipayGetTokenUrl) {
        this.alipayGetTokenUrl = alipayGetTokenUrl;
    }

    public void setAlipayGetTicketUrl(String alipayGetTicketUrl) {
        this.alipayGetTicketUrl = alipayGetTicketUrl;
    }



    public void setAlipayPunchCardPayUrl(String alipayPunchCardPayUrl) {
        this.alipayPunchCardPayUrl = alipayPunchCardPayUrl;
    }


    public void setAlipayQueryTradeUrl(String alipayQueryTradeUrl) {
        this.alipayQueryTradeUrl = alipayQueryTradeUrl;
    }


    public void setAlipayReverseTradeUrl(String alipayReverseTradeUrl) {
        this.alipayReverseTradeUrl = alipayReverseTradeUrl;
    }

    public void setAlipayRefundUrl(String alipayRefundUrl) {
        this.alipayRefundUrl = alipayRefundUrl;
    }


    public void setAlipayRefundQueryUrl(String alipayRefundQueryUrl) {
        this.alipayRefundQueryUrl = alipayRefundQueryUrl;
    }

    public void setWechatScanNotifyUrl(String wechatScanNotifyUrl) {
        this.wechatScanNotifyUrl = wechatScanNotifyUrl;
    }

    public void setWechatScanPayUrl(String wechatScanPayUrl) {
        this.wechatScanPayUrl = wechatScanPayUrl;
    }

    public void setAlipayScanPayUrl(String alipayScanPayUrl) {
        this.alipayScanPayUrl = alipayScanPayUrl;
    }

    public void setWechatScanQueryUrl(String wechatScanQueryUrl) {
        this.wechatScanQueryUrl = wechatScanQueryUrl;
    }

    public void setTianyiRefundNotifyUrl(String tianyiRefundNotifyUrl) {
        this.tianyiRefundNotifyUrl = tianyiRefundNotifyUrl;
    }

    public void setTianyiPayNotifyUrl(String tianyiPayNotifyUrl) {
        this.tianyiPayNotifyUrl = tianyiPayNotifyUrl;
    }

    public String getTianyiRefundNotifyUrl() {
        return tianyiRefundNotifyUrl;
    }

    public void setWebankStatementUrl(String webankStatementUrl) {
		this.webankStatementUrl = webankStatementUrl;
	}

	/**
     * 初始化支付宝ticket
     */
    public void initAliTicket(){
        String ticketKey = "aliPayTicket";
        String ticketValue = redisService.get(ticketKey);
        log.info("aliPayTicketValue={}",ticketValue);
        if(StringUtils.isEmpty(ticketValue)) {
            WaAccessTokenResData waAccessTokenResData = WebankPayUnit.alipayGetToken();
            WaTicketResData waTicketResData = WebankPayUnit.alipayGetTicket(waAccessTokenResData.getAccess_token());
            if(waTicketResData.getTickets() != null) {
                WaTicketResData.Ticket ticket = waTicketResData.getTickets().get(0);
                ticketValue = ticket.getValue();
                this.ticket = ticketValue;
                redisService.set(ticketKey, ticketValue);
                redisService.expire(ticketKey, 20 * 60);
                this.init();
            }else{
                throw new TradePayException(ConstantEnum.EXCEPTION_WEBANK_ALI_TICKET_FAIL.getCodeStr(),ConstantEnum.EXCEPTION_WEBANK_ALI_TICKET_FAIL.getValueStr());
            }
        }
    }
}
