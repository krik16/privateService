package com.rongyi.easy.activitymanage.vo.groupBuy;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by caohongjiang on 2016/10/21.
 */
public class GroupSearch implements Serializable {
    private static final long serialVersionUID = 1532510657452294276L;
    private Integer currentPage;
    private Integer pageSize;

    private Integer totoalCount;

    /**
     * 查询条件
     */
    private Date qcreateAt;

    /**
     * 查询条件
     */
    private Date qendAt;

    /**
     * 查询条件:拼团状态   0  成功,1 失败 2  拼团中
     */
    private Integer qState;

    /**
     * 团id
     */
    private Long groupId;

    /***
     * 活动id
     */
    private Integer activityId;


    /***
     * 商品id
     */
    private String goodId;

    /**
     * 团创建时间
     */
    private Date createAt;

    /**
     * 团创关闭时间
     */
    private Date endAt;

    /***
     * 成团人数  :3人团   5 人团
     */
    private Integer  groupPeopleLimit;
    private String userNick;
    private String phone;

    private String goodName;

    public Integer getqState() {
        return qState;
    }

    public void setqState(Integer qState) {
        this.qState = qState;
    }

    public Date getQcreateAt() {
        return qcreateAt;
    }

    public void setQcreateAt(Date qcreateAt) {
        this.qcreateAt = qcreateAt;
    }

    public Date getQendAt() {
        return qendAt;
    }

    public void setQendAt(Date qendAt) {
        this.qendAt = qendAt;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotoalCount() {
        return totoalCount;
    }

    public void setTotoalCount(Integer totoalCount) {
        this.totoalCount = totoalCount;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Integer getGroupPeopleLimit() {
        return groupPeopleLimit;
    }

    public void setGroupPeopleLimit(Integer groupPeopleLimit) {
        this.groupPeopleLimit = groupPeopleLimit;
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
}
