package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 
* @Description: 拼团活动vo
* @author chenjun
* @date 2016年10月13日 下午6:47:26 
*
 */
public class ActivityVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -844670575721824951L;
	
	private Integer activityId;//拼团活动id
	private String activityName;//拼团活动名称
	private Long endAt;//拼团活动结束时间
	private Long startAt;//拼团活动开始时间
	private String shareDesc;//分享内容
	private String sharePic;//	分享图片
	private String shareTitle;//分享标题
	private Boolean forceAttention = false;//是否需要强制关注 true需要 false不需要
	public Boolean getForceAttention() {
		return forceAttention;
	}
	public void setForceAttention(Boolean forceAttention) {
		this.forceAttention = forceAttention;
	}
	private List<ActivityCommodityVO> commodityList;//拼团活动商品列表
	
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public Long getEndAt() {
		return endAt;
	}
	public void setEndAt(Long endAt) {
		this.endAt = endAt;
	}
	public Long getStartAt() {
		return startAt;
	}
	public void setStartAt(Long startAt) {
		this.startAt = startAt;
	}
	public String getShareDesc() {
		return shareDesc;
	}
	public void setShareDesc(String shareDesc) {
		this.shareDesc = shareDesc;
	}
	public String getSharePic() {
		return sharePic;
	}
	public void setSharePic(String sharePic) {
		this.sharePic = sharePic;
	}
	public String getShareTitle() {
		return shareTitle;
	}
	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}
	public List<ActivityCommodityVO> getCommodityList() {
		return commodityList;
	}
	public void setCommodityList(List<ActivityCommodityVO> commodityList) {
		this.commodityList = commodityList;
	}
	@Override
	public String toString() {
		return "GroupActivityVO [activityId=" + activityId + ", activityName="
				+ activityName + ", endAt=" + endAt + ", startAt=" + startAt
				+ ", shareDesc=" + shareDesc + ", sharePic=" + sharePic
				+ ", shareTitle=" + shareTitle + ", commodityList=" + commodityList 
				+ ", forceAttention=" + forceAttention
				+ "]";
	}

}
