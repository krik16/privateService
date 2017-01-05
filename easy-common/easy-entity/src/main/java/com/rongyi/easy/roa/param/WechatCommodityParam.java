package com.rongyi.easy.roa.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
/**
 * 
 * @author user
 *
 */
public class WechatCommodityParam extends MalllifeBaseParam implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String commodityId;//商品id
	private Integer activityId;//拼团活动id
	private String memberId;//微信电子会员ids
	private List<CommoditySpecParam> commoditySpecIds;
	private String categoryParentId;

	public String getCategoryParentId() {
		return categoryParentId;
	}

	public void setCategoryParentId(String categoryParentId) {
		this.categoryParentId = categoryParentId;
	}

	public List<CommoditySpecParam> getCommoditySpecIds() {
		return commoditySpecIds;
	}
	public void setCommoditySpecIds(List<CommoditySpecParam> commoditySpecIds) {
		this.commoditySpecIds = commoditySpecIds;
	}
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	private List<String> commodityIds;

	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}	

	public List<String> getCommodityIds() {
		return commodityIds;
	}

	public void setCommodityIds(List<String> commodityIds) {
		this.commodityIds = commodityIds;
	}
	@Override
	public String toString() {
		return "WechatCommodityParam [commodityId=" + commodityId
				+ ", activityId=" + activityId + ", memberId=" + memberId
				+ ", commoditySpecIds=" + commoditySpecIds + ", commodityIds="
				+ commodityIds + "]";
	}
}
