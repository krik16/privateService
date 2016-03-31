package com.rongyi.easy.rmmm.dto.user;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  登录记录
 * time:  2016/3/4
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/3/4              1.0            创建文件
 *
 */

import java.io.Serializable;

public class UserLoginDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String phone; //登录账号

    private String deviceId; //登录设备号

    private String channel; //渠道号

    private String jessionid; //sessionID

    private Integer loginStatus; //登录状态

    private String loginIp; //登录ip


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getJessionid() {
        return jessionid;
    }

    public void setJessionid(String jessionid) {
        this.jessionid = jessionid;
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
}
