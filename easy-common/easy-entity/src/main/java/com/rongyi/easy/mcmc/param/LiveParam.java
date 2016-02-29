package com.rongyi.easy.mcmc.param;

import java.io.Serializable;
import java.util.List;


/**
 * 直播
 * @author zzq
 *
 */
public class LiveParam  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String liveId;
	String bullId;
	String liveName;
	String commodityIdList;
	String beginTime;
	String endTime;
	String liveStatus;
	String jsessionid;
	int commodityCount;
	
	int page;
	int pageSize;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	int currentPage;
	/**
	 * 地址类型 0商场，1街边店
	 */
	private int zoneType;
	/**

	 * 定点位置id
	 */
	private String liveAddressId;
	private List<String> urlList;

	public List<String> getUrlList() {
		return urlList;
	}

	public void setUrlList(List<String> urlList) {
		this.urlList = urlList;
	}
	public int getZoneType() {
		return zoneType;
	}
	public void setZoneType(int zoneType) {
		this.zoneType = zoneType;
	}
	public String getLiveAddressId() {
		return liveAddressId;
	}
	public void setLiveAddressId(String liveAddressId) {
		this.liveAddressId = liveAddressId;
	}
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
	public String getLiveName() {
		return liveName;
	}
	public void setLiveName(String liveName) {
		this.liveName = liveName;
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

	@Override
	public String toString() {
		return "LiveParam{" +
				"liveId='" + liveId + '\'' +
				", bullId='" + bullId + '\'' +
				", liveName='" + liveName + '\'' +
				", commodityIdList='" + commodityIdList + '\'' +
				", beginTime='" + beginTime + '\'' +
				", endTime='" + endTime + '\'' +
				", liveStatus='" + liveStatus + '\'' +
				", jsessionid='" + jsessionid + '\'' +
				", commodityCount=" + commodityCount +
				", page=" + page +
				", pageSize=" + pageSize +
				", currentPage=" + currentPage +
				", zoneType=" + zoneType +
				", liveAddressId='" + liveAddressId + '\'' +
				'}';
	}
}
