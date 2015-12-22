/** 
* @Title: OrderWithCouponInfoVO.java 
* @Package com.rongyi.easy.rmmm.vo 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年7月7日 下午3:46:31 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author ZhengYl
 *
 */
public class OrderWithCouponInfoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1212362673181841444L;

	/** 订单号 */
	private String orderNo;

	/** 订单实际支付金额 */
	private BigDecimal totalAmount;

	/** 订单现金券信息列表 */
	private List<OrderCouponInfo> couponInfoList;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<OrderCouponInfo> getCouponInfoList() {
		return couponInfoList;
	}

	public void setCouponInfoList(List<OrderCouponInfo> couponInfoList) {
		this.couponInfoList = couponInfoList;
	}

}
