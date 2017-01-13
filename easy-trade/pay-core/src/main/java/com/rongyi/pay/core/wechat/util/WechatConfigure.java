package com.rongyi.pay.core.wechat.util;

import com.rongyi.pay.core.constants.ConstantEnum;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 微信支付账号配置信息
 * conan
 * 2016/10/11 14:49
 **/
public class WechatConfigure {


    //这个就是自己要保管好的私有Key了（切记只能放在自己的后台代码里，不能放在任何可能被看到源代码的客户端程序中）
    // 每次自己Post数据给API的时候都要用这个key来对所有字段进行签名，生成的签名会放在Sign这个字段，API收到Post数据的时候也会用同样的签名算法对Post过来的数据进行签名和验证
    // 收到API的返回的时候也要用这个key来对返回的数据算下签名，跟API的Sign数据进行比较，如果值不一致，有可能数据被第三方给篡改
    private String key = "";
//	private static String key = "b24aaabb1ea8a155c4572570cd260313";

    //微信分配的公众号ID（开通公众号之后可以获取到）
    private String appID = "";

    //微信支付分配的商户号ID（开通公众号的微信支付功能之后可以获取到）
    private String mchID = "";

    //受理模式下给子商户分配的子商户号
    private String subMchID = "";

    //受理模式下给子商户分配的子商户公众号id
    private String subAppID="";

    //HTTPS证书的本地路径
    private String certLocalPath = "";
//	private static String certLocalPath ="F:/data/etc/projects/easy-pay-cert/1268956601.p12";

    //HTTPS证书密码，默认密码等于商户号MCHID
    private String certPassword = "";

    //是否使用异步线程的方式来上报API测速，默认为异步模式
    private boolean useThreadToDoReport = true;

    //机器IP
    private String ip = "127.0.0.1";
    
  //微信分配的公众号secret（开通公众号之后可以获取到）
    private String appSecret = "";
    
    //默认刷卡支付
    private String tradeType = ConstantEnum.WEIXIN_PAY_TRADE_TYPE_NATIVE.getValueStr();

    //以下是几个API的路径：

    //统一下单API
    public static String UNIFIED_ORDER_API = "https://api.mch.weixin.qq.com/pay/unifiedorder";

    //1）刷卡支付API
    public static String PAY_API = "https://api.mch.weixin.qq.com/pay/micropay";

    //2）被扫支付查询API
    public static String PAY_QUERY_API = "https://api.mch.weixin.qq.com/pay/orderquery";

    //3）退款API
    public static String REFUND_API = "https://api.mch.weixin.qq.com/secapi/pay/refund";

    //4）退款查询API
    public static String REFUND_QUERY_API = "https://api.mch.weixin.qq.com/pay/refundquery";

    //5）撤销API
    public static String REVERSE_API = "https://api.mch.weixin.qq.com/pay/closeorder";

    //6）下载对账单API
    public static String DOWNLOAD_BILL_API = "https://api.mch.weixin.qq.com/pay/downloadbill";

    //7) 统计上报API
    public static String REPORT_API = "https://api.mch.weixin.qq.com/payitil/report";
    
    // 网页获取openId
    public static String WEB_GET_OPEN_ID = "https://api.weixin.qq.com/sns/oauth2/access_token?appid={0}&secret={1}&code={2}&grant_type=authorization_code";


    public static String HttpsRequestClassName = "com.rongyi.pay.core.wechat.util.HttpsRequest";

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getMchID() {
        return mchID;
    }

    public void setMchID(String mchID) {
        this.mchID = mchID;
    }

    public String getSubMchID() {
        return subMchID;
    }

    public void setSubMchID(String subMchID) {
        this.subMchID = subMchID;
    }

    public String getCertLocalPath() {
        return certLocalPath;
    }

    public void setCertLocalPath(String certLocalPath) {
        this.certLocalPath = certLocalPath;
    }

    public String getCertPassword() {
        return certPassword;
    }

    public void setCertPassword(String certPassword) {
        this.certPassword = certPassword;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean isUseThreadToDoReport() {
        return useThreadToDoReport;
    }

    public void setUseThreadToDoReport(boolean useThreadToDoReport) {
        this.useThreadToDoReport = useThreadToDoReport;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public static String getUnifiedOrderApi() {
        return UNIFIED_ORDER_API;
    }

    public static void setUnifiedOrderApi(String unifiedOrderApi) {
        UNIFIED_ORDER_API = unifiedOrderApi;
    }

    public static String getPayApi() {
        return PAY_API;
    }

    public static void setPayApi(String payApi) {
        PAY_API = payApi;
    }

    public static String getPayQueryApi() {
        return PAY_QUERY_API;
    }

    public static void setPayQueryApi(String payQueryApi) {
        PAY_QUERY_API = payQueryApi;
    }

    public static String getRefundApi() {
        return REFUND_API;
    }

    public static void setRefundApi(String refundApi) {
        REFUND_API = refundApi;
    }

    public static String getRefundQueryApi() {
        return REFUND_QUERY_API;
    }

    public static void setRefundQueryApi(String refundQueryApi) {
        REFUND_QUERY_API = refundQueryApi;
    }

    public static String getReverseApi() {
        return REVERSE_API;
    }

    public static void setReverseApi(String reverseApi) {
        REVERSE_API = reverseApi;
    }

    public static String getDownloadBillApi() {
        return DOWNLOAD_BILL_API;
    }

    public static void setDownloadBillApi(String downloadBillApi) {
        DOWNLOAD_BILL_API = downloadBillApi;
    }

    public static String getReportApi() {
        return REPORT_API;
    }

    public static void setReportApi(String reportApi) {
        REPORT_API = reportApi;
    }

    public static String getHttpsRequestClassName() {
        return HttpsRequestClassName;
    }

    public static void setHttpsRequestClassName(String httpsRequestClassName) {
        HttpsRequestClassName = httpsRequestClassName;
    }

    public String getSubAppID() {
        return subAppID;
    }

    public void setSubAppID(String subAppID) {
        this.subAppID = subAppID;
    }

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
