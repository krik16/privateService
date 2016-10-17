package com.rongyi.easy.roa.param;

import java.io.Serializable;
import java.util.List;
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
	
    private String orderNum;//订单号
	
	private List<String> orderNums;//订单号集合

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public List<String> getOrderNums() {
		return orderNums;
	}

	public void setOrderNums(List<String> orderNums) {
		this.orderNums = orderNums;
	}

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
				+ ", memberId=" + memberId + ", orderNum=" + orderNum
				+ ", orderNums=" + orderNums + "]";
	}
	
}
