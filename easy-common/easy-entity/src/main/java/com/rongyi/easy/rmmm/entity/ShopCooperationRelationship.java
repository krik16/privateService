package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("rmmm_shop")
public class ShopCooperationRelationship implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4456592329869527608L;
	
	@Id
	private ObjectId id;
	private ObjectId shop_mid;
	private String cooperation_shop_id;
	private int shop_status;
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
	public ObjectId getShop_mid() {
		return shop_mid;
	}
	public void setShop_mid(ObjectId shop_mid) {
		this.shop_mid = shop_mid;
	}
	public String getCooperation_shop_id() {
		return cooperation_shop_id;
	}
	public void setCooperation_shop_id(String cooperation_shop_id) {
		this.cooperation_shop_id = cooperation_shop_id;
	}
	public int getShop_status() {
		return shop_status;
	}
	public void setShop_status(int shop_status) {
		this.shop_status = shop_status;
	}
	

}
