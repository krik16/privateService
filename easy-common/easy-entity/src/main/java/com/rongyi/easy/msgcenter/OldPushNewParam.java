package com.rongyi.easy.msgcenter;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/8/25.
 */
public class OldPushNewParam implements Serializable {
    private String inviteCode;//老用户邀请码
    private Integer inviteType;//邀请类型 1注册 2注册并交易
    private String userId;//被邀请用户id
    private String userPhone;//被邀请用户手机号码

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public Integer getInviteType() {
        return inviteType;
    }

    public void setInviteType(Integer inviteType) {
        this.inviteType = inviteType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    @Override
    public String toString() {
        return "OldPushNewParam{" +
                "inviteCode='" + inviteCode + '\'' +
                ", inviteType=" + inviteType +
                ", userId=" + userId +
                '}';
    }
}
