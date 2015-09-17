package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("mcmc_commodity_spec_column_classification")
public class CommoditySpecColumnClassification implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9099780604289373639L;
	@Id
	private ObjectId id;
	private String color;//颜色规格项对应的色系
	private String name;//规格类名
	private List<ObjectId> parentids;
	private ObjectId parentid;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
