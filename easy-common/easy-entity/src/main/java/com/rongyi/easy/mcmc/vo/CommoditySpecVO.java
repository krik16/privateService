package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rongyi.easy.mcmc.CommoditySpec;
import com.rongyi.easy.mcmc.param.CommoditySpecParam;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;


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

	private String activityStock;// sku 参与活动剩余库存
	//private String activityPrice; //sku 参与活动活动价
	private Integer activitylimitCount;// sku 参与活动限购数量

	private List<CommoditySpecColumnVO> specColumnValues;

	private Integer activitySpecStock;//拼团商品规格库存
	private Double activityPrice;//拼团商品规格价格

	private String referencePrice;

	private String specColumnsMsg;


	public String getSpecColumnsMsg() {
		return specColumnsMsg;
	}

	public void setSpecColumnsMsg(String specColumnsMsg) {
		this.specColumnsMsg = specColumnsMsg;
	}

	public Integer getActivitySpecStock() {
		return activitySpecStock;
	}

	public void setActivitySpecStock(Integer activitySpecStock) {
		this.activitySpecStock = activitySpecStock;
	}

	public Double getActivityPrice() {
		return activityPrice;
	}

	public void setActivityPrice(Double activityPrice) {
		this.activityPrice = activityPrice;
	}

	public List<CommoditySpecColumnVO> getSpecColumnValues() {
		return specColumnValues;
	}

	public void setSpecColumnValues(List<CommoditySpecColumnVO> specColumnValues) {
		this.specColumnValues = specColumnValues;
	}

	public CommoditySpecVO(){

	}

	public CommoditySpecVO(CommoditySpec commoditySpec) {
		this.specId = commoditySpec.getId().toString();
		this.specStock = commoditySpec.getStock();
		this.specOriginalPrice = commoditySpec.getOriginalPrice();
		this.specCurrentPrice = commoditySpec.getCurrentPrice();
		this.sku = commoditySpec.getSku();
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

	public String getActivityStock() {
		return activityStock;
	}

	public void setActivityStock(String activityStock) {
		this.activityStock = activityStock;
	}

	/*public String getActivityPrice() {
		return activityPrice;
	}

	public void setActivityPrice(String activityPrice) {
		this.activityPrice = activityPrice;
	}*/

	public Integer getActivitylimitCount() {
		return activitylimitCount;
	}

	public void setActivitylimitCount(Integer activitylimitCount) {
		this.activitylimitCount = activitylimitCount;
	}

	public String getReferencePrice() {
		return referencePrice;
	}

	public void setReferencePrice(String referencePrice) {
		this.referencePrice = referencePrice;
	}

	@Override
	public String toString() {
		return "CommoditySpecVO{" +
				"specId='" + specId + '\'' +
				", specStock='" + specStock + '\'' +
				", specTotalStock='" + specTotalStock + '\'' +
				", specLockedStock='" + specLockedStock + '\'' +
				", specOriginalPrice='" + specOriginalPrice + '\'' +
				", specCurrentPrice='" + specCurrentPrice + '\'' +
				", specPictureUrl='" + specPictureUrl + '\'' +
				", sku='" + sku + '\'' +
				", activityStock='" + activityStock + '\'' +
				", activityPrice='" + activityPrice + '\'' +
				", activitylimitCount='" + activitylimitCount + '\'' +
				", specColumnValues=" + specColumnValues +
				", referencePrice=" + referencePrice +
				'}';
	}

	public void setCommoditySpecInfo(CommoditySpecParam param) {
		this.setSpecOriginalPrice(param.getOriginalPrice());
		this.setSpecCurrentPrice(param.getCurrentPrice());
		this.setSpecTotalStock(Integer.toString(param.getStock()));
		this.setSpecStock(Integer.toString(param.getRemain()));
		this.setSpecPictureUrl(param.getPictureUrl());
		this.setSku(param.getSku());
		this.setReferencePrice(param.getReferencePrice());

		if (CollectionUtils.isNotEmpty(param.getColumnIds())) {
			this.setSpecColumnValues(new CommoditySpecColumnVO().getSpecColumnInfo(param));
		}
	}
}
