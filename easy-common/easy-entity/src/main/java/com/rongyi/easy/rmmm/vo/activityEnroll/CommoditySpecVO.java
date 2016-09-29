package com.rongyi.easy.rmmm.vo.activityEnroll;

import java.io.Serializable;
import java.util.List;
/**
 * 参与活动的商品规格信息VO
 * @author user
 *
 */
public class CommoditySpecVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String commoditySpecId;//商品规格id
	private String specCurrentPrice;//规格现价
	private String specOriginalPrice;//规格现价
	private String activityPrice;//活动价格
	private Integer inventory;//活动提报库存
	private Integer specStock;//规格库存
	private List<SpecColumnVO> columnList;//规格具体信息集合
	public String getCommoditySpecId() {
		return commoditySpecId;
	}
	public void setCommoditySpecId(String commoditySpecId) {
		this.commoditySpecId = commoditySpecId;
	}
	public String getSpecCurrentPrice() {
		return specCurrentPrice;
	}
	public void setSpecCurrentPrice(String specCurrentPrice) {
		this.specCurrentPrice = specCurrentPrice;
	}
	public String getSpecOriginalPrice() {
		return specOriginalPrice;
	}
	public void setSpecOriginalPrice(String specOriginalPrice) {
		this.specOriginalPrice = specOriginalPrice;
	}
	public String getActivityPrice() {
		return activityPrice;
	}
	public void setActivityPrice(String activityPrice) {
		this.activityPrice = activityPrice;
	}
	public Integer getInventory() {
		return inventory;
	}
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	public Integer getSpecStock() {
		return specStock;
	}
	public void setSpecStock(Integer specStock) {
		this.specStock = specStock;
	}
	public List<SpecColumnVO> getColumnList() {
		return columnList;
	}
	public void setColumnList(List<SpecColumnVO> columnList) {
		this.columnList = columnList;
	}
	@Override
	public String toString() {
		return "CommoditySpecVO [commoditySpecId=" + commoditySpecId
				+ ", specCurrentPrice=" + specCurrentPrice
				+ ", specOriginalPrice=" + specOriginalPrice
				+ ", activityPrice=" + activityPrice + ", inventory="
				+ inventory + ", specStock=" + specStock + ", columnList="
				+ columnList + "]";
	}
	
}
