package com.rongyi.easy.bsoms.entity;

import com.rongyi.easy.bsoms.entity.UserInfo;

public class SessionUserInfo extends UserInfo{
    
    private Integer brandId;
    
    private String brandMid;

    private Integer ownerId;
    
    private String ownerMid;

    private Integer mallId;
    
    private String mallMid;

    private Integer shopId;
    
    private String shopMid;
    
    private Integer branchCompanyId;
    
    private String branchCompanyMid;

	public String getOwnerMid() {
		return ownerMid;
	}

	public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}

	public void setOwnerMid(String ownerMid) {
		this.ownerMid = ownerMid;
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

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
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

	public Integer getBranchCompanyId() {
		return branchCompanyId;
	}

	public void setBranchCompanyId(Integer branchCompanyId) {
		this.branchCompanyId = branchCompanyId;
	}
	
	public String getBranchCompanyMid() {
		return branchCompanyMid;
	}

	public void setBranchCompanyMid(String branchCompanyMid) {
		this.branchCompanyMid = branchCompanyMid;
	}

	public Integer getBindingId(){
//		return 6;//集团假数据
//		return 36;//商场假数据
		if(getIdentity() == 0){
			return ownerId;
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
			return ownerMid;
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