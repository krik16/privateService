package com.rongyi.easy.coupon.vo.merchant;

import java.io.Serializable;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/8/19 17:54.
 */
public class UserInfoVo implements Serializable{
    private Integer id;
    private Integer Identity;
    private Integer shopId;
    private Integer mallId;
    private Integer groupId;
    private Integer brandId;
    private Integer branchCompanyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdentity() {
        return Identity;
    }

    public void setIdentity(Integer identity) {
        Identity = identity;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getMallId() {
        return mallId;
    }

    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getBranchCompanyId() {
        return branchCompanyId;
    }

    public void setBranchCompanyId(Integer branchCompanyId) {
        this.branchCompanyId = branchCompanyId;
    }
}
