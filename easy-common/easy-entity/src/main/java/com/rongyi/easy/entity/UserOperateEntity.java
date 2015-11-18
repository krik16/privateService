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
 * author chenjun
 * Description ：用户操作我的代金券、红包、抵扣券记录
 * time ：2015年11月17日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月17日               1.0              创建文件
 */
@Entity(value = "user_operate", noClassnameStored = true)
public class UserOperateEntity implements Serializable{
	
	@Id
	private ObjectId id;//主键
	@Property("user_id")
	private String userId;//用户id
	@Property("type")
	private String type;//类型 1 红包 2代金券 3抵扣券
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
		return "UserOperateEntity [id=" + id + ", userId=" + userId + ", type=" + type + ", updatedAt=" + updatedAt
				+ ", createdAt=" + createdAt + "]";
	}

}
