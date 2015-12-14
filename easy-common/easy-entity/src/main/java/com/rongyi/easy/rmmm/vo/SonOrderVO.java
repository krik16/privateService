package com.rongyi.easy.rmmm.vo;

import com.rongyi.easy.mcmc.vo.CommoditySpecColumnVO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class SonOrderVO implements Serializable{

	private String num;// 下单数量

	private List<CommoditySpecColumnVO> specColumnValues;// 规格参数

	private String commodityPic;// 商品图片

	private String commodityCurrentPrice;// 商品现价

	private String commodityOriginalPrice;// 商品原价
	
	private BigDecimal realAmount;// 子订单实际价格

	private String sonOrderStatus;// 子订单状态（含有维权状态）

	private String refundStatus;// 退款状态

	private String commodityId;// 商品编号

	private String commodityName;// 商品名称

	private String sonOrderId;// 子订单id

	private String applicationId;// 退款或维权id

	private String appealTimes;// 维权次数

	private String refundTimes;// 退款次数

	private String couponCode;// 卡券码

	private String discount;// 抵扣金额

	private String description;// 全场红包/店铺红包
	private String liveName;//直播名
	public BigDecimal getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(BigDecimal realAmount) {
		this.realAmount = realAmount;
	}

	public String getLiveName() {
		return liveName;
	}

	public void setLiveName(String liveName) {
		this.liveName = liveName;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public List<CommoditySpecColumnVO> getSpecColumnValues() {
		return specColumnValues;
	}

	public void setSpecColumnValues(List<CommoditySpecColumnVO> specColumnValues) {
		this.specColumnValues = specColumnValues;
	}

	public String getCommodityPic() {
		return commodityPic;
	}

	public void setCommodityPic(String commodityPic) {
		this.commodityPic = commodityPic;
	}

	public String getCommodityCurrentPrice() {
		return commodityCurrentPrice;
	}

	public void setCommodityCurrentPrice(String commodityCurrentPrice) {
		this.commodityCurrentPrice = commodityCurrentPrice;
	}

	public String getCommodityOriginalPrice() {
		return commodityOriginalPrice;
	}

	public void setCommodityOriginalPrice(String commodityOriginalPrice) {
		this.commodityOriginalPrice = commodityOriginalPrice;
	}

	public String getSonOrderStatus() {
		return sonOrderStatus;
	}

	public void setSonOrderStatus(String sonOrderStatus) {
		this.sonOrderStatus = sonOrderStatus;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getSonOrderId() {
		return sonOrderId;
	}

	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getAppealTimes() {
		return appealTimes;
	}

	public void setAppealTimes(String appealTimes) {
		this.appealTimes = appealTimes;
	}

	public String getRefundTimes() {
		return refundTimes;
	}

	public void setRefundTimes(String refundTimes) {
		this.refundTimes = refundTimes;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "SonOrderVO{" +
				"num='" + num + '\'' +
				", specColumnValues=" + specColumnValues +
				", commodityPic='" + commodityPic + '\'' +
				", commodityCurrentPrice='" + commodityCurrentPrice + '\'' +
				", commodityOriginalPrice='" + commodityOriginalPrice + '\'' +
				", realAmount=" + realAmount +
				", sonOrderStatus='" + sonOrderStatus + '\'' +
				", refundStatus='" + refundStatus + '\'' +
				", commodityId='" + commodityId + '\'' +
				", commodityName='" + commodityName + '\'' +
				", sonOrderId='" + sonOrderId + '\'' +
				", applicationId='" + applicationId + '\'' +
				", appealTimes='" + appealTimes + '\'' +
				", refundTimes='" + refundTimes + '\'' +
				", couponCode='" + couponCode + '\'' +
				", discount='" + discount + '\'' +
				", description='" + description + '\'' +
				", liveName='" + liveName + '\'' +
				'}';
	}
}
