package com.rongyi.core.common.third.param.sms;

import com.rongyi.core.common.third.md5.Md5Util;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.sms.SmsConfig;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by WUH on 2017/4/7.
 * 短信渠道返回VO
 */
public class SmsVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;     //id

    private String channel;  //渠道

    private String privateKey; //不可修改

    private String publicKey;//不可修改

    private String token; //token 不可修改

    private int ipLimit; // IP限制  ；0 不做限制 1 限制

    private String ipWhiteList; //ip白名单

    private int limitNumber;  //限制次数

    private String phoneWhiteList; //手机号白名单

    private String sendChannel; //发送渠道

    private String sendType;//发送类型  RYNTCSMS 通知类型 RYMARKSMS 营销类型

    private int isDisabled;//0 正常 1禁用，停止

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

    public SmsVO(SmsChannelDto smsChannelDto){
        this.setId(smsChannelDto.getId());
        this.setChannel(smsChannelDto.getChannel());
        this.setPublicKey(smsChannelDto.getPublicKey());
        this.setPrivateKey(smsChannelDto.getPrivateKey());
        this.setToken(smsChannelDto.getToken());
        this.setIpLimit(smsChannelDto.getIpLimit());
        this.setIpWhiteList(smsChannelDto.getIpWhiteList());
        this.setLimitNumber(smsChannelDto.getLimitNumber());
        this.setPhoneWhiteList(smsChannelDto.getPhoneWhiteList());
        this.setSendChannel(smsChannelDto.getSendChannel());
        this.setSendType(smsChannelDto.getSendType());
        this.setIsDisabled(smsChannelDto.getIsDisabled());
        this.setSign(smsChannelDto.getSign());
        this.setRemark(smsChannelDto.getRemark());
        this.setUrl(smsChannelDto.getUrl());
        this.setUnitId(smsChannelDto.getUnitId());
        this.setUsername(smsChannelDto.getUsername());
        if(StringUtils.isNotBlank(smsChannelDto.getPassword())){
            String password = Md5Util.EncoderByMd5(smsChannelDto.getPassword());
            this.setPassword(password);
        }
        this.setCreateAt(smsChannelDto.getCreateAt());
        this.setCreateBy(smsChannelDto.getCreateBy());
        this.setUpdateAt(smsChannelDto.getUpdateAt());
        this.setUpdateBy(smsChannelDto.getUpdateBy());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChannel() {
        return channel;
    }

    public int getIpLimit() {
        return ipLimit;
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

    public String getSendType() {
        return sendType;
    }

    public int getIsDisabled() {
        return isDisabled;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setIpLimit(int ipLimit) {
        this.ipLimit = ipLimit;
    }

    public String getIpWhiteList() {
        return ipWhiteList;
    }

    public void setIpWhiteList(String ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }

    public String getSendChannel() {
        return sendChannel;
    }

    public void setSendChannel(String sendChannel) {
        this.sendChannel = sendChannel;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public void setIsDisabled(int isDisabled) {
        this.isDisabled = isDisabled;
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
        return SmsConfig.PASSWORD;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateAt() {
        return DateUtil.dateToString(createAt);
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

    public String getUpdateAt() {
        return DateUtil.dateToString(updateAt);
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
    public String toString(){
        return ReflectionToStringBuilder.toString(this);
    }
}
