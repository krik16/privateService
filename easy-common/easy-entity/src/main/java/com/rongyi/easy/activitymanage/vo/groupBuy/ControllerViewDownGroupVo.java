package com.rongyi.easy.activitymanage.vo.groupBuy;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xuying on 2016/10/27.
 */
public class ControllerViewDownGroupVo implements Serializable{

   private Integer groupId;
    private String userNick;
    private String phone;
    private Integer groupPeopleLimit;
    private Date createAt;
    private Integer state;
    private String goodName;
    private String userName;
    private String userPhone;
    private Integer joinState;


    public Integer getJoinState() {
        return joinState;
    }

    public void setJoinState(Integer joinState) {
        this.joinState = joinState;
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

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getGroupPeopleLimit() {
        return groupPeopleLimit;
    }

    public void setGroupPeopleLimit(Integer groupPeopleLimit) {
        this.groupPeopleLimit = groupPeopleLimit;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }
}
