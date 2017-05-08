package com.rongyi.easy.bsoms.entity;

import java.io.Serializable;
import java.util.Date;

public class UserShop implements Serializable{
    private Integer id;

    private Integer brandId;

    private Integer ownerId;

    private Integer mallId;

    private Integer shopId;

    private Integer branchCompanyId;

    private Integer status;

    private Date createAt;

    private Integer userId;

    private Integer parentShopId;
    
    private Integer grandpaShopId;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getBranchCompanyId() {
        return branchCompanyId;
    }

    public void setBranchCompanyId(Integer branchCompanyId) {
        this.branchCompanyId = branchCompanyId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	public Integer getParentShopId() {
		return parentShopId;
	}

	public void setParentShopId(Integer parentShopId) {
		this.parentShopId = parentShopId;
	}

	public Integer getGrandpaShopId() {
		return grandpaShopId;
	}

	public void setGrandpaShopId(Integer grandpaShopId) {
		this.grandpaShopId = grandpaShopId;
	}

}