package com.rongyi.pay.core.tianyi.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * Created by yangyang on 2017/4/5.
 */
public class PublicKeyParam extends BaseData {

    //公钥索引
    private String keyIndex;

    //AES迷药加密串
    private String encryKey;

    //请求豹纹加密串
    private String encryStr;

    //接口请求业务编码-M
    private String interCode;


    public String getKeyIndex() {
        return keyIndex;
    }

    public void setKeyIndex(String keyIndex) {
        this.keyIndex = keyIndex;
    }

    public String getEncryKey() {
        return encryKey;
    }

    public void setEncryKey(String encryKey) {
        this.encryKey = encryKey;
    }

    public String getEncryStr() {
        return encryStr;
    }

    public void setEncryStr(String encryStr) {
        this.encryStr = encryStr;
    }

    public String getInterCode() {
        return interCode;
    }

    public void setInterCode(String interCode) {
        this.interCode = interCode;
    }
}
