package com.rongyi.easy.code;

import java.util.Date;

public class ActivityCode {
    private Long id;

    private String code;

    /**
     * 状态：0：未导出；1：导出；2：已使用；3：作废
     */
    private Byte status;

    private Date createAt;

    private Date updateAt;

    private String createUser;

    private String updateUser;

    /**
     * 活动id&&推广码id
     */
    private String activityId;

    /**
     * 动类型。0：活动；1：促销推广码
     */
    private Byte activityType;

    /**
     * 版本号
     */
    private String version;

    /**
     * 礼品码对应的商场id
     */
    private String mallId;

    /**
     * 0:邀请码；1：礼品码 ；2：邀请码；3：推广码
     */
    private Byte type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public Byte getActivityType() {
        return activityType;
    }

    public void setActivityType(Byte activityType) {
        this.activityType = activityType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ActivityCode{");
        sb.append("id=").append(id);
        sb.append(", code='").append(code).append('\'');
        sb.append(", status=").append(status);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", createUser='").append(createUser).append('\'');
        sb.append(", updateUser='").append(updateUser).append('\'');
        sb.append(", activityId='").append(activityId).append('\'');
        sb.append(", activityType=").append(activityType);
        sb.append(", version='").append(version).append('\'');
        sb.append(", mallId='").append(mallId).append('\'');
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
