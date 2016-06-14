package com.rongyi.easy.ryoms.advert.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 配置VO类
 * @author wangjh
 * @date 2016年2月18日
 */
public class ConfigVO implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -1452982881105333559L;
	// 编号
	private int configId = 0;
	// 商城Id
	private String mallMId = "";
	// 商城名称
	private String mallName = "";
	// 商城等级
	private String mall_level = "";
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
	private Integer create_int;
	private Date create_date;
	private Integer update_int;
	private Date update_date;
	private String create_by;
	private Long create_at;
	private String update_by;
	private Long update_at;
	private Integer mall_ad_num;//全屏商家广告数量
	private Integer ry_ad_num;//全屏容易网广告数量
	private Integer mall_banner;//banner商家广告数量
	private Integer ry_banner;//banner容易网广告数量
	private Integer mall_banner_330_home_a;//banner1040_580商家广告数量
	private Integer ry_banner_330_home_a;//banner1040_580容易网广告数量
	private Integer mall_banner_330_home_d;//banner1040_520商家广告数量
	private Integer ry_banner_330_home_d;//banner1040_520容易网广告数量
	private Integer mall_banner_318_home_b;//banner618_930商家广告数量
	private Integer ry_banner_318_home_b;//banner618_930容易网广告数量
	private Integer mall_banner_318_home_d;//banner1040_630商家广告数量
	private Integer ry_banner_318_home_d;//banner1040_630容易网广告数量
	private Integer mall_brandguide;//品牌导购商场数量
	private Integer ry_brandguide;//品牌导购容易网数量
	private Integer mall_floornavigate;//楼层导航商场数量
	private Integer ry_floornavigate;//楼层导航容易网数量
	private Integer mall_membercenter;//会员中心商场数量
	private Integer ry_membercenter;//会员中心容易网数量
	private Integer mall_activity;//精彩活动商场数量
	private Integer ry_activity;//精彩活动容易网数量
	private Integer mall_coupon;//优惠券商场数量
	private Integer ry_coupon;//优惠券容易网数量
	private String address;//详细地址
	/**
	 * @return the configId
	 */
	public int getConfigId() {
		return configId;
	}
	/**
	 * @param configId the configId to set
	 */
	public void setConfigId(int configId) {
		this.configId = configId;
	}
	/**
	 * @return the mallMId
	 */
	public String getMallMId() {
		return mallMId;
	}
	/**
	 * @param mallMId the mallMId to set
	 */
	public void setMallMId(String mallMId) {
		this.mallMId = mallMId;
	}
	/**
	 * @return the mallName
	 */
	public String getMallName() {
		return mallName;
	}
	/**
	 * @param mallName the mallName to set
	 */
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	/**
	 * @return the mall_level
	 */
	public String getMall_level() {
		return mall_level;
	}
	/**
	 * @param mall_level the mall_level to set
	 */
	public void setMall_level(String mall_level) {
		this.mall_level = mall_level;
	}
	/**
	 * @return the positionId
	 */
	public int getPositionId() {
		return positionId;
	}
	/**
	 * @param positionId the positionId to set
	 */
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	/**
	 * @return the positionName
	 */
	public String getPositionName() {
		return positionName;
	}
	/**
	 * @param positionName the positionName to set
	 */
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	/**
	 * @return the cityMId
	 */
	public String getCityMId() {
		return cityMId;
	}
	/**
	 * @param cityMId the cityMId to set
	 */
	public void setCityMId(String cityMId) {
		this.cityMId = cityMId;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the cityLevel
	 */
	public int getCityLevel() {
		return cityLevel;
	}
	/**
	 * @param cityLevel the cityLevel to set
	 */
	public void setCityLevel(int cityLevel) {
		this.cityLevel = cityLevel;
	}
	/**
	 * @return the areaId
	 */
	public int getAreaId() {
		return areaId;
	}
	/**
	 * @param areaId the areaId to set
	 */
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return areaName;
	}
	/**
	 * @param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	/**
	 * @return the countTotal
	 */
	public int getCountTotal() {
		return countTotal;
	}
	/**
	 * @param countTotal the countTotal to set
	 */
	public void setCountTotal(int countTotal) {
		this.countTotal = countTotal;
	}
	/**
	 * @return the countRY
	 */
	public int getCountRY() {
		return countRY;
	}
	/**
	 * @param countRY the countRY to set
	 */
	public void setCountRY(int countRY) {
		this.countRY = countRY;
	}
	/**
	 * @return the countMall
	 */
	public int getCountMall() {
		return countMall;
	}
	/**
	 * @param countMall the countMall to set
	 */
	public void setCountMall(int countMall) {
		this.countMall = countMall;
	}
	/**
	 * @return the statusId
	 */
	public int getStatusId() {
		return statusId;
	}
	/**
	 * @param statusId the statusId to set
	 */
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	/**
	 * @return the statusName
	 */
	public String getStatusName() {
		return statusName;
	}
	/**
	 * @param statusName the statusName to set
	 */
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	/**
	 * @return the create_int
	 */
	public Integer getCreate_int() {
		return create_int;
	}
	/**
	 * @param create_int the create_int to set
	 */
	public void setCreate_int(Integer create_int) {
		this.create_int = create_int;
	}
	/**
	 * @return the create_date
	 */
	public Date getCreate_date() {
		return create_date;
	}
	/**
	 * @param create_date the create_date to set
	 */
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	/**
	 * @return the update_int
	 */
	public Integer getUpdate_int() {
		return update_int;
	}
	/**
	 * @param update_int the update_int to set
	 */
	public void setUpdate_int(Integer update_int) {
		this.update_int = update_int;
	}
	/**
	 * @return the update_date
	 */
	public Date getUpdate_date() {
		return update_date;
	}
	/**
	 * @param update_date the update_date to set
	 */
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	/**
	 * @return the create_by
	 */
	public String getCreate_by() {
		return create_by;
	}
	/**
	 * @param create_by the create_by to set
	 */
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	/**
	 * @return the create_at
	 */
	public Long getCreate_at() {
		return create_at;
	}
	/**
	 * @param create_at the create_at to set
	 */
	public void setCreate_at(Long create_at) {
		this.create_at = create_at;
	}
	/**
	 * @return the update_by
	 */
	public String getUpdate_by() {
		return update_by;
	}
	/**
	 * @param update_by the update_by to set
	 */
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	/**
	 * @return the update_at
	 */
	public Long getUpdate_at() {
		return update_at;
	}
	/**
	 * @param update_at the update_at to set
	 */
	public void setUpdate_at(Long update_at) {
		this.update_at = update_at;
	}
	/**
	 * @return the mall_ad_num
	 */
	public Integer getMall_ad_num() {
		return mall_ad_num;
	}
	/**
	 * @param mall_ad_num the mall_ad_num to set
	 */
	public void setMall_ad_num(Integer mall_ad_num) {
		this.mall_ad_num = mall_ad_num;
	}
	/**
	 * @return the ry_ad_num
	 */
	public Integer getRy_ad_num() {
		return ry_ad_num;
	}
	/**
	 * @param ry_ad_num the ry_ad_num to set
	 */
	public void setRy_ad_num(Integer ry_ad_num) {
		this.ry_ad_num = ry_ad_num;
	}
	/**
	 * @return the mall_banner
	 */
	public Integer getMall_banner() {
		return mall_banner;
	}
	/**
	 * @param mall_banner the mall_banner to set
	 */
	public void setMall_banner(Integer mall_banner) {
		this.mall_banner = mall_banner;
	}
	/**
	 * @return the ry_banner
	 */
	public Integer getRy_banner() {
		return ry_banner;
	}
	/**
	 * @param ry_banner the ry_banner to set
	 */
	public void setRy_banner(Integer ry_banner) {
		this.ry_banner = ry_banner;
	}
	/**
	 * @return the mall_banner_330_home_a
	 */
	public Integer getMall_banner_330_home_a() {
		return mall_banner_330_home_a;
	}
	/**
	 * @param mall_banner_330_home_a the mall_banner_330_home_a to set
	 */
	public void setMall_banner_330_home_a(Integer mall_banner_330_home_a) {
		this.mall_banner_330_home_a = mall_banner_330_home_a;
	}
	/**
	 * @return the ry_banner_330_home_a
	 */
	public Integer getRy_banner_330_home_a() {
		return ry_banner_330_home_a;
	}
	/**
	 * @param ry_banner_330_home_a the ry_banner_330_home_a to set
	 */
	public void setRy_banner_330_home_a(Integer ry_banner_330_home_a) {
		this.ry_banner_330_home_a = ry_banner_330_home_a;
	}
	/**
	 * @return the mall_banner_330_home_d
	 */
	public Integer getMall_banner_330_home_d() {
		return mall_banner_330_home_d;
	}
	/**
	 * @param mall_banner_330_home_d the mall_banner_330_home_d to set
	 */
	public void setMall_banner_330_home_d(Integer mall_banner_330_home_d) {
		this.mall_banner_330_home_d = mall_banner_330_home_d;
	}
	/**
	 * @return the ry_banner_330_home_d
	 */
	public Integer getRy_banner_330_home_d() {
		return ry_banner_330_home_d;
	}
	/**
	 * @param ry_banner_330_home_d the ry_banner_330_home_d to set
	 */
	public void setRy_banner_330_home_d(Integer ry_banner_330_home_d) {
		this.ry_banner_330_home_d = ry_banner_330_home_d;
	}
	/**
	 * @return the mall_banner_318_home_b
	 */
	public Integer getMall_banner_318_home_b() {
		return mall_banner_318_home_b;
	}
	/**
	 * @param mall_banner_318_home_b the mall_banner_318_home_b to set
	 */
	public void setMall_banner_318_home_b(Integer mall_banner_318_home_b) {
		this.mall_banner_318_home_b = mall_banner_318_home_b;
	}
	/**
	 * @return the ry_banner_318_home_b
	 */
	public Integer getRy_banner_318_home_b() {
		return ry_banner_318_home_b;
	}
	/**
	 * @param ry_banner_318_home_b the ry_banner_318_home_b to set
	 */
	public void setRy_banner_318_home_b(Integer ry_banner_318_home_b) {
		this.ry_banner_318_home_b = ry_banner_318_home_b;
	}
	/**
	 * @return the mall_banner_318_home_d
	 */
	public Integer getMall_banner_318_home_d() {
		return mall_banner_318_home_d;
	}
	/**
	 * @param mall_banner_318_home_d the mall_banner_318_home_d to set
	 */
	public void setMall_banner_318_home_d(Integer mall_banner_318_home_d) {
		this.mall_banner_318_home_d = mall_banner_318_home_d;
	}
	/**
	 * @return the ry_banner_318_home_d
	 */
	public Integer getRy_banner_318_home_d() {
		return ry_banner_318_home_d;
	}
	/**
	 * @param ry_banner_318_home_d the ry_banner_318_home_d to set
	 */
	public void setRy_banner_318_home_d(Integer ry_banner_318_home_d) {
		this.ry_banner_318_home_d = ry_banner_318_home_d;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMall_brandguide() {
		return mall_brandguide;
	}
	public void setMall_brandguide(Integer mall_brandguide) {
		this.mall_brandguide = mall_brandguide;
	}
	public Integer getRy_brandguide() {
		return ry_brandguide;
	}
	public void setRy_brandguide(Integer ry_brandguide) {
		this.ry_brandguide = ry_brandguide;
	}
	public Integer getMall_floornavigate() {
		return mall_floornavigate;
	}
	public void setMall_floornavigate(Integer mall_floornavigate) {
		this.mall_floornavigate = mall_floornavigate;
	}
	public Integer getRy_floornavigate() {
		return ry_floornavigate;
	}
	public void setRy_floornavigate(Integer ry_floornavigate) {
		this.ry_floornavigate = ry_floornavigate;
	}
	public Integer getMall_membercenter() {
		return mall_membercenter;
	}
	public void setMall_membercenter(Integer mall_membercenter) {
		this.mall_membercenter = mall_membercenter;
	}
	public Integer getRy_membercenter() {
		return ry_membercenter;
	}
	public void setRy_membercenter(Integer ry_membercenter) {
		this.ry_membercenter = ry_membercenter;
	}
	public Integer getMall_activity() {
		return mall_activity;
	}
	public void setMall_activity(Integer mall_activity) {
		this.mall_activity = mall_activity;
	}
	public Integer getRy_activity() {
		return ry_activity;
	}
	public void setRy_activity(Integer ry_activity) {
		this.ry_activity = ry_activity;
	}
	public Integer getMall_coupon() {
		return mall_coupon;
	}
	public void setMall_coupon(Integer mall_coupon) {
		this.mall_coupon = mall_coupon;
	}
	public Integer getRy_coupon() {
		return ry_coupon;
	}
	public void setRy_coupon(Integer ry_coupon) {
		this.ry_coupon = ry_coupon;
	}
}
