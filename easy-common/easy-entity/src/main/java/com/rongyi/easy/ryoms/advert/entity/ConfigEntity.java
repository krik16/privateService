package com.rongyi.easy.ryoms.advert.entity;

/**
 * @Description: 配置新增/修改保存的实类
 * @author wangjh
 * @date 2016年2月18日
 */
public class ConfigEntity {
	public int getConfigId() {
		return configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
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

	public String getCityMId() {
		return cityMId;
	}

	public void setCityMId(String cityMId) {
		this.cityMId = cityMId;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getCountTotal() {
		return countTotal;
	}

	public void setCountTotal(int countTotal) {
		this.countTotal = countTotal;
	}

	public int getCountRY() {
		return countRY;
	}

	public void setCountRY(int countRy) {
		this.countRY = countRy;
	}

	public int getCountMall() {
		return countMall;
	}

	public void setCountMall(int countMall) {
		this.countMall = countMall;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMallMId() {
		return mallMId;
	}

	public void setMallMId(String mallMId) {
		this.mallMId = mallMId;
	}

	// 编号
	private int configId = 0;
	// 商城Id
	private String mallMId = "";
	// 商城名称
	private String mallName = "";
	// 商城等级
	private String mallLevel = "";
	// 城市Id
	private String cityMId = "";
	// 广告位置
	private int position = 0;
	// 广告数量
	private int countTotal = 0;
	// 广告数量-容易网
	private int countRY = 0;
	// 广告数量-卖场
	private int countMall = 0;
	// 用户Id
	private int userId = 0;
}
