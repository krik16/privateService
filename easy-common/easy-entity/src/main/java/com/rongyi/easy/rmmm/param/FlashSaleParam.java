package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.base.param.BaseParam;
import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/**
 * 闪购获取卖场参数
 * 
 * @author zzq
 * 
 */
public class FlashSaleParam extends MalllifeBaseParam implements Serializable{
	/**
	 * 賣場id 或者 閃購id
	 */
	private String id;

	/**
	 * 关键字
	 */
	private String keywork;
	/**
	 * 城市id
	 */
	private String cityId;
	/**
	 * 城市名称
	 */
	private String cityName;
	/**
	 * 当前页数
	 */
	private Integer currentPage = 1;
	/**
	 * 每页条数
	 */
	private Integer pageSize = 20;
	/**
	 * 排序  0：按发布日期排序  1：按销量由高到低2：按价格由低到高3：按价格由高到低4：按距离由近到远5：按折扣由高到低6：按折扣由低到高
	 */
	private String sortBy;
	/**
	 * x坐标
	 */
	private String longitude;
	/**
	 * y坐标
	 */
	private String latitude;
	/**
	 * 品牌id
	 */
	private String brandId;
	/**
	 * 類別id
	 */
	private String commodityCategory;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSortBy() {
		return sortBy;
	}
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getCommodityCategory() {
		return commodityCategory;
	}
	public void setCommodityCategory(String commodityCategory) {
		this.commodityCategory = commodityCategory;
	}
	public String getKeywork() {
		return keywork;
	}
	public void setKeywork(String keywork) {
		this.keywork = keywork;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
 
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "FlashSaleParam [id=" + id + ", keywork=" + keywork
				+ ", cityId=" + cityId + ", cityName=" + cityName
				+ ", currentPage=" + currentPage + ", pageSize=" + pageSize
				+ ", sortBy=" + sortBy + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", brandId=" + brandId
				+ ", commodityCategory=" + commodityCategory + "]";
	}
	

}
