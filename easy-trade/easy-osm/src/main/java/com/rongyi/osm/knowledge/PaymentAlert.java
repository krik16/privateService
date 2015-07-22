/** 
* @Title: PaymentAlert.java 
* @Package com.rongyi.osm.knowledge 
* @Description: 买家延迟未支付提醒事件
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年7月10日 上午11:19:07 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.osm.knowledge;

import java.util.Date;

/**
 * @author ZhengYl
 *
 */
public class PaymentAlert {

	/** 大订单号 */
	private String orderNo;

	/** 预计转入下一状态时间 */
	private Date nextStatusTime;

	/** 买家id */
	private String buyerId;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getNextStatusTime() {
		return nextStatusTime;
	}

	public void setNextStatusTime(Date nextStatusTime) {
		this.nextStatusTime = nextStatusTime;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public static PaymentAlert create(String orderNo, String buyerId, Date nextStatusTime) {
		PaymentAlert alert = new PaymentAlert();
		alert.setOrderNo(orderNo);
		alert.setBuyerId(buyerId);
		alert.setNextStatusTime(nextStatusTime);

		return alert;
	}
}
