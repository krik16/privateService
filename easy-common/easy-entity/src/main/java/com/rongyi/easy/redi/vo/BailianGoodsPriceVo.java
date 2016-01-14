package com.rongyi.easy.redi.vo;

import java.util.List;

public class BailianGoodsPriceVo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String salePrice;// 分类id 
	private String goodsSid;// 商品id
	private String priceType;// 商品描述
	private String stor;// 商品图片
	private String priceEndDate;// 商品名称
	private String priceStartDate;// 市场价格
	private String promotionPrice ;
	
	private String activeCode ;
	
	private String limitBuySum ;
	
	public String getActiveCode() {
		return activeCode;
	}
	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}
	public String getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}
	public String getGoodsSid() {
		return goodsSid;
	}
	public void setGoodsSid(String goodsSid) {
		this.goodsSid = goodsSid;
	}
	public String getPriceType() {
		return priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	public String getStor() {
		return stor;
	}
	public void setStor(String stor) {
		this.stor = stor;
	}
	public String getPriceEndDate() {
		return priceEndDate;
	}
	public void setPriceEndDate(String priceEndDate) {
		this.priceEndDate = priceEndDate;
	}
	public String getPriceStartDate() {
		return priceStartDate;
	}
	public void setPriceStartDate(String priceStartDate) {
		this.priceStartDate = priceStartDate;
	}
	public String getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public String getLimitBuySum() {
		return limitBuySum;
	}
	public void setLimitBuySum(String limitBuySum) {
		this.limitBuySum = limitBuySum;
	}
	

}