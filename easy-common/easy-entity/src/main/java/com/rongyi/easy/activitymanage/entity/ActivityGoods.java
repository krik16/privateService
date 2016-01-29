package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ActivityGoods implements Serializable {
    private Integer id;

    private Integer activityId;

    private String goodsId;

    private Integer type;

    private String name;

    private String picUrl;

    private Integer subsidyType;

    private Integer subsidyPrice;

    private Date joinStartAt;

    private Date joinEndAt;

    private Integer status;

    private String createUser;

    private String updateUser;

    private Date createAt;

    private Date updateAt;

    private Boolean isDeleted;

    private Integer version;

    /**
     * 商品规格
     */
    private List<ActivityGoodsSpec>  activityGoodsSpecs;

    /**
     * 商品分类
     */
    private List<ActivityGoodsCategory> activityGoodsCategories;

    public ActivityGoods(int type){
		this.type=type;
	}

    public ActivityGoods() {
    }

    public ActivityGoods(String goodsId){
		this.goodsId=goodsId;
	}

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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getSubsidyType() {
        return subsidyType;
    }

    public void setSubsidyType(Integer subsidyType) {
        this.subsidyType = subsidyType;
    }

    public Integer getSubsidyPrice() {
        return subsidyPrice;
    }

    public void setSubsidyPrice(Integer subsidyPrice) {
        this.subsidyPrice = subsidyPrice;
    }

    public Date getJoinStartAt() {
        return joinStartAt;
    }

    public void setJoinStartAt(Date joinStartAt) {
        this.joinStartAt = joinStartAt;
    }

    public Date getJoinEndAt() {
        return joinEndAt;
    }

    public void setJoinEndAt(Date joinEndAt) {
        this.joinEndAt = joinEndAt;
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

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<ActivityGoodsSpec> getActivityGoodsSpecs() {
        return activityGoodsSpecs;
    }

    public void setActivityGoodsSpecs(List<ActivityGoodsSpec> activityGoodsSpecs) {
        this.activityGoodsSpecs = activityGoodsSpecs;
    }

    public List<ActivityGoodsCategory> getActivityGoodsCategories() {
        return activityGoodsCategories;
    }

    public void setActivityGoodsCategories(List<ActivityGoodsCategory> activityGoodsCategories) {
        this.activityGoodsCategories = activityGoodsCategories;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("goodsId", goodsId)
                .append("type", type)
                .append("name", name)
                .append("picUrl", picUrl)
                .append("subsidyType", subsidyType)
                .append("subsidyPrice", subsidyPrice)
                .append("joinStartAt", joinStartAt)
                .append("joinEndAt", joinEndAt)
                .append("status", status)
                .append("createUser", createUser)
                .append("updateUser", updateUser)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("isDeleted", isDeleted)
                .append("version", version)
                .append("activityGoodsSpecs", activityGoodsSpecs)
                .append("activityGoodsCategories", activityGoodsCategories)
                .toString();
    }
}