package com.rongyi.easy.code;

import java.util.Date;

public class CodeGetRecord {
    private Integer id;

    private String code;

    private Date createAt;

    private String userId;

    private String userPhone;

    private String userNickName;

    private Byte status;

    private String inviterAccount;

    private Integer inviterId;

    /**
     * 0:店长；1：导购；2：买手
     */
    private Integer inviterType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
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

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getInviterAccount() {
        return inviterAccount;
    }

    public void setInviterAccount(String inviterAccount) {
        this.inviterAccount = inviterAccount;
    }

    public Integer getInviterId() {
        return inviterId;
    }

    public void setInviterId(Integer inviterId) {
        this.inviterId = inviterId;
    }

    public Integer getInviterType() {
        return inviterType;
    }

    public void setInviterType(Integer inviterType) {
        this.inviterType = inviterType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CodeGetRecord{");
        sb.append("id=").append(id);
        sb.append(", code='").append(code).append('\'');
        sb.append(", createAt=").append(createAt);
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", userPhone='").append(userPhone).append('\'');
        sb.append(", userNickName='").append(userNickName).append('\'');
        sb.append(", status=").append(status);
        sb.append(", inviterAccount='").append(inviterAccount).append('\'');
        sb.append(", inviterId=").append(inviterId);
        sb.append(", inviterType=").append(inviterType);
        sb.append('}');
        return sb.toString();
    }
}
