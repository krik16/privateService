/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年7月30日上午11:04:42
 * @Description: TODO
 *
 **/

package com.rongyi.easy.rpb.vo;

import java.io.Serializable;

/**	
 * @Author:  柯军
 * @Description: 支付成功通知订单系统消息返回结果 
 * @datetime:2015年7月30日上午11:04:42
 *
 **/

public class PaySuccessResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -422527996223906812L;

	private String orderNo;
	
	private boolean result;
	
	
	public PaySuccessResponse(){
		
	}

	public PaySuccessResponse(String orderNo, boolean result) {
		super();
		this.orderNo = orderNo;
		this.result = result;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	
	
	
}
