package com.rongyi.easy.bsoms.entity;

import java.io.Serializable;

public class SessionUserInfo implements Serializable{
    
	private static final long serialVersionUID = 6383826849485417919L;

	private Integer id;

    private Integer type;

    private Integer identity;

    private Integer isCooperation;

    private String userPhone;

    private String userName;

    private String userNickName;

    private Integer createSource;
    
    private Integer brandId;
    
    private String brandMid;

    private Integer groupId;
    
    private String groupMid;

    private Integer mallId;
    
    private String mallMid;

    private Integer shopId;
    
    private String shopMid;
    
    private Integer filialeId;
    
    private String filialeMid;



	public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}



	public String getBrandMid() {
		return brandMid;
	}

	public void setBrandMid(String brandMid) {
		this.brandMid = brandMid;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}



	public Integer getMallId() {
		return mallId;
	}

	public void setMallId(Integer mallId) {
		this.mallId = mallId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public Integer getFilialeId() {
		return filialeId;
	}

	public void setFilialeId(Integer filialeId) {
		this.filialeId = filialeId;
	}

	public String getFilialeMid() {
		return filialeMid;
	}

	public void setFilialeMid(String filialeMid) {
		this.filialeMid = filialeMid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getIdentity() {
		return identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public Integer getIsCooperation() {
		return isCooperation;
	}

	public void setIsCooperation(Integer isCooperation) {
		this.isCooperation = isCooperation;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	
	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupMid() {
		return groupMid;
	}

	public void setGroupMid(String groupMid) {
		this.groupMid = groupMid;
	}

	public Integer getCreateSource() {
		return createSource;
	}

	public void setCreateSource(Integer createSource) {
		this.createSource = createSource;
	}

	public Integer getBindingId(){
//		return 6;//集团假数据
//		return 36;//商场假数据
		if(getIdentity() == 0){
			return groupId;
		}else if(getIdentity() == 1){
			return mallId;
		}else if(getIdentity() == 2 || getIdentity() == 3 || getIdentity() == 4 || getIdentity() == 5){
			return brandId;
		}
		return null;
	}
	public String getBindingMid(){
//		return "55c1c53e992df1254cdb4e7e";//集团假数据
//		return "52ca425821232f10a400065e";//商场假数据
//		return "51f9d9e431d65584ab000c50";//品牌假数据
		if(getIdentity() == 0){
			return groupMid;
		}else if(getIdentity() == 1){
			return mallMid;
		}else if(getIdentity() == 2 || getIdentity() == 3 || getIdentity() == 4 || getIdentity() == 5){
			return brandMid;
		}
		return null;
	}
	
	public String getBindingType(){
		if(getIdentity() == 0){
			return "Group";//集团假数据
		}else if(getIdentity() == 1){
			return "Mall";
		}else if(getIdentity() == 2 || getIdentity() == 3 || getIdentity() == 4 || getIdentity() == 5){
			return "Brand";
		}
		return null;
	}
    
}
