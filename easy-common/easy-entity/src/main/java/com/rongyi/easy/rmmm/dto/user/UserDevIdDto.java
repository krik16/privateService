package com.rongyi.easy.rmmm.dto.user;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2016/3/31
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/3/31              1.0            创建文件
 *
 */

import java.io.Serializable;

public class UserDevIdDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String phone; //账号

    private String deviceId; //注册设备号

    private Integer userIdentity; //账号身份


    private Integer userId; //账号ID


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

    public Integer getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(Integer userIdentity) {
        this.userIdentity = userIdentity;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
