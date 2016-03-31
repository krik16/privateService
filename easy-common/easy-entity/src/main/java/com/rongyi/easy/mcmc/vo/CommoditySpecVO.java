package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.CommoditySpec;


public class CommoditySpecVO implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6630348930591836681L;
	private String specId;
	
	private String specStock;//库存
	private String specTotalStock;//总库存
	private String specLockedStock;//锁定库存
	private String specOriginalPrice;
	private String specCurrentPrice;
	private String specPictureUrl;//规格图片
	private String sku;
	
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
	
	public String getSpecTotalStock() {
		return specTotalStock;
	}
	
	public void setSpecTotalStock(String specTotalStock) {
		this.specTotalStock = specTotalStock;
	}
	
	public String getSpecLockedStock() {
		return specLockedStock;
	}
	
	public void setSpecLockedStock(String specLockedStock) {
		this.specLockedStock = specLockedStock;
	}

	public String getSpecPictureUrl() {
		return specPictureUrl;
	}

	public void setSpecPictureUrl(String specPictureUrl) {
		this.specPictureUrl = specPictureUrl;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
}
