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
}
