package com.rongyi.easy.ryoms.advert.param;

/**
 * @Description: 配置查询参数类
 * @author wangjh
 * @date 2016年2月18日
 */
public class ConfigSearchParam {
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getMallLevel() {
		return mallLevel;
	}
	public void setMallLevel(String mallLevel) {
		this.mallLevel = mallLevel;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public String getCityMId() {
		return cityMId;
	}
	public void setCityMId(String cityMId) {
		this.cityMId = cityMId;
	}
	public int getCityLevel() {
		return cityLevel;
	}
	public void setCityLevel(int cityLevel) {
		this.cityLevel = cityLevel;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	// 商城名称
	private String mallName = "";
	// 广告位置
	private int position = 0;
	// 商城等级Id
	private String mallLevel = "";
	// 配置状态Id
	private int status = 0;
	// 大区Id
	private int areaId = 0;
	// 城市mongoId
	private String cityMId = "";
	// 城市等级Id
	private int cityLevel = 0;
	// 当前页码
	private int currentPage = 0;
	// 页数
	private int pageSize = 10;
	// 开始序号数
	private int startIndex = 0;
}
