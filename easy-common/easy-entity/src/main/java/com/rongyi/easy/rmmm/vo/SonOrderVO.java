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

	private String refundStatus;// 退款状态 0：申请退款 1：退款中 2：拒绝退款 3：已退款 4：待买家发货 5：带卖家收货 6：退款关闭

	private String commodityId;// 商品id
	private String commodityNo;// 商品编号

	private String commodityName;// 商品名称

	private String sonOrderId;// 子订单id
	private String sonOrderNo;// 子订单号

	private String applicationId;// 退款或维权id

	private String appealTimes;// 维权次数

	private String refundTimes;// 退款次数

	private String couponCode;// 卡券码

	private String discount = "0";// 抵扣金额

	private String description;// 全场红包/店铺红包
	private String liveName;//直播名
	private boolean ifOnDisplayAfterSales = false;//是否显示申请售后按钮,true显示 false不显示
	private Integer couponDiscountType;//红包补贴类型  0：平台补贴 1：商家补贴
	private Integer rebateDiscountType;//抵扣券补贴类型  0：平台补贴 1：商家补贴
	private BigDecimal discountAmount;//原价-卖家优惠
	// 卖家满减金额
	private BigDecimal reductionFee;
	private Integer complaintStatus;// 维权状态 1：申诉中、2：申诉成功、3：申诉失败、4：申诉关闭
	private Integer refundType;// 退款类型 1：仅退款'，3：快递退货退款'，7：到店退货退款'
	private String refundNo;// 退款单号
	private boolean whetherCanRefund;// 是否可以退款" true：可以，false:不可以
	private boolean whetherCanComplaint;// 是否可以申诉" true：可以，false:不可以
	private String complaintNo;// 维权单号

	public boolean isIfOnDisplayAfterSales() {
		return ifOnDisplayAfterSales;
	}

	public void setIfOnDisplayAfterSales(boolean ifOnDisplayAfterSales) {
		this.ifOnDisplayAfterSales = ifOnDisplayAfterSales;
	}

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

	public Integer getCouponDiscountType() {
		return couponDiscountType;
	}

	public void setCouponDiscountType(Integer couponDiscountType) {
		this.couponDiscountType = couponDiscountType;
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Integer getRebateDiscountType() {
		return rebateDiscountType;
	}

	public void setRebateDiscountType(Integer rebateDiscountType) {
		this.rebateDiscountType = rebateDiscountType;
	}

	public BigDecimal getReductionFee() {
		return reductionFee;
	}

	public void setReductionFee(BigDecimal reductionFee) {
		this.reductionFee = reductionFee;
	}

	public Integer getComplaintStatus() {
		return complaintStatus;
	}

	public void setComplaintStatus(Integer complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	public Integer getRefundType() {
		return refundType;
	}

	public void setRefundType(Integer refundType) {
		this.refundType = refundType;
	}

	public String getRefundNo() {
		return refundNo;
	}

	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}

	public boolean isWhetherCanRefund() {
		return whetherCanRefund;
	}

	public void setWhetherCanRefund(boolean whetherCanRefund) {
		this.whetherCanRefund = whetherCanRefund;
	}

	public boolean isWhetherCanComplaint() {
		return whetherCanComplaint;
	}

	public void setWhetherCanComplaint(boolean whetherCanComplaint) {
		this.whetherCanComplaint = whetherCanComplaint;
	}

	public String getComplaintNo() {
		return complaintNo;
	}

	public void setComplaintNo(String complaintNo) {
		this.complaintNo = complaintNo;
	}

	public String getSonOrderNo() {
		return sonOrderNo;
	}

	public void setSonOrderNo(String sonOrderNo) {
		this.sonOrderNo = sonOrderNo;
	}

	@Override
	public String toString() {
		return "SonOrderVO{" +
				"appealTimes='" + appealTimes + '\'' +
				", num='" + num + '\'' +
				", integralDiscount=" + integralDiscount +
				", commodityAmount=" + commodityAmount +
				", voucherDiscount=" + voucherDiscount +
				", hbDiscount=" + hbDiscount +
				", commodityDiscount=" + commodityDiscount +
				", specColumnValues=" + specColumnValues +
				", commodityPic='" + commodityPic + '\'' +
				", commodityCurrentPrice='" + commodityCurrentPrice + '\'' +
				", commodityOriginalPrice='" + commodityOriginalPrice + '\'' +
				", realAmount=" + realAmount +
				", sonOrderStatus='" + sonOrderStatus + '\'' +
				", refundStatus='" + refundStatus + '\'' +
				", commodityId='" + commodityId + '\'' +
				", commodityNo='" + commodityNo + '\'' +
				", commodityName='" + commodityName + '\'' +
				", sonOrderId='" + sonOrderId + '\'' +
				", sonOrderNo='" + sonOrderNo + '\'' +
				", applicationId='" + applicationId + '\'' +
				", refundTimes='" + refundTimes + '\'' +
				", couponCode='" + couponCode + '\'' +
				", discount='" + discount + '\'' +
				", description='" + description + '\'' +
				", liveName='" + liveName + '\'' +
				", ifOnDisplayAfterSales=" + ifOnDisplayAfterSales +
				", couponDiscountType=" + couponDiscountType +
				", rebateDiscountType=" + rebateDiscountType +
				", discountAmount=" + discountAmount +
				", reductionFee=" + reductionFee +
				'}';
	}
}