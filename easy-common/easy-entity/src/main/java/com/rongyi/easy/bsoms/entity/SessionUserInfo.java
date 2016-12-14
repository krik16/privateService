package com.rongyi.easy.bsoms.entity;

import java.io.Serializable;

public class SessionUserInfo implements Serializable{
    
	private static final long serialVersionUID = 6383826849485417919L;

	private Integer id;

    private Integer type;

    private Integer identity;

    private Integer isCooperation;

    private String userPhone;
    
    private String userAccount;

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

	private Integer parentShopId;

	private String parentShopMid;

	private Integer grandpaShopId;

	private String grandpaShopMid;

	private Integer level;  //账号层级 1 2 3

	private Integer isChief; //是否主账号  0否 1是

    private String logo = "http://rongyi.b0.upaiyun.com/commodity/text/201601051202219059.png";  //logo图片地址
    
    private String theCompanyName;  //所属集团 or 商场 or 品牌名称
    
    private String address ;  //用户所属公司地址


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

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
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
		if(getIdentity() == 0){
			return groupId;
		}else if(getIdentity() == 1){
			return mallId;
		}else if(getIdentity() == 2) {
			return brandId;
		}else if (getIdentity() == 3) {
			return filialeId;
		}else if (getIdentity() == 4 || getIdentity() == 5) {
			return shopId;
		}
		return null;
	}
	public String getBindingMid(){
		if(getIdentity() == 0){
			return groupMid;
		}else if(getIdentity() == 1){
			return mallMid;
		}else if(getIdentity() == 2){
			return brandMid;
		}else if (getIdentity() == 3) {
			return filialeMid;
		}else if (getIdentity() == 4 || getIdentity() == 5) {
			return shopMid;
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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getTheCompanyName() {
		return theCompanyName;
	}

	public void setTheCompanyName(String theCompanyName) {
		this.theCompanyName = theCompanyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getIsChief() {
		return isChief;
	}

	public void setIsChief(Integer isChief) {
		this.isChief = isChief;
	}

	public Integer getParentShopId() {
		return parentShopId;
	}

	public void setParentShopId(Integer parentShopId) {
		this.parentShopId = parentShopId;
	}

	public String getParentShopMid() {
		return parentShopMid;
	}

	public void setParentShopMid(String parentShopMid) {
		this.parentShopMid = parentShopMid;
	}

	public Integer getGrandpaShopId() {
		return grandpaShopId;
	}

	public void setGrandpaShopId(Integer grandpaShopId) {
		this.grandpaShopId = grandpaShopId;
	}

	public String getGrandpaShopMid() {
		return grandpaShopMid;
	}

	public void setGrandpaShopMid(String grandpaShopMid) {
		this.grandpaShopMid = grandpaShopMid;
	}
}
