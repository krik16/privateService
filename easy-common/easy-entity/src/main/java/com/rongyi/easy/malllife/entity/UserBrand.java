package com.rongyi.easy.malllife.entity;

import java.sql.Timestamp;


public class UserBrand {

	private String jsessioinid;
	private int id;
	private String brandId;
	private String userId;
	private Timestamp createAt;
	private Timestamp updateAt;
	
	public String getJsessioinid() {
		return jsessioinid;
	}
	public void setJsessioinid(String jsessioinid) {
		this.jsessioinid = jsessioinid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}
	public Timestamp getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
 

}
