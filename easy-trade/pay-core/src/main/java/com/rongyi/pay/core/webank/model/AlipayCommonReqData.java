package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;
import com.rongyi.pay.core.webank.config.WebankConfigure;
import com.rongyi.pay.core.webank.util.Signature;
import com.rongyi.pay.core.wechat.util.RandomStringGenerator;

import java.util.ArrayList;

/**
 * 微众支付宝公共请求参数
 * Created by sujuan on 2017/3/3.
 */
public class AlipayCommonReqData extends BaseData{
    //32位随机码
    private String nonce ;

    //签名
    private String sign ;

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
}
