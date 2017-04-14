package com.rongyi.pay.core.tianyi.config;

import com.rongyi.pay.core.util.BaseData;

/**
 * Created by yangyang on 2017/4/5.
 */
public class TianyiConfigure extends BaseData {

    private static final String ENV = "2";
    private static final String USELANGUAGE = "zh";
    private static final String ORDERURL = "https://webpaywg.bestpay.com.cn/order.action";
    private static final String PUBLICKEYURL = "https://capi.bestpay.com.cn/common/interface";
    private static final String PAYQUERYURL = "https://webpaywg.bestpay.com.cn/query/queryOrder";
    private static final String REFUNDURL = "https://webpaywg.bestpay.com.cn/refund/commonRefund";
    private static final String PAYURL = "https://capi.bestpay.com.cn/gateway.pay";

    private String env = ENV;//环境地址 0 综测；1 准生产；2 生产 必填

    private String beforeBackUrl;//前台回调地址

    private String backMerchantUrl;//后台回调地址

    private String swtichacc;//是否可以切换用户支付 true/false 必填

    private String productId;//业务标识代码 必填 ,默认04

    private String busiType;//同为业务标识代码（两者具有不同的用途，但值相同）必填，默认04

    private String userLanguage = USELANGUAGE;//用户语言环境zh

    //下面2个参数通过"短信验证码验证"接口获取（免登参数）
    private String keyIndex;//密钥索引

    private String token;//令牌

    private String riskControlInfo;//风控信息，翼支付风控组提供

    private String orderUrl = ORDERURL;//下单请求url

    private String publicKeyUrl = PUBLICKEYURL;//获取公钥接口url

    private String payUrl = PAYURL;//支付接口url

    private String checkStandH5Url;//收银台H5url

    private String payQueryUrl = PAYQUERYURL;//交易查询url

    private String refundUrl = REFUNDURL;//退款接口url

    private String refundBackUrl;//退款回调地址



    private static TianyiConfigure tianyiConfigure;

    private TianyiConfigure(){}

    public static synchronized TianyiConfigure getInstance() {
        if (tianyiConfigure == null) {
            tianyiConfigure = new TianyiConfigure();
        }
        return tianyiConfigure;
    }

    public String getRefundBackUrl() {
        return refundBackUrl;
    }

    public void setRefundBackUrl(String refundBackUrl) {
        this.refundBackUrl = refundBackUrl;
    }

    public String getPublicKeyUrl() {
        return publicKeyUrl;
    }

    public void setPublicKeyUrl(String publicKeyUrl) {
        this.publicKeyUrl = publicKeyUrl;
    }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String getCheckStandH5Url() {
        return checkStandH5Url;
    }

    public void setCheckStandH5Url(String checkStandH5Url) {
        this.checkStandH5Url = checkStandH5Url;
    }

    public String getPayQueryUrl() {
        return payQueryUrl;
    }

    public void setPayQueryUrl(String payQueryUrl) {
        this.payQueryUrl = payQueryUrl;
    }

    public String getRefundUrl() {
        return refundUrl;
    }

    public void setRefundUrl(String refundUrl) {
        this.refundUrl = refundUrl;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getBeforeBackUrl() {
        return beforeBackUrl;
    }

    public void setBeforeBackUrl(String beforeBackUrl) {
        this.beforeBackUrl = beforeBackUrl;
    }

    public String getBackMerchantUrl() {
        return backMerchantUrl;
    }

    public void setBackMerchantUrl(String backMerchantUrl) {
        this.backMerchantUrl = backMerchantUrl;
    }

    public String getSwtichacc() {
        return swtichacc;
    }

    public void setSwtichacc(String swtichacc) {
        this.swtichacc = swtichacc;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getUserLanguage() {
        return userLanguage;
    }

    public void setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
    }

    public String getKeyIndex() {
        return keyIndex;
    }

    public void setKeyIndex(String keyIndex) {
        this.keyIndex = keyIndex;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRiskControlInfo() {
        return riskControlInfo;
    }

    public void setRiskControlInfo(String riskControlInfo) {
        this.riskControlInfo = riskControlInfo;
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }
}
