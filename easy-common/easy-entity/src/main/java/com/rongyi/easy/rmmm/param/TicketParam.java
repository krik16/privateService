/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年5月25日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年5月25日 1.0 创建文件
 */
public class TicketParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String orderNo;// 订单号

	private String ticketPicList;// 小票上传的图片凭证,用“;”隔开”
	
	private Integer userType;//0 导购  1买手

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTicketPicList() {
		return ticketPicList;
	}

	public void setTicketPicList(String ticketPicList) {
		this.ticketPicList = ticketPicList;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "TicketParam [orderNo=" + orderNo + ", ticketPicList=" + ticketPicList + ", userType=" + userType + "]";
	}
	
}
