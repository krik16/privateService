package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/**
 * 订单详情参数
 * @author chenjun
 *
 */
public class OrderDetailParam extends MalllifeBaseParam implements Serializable{

	private String orderId;// 大订单id

	private String orderNum;//订单号
	
	private List<String> closeOrderNums;//订单号集合

	
	public List<String> getCloseOrderNums() {
		return closeOrderNums;
	}

	public void setCloseOrderNums(List<String> closeOrderNums) {
		this.closeOrderNums = closeOrderNums;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}


	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
