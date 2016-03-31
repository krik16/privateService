package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity(value="mcmc_shop_brand_category",noClassnameStored=true)
public class CommodityCategoryFilter implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8165600555842780949L;
	@Id
	private ObjectId id;
	private String filter_id;
	private int filter_type;
	private List<ObjectId> category_list;
	private Date createAt;
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getFilter_id() {
		return filter_id;
	}
	public void setFilter_id(String filter_id) {
		this.filter_id = filter_id;
	}
	public int getFilter_type() {
		return filter_type;
	}
	public void setFilter_type(int filter_type) {
		this.filter_type = filter_type;
	}
	public List<ObjectId> getCategory_list() {
		return category_list;
	}
	public void setCategory_list(List<ObjectId> category_list) {
		this.category_list = category_list;
	}

}
