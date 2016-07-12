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
	
	@Override
	public String toString(){
		return "[name:"+name+",businessId:"+businessId+",floorId:"+floorId+",lastFloorId:"+lastFloorId
				+",shopNumber:"+shopNumber+",address:"+address;
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
}
