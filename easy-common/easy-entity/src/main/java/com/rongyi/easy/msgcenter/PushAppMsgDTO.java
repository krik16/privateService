package com.rongyi.easy.msgcenter;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shaozhou on 2016/8/8.
 */
public class PushAppMsgDTO implements Serializable {
    private List<Integer> userIds;//userId
    private String message;
    private String title;
    /**
     * 需要推送的app 0:容易逛；1：摩店；默认 0
     */
    private Integer pushApp;

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPushApp() {
        return pushApp;
    }

    public void setPushApp(Integer pushApp) {
        this.pushApp = pushApp;
    }

    @Override
    public String toString() {
        return "PushAppMsgDTO{" +
                "userIds=" + userIds +
                ", message='" + message + '\'' +
                ", title='" + title + '\'' +
                ", pushApp=" + pushApp +
                '}';
    }
}
