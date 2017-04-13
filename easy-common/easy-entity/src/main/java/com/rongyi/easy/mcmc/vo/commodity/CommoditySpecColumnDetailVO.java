package com.rongyi.easy.mcmc.vo.commodity;

import java.io.Serializable;
import java.util.List;

public class CommoditySpecColumnDetailVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commoditySpecId;//规格id
	private String commoditySpecName;//规格名称
	private String description;//规格说明
	private boolean hasClassification;//是否含有分类
	private List<SpecColumnClassificationVO> specColumnClassificationList;//规格分类列表  或者   子规格列表
	public String getCommoditySpecId() {
		return commoditySpecId;
	}
	public void setCommoditySpecId(String commoditySpecId) {
		this.commoditySpecId = commoditySpecId;
	}
	public String getCommoditySpecName() {
		return commoditySpecName;
	}
	public void setCommoditySpecName(String commoditySpecName) {
		this.commoditySpecName = commoditySpecName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isHasClassification() {
		return hasClassification;
	}
	public void setHasClassification(boolean hasClassification) {
		this.hasClassification = hasClassification;
	}
	public List<SpecColumnClassificationVO> getSpecColumnClassificationList() {
		return specColumnClassificationList;
	}
	public void setSpecColumnClassificationList(
			List<SpecColumnClassificationVO> specColumnClassificationList) {
		this.specColumnClassificationList = specColumnClassificationList;
	}
	@Override
	public String toString() {
		return "CommoditySpecColumnDetailVO [commoditySpecId="
				+ commoditySpecId + ", commoditySpecName=" + commoditySpecName
				+ ", description=" + description + ", hasClassification="
				+ hasClassification + ", specColumnClassificationList="
				+ specColumnClassificationList + "]";
	}
	
}
