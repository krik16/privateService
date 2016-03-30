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

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/**
 * @author ZhengYl
 *
 */
/**
 * @author ZhengYl
 *
 */
public class CommoditySearchParam  extends MalllifeBaseParam implements Serializable {

	/**  */
	private static final long serialVersionUID = -3577116644255163015L;
	
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
	 * 0：按发布日期排序  1：按销量由高到低  2：按价格由低到高  3：按价格由高到低  4：按距离由近到远  5：按销量由低到高
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
	
	/** 商品类型 (买手 1， 全部商品 0, 特卖场 2, 闪购 3，导购商品 4)*/
	private String commodityType;

	/**
	 * 商品spu
	 */
	private String systemNumber;

	private Integer from = 0; // 从0开始 偏移量，商品聚合分页使用
	
	private String source;//  端来源    1 微信   2 终端屏 3 其他

	private String zoneId;

	private String commodityCode;

	private List<String> keywordList = new ArrayList<>();

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

	public String getLiveId() {
		return liveId;
	}

	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public Integer getFlashSaleId() {
		return flashSaleId;
	}

	public void setFlashSaleId(Integer flashSaleId) {
		this.flashSaleId = flashSaleId;
	}

	public String getSystemNumber() {
		return systemNumber;
	}

	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
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

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	@Override
	public String toString() {
		return "CommoditySearchParam [keyword=" + keyword + ", shopId="
				+ shopId + ", brandId=" + brandId + ", mallId=" + mallId
				+ ", commodityCategory=" + commodityCategory + ", sortBy="
				+ sortBy + ", coord_x=" + coord_x + ", coord_y=" + coord_y
				+ ", bullId=" + bullId + ", liveId=" + liveId + ", saleId="
				+ saleId + ", flashSaleId=" + flashSaleId + ", commodityType="
				+ commodityType + ", systemNumber=" + systemNumber + ", from="
				+ from + ", source=" + source + "]";
		return "CommoditySearchParam [keyword=" + keyword + ", shopId=" + shopId + ", brandId=" + brandId + ", mallId="
				+ mallId + ", commodityCategory=" + commodityCategory + ", sortBy=" + sortBy + ", coord_x=" + coord_x
				+ ", coord_y=" + coord_y + ", bullId=" + bullId + ", liveId=" + liveId + ", saleId=" + saleId
				+ ", flashSaleId=" + flashSaleId + ", commodityType=" + commodityType + ", systemNumber=" + systemNumber
				+ ", from=" + from + ", zoneId=" + zoneId + ", commodityCode=" + commodityCode + ", keywordList="
				+ keywordList + "]";
	}
	
}
