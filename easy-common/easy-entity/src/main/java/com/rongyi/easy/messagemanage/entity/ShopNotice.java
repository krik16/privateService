package com.rongyi.easy.messagemanage.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 店铺公告实体
 * @author lijing
 * @time 2015-09-06
 */
@SuppressWarnings("serial")
public class ShopNotice implements Serializable{
	/**店铺公告id*/
    private Integer id;
    /**店铺公告内容*/
    private String content;
    /**店铺名字*/
    private String shopName;
    /**店铺id*/
    private String shopMid;
    /**状态 0待审核 1审核通过 2 未通过*/
    private Integer status;
    /** 发布开始时间*/
    private Date publishBeginAt;
    /** 发布结束时间*/
    private Date publishEndAt;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createAt;
    /**修改人*/
    private String updateUser;
    /**修改时间*/
    private Date updateAt;
    /**是否删除  true  删除了   false没有删除*/
    private Boolean isDeleted;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPublishBeginAt() {
        return publishBeginAt;
    }

    public void setPublishBeginAt(Date publishBeginAt) {
        this.publishBeginAt = publishBeginAt;
    }

    public Date getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(Date publishEndAt) {
        this.publishEndAt = publishEndAt;
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}