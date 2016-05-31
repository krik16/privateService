package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 首页特卖商品显示信息
 * @author user
 *
 */
public class CommoditySaleVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> commodityPicList;//商品图片集合
	private String commodityId;//商品id
	private String commodityCode;//商品编号
	private String commodityOPriceMax;//我是最高原价”,
	private String commodityOPriceMin;//我是最低原价”,
	private String commodityCPriceMax;//我是最高现价”,
	private String commodityCPriceMin;//我是最低现价”,
	private String commodityOPOfLCP;//我是最低现价对应的原价
	private String commodityCurrentPrice;
	private String commodityDescription;//我是商品描述”,
	private String commodityName;//我是商品名称”,
	public List<String> getCommodityPicList() {
		return commodityPicList;
	}
	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityCode() {
		return commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}
	public String getCommodityOPriceMax() {
		return commodityOPriceMax;
	}
	public void setCommodityOPriceMax(String commodityOPriceMax) {
		this.commodityOPriceMax = commodityOPriceMax;
	}
	public String getCommodityOPriceMin() {
		return commodityOPriceMin;
	}
	public void setCommodityOPriceMin(String commodityOPriceMin) {
		this.commodityOPriceMin = commodityOPriceMin;
	}
	public String getCommodityCPriceMax() {
		return commodityCPriceMax;
	}
	public void setCommodityCPriceMax(String commodityCPriceMax) {
		this.commodityCPriceMax = commodityCPriceMax;
	}
	public String getCommodityCPriceMin() {
		return commodityCPriceMin;
	}
	public void setCommodityCPriceMin(String commodityCPriceMin) {
		this.commodityCPriceMin = commodityCPriceMin;
	}
	public String getCommodityOPOfLCP() {
		return commodityOPOfLCP;
	}
	public void setCommodityOPOfLCP(String commodityOPOfLCP) {
		this.commodityOPOfLCP = commodityOPOfLCP;
	}
	public String getCommodityCurrentPrice() {
		return commodityCurrentPrice;
	}
	public void setCommodityCurrentPrice(String commodityCurrentPrice) {
		this.commodityCurrentPrice = commodityCurrentPrice;
	}
	public String getCommodityDescription() {
		return commodityDescription;
	}
	public void setCommodityDescription(String commodityDescription) {
		this.commodityDescription = commodityDescription;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	@Override
	public String toString() {
		return "CommoditySaleVO [commodityPicList=" + commodityPicList
				+ ", commodityId=" + commodityId + ", commodityCode="
				+ commodityCode + ", commodityOPriceMax=" + commodityOPriceMax
				+ ", commodityOPriceMin=" + commodityOPriceMin
				+ ", commodityCPriceMax=" + commodityCPriceMax
				+ ", commodityCPriceMin=" + commodityCPriceMin
				+ ", commodityOPOfLCP=" + commodityOPOfLCP
				+ ", commodityCurrentPrice=" + commodityCurrentPrice
				+ ", commodityDescription=" + commodityDescription
				+ ", commodityName=" + commodityName + "]";
	}
	
}
