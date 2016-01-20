package com.rongyi.easy.bdata.param;
/**
 * 微信端查询店铺参数类
 * @author wzh
 *
 */
public class ShopParamForWeChat {
	
	private String name;//店铺名
	private String number;//铺位号
	private String floorId;//楼层id
	private String mallId;//商场id
	private String building;//楼栋
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getFloorId() {
		return floorId;
	}
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	
}
