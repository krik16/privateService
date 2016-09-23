/**
* @Title: CommoditySearchParam.java
* @Package com.rongyi.easy.solr.param
* @Description: 商品检索请求参数
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年9月10日 下午2:19:16
* @version V1.0
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.solr.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rongyi.core.annotation.NeedCheck;
import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/**
 * 商品查询参数类
 *
 * @author  zhengyi, yaoyiwei
 * @date 2016-05-09
 * @version 1.1
 */
public class CommoditySearchParam  extends MalllifeBaseParam implements Serializable {

	private static final long serialVersionUID = -3577116644255163015L;

	private String id;

	private List<String> brandMids;

	/** 关键词 */
	private String keyword;

	/** 店铺Id ObjectId or SQLId */
	private String shopId;

	/** 品牌Id ObjectId or SQLId */
	private String brandId;

	/** 商场Id  ObjectId or SQLId */
	private String mallId;

	/** 商品类别 */
	private String commodityCategory;

	/** 排序规则
	 * 0：按发布日期排序  1：按销量由高到低  2：按价格由低到高  3：按价格由高到低  4：按距离由近到远  5：按销量由低到高 6:折扣由低到高  7：折扣由高到低  8:橱窗推荐商品
	 * */
	private String sortBy;

	/** 坐标x */
	private String coord_x;

	/** 坐标y */
	private String coord_y;

	/** 买手id */
	private String bullId;

	/** 直播id */
	private String liveId;

	private Integer saleId; // 特卖ID

	private Integer flashSaleId; // 闪购ID

	/** 商品类型 (买手 1， 全部商品 0, 特卖场 2, 闪购 3，导购商品 4)*/   //old
	// 商品类型1：所有商品 2：导购商品 3：买手商品 4：闪购 5：卖场  6,直播     new
	private String commodityType;

	private String filterMethodName;

	private String sortMethodName;

	/**
	 * 商品spu
	 */
	private String systemNumber;

	private Integer from; // 从0开始 偏移量，商品聚合分页使用

	private String source;//  端来源    1 微信   2 终端屏 3 其他

	private String minPrice;	// 最小价格范围

	private String maxPrice;	// 最大价格范围

	private String zoneId;

	private String commodityCode;

	private List<String> keywordList = new ArrayList<>();

	private List<String> shopList;//店铺id集合
	private List<String> categoryList;//分类id集合
	private String couponId;//红包券id

	private List<Integer> saleIds;

	private Map commodityMaxMinValues;  // 商品最大最小销量和更新时间

	private Integer galleryPosition;//橱窗位置


	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public List<String> getShopList() {
		return shopList;
	}

	public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}

	public List<String> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<String> categoryList) {
		this.categoryList = categoryList;
	}

	public List<String> getKeywordList() {
		return keywordList;
	}

	public void setKeywordList(List<String> keywordList) {
		this.keywordList = keywordList;
	}

	public void addKeywordList(String keyword) {
		this.keywordList.add(keyword);
	}

	public Integer getFrom() {
		return from;
	}

	public void setFrom(Integer from) {
		this.from = from;
	}

	public String getCommodityType() {
		return commodityType;
	}

	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
	}

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
	 * @return the shopId
	 */
	public String getShopId() {
		return shopId;
	}

	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * @return the brandId
	 */
	public String getBrandId() {
		return brandId;
	}

	/**
	 * @param brandId the brandId to set
	 */
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	/**
	 * @return the mallId
	 */
	public String getMallId() {
		return mallId;
	}

	/**
	 * @param mallId the mallId to set
	 */
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	/**
	 * @return the commodityCategory
	 */
	public String getCommodityCategory() {
		return commodityCategory;
	}

	/**
	 * @param commodityCategory the commodityCategory to set
	 */
	public void setCommodityCategory(String commodityCategory) {
		this.commodityCategory = commodityCategory;
	}

	/**
	 * @return the sortBy
	 */
	public String getSortBy() {
		return sortBy;
	}

	/**
	 * @param sortBy the sortBy to set
	 */
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	/**
	 * @return the coord_x
	 */
	public String getCoord_x() {
		return coord_x;
	}

	/**
	 * @param coord_x the coord_x to set
	 */
	public void setCoord_x(String coord_x) {
		this.coord_x = coord_x;
	}

	/**
	 * @return the coord_y
	 */
	public String getCoord_y() {
		return coord_y;
	}

	/**
	 * @param coord_y the coord_y to set
	 */
	public void setCoord_y(String coord_y) {
		this.coord_y = coord_y;
	}

	public String getBullId() {
		return bullId;
	}

	public void setBullId(String bullId) {
		this.bullId = bullId;
	}

	@NeedCheck(getFieldName = "liveId")
	public String getLiveId() {
		return liveId;
	}

	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

	@NeedCheck(getFieldName = "saleId")
	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	@NeedCheck(getFieldName = "flashSaleId")
	public Integer getFlashSaleId() {
		return flashSaleId;
	}

	public void setFlashSaleId(Integer flashSaleId) {
		this.flashSaleId = flashSaleId;
	}

	@NeedCheck(getFieldName = "systemNumber")
	public String getSystemNumber() {
		return systemNumber;
	}


	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	@NeedCheck(getFieldName = "commodityCode")
	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
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

	@NeedCheck(getFieldName = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getBrandMids() {
		return brandMids;
	}

	public void setBrandMids(List<String> brandMids) {
		this.brandMids = brandMids;
	}

	public String getFilterMethodName() {
		return filterMethodName;
	}

	public void setFilterMethodName(String filterMethodName) {
		this.filterMethodName = filterMethodName;
	}

	public String getSortMethodName() {
		return sortMethodName;
	}

	public void setSortMethodName(String sortMethodName) {
		this.sortMethodName = sortMethodName;
	}

	public Map getCommodityMaxMinValues() {
		return commodityMaxMinValues;
	}

	public void setCommodityMaxMinValues(Map commodityMaxMinValues) {
		this.commodityMaxMinValues = commodityMaxMinValues;
	}

	public List<Integer> getSaleIds() {
		return saleIds;
	}

	public void setSaleIds(List<Integer> saleIds) {
		this.saleIds = saleIds;
	}

	@NeedCheck(getFieldName = "galleryPosition")
	public Integer getGalleryPosition() {
		return galleryPosition;
	}

	public void setGalleryPosition(Integer galleryPosition) {
		this.galleryPosition = galleryPosition;
	}

	@Override
	public String toString() {
		return "CommoditySearchParam{" +
				"brandId='" + brandId + '\'' +
				", id='" + id + '\'' +
				", brandMids=" + brandMids +
				", keyword='" + keyword + '\'' +
				", shopId='" + shopId + '\'' +
				", mallId='" + mallId + '\'' +
				", commodityCategory='" + commodityCategory + '\'' +
				", sortBy='" + sortBy + '\'' +
				", coord_x='" + coord_x + '\'' +
				", coord_y='" + coord_y + '\'' +
				", bullId='" + bullId + '\'' +
				", liveId='" + liveId + '\'' +
				", saleId=" + saleId +
				", flashSaleId=" + flashSaleId +
				", commodityType='" + commodityType + '\'' +
				", filterMethodName='" + filterMethodName + '\'' +
				", sortMethodName='" + sortMethodName + '\'' +
				", systemNumber='" + systemNumber + '\'' +
				", from=" + from +
				", source='" + source + '\'' +
				", minPrice='" + minPrice + '\'' +
				", maxPrice='" + maxPrice + '\'' +
				", zoneId='" + zoneId + '\'' +
				", commodityCode='" + commodityCode + '\'' +
				", keywordList=" + keywordList +
				", shopList=" + shopList +
				", categoryList=" + categoryList +
				", couponId='" + couponId + '\'' +
				", commodityMaxMinValues=" + commodityMaxMinValues +
				", galleryPosition=" + galleryPosition +
				"} " + super.toString();
	}

}
