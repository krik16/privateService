package com.rongyi.easy.mcmc.param;
/**
 * 直播
 * @author zzq
 *
 */
public class LiveParam {
	
	String liveId;
	String bullId;
	String liveTitle;
	String commodityIdList;
	String beginTime;
	String endTime;
	String liveStatus;
	String jsessionid;
	int commodityCount;
	int page;
	int pageSize;
	public int getCommodityCount() {
		return commodityCount;
	}
	public void setCommodityCount(int commodityCount) {
		this.commodityCount = commodityCount;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getJsessionid() {
		return jsessionid;
	}
	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}
	public String getLiveId() {
		return liveId;
	}
	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}
	public String getBullId() {
		return bullId;
	}
	public void setBullId(String bullId) {
		this.bullId = bullId;
	}
	public String getLiveTitle() {
		return liveTitle;
	}
	public void setLiveTitle(String liveTitle) {
		this.liveTitle = liveTitle;
	}
	public String getCommodityIdList() {
		return commodityIdList;
	}
	public void setCommodityIdList(String commodityIdList) {
		this.commodityIdList = commodityIdList;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getLiveStatus() {
		return liveStatus;
	}
	public void setLiveStatus(String liveStatus) {
		this.liveStatus = liveStatus;
	}

}
