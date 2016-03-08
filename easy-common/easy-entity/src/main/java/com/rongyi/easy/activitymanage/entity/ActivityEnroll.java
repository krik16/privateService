package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;
import java.util.Date;

public class ActivityEnroll implements Serializable {
    private Integer id;

    private Integer activityId;

    private String enrollId;

    private Byte enrollType;

    private Byte isReg;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    private Byte isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(String enrollId) {
        this.enrollId = enrollId;
    }

    public Byte getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(Byte enrollType) {
        this.enrollType = enrollType;
    }

    public Byte getIsReg() {
        return isReg;
    }

    public void setIsReg(Byte isReg) {
        this.isReg = isReg;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}