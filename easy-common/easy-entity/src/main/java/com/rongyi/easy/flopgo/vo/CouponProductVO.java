package com.rongyi.easy.flopgo.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.coupon.entity.OldCoupon.CouponProduct;

/**
 * 做现金卷的信息封装返回
 * @author lijing
 *
 */
public class CouponProductVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String marketName;
	private String shopName;

	private String productNum;

	private String productName;

	private String status;
	private List<String> pics;// 商品图片
	
	public List<String> getPics() {
		return pics;
	}
	public void setPics(List<String> pics) {
		this.pics = pics;
	}
	public CouponProductVO(){
		
	}
	public CouponProductVO(CouponProduct couponProduct){
		if(couponProduct!=null){
		this.id=couponProduct.getProductId().toString();
		this.marketName=couponProduct.getMarketName();
		this.shopName=couponProduct.getShopName();
		this.productNum=couponProduct.getProductNum();
		this.productName=couponProduct.getProductName();
		this.status=couponProduct.getStatus();
		this.pics=couponProduct.getPics();
		
		}
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
