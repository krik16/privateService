package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.CommoditySpec;
import com.rongyi.easy.mcmc.CommoditySpecColumn;


public class CommoditySpecVO implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6630348930591836681L;
	private String specId;
	
	private String specStock;
	private String specOriginalPrice;
	private String specCurrentPrice;
	private List<CommoditySpecColumnVO> specColumnValues;
	public List<CommoditySpecColumnVO> getSpecColumnValues() {
		return specColumnValues;
	}
	public void setSpecColumnValues(List<CommoditySpecColumnVO> specColumnValues) {
		this.specColumnValues = specColumnValues;
	}
	public CommoditySpecVO(){
		
	}
	public CommoditySpecVO(CommoditySpec commoditySpec){
		this.specId = commoditySpec.getId().toString();
		this.specStock = commoditySpec.getStock();
		this.specOriginalPrice = commoditySpec.getOriginalPrice();
		this.specCurrentPrice = commoditySpec.getCurrentPrice();
	}
	public String getSpecId() {
		return specId;
	}
	public void setSpecId(String specId) {
		this.specId = specId;
	}
	public String getSpecStock() {
		return specStock;
	}
	public void setSpecStock(String specStock) {
		this.specStock = specStock;
	}
	public String getSpecOriginalPrice() {
		return specOriginalPrice;
	}
	public void setSpecOriginalPrice(String specOriginalPrice) {
		this.specOriginalPrice = specOriginalPrice;
	}
	public String getSpecCurrentPrice() {
		return specCurrentPrice;
	}
	public void setSpecCurrentPrice(String specCurrentPrice) {
		this.specCurrentPrice = specCurrentPrice;
	}

}
