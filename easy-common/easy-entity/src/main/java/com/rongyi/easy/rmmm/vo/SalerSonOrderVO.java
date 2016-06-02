package com.rongyi.easy.rmmm.vo;

import com.rongyi.easy.mcmc.vo.CommoditySpecColumnVO;

import java.io.Serializable;
import java.util.List;

/**
 * 卖家版大订单列表子订单列表VO
 * 
 * @author zzp
 * 
 */

public class SalerSonOrderVO implements Serializable{
	private String commodityId;// 我是商品编号
	private String specId;//商品规格id
	private String newPrice;//商品修改后价格
	private String commodityName;// 我是商品名称
	private String address;// 邮寄地址
	private String num;// 下单数量
	private String commodityPic;// 商品图片
	private String commodityCurrentPrice;// 我是商品现价
	private String sonOrderId;// 子订单ID
	private String sonOrderStatus;// 子订单状态
	private String successRefund;// 是否已退款
	private String refundType;// 退款类型
	private String refundReason;// 退款原因
	private String refundStatus;// 退款状态
	private List<CommoditySpecColumnVO> specColumnValues;// 规格参数
	private String applicationId;// 退款或维权id

	private String commodityCommission;// 商品佣金
	private String commodityCode;// 商品货号

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
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

	public String getSonOrderId() {
		return sonOrderId;
	}

	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}

	public String getSonOrderStatus() {
		return sonOrderStatus;
	}

	public void setSonOrderStatus(String sonOrderStatus) {
		this.sonOrderStatus = sonOrderStatus;
	}

	public String getSuccessRefund() {
		return successRefund;
	}

	public void setSuccessRefund(String successRefund) {
		this.successRefund = successRefund;
	}

	public String getRefundType() {
		return refundType;
	}

	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public String getRefundReason() {
		return refundReason;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public List<CommoditySpecColumnVO> getSpecColumnValues() {
		return specColumnValues;
	}

	public void setSpecColumnValues(List<CommoditySpecColumnVO> specColumnValues) {
		this.specColumnValues = specColumnValues;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getCommodityCommission() {
		return commodityCommission;
	}

	public void setCommodityCommission(String commodityCommission) {
		this.commodityCommission = commodityCommission;
	}

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getSpecId()
	{
		return specId;
	}

	public void setSpecId(String specId)
	{
		this.specId = specId;
	}

	public String getNewPrice()
	{
		return newPrice;
	}

	public void setNewPrice(String newPrice)
	{
		this.newPrice = newPrice;
	}

	@Override
	public String toString() {
		return "SalerSonOrderVO{" +
				"commodityId='" + commodityId + '\'' +
				", commodityName='" + commodityName + '\'' +
				", address='" + address + '\'' +
				", num='" + num + '\'' +
				", commodityPic='" + commodityPic + '\'' +
				", commodityCurrentPrice='" + commodityCurrentPrice + '\'' +
				", sonOrderId='" + sonOrderId + '\'' +
				", sonOrderStatus='" + sonOrderStatus + '\'' +
				", successRefund='" + successRefund + '\'' +
				", refundType='" + refundType + '\'' +
				", refundReason='" + refundReason + '\'' +
				", refundStatus='" + refundStatus + '\'' +
				", specColumnValues=" + specColumnValues +
				", applicationId='" + applicationId + '\'' +
				", commodityCommission='" + commodityCommission + '\'' +
				", commodityCode='" + commodityCode + '\'' +
				", newPrice='" + newPrice + '\'' +
				", specId='" + specId + '\'' +
				'}';
	}
}
