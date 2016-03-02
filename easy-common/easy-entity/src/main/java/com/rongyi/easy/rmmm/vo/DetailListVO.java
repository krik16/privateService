/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年5月28日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年5月28日 1.0 创建文件
 */
public class DetailListVO implements Serializable {

	private String date;// 交易时间
	private String deliveryDate;// 发货时间
	private String amount;// 金额
	private String realAmount; //订单总金额（买家实际支付金额）
	private String orderId;// 大订单id
	private String orderNum;// 大订单号
	private String commodityPostage;// 运费
	private String status;// 佣金状态 1已发放 2处理中 3失败
	private String allCommodityCommission;// 总佣金
	private String ticketStatus;// 小票状态 -1: 一审不通过, -2: 二审不通过, 0: 小票未上传, 1: 待审核,
								// 2: 一级审核通过, 3: 二级审核通过, 4: 佣金已到账
	private List<SonDetailListVO> sonOrderList;// 子订单数据
	private String disconnt;// 折扣
	private String buyerName;// 买家名称
	private String buyerIM;// 买家IM账号
	private String traceStatus; //详情状态（轨迹图） 0 发货成功（处理中） 1 订单完成 2 订单失败 3 审核成功 4审核失败 5已发放
	private String realCommodityCommission;// 该订单原佣金金额
	private String failReason;// 审核失败理由

	public String getRealCommodityCommission() {
		return realCommodityCommission;
	}

	public void setRealCommodityCommission(String realCommodityCommission) {
		this.realCommodityCommission = realCommodityCommission;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getTraceStatus() {
		return traceStatus;
	}

	public void setTraceStatus(String traceStatus) {
		this.traceStatus = traceStatus;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getCommodityPostage() {
		return commodityPostage;
	}

	public void setCommodityPostage(String commodityPostage) {
		this.commodityPostage = commodityPostage;
	}

	public List<SonDetailListVO> getSonOrderList() {
		return sonOrderList;
	}

	public void setSonOrderList(List<SonDetailListVO> sonOrderList) {
		this.sonOrderList = sonOrderList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAllCommodityCommission() {
		return allCommodityCommission;
	}

	public void setAllCommodityCommission(String allCommodityCommission) {
		this.allCommodityCommission = allCommodityCommission;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getDisconnt() {
		return disconnt;
	}

	public void setDisconnt(String disconnt) {
		this.disconnt = disconnt;
	}

	public String getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Override
	public String toString() {
		return "DetailListVO [date=" + date + ", deliveryDate=" + deliveryDate + ", amount=" + amount + ", realAmount="
				+ realAmount + ", orderId=" + orderId + ", orderNum=" + orderNum + ", commodityPostage=" + commodityPostage
				+ ", status=" + status + ", allCommodityCommission=" + allCommodityCommission + ", ticketStatus=" + ticketStatus
				+ ", sonOrderList=" + sonOrderList + ", disconnt=" + disconnt + ", buyerName=" + buyerName + ", buyerIM="
				+ buyerIM + ", traceStatus=" + traceStatus + ", realCommodityCommission=" + realCommodityCommission
				+ ", failReason=" + failReason + "]";
	}
}
