package com.rongyi.easy.bsoms.entity;

import java.io.Serializable;
import java.util.Date;

public class TaskInfo implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String name;

    private Date startAt;

    private Date endAt;

    private String agreeTitle;

    private int status;         //任务状态  0待审核 1已通过 2未通过 3已终止 （4未生效 5生效中 6已结束）

    private int isDeleted;  //0正常 1已删除

    private String stopReason;  //终止理由

    private Integer createBy;

    private Integer updateBy;

    private Date createAt;

    private Date updateAt;

    private int signUpNum;  //报名人数

    private String createUser; //创建者用户名

    private String updateUser; //修改者用户名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public String getAgreeTitle() {
        return agreeTitle;
    }

    public void setAgreeTitle(String agreeTitle) {
        this.agreeTitle = agreeTitle;
    }

    public int getStatus() {
        return status;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
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

    public String getStopReason() {
        return stopReason;
    }

    public void setStopReason(String stopReason) {
        this.stopReason = stopReason;
    }

    public int getSignUpNum() {
        return signUpNum;
    }

    public void setSignUpNum(int signUpNum) {
        this.signUpNum = signUpNum;
    }

    public String getCreateUser() {
        return createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}