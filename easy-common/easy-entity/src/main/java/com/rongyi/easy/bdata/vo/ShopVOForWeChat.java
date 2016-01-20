package com.rongyi.easy.bdata.vo;

import com.rongyi.easy.bdata.entity.Shop;



/**
 * 商家后台店铺管理实体类
 * 
 * @author wzh
 *
 */
public class ShopVOForWeChat {

	private String id;

	private String name;// 店铺名称

	private String address;// 详细地址

	private String telephone;// 店铺电话


	/**
	 * @param shop
	 */
	public ShopVOForWeChat(Shop shop) {
		
		this.id=shop.getId().toString();
		this.name=shop.getName();
		this.address=shop.getAddress();
		this.telephone=shop.getTelephone();
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
