package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;
import com.rongyi.pay.core.webank.config.WebankConfigure;
import com.rongyi.pay.core.wechat.util.RandomStringGenerator;

/**
 * 微众支付宝公共请求参数
 * Created by sujuan on 2017/3/3.
 */
public class AlipayCommonReqData extends BaseData{
    private static final long serialVersionUID = 7120930794279628735L;
    //32位随机码
    private String nonce ;

    //签名
    private String sign ;

    //版本
    private String version = "1.0.0";

    //app_id
    private String appId ;

    public AlipayCommonReqData(WebankConfigure configure) {
        setNonce(RandomStringGenerator.getRandomStringByLength(32));
        setAppId(configure.getAppId());
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
