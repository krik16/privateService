package com.rongyi.easy.merchantactivity.vo;

import com.rongyi.easy.activitymanage.entity.ActivityGoodsSpec;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/20
 * TIME : 23:19
 * ideaworkspace.
 */
public class GoodsActivtyVO implements Serializable {
    private Integer goodsId;
    /**
     * * 商品审核状态：待审核[0] 已退回[1] 已通过[2],3已下线 4 申请撤销中),
     */
    private Integer goodsStatus;

    /**
     * 卡券id
     */
    private String couponId;
    /**
     * 卡券类型
     */
    private Integer goodsType;

    private String goodsName;

    private String activityName;
    /**活动状态  0.待审核
     1.不通过
     2.未开始
     3.进行中
     4.已结束
     5 强下线
     6 申请撤销中
     */
    private Integer activityStatus;

    private Date activityStartAt;

    private Date activityEndAt;

    private Boolean activityIsDeleted;

    /**
     * 商品规格
     */
    private List<ActivityGoodsSpec> activityGoodsSpecsVos = new ArrayList<ActivityGoodsSpec>();

    private Integer identity;

    private String identity_id;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Date getActivityStartAt() {
        return activityStartAt;
    }

    public void setActivityStartAt(Date activityStartAt) {
        this.activityStartAt = activityStartAt;
    }

    public Date getActivityEndAt() {
        return activityEndAt;
    }

    public void setActivityEndAt(Date activityEndAt) {
        this.activityEndAt = activityEndAt;
    }

    public Boolean getActivityIsDeleted() {
        return activityIsDeleted;
    }

    public void setActivityIsDeleted(Boolean activityIsDeleted) {
        this.activityIsDeleted = activityIsDeleted;
    }

    public List<ActivityGoodsSpec> getActivityGoodsSpecsVos() {
        return activityGoodsSpecsVos;
    }

    public void setActivityGoodsSpecsVos(List<ActivityGoodsSpec> activityGoodsSpecsVos) {
        this.activityGoodsSpecsVos = activityGoodsSpecsVos;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getIdentity_id() {
        return identity_id;
    }

    public void setIdentity_id(String identity_id) {
        this.identity_id = identity_id;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("goodsId", goodsId)
                .append("goodsStatus", goodsStatus)
                .append("couponId", couponId)
                .append("goodsType", goodsType)
                .append("goodsName", goodsName)
                .append("activityName", activityName)
                .append("activityStatus", activityStatus)
                .append("activityStartAt", activityStartAt)
                .append("activityEndAt", activityEndAt)
                .append("activityIsDeleted", activityIsDeleted)
                .append("activityGoodsSpecsVos", activityGoodsSpecsVos)
                .append("identity", identity)
                .append("identity_id", identity_id)
                .toString();
    }
}
