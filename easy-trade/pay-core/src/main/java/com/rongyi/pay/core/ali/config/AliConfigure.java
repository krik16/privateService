package com.rongyi.pay.core.ali.config;

import com.rongyi.pay.core.util.BaseData;

/**
 * Created by liuyangkly on 15/6/27.
 */
public class AliConfigure extends BaseData{
//    private static Configuration configs;

    private  String openApiDomain = "https://openapi.alipay.com/gateway.do";   // 支付宝openapi域名
    private  String mcloudApiDomain ="http://mcloudmonitor.com/gateway.do";  // 支付宝mcloudmonitor域名
    private  String pid = "";// 商户partner id
    private  String appid = "";           // 商户应用id
    private  String key = "";//key

    private  String privateKey = "";      // RSA私钥，用于对商户请求报文加签
    private  String publicKey = "";       // RSA公钥，仅用于验证开发者网关
    private  String alipayPublicKey = ""; // 支付宝RSA公钥，用于验签支付宝应答

    private String mchAuthUrl = "http://openauth.alipay.com/oauth2/appToAppAuth.htm";//商户授权url

    private String userAuthUrl = "https://openauth.alipay.com/oauth2/publicAppAuthorize.htm";//用户授权url

    private  int maxQueryRetry = 5;   // 最大查询次数
    private  long queryDuration = 5000;  // 查询间隔（毫秒）

    private  int maxCancelRetry = 3;  // 最大撤销次数
    private  long cancelDuration = 200; // 撤销间隔（毫秒）

    private  long heartbeatDelay = 5; // 交易保障线程第一次调度延迟（秒）
    private  long heartbeatDuration = 900; // 交易保障线程调度间隔（秒）

    private String notifyUrl;//支付通知地址

    private String appAuthToken;//应用令牌

    public String getAppAuthToken() {
        return appAuthToken;
    }

    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
    }

    private static AliConfigure aliConfigure;

    private AliConfigure (){}

    public static synchronized AliConfigure getInstance() {
        if (aliConfigure == null) {
            aliConfigure = new AliConfigure();
        }
        return aliConfigure;
    }

    /**
     * test init
     */
    public static AliConfigure init() {

        AliConfigure aliConfigure =  new AliConfigure();
        //test 账号
        aliConfigure.setPid("2088701977493485");
        aliConfigure.setAppid("2014020800003041");
        aliConfigure.setPrivateKey("MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBALoF8MTGt3gvWbjGRHxOmHqOoWwBLq3N3PQ3hPUdmsVP5tqW8scfSNmyW6XTPT1tzfKMmTc6zNrc8YH5Tm2dVa4zzLfqcBe7MSSChfpz+poNA/kOTESz0iocjMDycvlH8V0ZFyyMBf7XeG9AjzTukxHKcTGJrPV40xcpHyejCpMbAgMBAAECgYEAgvi3wfOfLVE5PGzrvxGfLXrKkD5s3RX6IUANrn5/f7h38yMgH64ZHp0DBceqcFulCsaPAWG25cl1iGs9GtQRg/YPe6CF4+TwHP9YaySAlk1goYaE1UOg0rewkf+KlWeuJ9bgd4ljNNkhNTtAkGah+PaaBGPwvSv5rqVg/Llw5HECQQDyv0OvZy+M3eZxWYD/i8U3sS53I5VMV3r1TiObr/e2wKN78RIUnnlpj9C2PESJLywiEW1ooi3e3xY2Km4U0/TNAkEAxC3g+SBLns6fCiRZbRa5JgVQFQ3gxMDVE8N+PFaoYrupusBy7+TI4ZMwE0YxA3m25Sz8CCiADJrxOyCnbt5nhwJBALZC45g0eqBjEB51XIUDNe3t6/xqTDQIzvqWU+gWhIDEPTvXMoMmxfR7lfLuZ2s1bwaZXTOd6aEYkX3T99lNl9UCQQCjzKrLV+vL7TldfnwsWYy98jGrYqsJnPhMSC5esvxlc8uD4qwVITGZJww9C55hCH9tWuIU7bv8ymIgvGMQbyKBAkA7vQqa3BAnA3+ie2/wgEyAskU9cWSXFcxhMxQ7V3Yg4pKZC7BvWvhPDeKFDPbMlTXfkhG/lLp5WiJ+uW4Zdetd");
        aliConfigure.setPublicKey("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC6BfDExrd4L1m4xkR8Tph6jqFsAS6tzdz0N4T1HZrFT+balvLHH0jZslul0z09bc3yjJk3Osza3PGB+U5tnVWuM8y36nAXuzEkgoX6c/qaDQP5DkxEs9IqHIzA8nL5R/FdGRcsjAX+13hvQI807pMRynExiaz1eNMXKR8nowqTGwIDAQAB");
        aliConfigure.setAlipayPublicKey("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB");
        aliConfigure.setKey("wx749527272cae4b9b");
        return aliConfigure;
    }


    public String getOpenApiDomain() {
        return openApiDomain;
    }

    public void setOpenApiDomain(String openApiDomain) {
        this.openApiDomain = openApiDomain;
    }

    public String getMcloudApiDomain() {
        return mcloudApiDomain;
    }

    public void setMcloudApiDomain(String mcloudApiDomain) {
        this.mcloudApiDomain = mcloudApiDomain;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getAlipayPublicKey() {
        return alipayPublicKey;
    }

    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
    }

    public int getMaxQueryRetry() {
        return maxQueryRetry;
    }

    public void setMaxQueryRetry(int maxQueryRetry) {
        this.maxQueryRetry = maxQueryRetry;
    }

    public long getQueryDuration() {
        return queryDuration;
    }

    public void setQueryDuration(long queryDuration) {
        this.queryDuration = queryDuration;
    }

    public int getMaxCancelRetry() {
        return maxCancelRetry;
    }

    public void setMaxCancelRetry(int maxCancelRetry) {
        this.maxCancelRetry = maxCancelRetry;
    }

    public long getCancelDuration() {
        return cancelDuration;
    }

    public void setCancelDuration(long cancelDuration) {
        this.cancelDuration = cancelDuration;
    }

    public long getHeartbeatDelay() {
        return heartbeatDelay;
    }

    public void setHeartbeatDelay(long heartbeatDelay) {
        this.heartbeatDelay = heartbeatDelay;
    }

    public long getHeartbeatDuration() {
        return heartbeatDuration;
    }

    public void setHeartbeatDuration(long heartbeatDuration) {
        this.heartbeatDuration = heartbeatDuration;
    }

    public String getMchAuthUrl() {
        return mchAuthUrl;
    }

    public void setMchAuthUrl(String mchAuthUrl) {
        this.mchAuthUrl = mchAuthUrl;
    }

    public String getUserAuthUrl() {
        return userAuthUrl;
    }

    public void setUserAuthUrl(String userAuthUrl) {
        this.userAuthUrl = userAuthUrl;
    }

    public static AliConfigure getAliConfigure() {
        return aliConfigure;
    }

    public static void setAliConfigure(AliConfigure aliConfigure) {
        AliConfigure.aliConfigure = aliConfigure;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "AliConfigure{" +
                ", pid='" + pid + '\'' +
                ", appid='" + appid + '\'' +
                '}';
    }
}

