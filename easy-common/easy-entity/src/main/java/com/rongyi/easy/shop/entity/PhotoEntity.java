package com.rongyi.easy.shop.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.bson.types.ObjectId;

import java.util.Date;

/**
 * 图片信息
 */
@Entity(value="photos",noClassnameStored=true)
public class PhotoEntity {

    @Id
    private ObjectId id;

    private String title;
    private Date updated_at;
    private Date created_at;
    private ObjectId owner_id;
    private String owner_type;
    private String file;
    private Integer status;
    private Integer position;

	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
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
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
}
