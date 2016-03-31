package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

import net.sf.json.JSONObject;

public class ParentOrderParam implements Serializable {

	private List<SonOrderParam> sonOrderList;//
	private String shopId;// 店铺ID
	private String comment;// 备注
	private String addressId;// 邮寄地址id
	private String orderModelId;// 父模板id
	private String guideId;// 导购id
	private JSONObject discountInfo;// {“score”:”使用积分”}
	private String platformRebateCode;//促销券code

	public List<SonOrderParam> getSonOrderList() {
		return sonOrderList;
	}

	public void setSonOrderList(List<SonOrderParam> sonOrderList) {
		this.sonOrderList = sonOrderList;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getOrderModelId() {
		return orderModelId;
	}

	public void setOrderModelId(String orderModelId) {
		this.orderModelId = orderModelId;
	}

	public String getGuideId() {
		return guideId;
	}

	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}

	public JSONObject getDiscountInfo() {
		return discountInfo;
	}

	public void setDiscountInfo(JSONObject discountInfo) {
		this.discountInfo = discountInfo;
	}

	public String getPlatformRebateCode() {
		return platformRebateCode;
	}

	public void setPlatformRebateCode(String platformRebateCode) {
		this.platformRebateCode = platformRebateCode;
	}

	@Override
	public String toString() {
		return "ParentOrderParam{" +
				"sonOrderList=" + sonOrderList +
				", shopId='" + shopId + '\'' +
				", comment='" + comment + '\'' +
				", addressId='" + addressId + '\'' +
				", orderModelId='" + orderModelId + '\'' +
				", guideId='" + guideId + '\'' +
				", discountInfo=" + discountInfo +
				", platformRebateCode=" + platformRebateCode +
				'}';
	}
}
