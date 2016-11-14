package com.rongyi.easy.tradecenter.vo;

import java.io.Serializable;

/**
 * 统一用户（微信）
 *
 * @author wangjh7
 * @date 2016-11-14
 */
public class UserCenterVO implements Serializable {
    // 用户ID
    private String userId;
    // 用户名称
    private String userName;
    // 用户昵称
    private String nickName;
    // 用户手机
    private String userPhone;
    // 微信Id
    private String openId;
    // 用户等级
    private String level;
    // 积分
    private int creditNumber;

    public int getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "UserCenterVO{" +
                "creditNumber=" + creditNumber +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", openId='" + openId + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
