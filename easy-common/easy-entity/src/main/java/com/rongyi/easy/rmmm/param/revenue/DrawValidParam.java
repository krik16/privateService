package com.rongyi.easy.rmmm.param.revenue;

import java.io.Serializable;

/**
 * 设置体现密码校验验证码,手机号码,身份证号码参数
 * Created by shaozhou on 2016/7/28.
 */
public class DrawValidParam implements Serializable {
    private String phone;//手机号码
    private String verifyCode;//验证码
    private String identity;//身份证号码
    private String jsessionid;//jsessionId
    private String password;//当前密码
    private String oldPassword;//旧密码
    private String radomCode;//随机码

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getJsessionid() {
        return jsessionid;
    }

    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }

    public String getRadomCode() {
        return radomCode;
    }

    public void setRadomCode(String radomCode) {
        this.radomCode = radomCode;
    }

    @Override
    public String toString() {
        return "DrawValidParam{" +
                "phone='" + phone + '\'' +
                ", verifyCode='" + verifyCode + '\'' +
                ", identity='" + identity + '\'' +
                ", jsessionid='" + jsessionid + '\'' +
                ", password='" + password + '\'' +
                ", oldPassword='" + oldPassword + '\'' +
                ", radomCode='" + radomCode + '\'' +
                '}';
    }
}
