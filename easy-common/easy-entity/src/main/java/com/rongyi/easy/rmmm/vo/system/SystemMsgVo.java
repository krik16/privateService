package com.rongyi.easy.rmmm.vo.system;

import java.io.Serializable;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  系统消息
 * time:  2015/4/15
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/4/15              1.0            创建文件
 *
 */
public class SystemMsgVo implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;  //

    private String msgTitle; //消息标题

    private String msgPushtime;//时间 格式 2012-11-11

    private String msgContent;//内容

    private String  msgLink ;//消息链接

    private String msgStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getMsgPushtime() {
        return msgPushtime;
    }

    public void setMsgPushtime(String msgPushtime) {
        this.msgPushtime = msgPushtime;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getMsgLink() {
        return msgLink;
    }

    public void setMsgLink(String msgLink) {
        this.msgLink = msgLink;
    }

    public String getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(String msgStatus) {
        this.msgStatus = msgStatus;
    }
}
