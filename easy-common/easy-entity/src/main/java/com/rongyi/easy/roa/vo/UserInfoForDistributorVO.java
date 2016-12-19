package com.rongyi.easy.roa.vo;

import java.io.Serializable;

/**
 * 新建分销商时筛选的店铺账户列表返回VO
 * @author user
 *
 */
public class UserInfoForDistributorVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8482584141563190018L;
	private Integer id;//表主键id
	private String shopName;//店铺名称
	private String shopMid;//店铺mongoId
	private String userAccount;//用户名
	private String userPhone;//手机号
	private Integer identity;//身份类型:0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购、6买手
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Integer getIdentity() {
		return identity;
	}
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}
	@Override
	public String toString() {
		return "UserInfoForDistributorVO [id=" + id + ", shopName=" + shopName
				+ ", shopMid=" + shopMid + ", userAccount=" + userAccount
				+ ", userPhone=" + userPhone + ", identity=" + identity + "]";
	}
	
	
}
