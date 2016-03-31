package com.rongyi.easy.redi.vo;

import java.util.List;

public class BailianGoodsVo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String categorySid;// 分类id 
	private String salePrice;// 销售价格
	private String goodsId;// 商品id
	private String goodsDesc;// 商品描述
	private String pictureUrl;// 商品图片
	private String product_name;// 商品名称
	private String marketPrice;// 市场价格
	
	private List<GoodsFieldVo> fields ;
	
	
	
	
	public List<GoodsFieldVo> getFields() {
		return fields;
	}
	public void setFields(List<GoodsFieldVo> fields) {
		this.fields = fields;
	}
	public String getCategorySid() {
		return categorySid;
	}
	public void setCategorySid(String categorySid) {
		this.categorySid = categorySid;
	}
	public String getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsDesc() {
		return goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}



}