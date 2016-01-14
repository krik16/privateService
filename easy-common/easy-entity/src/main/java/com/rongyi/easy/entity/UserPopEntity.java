/**
 * 
 */
package com.rongyi.easy.entity;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * Copyright (C),上海容易网电子商务有限公司
 *  author chenjun 
 *  Description ：验码成功弹窗记录 
 *  time ：2015年8月17日 
 *  History: 变更记录 <author> <time> <version> <desc> 
 *  chenjun 2015年8月17日  1.0 创建文件
 */
@Entity(value = "user_pop", noClassnameStored = true)
public class UserPopEntity implements Serializable {

	@Id
	private ObjectId id;// id
	@Property("user_id")
	private String userId;// 用户id
	@Property("shop_mid")
	private String shopMid;// 店铺id
	@Property("updated_at")
	private Date updatedAt;// 更新时间
	@Property("created_at")
	private Date createdAt;// 创建时间

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "UserPopEntity [id=" + id + ", userId=" + userId + ", shopMid=" + shopMid + ", updatedAt=" + updatedAt
				+ ", createdAt=" + createdAt + "]";
	}

}
