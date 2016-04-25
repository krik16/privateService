package com.rongyi.easy.malllife.param;

import java.io.Serializable;
import java.util.Date;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/6/3
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/6/3              1.0            创建文件
 *
 */
public class MalllifeUser implements Serializable {

    private static final long serialVersionUID = 1L;


    private String userId;

    private String phone;

    private String pwd;

    private String nickName;

    private  String avatar;  //头像地址


    private String openId;



    private String channel;// 容易逛(MALLLIFE),其他第三方全民财富（QMCAIFU） RONGYI_HTDR(容易后台导入)  HGDSLHJ   //哈根达斯—老虎机活动

    private String devUuid;//设备uuid

    private String idfa; //

    private String deviceType; //设备型号

    private String terminalType;//终端平台 IOS || android

    private String imId;

    private Integer isLoginRed;//登录领红包 0未领取 1已经领取

    private String pushChanelId;

    private Date lastSignInAt;

    private String   lastSignInIp;//最新登录Ip地址

    private String shareCode;//摩店邀请注册码

    private String registInIp;//注册IP

    private String  publicNumId;//商家公众号Id

    public String getIdfa() {
        return idfa;
    }

    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDevUuid() {
        return devUuid;
    }

    public void setDevUuid(String devUuid) {
        this.devUuid = devUuid;
    }

    public String getImId() {
        return imId;
    }

    public void setImId(String imId) {
        this.imId = imId;
    }

    public Integer getIsLoginRed() {
        return isLoginRed;
    }

    public void setIsLoginRed(Integer isLoginRed) {
        this.isLoginRed = isLoginRed;
    }

    public String getPushChanelId() {
        return pushChanelId;
    }

    public void setPushChanelId(String pushChanelId) {
        this.pushChanelId = pushChanelId;
    }

    public Date getLastSignInAt() {
        return lastSignInAt;
    }

    public void setLastSignInAt(Date lastSignInAt) {
        this.lastSignInAt = lastSignInAt;
    }

    public String getLastSignInIp() {
        return lastSignInIp;
    }

    public void setLastSignInIp(String lastSignInIp) {
        this.lastSignInIp = lastSignInIp;
    }

    public String getShareCode() {
        return shareCode;
    }

    public void setShareCode(String shareCode) {
        this.shareCode = shareCode;
    }

    public String getRegistInIp() {
        return registInIp;
    }

    public void setRegistInIp(String registInIp) {
        this.registInIp = registInIp;
    }

    public String getPublicNumId() {
        return publicNumId;
    }

    public void setPublicNumId(String publicNumId) {
        this.publicNumId = publicNumId;
    }
}
