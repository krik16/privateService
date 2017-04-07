package com.rongyi.core.common.third.param.sms;

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

    private String sendChannel; //发送渠道

    private String sendType;//发送类型  RYNTCSMS 通知类型 RYMARKSMS 营销类型

    private int isDisabled;//0 正常 1禁用，停止

    private String sign;    //短信签名

    private String remark;    //备注

    private Date createAt;

    private String createBy;

    private Date updateAt;

    private String updateBy;

    public SmsVO(SmsDto smsDto){
        this.setId(smsDto.getId());
        this.setChannel(smsDto.getChannel());
        this.setPublicKey(smsDto.getPublicKey());
        this.setPrivateKey(smsDto.getPrivateKey());
        this.setToken(smsDto.getToken());
        this.setIpLimit(smsDto.getIpLimit());
        this.setIpWhiteList(smsDto.getIpWhiteList());
        this.setSendChannel(smsDto.getSendChannel());
        this.setSendType(smsDto.getSendType());
        this.setIsDisabled(smsDto.getIsDisabled());
        this.setSign(smsDto.getSign());
        this.setRemark(smsDto.getRemark());
        this.setCreateAt(smsDto.getCreateAt());
        this.setCreateBy(smsDto.getCreateBy());
        this.setUpdateAt(smsDto.getUpdateAt());
        this.setUpdateBy(smsDto.getUpdateBy());
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

    public int getIpLimit() {
        return ipLimit;
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

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public int getIsDisabled() {
        return isDisabled;
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
    public String toString(){
        return ReflectionToStringBuilder.toString(this);
    }
}
