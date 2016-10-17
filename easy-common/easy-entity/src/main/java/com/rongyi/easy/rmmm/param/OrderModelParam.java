/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年5月19日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年5月19日 1.0 创建文件
 */
public class OrderModelParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String shopId;// 店铺的mysql id
	private String guideId;// 导购id
	private String orderPrice;// 订单价格
	private List<OrderDetailModelParam> ordeDetailModel;
	private String memberId;//微信用户id
	private Integer from;//0微信,1容易逛
	private String memberLogo;// 用户头像
	private String memberName;// 用户昵称
	private String openId;//

	public Integer getFrom() {
		return from;
	}

	public void setFrom(Integer from) {
		this.from = from;
	}

	public String getMemberLogo() {
		return memberLogo;
	}

	public void setMemberLogo(String memberLogo) {
		this.memberLogo = memberLogo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getGuideId() {
		return guideId;
	}

	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}

	public List<OrderDetailModelParam> getOrdeDetailModel() {
		return ordeDetailModel;
	}

	public void setOrdeDetailModel(List<OrderDetailModelParam> ordeDetailModel) {
		this.ordeDetailModel = ordeDetailModel;
	}

	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "OrderModelParam [shopId=" + shopId + ", guideId=" + guideId
				+ ", orderPrice=" + orderPrice + ", ordeDetailModel="
				+ ordeDetailModel + ", memberId=" + memberId + ", from=" + from
				+ ", memberLogo=" + memberLogo + ", memberName=" + memberName
				+ ", openId=" + openId + "]";
	}
	
}
