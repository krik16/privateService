package com.rongyi.core.sms;

import java.io.Serializable;

/**
 * Created by wuhui on 2017/4/13.
 */
public class SmsChannel implements Serializable {

    private String key;
    private String desc;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SmsChannel(String key, String desc){
        this.key = key;
        this.desc = desc;
    }
}
