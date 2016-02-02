package com.rongyi.easy.usercenter.entity;
/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  用户中心---用户管理
 * time:  2015/11/19
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/11/19            1.0            创建文件
 *
 */
import java.io.Serializable;
import java.util.Date;

/**
 *
 */
public class MalllifeUserInfoEntity  implements Serializable {

    private static final long serialVersionUID = 1L;
    /** 用户uuid */
    private String id;

    /** 用户名称 */
    private String userName;

    /** 密码 */
    private String password;

    /** 邮箱 */
    private String email;

    /** 手机号 */
    private String phone;

    /** 版本号 */
    private Integer version;

    /*是否禁用 0 正常*/
    private Integer isDisable;

    /** 头像地址 */
    private String headImg;

    /** 微信openid */
    private String openId;

    /** 环信号 */
    private String imId;

    /** 用户呢称 */
    private String nickName;

    /** 注册渠道
    MALLLIFE 容易逛, 主要用于IOS
    QMCAIFU  全民财富
    RONGYI_HTDR 容易后台导入
    HGDSLHJ 哈根达斯—老虎机活动
     As 表示终端翻牌
     wechat_fanpaigou 表示微信翻牌
     */
    private String channel;

    /** 设备ID */
    private String devUuid;

    /** IOS idfa */
    private String idfa;

    /** 设备型号 */
    private String deviceType;

    /** 终端类型 */
    private String terminalType;

    /** 用户性别，U未知,M男，F女,默认U */
    private String gender;

    /** 是否领取红包 默认值0 未领取，1已领取 */
    private Integer loginRed;

    /** 更新时间 */
    private Date updateAt;

    /** 创建时间 */
    private Date createAt;

    /** 百度推送Id */
    private String pushId;

    /** 最新登录时间 */
    private Date lastLoginAt;

    /** 最新登录Ip地址 */
    private String lastLoginIp;

    /** 摩店邀请注册码 */
    private String shareCode;

    /** 注册IP */
    private String registIp;



    /** 商家公众号Id */
    private String publicNumId;

    /**
     * 用户uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 用户uuid
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名称
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 手机号
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 版本号
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本号
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 头像地址
     * @return headImg
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 头像地址
     * @param headImg
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 微信openid
     * @return openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 微信openid
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 环信号
     * @return imId
     */
    public String getImId() {
        return imId;
    }

    /**
     * 环信号
     * @param imId
     */
    public void setImId(String imId) {
        this.imId = imId;
    }

    /**
     * 用户呢称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 用户呢称
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 注册渠道
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 注册渠道
     * @param channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * 设备ID
     * @return devUuid
     */
    public String getDevUuid() {
        return devUuid;
    }

    /**
     * 设备ID
     * @param devUuid
     */
    public void setDevUuid(String devUuid) {
        this.devUuid = devUuid;
    }

    /**
     * IOS idfa
     * @return idfa
     */
    public String getIdfa() {
        return idfa;
    }

    /**
     * IOS idfa
     * @param idfa
     */
    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    /**
     * 设备型号
     * @return deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 设备型号
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 终端类型
     * @return terminalType
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * 终端类型
     * @param terminalType
     */
    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    /**
     * 用户性别，U未知,M男，F女,默认U
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 用户性别，U未知,M男，F女,默认U
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 是否领取红包 默认值0 未领取，1已领取
     * @return loginRed
     */
    public Integer getLoginRed() {
        return loginRed;
    }

    /**
     * 是否领取红包 默认值0 未领取，1已领取
     * @param loginRed
     */
    public void setLoginRed(Integer loginRed) {
        this.loginRed = loginRed;
    }

    /**
     * 更新时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 更新时间
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 创建时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 百度推送Id
     * @return pushId
     */
    public String getPushId() {
        return pushId;
    }

    /**
     * 百度推送Id
     * @param pushId
     */
    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    /**
     * 最新登录时间
     * @return lastLoginAt
     */
    public Date getLastLoginAt() {
        return lastLoginAt;
    }

    /**
     * 最新登录时间
     * @param lastLoginAt
     */
    public void setLastLoginAt(Date lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    /**
     * 最新登录Ip地址
     * @return lastLoginIp
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 最新登录Ip地址
     * @param lastLoginIp
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * 摩店邀请注册码
     * @return shareCode
     */
    public String getShareCode() {
        return shareCode;
    }

    /**
     * 摩店邀请注册码
     * @param shareCode
     */
    public void setShareCode(String shareCode) {
        this.shareCode = shareCode;
    }

    public Integer getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }

    /**
     * 注册IP
     * @return registIp
     */
    public String getRegistIp() {
        return registIp;
    }

    /**
     * 注册IP
     * @param registIp
     */
    public void setRegistIp(String registIp) {
        this.registIp = registIp;
    }

    public String getPublicNumId() {
        return publicNumId;
    }

    public void setPublicNumId(String publicNumId) {
        this.publicNumId = publicNumId;
    }
}