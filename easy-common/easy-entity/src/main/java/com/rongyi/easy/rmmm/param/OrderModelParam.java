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
	private Integer articleId;//文章id
	private Integer articleType;//文章类型 1潮人攻略

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

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public Integer getArticleType() {
		return articleType;
	}

	public void setArticleType(Integer articleType) {
		this.articleType = articleType;
	}

	@Override
	public String toString() {
		return "OrderModelParam [shopId=" + shopId + ", guideId=" + guideId + ", articleId=" + articleId + ", articleType=" + articleType
				+ ", orderPrice=" + orderPrice + ", ordeDetailModel="
				+ ordeDetailModel + ", memberId=" + memberId + "]";
	}
	
}
