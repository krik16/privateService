package com.rongyi.easy.malllife.vo.h5;

import java.io.Serializable;
import java.util.List;
/**
 * 商铺分享详情页商品返回数据
 * @author user
 *
 */
public class CommodityShareVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commodityId;//商品id
	private String commodityName;//商品名称
	private String commodityOPriceMax;//我是最高原价”,
	private String commodityOPriceMin;//我是最低原价”,
	private String commodityCPriceMax;//我是最高现价”,
	private String commodityCPriceMin;//我是最低现价”,
	private String commodityOPOfLCP;//我是最低现价对应的原价
	private String commodityCurrentPrice;//商品现价
	private String mallTip;///< 商城标签（商城名称，如果是街边店则是街边点名称）
	private List<String> commodityPicList;//商品图片集合
	private Double discount;//商品折扣
	private String mallName;//商场名称
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
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
	public String getMallTip() {
		return mallTip;
	}
	public void setMallTip(String mallTip) {
		this.mallTip = mallTip;
	}
	public List<String> getCommodityPicList() {
		return commodityPicList;
	}
	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	@Override
	public String toString() {
		return "CommodityShareVO [commodityId=" + commodityId
				+ ", commodityName=" + commodityName + ", commodityOPriceMax="
				+ commodityOPriceMax + ", commodityOPriceMin="
				+ commodityOPriceMin + ", commodityCPriceMax="
				+ commodityCPriceMax + ", commodityCPriceMin="
				+ commodityCPriceMin + ", commodityOPOfLCP=" + commodityOPOfLCP
				+ ", commodityCurrentPrice=" + commodityCurrentPrice
				+ ", mallTip=" + mallTip + ", commodityPicList="
				+ commodityPicList + ", discount=" + discount + ", mallName="
				+ mallName + "]";
	}
	
}
