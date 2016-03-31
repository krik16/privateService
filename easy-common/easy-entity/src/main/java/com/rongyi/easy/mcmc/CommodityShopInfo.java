package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.List;

public class CommodityShopInfo implements Serializable{
	private static final long serialVersionUID = -1820458170953909645L;
	
	private String shopMid;
	private String brandMid;
	private String positon;
	private List<String> zoneIds;
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	public String getBrandMid() {
		return brandMid;
	}
	public void setBrandMid(String brandMid) {
		this.brandMid = brandMid;
	}
	public String getPositon() {
		return positon;
	}
	public void setPositon(String positon) {
		this.positon = positon;
	}
	public List<String> getZoneIds() {
		return zoneIds;
	}
	public void setZoneIds(List<String> zoneIds) {
		this.zoneIds = zoneIds;
	}
	@Override
	public String toString() {
		return "CommodityShopInfo [shopMid=" + shopMid + ", brandMid=" + brandMid + ", positon=" + positon
				+ ", zoneIds=" + zoneIds + "]";
	}
	
}
