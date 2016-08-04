package com.rongyi.easy.bdata.entity;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 图片
 * 
 * @author xiaobo
 *
 */
@Entity(value="photos", noClassnameStored = true)
public class Photo implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 图片id
	 */
	@Id
	private ObjectId id;
	/**
	 * 创建时间
	 */
	private Date created_at;
	/**
	 * 图片名
	 */
	private String file;
	/**
	 * 拥有者id
	 */
	private ObjectId owner_id;
	/**
	 * 拥有者类型
	 */
	private String owner_type;
	/**
	 * 图片位置
	 */
	private int position;
	/**
	 * 状态
	 */
	private Double status;
	/**
	 * 更新时间
	 */
	private Date updated_at;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public ObjectId getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(ObjectId owner_id) {
		this.owner_id = owner_id;
	}

	public String getOwner_type() {
		return owner_type;
	}

	public void setOwner_type(String owner_type) {
		this.owner_type = owner_type;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Double getStatus() {
		return status;
	}

	public void setStatus(Double status) {
		this.status = status;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
}
