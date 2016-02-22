package com.rongyi.easy.ryoms.advert.vo;

/**
 * @Description: 配置VO类
 * @author wangjh
 * @date 2016年2月18日
 */
public class ConfigVO {
	public int getConfigId() {
		return configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
	}

	public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getMallLevel() {
		return mallLevel;
	}

	public void setMallLevel(String mallLevel) {
		this.mallLevel = mallLevel;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getCityMId() {
		return cityMId;
	}

	public void setCityMId(String cityMId) {
		this.cityMId = cityMId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getCityLevel() {
		return cityLevel;
	}

	public void setCityLevel(int cityLevel) {
		this.cityLevel = cityLevel;
	}

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public int getCountTotal() {
		return countTotal;
	}

	public void setCountTotal(int countTotal) {
		this.countTotal = countTotal;
	}

	public int getCountMall() {
		return countMall;
	}

	public void setCountMall(int countMall) {
		this.countMall = countMall;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public int getCountRY() {
		return countRY;
	}

	public void setCountRY(int countRY) {
		this.countRY = countRY;
	}

	// 编号
	private int configId = 0;
	// 商城Id
	private String mallMid = "";
	// 商城名称
	private String mallName = "";
	// 商城等级
	private String mallLevel = "";
	// 广告位置
	private int positionId = 0;
	// 广告位置
	private String positionName = "";
	// 城市Id
	private String cityMId = "";
	// 城市名称
	private String cityName = "";
	// 城市等级
	private int cityLevel = 0;
	// 城市Id
	private int areaId = 0;
	// 城市名称
	private String areaName = "";
	// 广告数量
	private int countTotal = 0;
	// 广告数量-容易网
	private int countRY = 0;
	// 广告数量-卖场
	private int countMall = 0;
	// 状态Id
	private int statusId = 0;
	// 状态名称
	private String statusName = "";

}
