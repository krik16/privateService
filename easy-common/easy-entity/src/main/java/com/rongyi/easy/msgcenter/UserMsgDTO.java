package com.rongyi.easy.msgcenter;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/8/30 15:51
 * Package:com.rongyi.easy.msgcenter
 * Project:message-center
 */
public class UserMsgDTO implements Serializable{
    private static final long serialVersionUID = -3022699601318374789L;
    /**
     * 消息标题
     */
    private String title;

    /**
     * 消息内容
     */
    private String msgContent;

    /**
     * 发送用户id
     */
    private String userId;

    /**
     * 推送类型  1.系统推送 0.人工推送
     */
    private Integer pushType;

    /**
     * 推送时间
     */
    private Date msgPushtime;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getPushType() {
        return pushType;
    }

    public void setPushType(Integer pushType) {
        this.pushType = pushType;
    }

    public Date getMsgPushtime() {
        return msgPushtime;
    }

    public void setMsgPushtime(Date msgPushtime) {
        this.msgPushtime = msgPushtime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserMsgDTO{");
        sb.append("title='").append(title).append('\'');
        sb.append(", msgContent='").append(msgContent).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", pushType=").append(pushType);
        sb.append(", msgPushtime=").append(msgPushtime);
        sb.append('}');
        return sb.toString();
    }
}
