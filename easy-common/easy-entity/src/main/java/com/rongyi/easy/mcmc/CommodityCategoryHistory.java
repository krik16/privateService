package com.rongyi.easy.mcmc;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity(value="mcmc_commodity_category_history",noClassnameStored=true)
public class CommodityCategoryHistory  implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3491400779856182500L;
	@Id
	private ObjectId id;
	private String commodityCategoryId;//对应分类id
	private Integer userId;//对应使用者id
	private int type;
	private List<ObjectId> parentids;//对应父类id
	private Date updateAt;
	private Date createAt;
	
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getCommodityCategoryId() {
		return commodityCategoryId;
	}
	public void setCommodityCategoryId(String commodityCategoryId) {
		this.commodityCategoryId = commodityCategoryId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<ObjectId> getParentids() {
		return parentids;
	}
	public void setParentids(List<ObjectId> parentids) {
		this.parentids = parentids;
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
	
}
