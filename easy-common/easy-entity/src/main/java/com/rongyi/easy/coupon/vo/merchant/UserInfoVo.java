package com.rongyi.easy.coupon.vo.merchant;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/8/19 17:54.
 */
public class UserInfoVo implements Serializable{
    private Integer id;
    private Integer identity;//身份类型:0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购
    private String shopId;
    private String  mallId;
    private String groupId;
    private String brandId;
    private String branchCompanyId;
    private String userName;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("identity", identity).append("shopId", shopId).append("mallId", mallId).append("groupId", groupId).append("brandId", brandId).append("branchCompanyId", branchCompanyId).append("userName", userName).toString();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBranchCompanyId() {
        return branchCompanyId;
    }

    public void setBranchCompanyId(String branchCompanyId) {
        this.branchCompanyId = branchCompanyId;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

}
