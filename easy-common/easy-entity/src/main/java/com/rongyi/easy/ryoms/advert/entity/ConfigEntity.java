package com.rongyi.easy.ryoms.advert.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 配置新增/修改保存的实类
 * @author wangjh
 * @date 2016年2月18日
 */
public class ConfigEntity implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 2061650543938037443L;
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
	private Integer create_by;
	private Date create_at;
	private Integer update_by;
	private Date update_at;
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
	 * @return the mallLevel
	 */
	public String getMallLevel() {
		return mallLevel;
	}
	/**
	 * @param mallLevel the mallLevel to set
	 */
	public void setMallLevel(String mallLevel) {
		this.mallLevel = mallLevel;
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
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
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
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the create_by
	 */
	public Integer getCreate_by() {
		return create_by;
	}
	/**
	 * @param create_by the create_by to set
	 */
	public void setCreate_by(Integer create_by) {
		this.create_by = create_by;
	}
	/**
	 * @return the create_at
	 */
	public Date getCreate_at() {
		return create_at;
	}
	/**
	 * @param create_at the create_at to set
	 */
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	/**
	 * @return the update_by
	 */
	public Integer getUpdate_by() {
		return update_by;
	}
	/**
	 * @param update_by the update_by to set
	 */
	public void setUpdate_by(Integer update_by) {
		this.update_by = update_by;
	}
	/**
	 * @return the update_at
	 */
	public Date getUpdate_at() {
		return update_at;
	}
	/**
	 * @param update_at the update_at to set
	 */
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年3月1日 下午5:21:44
	* @throws 
	*/
	@Override
	public String toString() {
		return "ConfigEntity [configId=" + configId + ", mallMId=" + mallMId + ", mallName=" + mallName + ", mallLevel="
				+ mallLevel + ", cityMId=" + cityMId + ", position=" + position + ", countTotal=" + countTotal
				+ ", countRY=" + countRY + ", countMall=" + countMall + ", userId=" + userId + ", create_by="
				+ create_by + ", create_at=" + create_at + ", update_by=" + update_by + ", update_at=" + update_at
				+ "]";
	}
}
