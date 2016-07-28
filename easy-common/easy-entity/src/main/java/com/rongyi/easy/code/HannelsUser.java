package com.rongyi.easy.code;

public class HannelsUser {
    private Integer id;

    private Integer hannelsId;//推广码id

    private Integer userId;//用户id

    private String userAccount;//用户账号

    private String userPhone;//用户手机号码

    private Integer identity;//用户类型  4:店长；5：导购

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHannelsId() {
        return hannelsId;
    }

    public void setHannelsId(Integer hannelsId) {
        this.hannelsId = hannelsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "HannelsUser{" +
                "id=" + id +
                ", hannelsId=" + hannelsId +
                ", userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", identity=" + identity +
                '}';
    }
}
