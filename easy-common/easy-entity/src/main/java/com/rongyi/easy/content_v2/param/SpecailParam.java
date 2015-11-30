package com.rongyi.easy.content_v2.param;

import java.io.Serializable;
import java.util.List;

public class SpecailParam implements Serializable {
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
	
	private Integer currentPage;
	
	private Integer pageSize;
	
	private Integer offset;
	/**排序的字段*/
	private String orderByString;
	/**0 为升序  1为降序  */
	private Integer orderByDesc;
	/**
	 * 位置id list
	 */
	private List<Integer> positionIds;
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
	/**
	 * @return the currentPage
	 */
	public Integer getCurrentPage() {
		return currentPage;
	}
	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	/**
	 * @return the pageSize
	 */
	public Integer getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * @return the offset
	 */
	public Integer getOffset() {
		offset = (this.currentPage -1) * this.pageSize;
		return offset;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	/**
	 * @return the orderByString
	 */
	public String getOrderByString() {
		return orderByString;
	}
	/**
	 * @param orderByString the orderByString to set
	 */
	public void setOrderByString(String orderByString) {
		this.orderByString = orderByString;
	}
	/**
	 * @return the orderByDesc
	 */
	public Integer getOrderByDesc() {
		return orderByDesc;
	}
	/**
	 * @param orderByDesc the orderByDesc to set
	 */
	public void setOrderByDesc(Integer orderByDesc) {
		this.orderByDesc = orderByDesc;
	}
	/**
	 * @return the positionIds
	 */
	public List<Integer> getPositionIds() {
		return positionIds;
	}
	/**
	 * @param positionIds the positionIds to set
	 */
	public void setPositionIds(List<Integer> positionIds) {
		this.positionIds = positionIds;
	}
}
