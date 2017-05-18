package com.rongyi.easy.bdata.vo;

import java.io.Serializable;


public class BrandHaiXinVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String brandCode;//品牌编码
	private String brandName;//品牌名称
	private String remark;//备注
	private String shopMid;

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrandCode() {
		return brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "BrandHaiXinVO [id=" + id + ", brandCode=" + brandCode
				+ ", brandName=" + brandName + ", remark=" + remark + "]";
	}
	
	
}
