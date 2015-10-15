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
	private String id;

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
	private long createAt;

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
	private Double distance ;
	
	/**
	 * sessionId
	 */
	private String jsessionId;

	public String getJsessionId() {
		return jsessionId;
	}

	public void setJsessionId(String jsessionId) {
		this.jsessionId = jsessionId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public long getCreateAt() {
		return createAt;
	}

	public void setCreateAt(long createAt) {
		this.createAt = createAt;
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
}
