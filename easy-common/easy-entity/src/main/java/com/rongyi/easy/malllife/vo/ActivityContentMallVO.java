package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

public class ActivityContentMallVO  implements Serializable{
	
    private String       mallName;
    private double       logoX;
    private double       logoY;
    private String       mapPicture;
    private String       iconUrl;
    private Integer      number; //活动被举行商场数量
    private String       refType;   // 关联类型
    private String       refId;     // 分享时关联的id， mall,shop  
    private String       address; // 地址
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public double getLogoX() {
		return logoX;
	}
	public void setLogoX(double logoX) {
		this.logoX = logoX;
	}
	public double getLogoY() {
		return logoY;
	}
	public void setLogoY(double logoY) {
		this.logoY = logoY;
	}
	public String getMapPicture() {
		return mapPicture;
	}
	public void setMapPicture(String mapPicture) {
		this.mapPicture = mapPicture;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getRefType() {
		return refType;
	}
	public void setRefType(String refType) {
		this.refType = refType;
	}
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ActivityContentMallVO [mallName=" + mallName + ", logoX="
				+ logoX + ", logoY=" + logoY + ", mapPicture=" + mapPicture
				+ ", iconUrl=" + iconUrl + ", number=" + number + ", refType="
				+ refType + ", refId=" + refId + ", address=" + address + "]";
	}

}
