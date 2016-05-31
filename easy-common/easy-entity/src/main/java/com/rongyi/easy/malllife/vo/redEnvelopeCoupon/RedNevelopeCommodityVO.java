package com.rongyi.easy.malllife.vo.redEnvelopeCoupon;

import java.io.Serializable;
import java.util.List;
/**
 * 可使用红包的商品返回字段
 * @author user
 *
 */
public class RedNevelopeCommodityVO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commodityId;
	private String commodityName;
	private String commodityOPriceMax;//我是最高原价”,
	private String commodityOPriceMin;//我是最低原价”,
	private String commodityCPriceMax;//我是最高现价”,
	private String commodityCPriceMin;//我是最低现价”,
	private String commodityOPOfLCP;//现价最低的规格对应的原价
	private String commodityBrandName;
	private int commodityType;//0 导购  1买手
	private List<String> commodityPicList;
	private String mallTip;//商场/街边店标签
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
	public String getCommodityBrandName() {
		return commodityBrandName;
	}
	public void setCommodityBrandName(String commodityBrandName) {
		this.commodityBrandName = commodityBrandName;
	}
	public int getCommodityType() {
		return commodityType;
	}
	public void setCommodityType(int commodityType) {
		this.commodityType = commodityType;
	}
	public List<String> getCommodityPicList() {
		return commodityPicList;
	}
	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}
	public String getCommodityOPOfLCP() {
		return commodityOPOfLCP;
	}
	public void setCommodityOPOfLCP(String commodityOPOfLCP) {
		this.commodityOPOfLCP = commodityOPOfLCP;
	}
	public String getMallTip() {
		return mallTip;
	}
	public void setMallTip(String mallTip) {
		this.mallTip = mallTip;
	}
	@Override
	public String toString() {
		return "RedNevelopeCommodityVO [commodityId=" + commodityId
				+ ", commodityName=" + commodityName + ", commodityOPriceMax="
				+ commodityOPriceMax + ", commodityOPriceMin="
				+ commodityOPriceMin + ", commodityCPriceMax="
				+ commodityCPriceMax + ", commodityCPriceMin="
				+ commodityCPriceMin + ", commodityOPOfLCP=" + commodityOPOfLCP
				+ ", commodityBrandName=" + commodityBrandName
				+ ", commodityType=" + commodityType + ", commodityPicList="
				+ commodityPicList + ", mallTip=" + mallTip + "]";
	}
	
	
}
