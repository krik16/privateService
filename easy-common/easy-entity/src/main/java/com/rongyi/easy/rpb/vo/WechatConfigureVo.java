package com.rongyi.easy.rpb.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 微信支付账号配置信息
 * conan
 * 2016/10/11 14:49
 **/
public class WechatConfigureVo implements Serializable {


    private static final long serialVersionUID = -4091061010908993281L;
    private String key = "";

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

    //机器IP
    private String ip = "127.0.0.1";
    
  //微信分配的公众号secret（开通公众号之后可以获取到）
    private String appSecret = "";
    
    //支付类型
    private String tradeType;

    //支付通知地址
    private String notifyUrl;


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

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
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

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
