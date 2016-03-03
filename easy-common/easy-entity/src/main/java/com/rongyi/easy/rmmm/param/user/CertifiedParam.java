package com.rongyi.easy.rmmm.param.user;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;

public class CertifiedParam extends BaseParam implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Integer userId;  //用户ID
	
	private String callName; //称呼
	
	private String city;          //所在城市
	
	private String contactPhone;  //联系电话
	
	private String synopsis;      //自我简介
	
	private String mallId;        //商场ID
	
	private String shopId;         //店铺ID

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getCallName() {
		return callName;
	}

	public void setCallName(String callName) {
		this.callName = callName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	
	
}
