package com.rongyi.easy.activitymanage.vo;

import com.rongyi.easy.activitymanage.entity.ActivityGoodsRule;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.activitymanage.vo easy-api :author lijing
 * User:lijing
 * DATE : 2016/1/25
 * TIME : 16:41
 * easy-api.
 */
public class ActivityInfoListVO implements Serializable {
    /**活动id*/
    private Integer id;
   /**活动名称*/
    private String name;
   /**活动开始时间*/
    private Date startAt;
    /**活动结束时间*/
    private Date endAt;
    /**活动类型 0.商品类活动，1卡券类活动，2.抽奖类活动 3.卡券及商品类活动，4.签到送积分，5，特卖'*/
    private Integer type;
    /**发布终端:[1,1,1,1]表示容易逛、终端屏、微信、微商端全部选中[1,0,0,0]表示第一个选中*/
    private String synTarget;
    /**活动状态  0.待审核
     1.不通过
     2.未开始
     3.进行中
     4.已结束
     */
    private Integer status;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createAt;
    /**修改人*/
    private String updateUser;
    /**修改时间*/
    private Date updateAt;
   /**待审核商品个数*/
    private Integer pendGoods;
    /**模版类型*/
    private Integer activityType;
    /**报名商品总数*/
    private Integer goodsTotal;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSynTarget() {
        return synTarget;
    }

    public void setSynTarget(String synTarget) {
        this.synTarget = synTarget;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getPendGoods() {
        return pendGoods;
    }

    public void setPendGoods(Integer pendGoods) {
        this.pendGoods = pendGoods;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getGoodsTotal() {
        return goodsTotal;
    }

    public void setGoodsTotal(Integer goodsTotal) {
        this.goodsTotal = goodsTotal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("type", type)
                .append("synTarget", synTarget)
                .append("status", status)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("pendGoods", pendGoods)
                .append("activityType", activityType)
                .append("goodsTotal", goodsTotal)
                .toString();
    }
}
