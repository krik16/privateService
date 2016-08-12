package com.rongyi.easy.rmmm.param.user;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/8/12.
 */
public class PushUpdateParam implements Serializable {
    private String pushId;

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    @Override
    public String toString() {
        return "PushUpdateParam{" +
                "pushId='" + pushId + '\'' +
                '}';
    }
}
