package com.rongyi.core.common.third.param.sms;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.util.Date;

/**
 * Created by wuhui on 2017/4/7.
 */
public class SmsChannelDto extends SmsDto {
    private int id;     //id

    private int limitNumber;  //限制次数

    private String phoneWhiteList; //手机号白名单

    private String sign;    //短信签名

    private String remark;    //备注

    private String url;

    private String unitId;

    private String username;

    private String password;

    private Date createAt;

    private String createBy;

    private Date updateAt;

    private String updateBy;

    public SmsChannelDto(){}

    public SmsChannelDto(SmsDto smsDto){
        this.setChannel(smsDto.getChannel());
        this.setPrivateKey(smsDto.getPrivateKey());
        this.setPublicKey(smsDto.getPublicKey());
        this.setToken(smsDto.getToken());
        this.setSendChannel(smsDto.getSendChannel());
        this.setSendType(smsDto.getSendType());
        this.setIpLimit(smsDto.getIpLimit());
        this.setIpWhiteList(smsDto.getIpWhiteList());
    }

    public int getLimitNumber() {
        return limitNumber;
    }

    public void setLimitNumber(int limitNumber) {
        this.limitNumber = limitNumber;
    }

    public String getPhoneWhiteList() {
        return phoneWhiteList;
    }

    public void setPhoneWhiteList(String phoneWhiteList) {
        this.phoneWhiteList = phoneWhiteList;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
