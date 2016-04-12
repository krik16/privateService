package com.rongyi.easy.roa.param;

import java.io.Serializable;
/**
 * 微信版获取订单模板详情参数
 * @author user
 *
 */
public class WebchatOrderModelParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String orderModelId;//父模板id
	
	private String memberId;//微信用户id

	public String getOrderModelId() {
		return orderModelId;
	}

	public void setOrderModelId(String orderModelId) {
		this.orderModelId = orderModelId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "WebchatOrderModelParam [orderModelId=" + orderModelId
				+ ", memberId=" + memberId + "]";
	}
	
}
