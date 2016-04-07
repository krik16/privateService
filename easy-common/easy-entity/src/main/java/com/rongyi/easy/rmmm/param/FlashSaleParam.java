package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.base.param.BaseParam;
import com.rongyi.easy.malllife.param.MalllifeBaseParam;
import org.apache.commons.lang.builder.ToStringBuilder;

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
	 * 最低价格
	 */
	private String minPrice;
	/**
	 * 最高价格
	 */
	private String maxPrice;
	/**
	 * 品牌id
	 */
	private String brandId;
	/**
	 * 類別id
	 */
	private String commodityCategory;

	/**
	 * 给前端的随机数
	 */
	private Integer randomParam;
	/**
	 * 内容id
	 */
	private Integer contentId;

	
	
	public Integer getContentId() {
		return contentId;
	}
	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
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

	public Integer getRandomParam() {
		return randomParam;
	}

	public void setRandomParam(Integer randomParam) {
		this.randomParam = randomParam;
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

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	@Override
	public String toString() {
		return "FlashSaleParam{" +
				"id='" + id + '\'' +
				", keywork='" + keywork + '\'' +
				", cityId='" + cityId + '\'' +
				", cityName='" + cityName + '\'' +
				", sortBy='" + sortBy + '\'' +
				", longitude='" + longitude + '\'' +
				", latitude='" + latitude + '\'' +
				", minPrice='" + minPrice + '\'' +
				", maxPrice='" + maxPrice + '\'' +
				", brandId='" + brandId + '\'' +
				", commodityCategory='" + commodityCategory + '\'' +
				", randomParam=" + randomParam +
				", contentId=" + contentId +
				"} " + super.toString();
	}
}
