package com.rongyi.easy.mcmc;

import java.io.Serializable;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity(value="mcmc_commodity_spec_column",noClassnameStored=true)
public class CommoditySpecColumn implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9099780604289373639L;
	@Id
	private ObjectId id;
	private String name;
	private boolean isRequired;
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
	public boolean isRequired() {
		return isRequired;
	}
	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}

}
