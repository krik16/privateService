package com.rongyi.easy.mcmc.vo.commodity;

import java.util.Date;
/**
 * 大运营后台商品规格列表返回VO
 * @author user
 *
 */
public class CommoditySpecColumnVO {
	
	private String commoditySpecId;//规格id
	private String commoditySpecName;//规格名称
	private String updateName;//修改人
	private Date updateAt;//修改时间
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
	public String getUpdateName() {
		return updateName;
	}
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	@Override
	public String toString() {
		return "CommoditySpecColumnVO [commoditySpecId=" + commoditySpecId
				+ ", commoditySpecName=" + commoditySpecName + ", updateName="
				+ updateName + ", updateAt=" + updateAt + "]";
	}
	
}
