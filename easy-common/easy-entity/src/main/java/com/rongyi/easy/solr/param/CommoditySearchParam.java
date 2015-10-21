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
	
	/** 排序规则 */
	private String sortBy;
	
	/** 页 */
	private Integer currentPage;
	
	/** 一页数量 */
	private Integer pageSize;
	
	/** 坐标x */
	private String coord_x;
	
	/** 坐标y */
	private String coord_y;
	
	/** 买手id */
	private String bullId;
	
	/** 直播id */
	private String liveId;
	
	/** 商品类型 (直播：1 ，全部商品：0)*/
	private String commodityType;

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
	
	
	
	

}
