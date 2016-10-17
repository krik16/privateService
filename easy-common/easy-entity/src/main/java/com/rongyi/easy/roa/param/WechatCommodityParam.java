package com.rongyi.easy.roa.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
/**
 * 
 * @author user
 *
 */
public class WechatCommodityParam extends MalllifeBaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commodityId;//商品id
	private Integer activityId;//拼团活动id
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	@Override
	public String toString() {
		return "WechatCommodityParam [commodityId=" + commodityId
				+ ", activityId=" + activityId + "]";
	}
	
}
