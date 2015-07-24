/** 
* @Title: PaymentInfo.java 
* @Package com.rongyi.va.account 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月14日 下午4:31:15 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.account;

import java.math.BigDecimal;

/**
 * @author ZhengYl
 *
 */
public class PaymentInfo {
	/** 用户id */
	private String userId;
	
	/** 支付款Id */
	private String paymentId;
	
	/** 提现支付金额 */
	private BigDecimal drawAmount;
	
	/** 提现申请单号 */
	private String orderNo;
	
	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public BigDecimal getDrawAmount() {
		return drawAmount;
	}

	public void setDrawAmount(BigDecimal drawAmount) {
		this.drawAmount = drawAmount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
}
