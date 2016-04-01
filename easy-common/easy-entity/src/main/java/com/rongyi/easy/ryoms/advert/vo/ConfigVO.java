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
	private Integer mall_banner_1040_580;//banner1040_580商家广告数量
	private Integer ry_banner_1040_580;//banner1040_580容易网广告数量
	private Integer mall_banner_1040_520;//banner1040_520商家广告数量
	private Integer ry_banner_1040_520;//banner1040_520容易网广告数量
	private Integer mall_banner_618_930;//banner618_930商家广告数量
	private Integer ry_banner_618_930;//banner618_930容易网广告数量
	private Integer mall_banner_1040_630;//banner1040_630商家广告数量
	private Integer ry_banner_1040_630;//banner1040_630容易网广告数量
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
	 * @return the mall_banner_1040_580
	 */
	public Integer getMall_banner_1040_580() {
		return mall_banner_1040_580;
	}
	/**
	 * @param mall_banner_1040_580 the mall_banner_1040_580 to set
	 */
	public void setMall_banner_1040_580(Integer mall_banner_1040_580) {
		this.mall_banner_1040_580 = mall_banner_1040_580;
	}
	/**
	 * @return the ry_banner_1040_580
	 */
	public Integer getRy_banner_1040_580() {
		return ry_banner_1040_580;
	}
	/**
	 * @param ry_banner_1040_580 the ry_banner_1040_580 to set
	 */
	public void setRy_banner_1040_580(Integer ry_banner_1040_580) {
		this.ry_banner_1040_580 = ry_banner_1040_580;
	}
	/**
	 * @return the mall_banner_1040_520
	 */
	public Integer getMall_banner_1040_520() {
		return mall_banner_1040_520;
	}
	/**
	 * @param mall_banner_1040_520 the mall_banner_1040_520 to set
	 */
	public void setMall_banner_1040_520(Integer mall_banner_1040_520) {
		this.mall_banner_1040_520 = mall_banner_1040_520;
	}
	/**
	 * @return the ry_banner_1040_520
	 */
	public Integer getRy_banner_1040_520() {
		return ry_banner_1040_520;
	}
	/**
	 * @param ry_banner_1040_520 the ry_banner_1040_520 to set
	 */
	public void setRy_banner_1040_520(Integer ry_banner_1040_520) {
		this.ry_banner_1040_520 = ry_banner_1040_520;
	}
	/**
	 * @return the mall_banner_618_930
	 */
	public Integer getMall_banner_618_930() {
		return mall_banner_618_930;
	}
	/**
	 * @param mall_banner_618_930 the mall_banner_618_930 to set
	 */
	public void setMall_banner_618_930(Integer mall_banner_618_930) {
		this.mall_banner_618_930 = mall_banner_618_930;
	}
	/**
	 * @return the ry_banner_618_930
	 */
	public Integer getRy_banner_618_930() {
		return ry_banner_618_930;
	}
	/**
	 * @param ry_banner_618_930 the ry_banner_618_930 to set
	 */
	public void setRy_banner_618_930(Integer ry_banner_618_930) {
		this.ry_banner_618_930 = ry_banner_618_930;
	}
	/**
	 * @return the mall_banner_1040_630
	 */
	public Integer getMall_banner_1040_630() {
		return mall_banner_1040_630;
	}
	/**
	 * @param mall_banner_1040_630 the mall_banner_1040_630 to set
	 */
	public void setMall_banner_1040_630(Integer mall_banner_1040_630) {
		this.mall_banner_1040_630 = mall_banner_1040_630;
	}
	/**
	 * @return the ry_banner_1040_630
	 */
	public Integer getRy_banner_1040_630() {
		return ry_banner_1040_630;
	}
	/**
	 * @param ry_banner_1040_630 the ry_banner_1040_630 to set
	 */
	public void setRy_banner_1040_630(Integer ry_banner_1040_630) {
		this.ry_banner_1040_630 = ry_banner_1040_630;
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
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年4月1日 下午2:53:19
	* @throws 
	*/
	@Override
	public String toString() {
		return "ConfigVO [configId=" + configId + ", mallMId=" + mallMId + ", mallName=" + mallName + ", mall_level="
				+ mall_level + ", positionId=" + positionId + ", positionName=" + positionName + ", cityMId=" + cityMId
				+ ", cityName=" + cityName + ", cityLevel=" + cityLevel + ", areaId=" + areaId + ", areaName="
				+ areaName + ", countTotal=" + countTotal + ", countRY=" + countRY + ", countMall=" + countMall
				+ ", statusId=" + statusId + ", statusName=" + statusName + ", create_int=" + create_int
				+ ", create_date=" + create_date + ", update_int=" + update_int + ", update_date=" + update_date
				+ ", create_by=" + create_by + ", create_at=" + create_at + ", update_by=" + update_by + ", update_at="
				+ update_at + ", mall_ad_num=" + mall_ad_num + ", ry_ad_num=" + ry_ad_num + ", mall_banner="
				+ mall_banner + ", ry_banner=" + ry_banner + ", mall_banner_1040_580=" + mall_banner_1040_580
				+ ", ry_banner_1040_580=" + ry_banner_1040_580 + ", mall_banner_1040_520=" + mall_banner_1040_520
				+ ", ry_banner_1040_520=" + ry_banner_1040_520 + ", mall_banner_618_930=" + mall_banner_618_930
				+ ", ry_banner_618_930=" + ry_banner_618_930 + ", mall_banner_1040_630=" + mall_banner_1040_630
				+ ", ry_banner_1040_630=" + ry_banner_1040_630 + "]";
	}
}
