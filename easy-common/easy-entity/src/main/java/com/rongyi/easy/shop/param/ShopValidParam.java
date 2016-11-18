package com.rongyi.easy.shop.param;

import java.io.Serializable;

/**
 * 校验店铺是否重复的bean
 * @author sj
 *
 */
public class ShopValidParam implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name ;        //店铺名称
	private String businessId ;  //区ID
	private String floorId;      //楼层id
	private String lastFloorId;  //跨楼层的第二个楼层ID
	private String shopNumber; //铺位号
	private String address ;   //详细地址
	private String shopId;  //店铺ID
	private Integer shopType;  //店铺类型 2街边店

	@Override
	public String toString() {
		return "ShopValidParam{" +
				"name='" + name + '\'' +
				", businessId='" + businessId + '\'' +
				", floorId='" + floorId + '\'' +
				", lastFloorId='" + lastFloorId + '\'' +
				", shopNumber='" + shopNumber + '\'' +
				", address='" + address + '\'' +
				", shopId='" + shopId + '\'' +
				", shopType=" + shopType +
				'}';
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getFloorId() {
		return floorId;
	}
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}
	public String getLastFloorId() {
		return lastFloorId;
	}
	public void setLastFloorId(String lastFloorId) {
		this.lastFloorId = lastFloorId;
	}
	public String getShopNumber() {
		return shopNumber;
	}
	public void setShopNumber(String shopNumber) {
		this.shopNumber = shopNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Integer getShopType() {
		return shopType;
	}

	public void setShopType(Integer shopType) {
		this.shopType = shopType;
	}
}
