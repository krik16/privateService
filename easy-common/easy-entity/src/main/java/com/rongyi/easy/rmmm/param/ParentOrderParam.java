package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

import net.sf.json.JSONObject;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class ParentOrderParam implements Serializable {

	private List<SonOrderParam> sonOrderList;//
	private String shopId;// 店铺ID
	private String mallId;//商场id
	private String comment;// 备注
	private String addressId;// 邮寄地址id
	private String orderModelId;// 父模板id
	private String guideId;// 导购id
	private JSONObject discountInfo;// {“score”:”使用积分”}
	private String platformRebateCode;//促销券code
	private Integer deliveryType;//发货方式 （ 1自提 2快递）
	private String reserveName;//预约人姓名
	private String reservePhone;//预约人手机号
	private String reserveCompany;//预约人公司
	private String reservePost;//预约人职称

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

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public Integer getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(Integer deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getReserveName() {
		return reserveName;
	}

	public void setReserveName(String reserveName) {
		this.reserveName = reserveName;
	}

	public String getReservePhone() {
		return reservePhone;
	}

	public void setReservePhone(String reservePhone) {
		this.reservePhone = reservePhone;
	}

	public String getReserveCompany() {
		return reserveCompany;
	}

	public void setReserveCompany(String reserveCompany) {
		this.reserveCompany = reserveCompany;
	}

	public String getReservePost() {
		return reservePost;
	}

	public void setReservePost(String reservePost) {
		this.reservePost = reservePost;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
		return "ParentOrderParam{" +
				"sonOrderList=" + sonOrderList +
				", shopId='" + shopId + '\'' +
				", comment='" + comment + '\'' +
				", addressId='" + addressId + '\'' +
				", orderModelId='" + orderModelId + '\'' +
				", guideId='" + guideId + '\'' +
				", discountInfo=" + discountInfo +
				", platformRebateCode=" + platformRebateCode +
				", reservePhone=" + reservePhone +
				", reserveName=" + reserveName +
				", reserveCompany=" + reserveCompany +
				", reservePost=" + reservePost +
				'}';
	}
}
