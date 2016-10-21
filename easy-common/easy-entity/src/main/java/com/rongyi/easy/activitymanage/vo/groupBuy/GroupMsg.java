package com.rongyi.easy.activitymanage.vo.groupBuy;

import java.io.Serializable;

/**
 * Created by caohongjiang on 2016/10/20.
 */
public class GroupMsg  implements Serializable{
    private static final long serialVersionUID = 5358511895479167306L;

    private  GroupInfo groupInfo;
    private String mallName;
    private String mallId;
    private String groupPeopleLimit;
    private String groupPeopleNeed;
    private String allReadyJoindCount;
    private String goodName;
    private String groupLeadName;
    private String goodPrice;
    private String urlPerfix;



    public GroupInfo getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(GroupInfo groupInfo) {
        this.groupInfo = groupInfo;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }


    public String getGroupPeopleLimit() {
        return groupPeopleLimit;
    }

    public void setGroupPeopleLimit(String groupPeopleLimit) {
        this.groupPeopleLimit = groupPeopleLimit;
    }

    public String getGroupPeopleNeed() {
        return groupPeopleNeed;
    }

    public void setGroupPeopleNeed(String groupPeopleNeed) {
        this.groupPeopleNeed = groupPeopleNeed;
    }

    public String getAllReadyJoindCount() {
        return allReadyJoindCount;
    }

    public void setAllReadyJoindCount(String allReadyJoindCount) {
        this.allReadyJoindCount = allReadyJoindCount;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGroupLeadName() {
        return groupLeadName;
    }

    public void setGroupLeadName(String groupLeadName) {
        this.groupLeadName = groupLeadName;
    }

    public String getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(String goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getUrlPerfix() {
        return urlPerfix;
    }

    public void setUrlPerfix(String urlPerfix) {
        this.urlPerfix = urlPerfix;
    }
}
