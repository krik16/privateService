package com.rongyi.easy.solr;

import org.apache.solr.client.solrj.beans.Field;

public class RmmmShopDocument implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4495448403857333054L;
	
	@Field
	private String id;
	@Field("name")
	private String name;
	@Field("mongoId")
	private String mongoId;
	@Field("status")
	private int status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMongoId() {
		return mongoId;
	}
	public void setMongoId(String mongoId) {
		this.mongoId = mongoId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
