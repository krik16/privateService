package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;

public class SalerDeliveryParam extends BaseParam implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String type;// 0是快递 1是无需物流

	private String orderNum;// 父订单号

	private String logisticsBillId;// 物流单号

	private String expressName;// 快递公司名称

	private String expressId;// 物流公司id

	private String ticketPicList;// 小票上传的图片凭证,用“;”隔开

	private Integer userId;//卖家用户id
	
	private String expressInfoId;//物流信息主键id

	private Integer source = 1;//操作平台 1摩店 2商家后台 3php

	public String getExpressInfoId() {
		return expressInfoId;
	}

	public void setExpressInfoId(String expressInfoId) {
		this.expressInfoId = expressInfoId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLogisticsBillId() {
		return logisticsBillId;
	}

	public void setLogisticsBillId(String logisticsBillId) {
		this.logisticsBillId = logisticsBillId;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getExpressId() {
		return expressId;
	}

	public void setExpressId(String expressId) {
		this.expressId = expressId;
	}

	public String getTicketPicList() {
		return ticketPicList;
	}

	public void setTicketPicList(String ticketPicList) {
		this.ticketPicList = ticketPicList;
	}

	public Integer getSource()
	{
		return source;
	}

	public void setSource(Integer source)
	{
		this.source = source;
	}

	@Override
	public String toString() {
		return "SalerDeliveryParam [type=" + type + ", orderNum=" + orderNum + ", logisticsBillId=" + logisticsBillId
				+ ", expressName=" + expressName + ", expressId=" + expressId + ", ticketPicList=" + ticketPicList + ", userId="
				+ userId + ", expressInfoId=" + expressInfoId + ",source"+source+"]";
	}
}
