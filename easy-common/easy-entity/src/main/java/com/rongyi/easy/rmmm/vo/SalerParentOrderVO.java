package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 卖家版大订单列表父订单列表VO
 * 
 * @author ZhangZhengping
 * 
 */
public class SalerParentOrderVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String status;// 订单状态
	private String totalPrice;// 总价
	private String orderTime;// 下单时间
	private String estimateNextStatusTime;// 预计转入下一状态时间
	private String buyerName;// 买家名称
	private String buyerIM;// 买家IM账号
	private String orderId;// 订单id
	private String countId;// 下单账号
	private String orderType;// 订单类型
	private String orderSource;// 订单渠道     0微商城 1APP 2终端机 3其他
	private String payTime;// 付款时间
	private String deliverTime;// 发货时间
	private String comment;// 订单备注
	private String consignee;// 收货人姓名
	private String phone;// 收货人电话
	private String address;// 收货人地址
	private String commodityPostage;// 运费
	private List<SalerSonOrderVO> sonOrderList;// 子订单列表
	private String isEvaluation;// 是否已评价
	private String closeType;// 父订单关闭类型 (0完成 1关闭)
	private String orderNo;// 订单编号
	private String closeReason;// 关闭原因
	private String provinceName;// 省名称
	private String cityName;// 市名称
	private String districtName;// 区名称
	private String buyerNickName;// 买家昵称
	private String orderOriginalPrice;// 我是订单原价
	private String allCommodityCommission;// 佣金总额
	private String expressBillId;// 物流单号
	private String ticketStatus;// 小票状态0: 小票未上传, 1: 待审核, 2: 一级审核通过, 3: 二级审核通过,
								// 4: 审核不通过
	private String refuseReason;// 审核失败理由
	private String expressName;// 物流公司名称
	private List<String> ticketPicList;// 小票URL集合
	private String receiveTime;// 收货时间
	private String buyerPhone;// 买家手机号

	private BigDecimal rebateDiscount;//商家抵扣券金额
	private String rebateTitle;//商家抵扣券名称

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerIM() {
		return buyerIM;
	}

	public void setBuyerIM(String buyerIM) {
		this.buyerIM = buyerIM;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<SalerSonOrderVO> getSonOrderList() {
		return sonOrderList;
	}

	public void setSonOrderList(List<SalerSonOrderVO> sonOrderList) {
		this.sonOrderList = sonOrderList;
	}

	public String getCountId() {
		return countId;
	}

	public void setCountId(String countId) {
		this.countId = countId;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getDeliverTime() {
		return deliverTime;
	}

	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCommodityPostage() {
		return commodityPostage;
	}

	public void setCommodityPostage(String commodityPostage) {
		this.commodityPostage = commodityPostage;
	}

	public String getIsEvaluation() {
		return isEvaluation;
	}

	public void setIsEvaluation(String isEvaluation) {
		this.isEvaluation = isEvaluation;
	}

	public String getEstimateNextStatusTime() {
		return estimateNextStatusTime;
	}

	public void setEstimateNextStatusTime(String estimateNextStatusTime) {
		this.estimateNextStatusTime = estimateNextStatusTime;
	}

	public String getCloseType() {
		return closeType;
	}

	public void setCloseType(String closeType) {
		this.closeType = closeType;
	}

	public String getCloseReason() {
		return closeReason;
	}

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getBuyerNickName() {
		return buyerNickName;
	}

	public void setBuyerNickName(String buyerNickName) {
		this.buyerNickName = buyerNickName;
	}

	public String getOrderOriginalPrice() {
		return orderOriginalPrice;
	}

	public void setOrderOriginalPrice(String orderOriginalPrice) {
		this.orderOriginalPrice = orderOriginalPrice;
	}


	public String getAllCommodityCommission() {
		return allCommodityCommission;
	}

	public void setAllCommodityCommission(String allCommodityCommission) {
		this.allCommodityCommission = allCommodityCommission;
	}

	public String getExpressBillId() {
		return expressBillId;
	}

	public void setExpressBillId(String expressBillId) {
		this.expressBillId = expressBillId;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public List<String> getTicketPicList() {
		return ticketPicList;
	}

	public void setTicketPicList(List<String> ticketPicList) {
		this.ticketPicList = ticketPicList;
	}

	public String getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}

	public String getBuyerPhone() {
		return buyerPhone;
	}

	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	public BigDecimal getRebateDiscount() {
		return rebateDiscount;
	}

	public void setRebateDiscount(BigDecimal rebateDiscount) {
		this.rebateDiscount = rebateDiscount;
	}
	
	public String getRebateTitle() {
		return rebateTitle;
	}

	public void setRebateTitle(String rebateTitle) {
		this.rebateTitle = rebateTitle;
	}

	@Override
	public String toString() {
		return "SalerParentOrderVO [status=" + status + ", totalPrice="
				+ totalPrice + ", orderTime=" + orderTime
				+ ", estimateNextStatusTime=" + estimateNextStatusTime
				+ ", buyerName=" + buyerName + ", buyerIM=" + buyerIM
				+ ", orderId=" + orderId + ", countId=" + countId
				+ ", orderType=" + orderType + ", orderSource=" + orderSource
				+ ", payTime=" + payTime + ", deliverTime=" + deliverTime
				+ ", comment=" + comment + ", consignee=" + consignee
				+ ", phone=" + phone + ", address=" + address
				+ ", commodityPostage=" + commodityPostage + ", sonOrderList="
				+ sonOrderList + ", isEvaluation=" + isEvaluation
				+ ", closeType=" + closeType + ", orderNo=" + orderNo
				+ ", closeReason=" + closeReason + ", provinceName="
				+ provinceName + ", cityName=" + cityName + ", districtName="
				+ districtName + ", buyerNickName=" + buyerNickName
				+ ", orderOriginalPrice=" + orderOriginalPrice
				+ ", allCommodityCommission=" + allCommodityCommission
				+ ", expressBillId=" + expressBillId + ", ticketStatus="
				+ ticketStatus + ", refuseReason=" + refuseReason
				+ ", expressName=" + expressName + ", ticketPicList="
				+ ticketPicList + ", receiveTime=" + receiveTime
				+ ", buyerPhone=" + buyerPhone + ", rebateDiscount="
				+ rebateDiscount + ", rebateTitle=" + rebateTitle + "]";
	}

}
