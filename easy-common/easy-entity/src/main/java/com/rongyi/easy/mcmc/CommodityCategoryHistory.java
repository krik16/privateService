package com.rongyi.easy.mcmc;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity("mcmc_commodity_category_history")
public class CommodityCategoryHistory  implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3491400779856182500L;
	@Id
	private ObjectId id;
	private String commodityCategoryId;
	private Integer userId;
	private int type;
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
	
	
}
