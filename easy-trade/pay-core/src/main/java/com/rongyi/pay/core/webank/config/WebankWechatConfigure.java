package com.rongyi.pay.core.webank.config;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众支付配置信息
 * Created by sujuan on 2017/2/16.
 */
public class WebankWechatConfigure extends BaseData{
    //商户号
    private String merchantCode ;

    //商户appid
    private String subAppid;

    //商户密钥key
    private String key ;

    //请求url
    private String url;

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getSubAppid() {
        return subAppid;
    }

    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
