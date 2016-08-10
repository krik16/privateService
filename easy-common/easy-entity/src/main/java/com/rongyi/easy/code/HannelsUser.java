package com.rongyi.easy.code;

public class HannelsUser {
    private Integer id;

    private Integer hannelsId;//推广码id

    private Integer userId;//用户id

    private String userAccount;//用户账号

    private String userPhone;//用户手机号码

    private Integer identity;//用户类型  4:店长；5：导购

    /**
     * 0:指定到人；1：指定到店铺；2：指定到商场
     */
    private Integer type;

    private String assignId;

    private String assignName;


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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAssignId() {
        return assignId;
    }

    public void setAssignId(String assignId) {
        this.assignId = assignId;
    }

    public String getAssignName() {
        return assignName;
    }

    public void setAssignName(String assignName) {
        this.assignName = assignName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HannelsUser{");
        sb.append("id=").append(id);
        sb.append(", hannelsId=").append(hannelsId);
        sb.append(", userId=").append(userId);
        sb.append(", userAccount='").append(userAccount).append('\'');
        sb.append(", userPhone='").append(userPhone).append('\'');
        sb.append(", identity=").append(identity);
        sb.append(", type=").append(type);
        sb.append(", assignId='").append(assignId).append('\'');
        sb.append(", assignName='").append(assignName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
