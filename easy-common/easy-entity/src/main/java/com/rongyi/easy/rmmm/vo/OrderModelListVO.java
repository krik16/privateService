/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年12月23日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年12月23日               1.0              创建文件
 */
public class OrderModelListVO implements Serializable{
	
	private List<OrderModelVO> orderModelList;//
	
	private String supportWay;//1仅支持自提 2仅支持快递 3都支持
	
	private Integer totalCommodityNum;//订单sku数量
	
	private String paymentWaitMax;// 付款超时,取消订单的时长
	
	private Integer rebateNum = 0;// 可使用抵扣券数量
	
	private String message;// 亲，您的订单中有仅支持....
	
	private List<Integer> orderModelListNum;//[3,2,1] 分别对应 都支持数量，仅支持快递数量，仅支持自提数量
	
	private String platformRebateCode;//抵扣券券码
	
	private Double rebateDiscount;// 抵扣券抵扣金额

	public String getPlatformRebateCode() {
		return platformRebateCode;
	}

	public void setPlatformRebateCode(String platformRebateCode) {
		this.platformRebateCode = platformRebateCode;
	}

	public Double getRebateDiscount() {
		return rebateDiscount;
	}

	public void setRebateDiscount(Double rebateDiscount) {
		this.rebateDiscount = rebateDiscount;
	}

	public List<Integer> getOrderModelListNum() {
		return orderModelListNum;
	}

	public void setOrderModelListNum(List<Integer> orderModelListNum) {
		this.orderModelListNum = orderModelListNum;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<OrderModelVO> getOrderModelList() {
		return orderModelList;
	}

	public void setOrderModelList(List<OrderModelVO> orderModelList) {
		this.orderModelList = orderModelList;
	}

	public String getSupportWay() {
		return supportWay;
	}

	public void setSupportWay(String supportWay) {
		this.supportWay = supportWay;
	}

	public Integer getTotalCommodityNum() {
		return totalCommodityNum;
	}

	public void setTotalCommodityNum(Integer totalCommodityNum) {
		this.totalCommodityNum = totalCommodityNum;
	}

	public String getPaymentWaitMax() {
		return paymentWaitMax;
	}

	public void setPaymentWaitMax(String paymentWaitMax) {
		this.paymentWaitMax = paymentWaitMax;
	}

	public Integer getRebateNum() {
		return rebateNum;
	}

	public void setRebateNum(Integer rebateNum) {
		this.rebateNum = rebateNum;
	}

	@Override
	public String toString() {
		return "OrderModelListVO [orderModelList=" + orderModelList
				+ ", supportWay=" + supportWay + ", totalCommodityNum="
				+ totalCommodityNum + ", paymentWaitMax=" + paymentWaitMax
				+ ", rebateNum=" + rebateNum + ", message=" + message
				+ ", orderModelListNum=" + orderModelListNum
				+ ", platformRebateCode=" + platformRebateCode
				+ ", rebateDiscount=" + rebateDiscount + "]";
	}

}
