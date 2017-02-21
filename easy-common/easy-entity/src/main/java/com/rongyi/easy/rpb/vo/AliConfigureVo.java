package com.rongyi.easy.rpb.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * conan
 * 2017/2/7 17:24
 **/
public class AliConfigureVo{
    private  String pid = "";// 商户partner id
    private  String appid = "";           // 商户应用id
    private  String key = "";//key

    private  String privateKey = "";      // RSA私钥，用于对商户请求报文加签
    private  String publicKey = "";       // RSA公钥，仅用于验证开发者网关
    private  String alipayPublicKey = ""; // 支付宝RSA公钥，用于验签支付宝应答

    private String notifyUrl;//支付通知地址

    private String appAuthToken;//应用令牌

    private static AliConfigureVo aliConfigureVo;

    private AliConfigureVo (){}

    public static synchronized AliConfigureVo getInstance() {
        if (aliConfigureVo == null) {
            aliConfigureVo = new AliConfigureVo();
        }
        return aliConfigureVo;
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getAppAuthToken() {
        return appAuthToken;
    }

    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
    }
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

}
