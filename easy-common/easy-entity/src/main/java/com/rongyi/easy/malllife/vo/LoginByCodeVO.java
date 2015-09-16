package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  登录参数
 * time:  2015/5/11
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/11              1.0            创建文件
 *
 */
public class LoginByCodeVO implements Serializable{

    private String       phone;//
    private String       code;//
    private String       dev_uuid; //设备uuid
    private String       sharCode; //邀请码
    private String       pushChanelId;//百度推送服务ID app传给后台
    private String      lastSignInIp;//最新登录Ip地址


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDev_uuid() {
        return dev_uuid;
    }

    public void setDev_uuid(String dev_uuid) {
        this.dev_uuid = dev_uuid;
    }

    public String getSharCode() {
        return sharCode;
    }

    public void setSharCode(String sharCode) {
        this.sharCode = sharCode;
    }

    public String getPushChanelId() {
        return pushChanelId;
    }

    public void setPushChanelId(String pushChanelId) {
        this.pushChanelId = pushChanelId;
    }

    public String getLastSignInIp() {
        return lastSignInIp;
    }

    public void setLastSignInIp(String lastSignInIp) {
        this.lastSignInIp = lastSignInIp;
    }
}
