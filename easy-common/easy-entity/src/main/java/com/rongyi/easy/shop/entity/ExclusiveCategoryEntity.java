package com.rongyi.easy.shop.entity;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
/**
 * 店铺专属分类
 * @author wzh
 *
 */
@Entity("shop_exclusive_category")
public class ExclusiveCategoryEntity {
	@Id
	private ObjectId id;

	private String name;
	private Date createAt;
	private List<ObjectId> parentids;
	private ObjectId parentid;
	private int type;//1表示一级分类2 二级分类
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
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public List<ObjectId> getParentids() {
		return parentids;
	}
	public void setParentids(List<ObjectId> parentids) {
		this.parentids = parentids;
	}
	public ObjectId getParentid() {
		return parentid;
	}
	public void setParentid(ObjectId parentid) {
		this.parentid = parentid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
}
