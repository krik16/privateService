package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 特卖对应的商场店铺表
 * @author lijing 2015-11-17 16:26
 */
public class TemplateSaleShopMall implements Serializable{
    /**id*/
    private Integer id;
    /**活动模版id*/
    private Integer activityTemplateId;
    /**商场id*/
    private String mallMid;
    /**商场名字*/
    private String mallName;
    /**店铺id*/
    private String shopMid;
    /**店铺名字*/
    private String shopName;
    /**false 表示没有删除   true表示删除*/
    private Boolean isDeleted;
    /**创建人*/
    private String createUser;
    /**修改时间*/
    private Date updateAt;
    /**创建时间*/
    private Date createAt;
    /**0表示没有修改  1表示新增 2表示删除  3表示修改*/
    private int isShopU;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityTemplateId() {
        return activityTemplateId;
    }

    public void setActivityTemplateId(Integer activityTemplateId) {
        this.activityTemplateId = activityTemplateId;
    }

    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public int getIsShopU() {
        return isShopU;
    }

    public void setIsShopU(int isShopU) {
        this.isShopU = isShopU;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityTemplateId", activityTemplateId)
                .append("mallMid", mallMid)
                .append("mallName", mallName)
                .append("shopMid", shopMid)
                .append("shopName", shopName)
                .append("isDeleted", isDeleted)
                .append("createUser", createUser)
                .append("updateAt", updateAt)
                .append("createAt", createAt)
                .append("isShopU",isShopU)
                .toString();
    }
}