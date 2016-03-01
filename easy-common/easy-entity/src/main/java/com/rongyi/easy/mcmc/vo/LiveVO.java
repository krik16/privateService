package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 直播VO，只包含新增修改的基本字段
 * 
 * @author xiaobo
 *
 */
public class LiveVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 直播id
	 */
	private String liveId;

	/**
	 * 直播名
	 */
	private String liveName;

	/**
	 * 买手id
	 */
	private String bullId;

	/**
	 * 直播开始时间
	 */
	private long beginTime;

	/**
	 * 直播结束时间
	 */
	private long endTime;

	/**
	 * 创建时间
	 */
	private long createTime;

	/**
	 * 直播状态 [0:发布/预热中，1:上线/进行中，2:下线(已过期)]
	 */
	private int status;

	/**
	 * 商品列表
	 */
	private List<LiveCommodityVO> commodityList;

	/**
	 * 直播定点（该直播下商品最多的商场或者街边店）
	 */
	private String liveAddress;

	/**
	 * 直播定点经纬度
	 */
	private List<Double> location;

	/**
	 * 品牌列表，按商品数量排序
	 */
	private List<String> brandNames;

	/**
	 * 直播用户信息
	 */
	private LiveBullInfoVO bullInfo;

	/**
	 * 距离
	 */
	private Double distance;

	/**
	 * sessionId
	 */
	private String jsessionId;
	
	/**
	 * 定点位置id
	 */
	private String liveAddressId;
	
	/**
	 * 地址类型 0商场，1街边店
	 */
	private int zoneType;

	private String shopLogo;

	private  List<String> urlList;

	public List<String> getUrlList() {
		return urlList;
	}

	public void setUrlList(List<String> urlList) {
		this.urlList = urlList;
	}

	public String getJsessionId() {
		return jsessionId;
	}

	public void setJsessionId(String jsessionId) {
		this.jsessionId = jsessionId;
	}

	public String getLiveId() {
		return liveId;
	}

	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

	public String getLiveName() {
		return liveName;
	}

	public void setLiveName(String liveName) {
		this.liveName = liveName;
	}

	public String getBullId() {
		return bullId;
	}

	public void setBullId(String bullId) {
		this.bullId = bullId;
	}

	public long getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(long beginTime) {
		this.beginTime = beginTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}	

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<LiveCommodityVO> getCommodityList() {
		return commodityList;
	}

	public void setCommodityList(List<LiveCommodityVO> commodityList) {
		this.commodityList = commodityList;
	}

	public String getLiveAddress() {
		return liveAddress;
	}

	public void setLiveAddress(String liveAddress) {
		this.liveAddress = liveAddress;
	}

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public List<String> getBrandNames() {
		return brandNames;
	}

	public void setBrandNames(List<String> brandNames) {
		this.brandNames = brandNames;
	}

	public LiveBullInfoVO getBullInfo() {
		return bullInfo;
	}

	public void setBullInfo(LiveBullInfoVO bullInfo) {
		this.bullInfo = bullInfo;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getLiveAddressId() {
		return liveAddressId;
	}

	public void setLiveAddressId(String liveAddressId) {
		this.liveAddressId = liveAddressId;
	}

	public int getZoneType() {
		return zoneType;
	}

	public void setZoneType(int zoneType) {
		this.zoneType = zoneType;
	}

	public String getShopLogo() {
		return shopLogo;
	}

	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}
}
