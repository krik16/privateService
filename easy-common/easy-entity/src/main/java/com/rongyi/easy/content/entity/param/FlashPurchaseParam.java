package com.rongyi.easy.content.entity.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
/**
 * 
* @ClassName: FlashPurchaseParam 
* @Description: 闪购推荐列表参数 
* @author shaozhou 
* @date 2015年11月18日 下午8:28:24 
*
 */
public class FlashPurchaseParam extends MalllifeBaseParam implements Serializable{
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 8379227039162132451L;
	/**
	 * 关键词预留，暂时不用
	 */
	private String keyword;
	/**
	 * 区域id 0代表查询全国的
	 */
	private String cityId;
	/**
	 * 区域名称
	 */
	private String cityName;
	/**
	 * 排序
	 */
	private String sort;
	/**
	 * x坐标
	 */
	private String longitude;
	/**
	 * y坐标
	 */
	private String latitude;
	/**
	 * @return the keyword
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * @param keyword the keyword to set
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	/**
	 * @return the cityId
	 */
	public String getCityId() {
		return cityId;
	}
	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
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
	 * @return the sort
	 */
	public String getSort() {
		return sort;
	}
	/**
	 * @param sort the sort to set
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}
	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
}
