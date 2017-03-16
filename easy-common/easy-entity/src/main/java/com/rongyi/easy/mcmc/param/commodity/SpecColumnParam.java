package com.rongyi.easy.mcmc.param.commodity;

import java.io.Serializable;
import java.util.List;

/**
 * 大运营新建商品规格参数
 * @author user
 *
 */
public class SpecColumnParam implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String commoditySpecId;//规格id
	private String commoditySpecName;//规格名称
	private String description;//规格说明
	private boolean hasClassification;//是否含有分类
	private Integer createBy;//创建人id
	private Integer updateBy;//修改人id
	private List<SpecColumnClassificationParam> specColumnClassificationList;
	private Integer source;//1为商家后台请求，绕过权限判断

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
	public Integer getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}
	public Integer getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}
	public List<SpecColumnClassificationParam> getSpecColumnClassificationList() {
		return specColumnClassificationList;
	}
	public void setSpecColumnClassificationList(
			List<SpecColumnClassificationParam> specColumnClassificationList) {
		this.specColumnClassificationList = specColumnClassificationList;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "SpecColumnParam [commoditySpecId=" + commoditySpecId
				+ ", commoditySpecName=" + commoditySpecName + ", description="
				+ description + ", hasClassification=" + hasClassification
				+ ", createBy=" + createBy + ", updateBy=" + updateBy+ ", source=" + source
				+ ", specColumnClassificationList="
				+ specColumnClassificationList + "]";
	}

}
