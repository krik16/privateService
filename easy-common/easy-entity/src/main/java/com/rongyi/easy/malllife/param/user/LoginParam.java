package com.rongyi.easy.malllife.param.user;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  重构登录传参
 * time:  2015/10/23
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/23              1.0            创建文件
 *
 */

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LoginParam implements Serializable {
    private static final long serialVersionUID = 1L;


    private String username ;
    private String password ;
    private String devId ;
    private String pushChanelId;
    private String lastSignInIp;
    private  String readpwd ;
    private String captcha ;
    private List<GrantedAuthority> authorities ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
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

    public String getReadpwd() {
        return readpwd;
    }

    public void setReadpwd(String readpwd) {
        this.readpwd = readpwd;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public List<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
}
