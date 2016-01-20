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
	
	private List<OrderModelVO> orderModelListForAll;//2中都支持
	
	private List<OrderModelVO> orderModelListForExpress;//仅支持快递
	
	private List<OrderModelVO> orderModelListForSelf;//仅支持自提
	
	private String message;// 亲，您的订单中有仅支持....

	public List<OrderModelVO> getOrderModelListForAll() {
		return orderModelListForAll;
	}

	public void setOrderModelListForAll(List<OrderModelVO> orderModelListForAll) {
		this.orderModelListForAll = orderModelListForAll;
	}

	public List<OrderModelVO> getOrderModelListForExpress() {
		return orderModelListForExpress;
	}

	public void setOrderModelListForExpress(List<OrderModelVO> orderModelListForExpress) {
		this.orderModelListForExpress = orderModelListForExpress;
	}

	public List<OrderModelVO> getOrderModelListForSelf() {
		return orderModelListForSelf;
	}

	public void setOrderModelListForSelf(List<OrderModelVO> orderModelListForSelf) {
		this.orderModelListForSelf = orderModelListForSelf;
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
		return "OrderModelListVO [orderModelList=" + orderModelList + ", supportWay=" + supportWay + ", totalCommodityNum="
				+ totalCommodityNum + ", paymentWaitMax=" + paymentWaitMax
				+ ", rebateNum=" + rebateNum + "]";
	}

}
