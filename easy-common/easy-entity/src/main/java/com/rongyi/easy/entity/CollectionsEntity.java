package com.rongyi.easy.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;

@Entity(value="collections", noClassnameStored = true)
public class CollectionsEntity implements Serializable{

	@Id
	private ObjectId id;// id
	@Property("user_id")
	private String userId;// 用户id
	@Property("collectable_id")
	private String collectableId;// 收藏的内容的id
	@Property("collectable_type")
	private String collectableType;// 收藏的内容
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

	public String getCollectableId() {
		return collectableId;
	}



	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setCollectableId(String collectableId) {
		this.collectableId = collectableId;
	}

	public String getCollectableType() {
		return collectableType;
	}

	public void setCollectableType(String collectableType) {
		this.collectableType = collectableType;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
