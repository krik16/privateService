package com.rongyi.pay.core.webank.config;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微众支付配置信息
 * Created by sujuan on 2017/2/16.
 */
public class WwConfigure extends BaseData{

    //商户密钥key
    private String key ;

    //刷卡支付请求url
    private String punchCardPayUrl;

    //刷卡支付订单查询请求Url
    private String punchCardPayQueryOrderUrl;

    //冲正订单（撤销订单）请求Url
    private String punchCardPayReverseOrderUrl;

    private static WwConfigure wwConfigure;

    private WwConfigure (){}

    public static synchronized WwConfigure getInstance() {
        if (wwConfigure == null) {
            wwConfigure = new WwConfigure();
        }
        return wwConfigure;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPunchCardPayUrl() {
        return punchCardPayUrl;
    }

    public void setPunchCardPayUrl(String punchCardPayUrl) {
        this.punchCardPayUrl = punchCardPayUrl;
    }

    public String getPunchCardPayQueryOrderUrl() {
        return punchCardPayQueryOrderUrl;
    }

    public void setPunchCardPayQueryOrderUrl(String punchCardPayQueryOrderUrl) {
        this.punchCardPayQueryOrderUrl = punchCardPayQueryOrderUrl;
    }

    public String getPunchCardPayReverseOrderUrl() {
        return punchCardPayReverseOrderUrl;
    }

    public void setPunchCardPayReverseOrderUrl(String punchCardPayReverseOrderUrl) {
        this.punchCardPayReverseOrderUrl = punchCardPayReverseOrderUrl;
    }
}
