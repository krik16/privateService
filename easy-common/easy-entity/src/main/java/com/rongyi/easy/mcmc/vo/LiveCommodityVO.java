package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 直播VO中的商品VO
 * 
 * @author xiaobo
 *
 */
public class LiveCommodityVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 商品id
	 */
	private String commodityId;
	
	/**
	 * 商品图片
	 */
	private String commodityPic;

	public List<String> commodityPicList; //图片列表
	public String isSpot; //是否现货 0否 1是
	public String commodityName; //商品名称
	public String commodityCurrentPrice;//商品现价
	public String commoditySold;//商品销量
	public String commodityStock;//商品库存
	public String commodityPubDate;//商品发布日期
	private long pubDateForSort;

	private Integer sort;

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getCommodityPic() {
		return commodityPic;
	}

	public void setCommodityPic(String commodityPic) {
		this.commodityPic = commodityPic;
	}

	public List<String> getCommodityPicList() {
		return commodityPicList;
	}

	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}

	public String getIsSpot() {
		return isSpot;
	}

	public void setIsSpot(String isSpot) {
		this.isSpot = isSpot;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getCommodityCurrentPrice() {
		return commodityCurrentPrice;
	}

	public void setCommodityCurrentPrice(String commodityCurrentPrice) {
		this.commodityCurrentPrice = commodityCurrentPrice;
	}

	public String getCommoditySold() {
		return commoditySold;
	}

	public void setCommoditySold(String commoditySold) {
		this.commoditySold = commoditySold;
	}

	public String getCommodityStock() {
		return commodityStock;
	}

	public void setCommodityStock(String commodityStock) {
		this.commodityStock = commodityStock;
	}

	public String getCommodityPubDate() {
		return commodityPubDate;
	}

	public void setCommodityPubDate(String commodityPubDate) {
		this.commodityPubDate = commodityPubDate;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public long getPubDateForSort() {
		return pubDateForSort;
	}

	public void setPubDateForSort(long pubDateForSort) {
		this.pubDateForSort = pubDateForSort;
	}
}
