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
	@Override
	public String toString() {
		return "WechatCommodityParam [commodityId=" + commodityId
				+ ", activityId=" + activityId + ", memberId=" + memberId + "]";
	}
	
	

	public List<String> getCommodityIds() {
		return commodityIds;
	}

	public void setCommodityIds(List<String> commodityIds) {
		this.commodityIds = commodityIds;
	}
}
