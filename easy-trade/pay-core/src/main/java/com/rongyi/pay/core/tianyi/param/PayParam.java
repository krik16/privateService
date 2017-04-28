package com.rongyi.pay.core.tianyi.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * Created by yangyang on 2017/4/5.
 */
public class PayParam extends BaseData {

    //公钥索引-M
    private String keyIndex;

    //AES密钥加密串-M
    private String encryKey;

    //请求报文加密串-M
    private String encryStr;

    //接口请求业务编码-M(30)
    private String platform;

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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
