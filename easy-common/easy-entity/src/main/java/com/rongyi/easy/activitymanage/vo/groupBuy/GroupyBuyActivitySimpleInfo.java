package com.rongyi.easy.activitymanage.vo.groupBuy;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;


/***
 * 拼团活动  H5页面商品简要信息
 * @author caohongjiang
 *
 */
public class GroupyBuyActivitySimpleInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3830153074986577580L;

	/***
	 * 活动名
	 */
	private String activityName;

	/***
	 * 活动id
	 */
	private int activityId;
	private String mallId;
	
	
	private Date begin;
	
	private Date end;
	
	/***
	 * 订单自动关闭时间:分钟
	 */
	private int orderCloseTime;
	
	/***
	 * 成团有效时间:分钟
	 */
	private int groupCloseTime;
	
	
	/***
	 * 强制关注
	 */
	private boolean isForceFollow;
	
	
	private String shareTitle;
	
	private String sharePic;
	
	private String shareContent;

	private Integer status;//活动状态：待审核[0] 未通过[1] 已通过[2] 已下线[3],强制下线[4]


	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setIsForceFollow(boolean isForceFollow) {
		this.isForceFollow = isForceFollow;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getActivityPic() {
		return activityPic;
	}

	public void setActivityPic(String activityPic) {
		this.activityPic = activityPic;
	}

	private String activityPic;

	public boolean isForceFollow() {
		return isForceFollow;
	}

	public void setForceFollow(boolean isForceFollow) {
		this.isForceFollow = isForceFollow;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public int getOrderCloseTime() {
		return orderCloseTime;
	}

	public void setOrderCloseTime(int orderCloseTime) {
		this.orderCloseTime = orderCloseTime;
	}

	public int getGroupCloseTime() {
		return groupCloseTime;
	}

	public void setGroupCloseTime(int groupCloseTime) {
		this.groupCloseTime = groupCloseTime;
	}


	public String getShareTitle() {
		return shareTitle;
	}

	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	public String getSharePic() {
		return sharePic;
	}

	public void setSharePic(String sharePic) {
		this.sharePic = sharePic;
	}

	public String getShareContent() {
		return shareContent;
	}

	public void setShareContent(String shareContent) {
		this.shareContent = shareContent;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}


}
