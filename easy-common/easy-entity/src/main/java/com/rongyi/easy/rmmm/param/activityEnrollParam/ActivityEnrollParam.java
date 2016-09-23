package com.rongyi.easy.rmmm.param.activityEnrollParam;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.rmmm.base.BaseParam;
/**
 * 活动报名参数
 * @author user
 *
 */
public class ActivityEnrollParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String activityId;//活动id
	private String commodityId;//商品id
	private String commodityType;//商品类型
	private String commoditySpecId;//商品规格id
	private Integer addSpecNum;//追加的库存数量
	private List<SpecListParam> specList;//规格集合
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityType() {
		return commodityType;
	}
	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
	}
	public String getCommoditySpecId() {
		return commoditySpecId;
	}
	public void setCommoditySpecId(String commoditySpecId) {
		this.commoditySpecId = commoditySpecId;
	}
	public Integer getAddSpecNum() {
		return addSpecNum;
	}
	public void setAddSpecNum(Integer addSpecNum) {
		this.addSpecNum = addSpecNum;
	}
	public List<SpecListParam> getSpecList() {
		return specList;
	}
	public void setSpecList(List<SpecListParam> specList) {
		this.specList = specList;
	}
	@Override
	public String toString() {
		return "ActivityEnrollParam [activityId=" + activityId
				+ ", commodityId=" + commodityId + ", commoditySpecId="
				+ commoditySpecId + ", addSpecNum=" + addSpecNum
				+ ", specList=" + specList + "]";
	}
	
}
