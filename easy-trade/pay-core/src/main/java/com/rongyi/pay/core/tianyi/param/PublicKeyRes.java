package com.rongyi.pay.core.tianyi.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * Created by yangyang on 2017/4/5.
 */
public class PublicKeyRes extends BaseData {

    //公钥索引
    private String keyIndex;

    //公钥
    private String pubKey;

    //会话id
    private String sessionId;

    //随机数
    private String aesRandomId;

    //等待时间
    private String waitTime;

    public String getKeyIndex() {
        return keyIndex;
    }

    public void setKeyIndex(String keyIndex) {
        this.keyIndex = keyIndex;
    }

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getAesRandomId() {
        return aesRandomId;
    }

    public void setAesRandomId(String aesRandomId) {
        this.aesRandomId = aesRandomId;
    }

    public String getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(String waitTime) {
        this.waitTime = waitTime;
    }
}
