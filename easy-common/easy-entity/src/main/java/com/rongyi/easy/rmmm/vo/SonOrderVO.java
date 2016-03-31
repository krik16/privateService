package com.rongyi.easy.rmmm.vo;

import com.rongyi.easy.mcmc.vo.CommoditySpecColumnVO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class SonOrderVO implements Serializable{

	private String num;// 下单数量

	private BigDecimal integralDiscount;//积分抵扣
	private BigDecimal commodityAmount;//子订单商品总价
	private BigDecimal voucherDiscount;//平台促销券抵扣
	private BigDecimal hbDiscount;//红包抵扣
	private BigDecimal commodityDiscount;//单个订单明细折扣

	private List<CommoditySpecColumnVO> specColumnValues;// 规格参数

	private String commodityPic;// 商品图片

	private String commodityCurrentPrice = "0";// 商品现价

	private String commodityOriginalPrice = "0";// 商品原价
	
	private BigDecimal realAmount = BigDecimal.valueOf(0.0);// 子订单实际价格

	private String sonOrderStatus;// 子订单状态（含有维权状态）

	private String refundStatus = "0";// 退款状态

	private String commodityId;// 商品id
	private String commodityNo;// 商品编号

	private String commodityName;// 商品名称

	private String sonOrderId;// 子订单id

	private String applicationId;// 退款或维权id

	private String appealTimes;// 维权次数

	private String refundTimes;// 退款次数

	private String couponCode;// 卡券码

	private String discount = "0";// 抵扣金额

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

	public BigDecimal getCommodityDiscount() {
		return commodityDiscount;
	}

	public void setCommodityDiscount(BigDecimal commodityDiscount) {
		this.commodityDiscount = commodityDiscount;
	}

	public String getCommodityOriginalPrice() {
		return commodityOriginalPrice;
	}

	public String getCommodityNo() {
		return commodityNo;
	}

	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}

	public void setCommodityOriginalPrice(String commodityOriginalPrice) {
		this.commodityOriginalPrice = commodityOriginalPrice;
	}


	public BigDecimal getVoucherDiscount() {
		return voucherDiscount;
	}

	public BigDecimal getIntegralDiscount() {
		return integralDiscount;
	}

	public void setIntegralDiscount(BigDecimal integralDiscount) {
		this.integralDiscount = integralDiscount;
	}

	public BigDecimal getCommodityAmount() {
		return commodityAmount;
	}

	public void setCommodityAmount(BigDecimal commodityAmount) {
		this.commodityAmount = commodityAmount;
	}

	public void setVoucherDiscount(BigDecimal voucherDiscount) {
		this.voucherDiscount = voucherDiscount;
	}

	public BigDecimal getHbDiscount() {
		return hbDiscount;
	}

	public void setHbDiscount(BigDecimal hbDiscount) {
		this.hbDiscount = hbDiscount;
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