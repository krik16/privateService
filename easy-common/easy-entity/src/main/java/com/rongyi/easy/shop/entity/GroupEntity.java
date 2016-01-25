package com.rongyi.easy.shop.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
/**
 * 集团
 * @author wzh
 *
 */
@SuppressWarnings("serial")
@Entity(value="mall_groups",noClassnameStored=true)
public class GroupEntity implements Serializable{
	
	
	@Id
	private ObjectId id;
	
	private String name;
	
	private int status;
	
	private List<ObjectId> mall_ids;
	
	private Date updated_at;
	
	private Date created_at;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<ObjectId> getMall_ids() {
		return mall_ids;
	}

	public void setMall_ids(List<ObjectId> mall_ids) {
		this.mall_ids = mall_ids;
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
	
}
