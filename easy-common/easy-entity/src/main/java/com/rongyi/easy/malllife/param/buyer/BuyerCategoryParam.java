package com.rongyi.easy.malllife.param.buyer;

import java.io.Serializable;
import java.util.List;

public class BuyerCategoryParam implements Serializable {
	private static final long serialVersionUID = -7251657383525434319L;

	private Integer filterType;		// 类型1：店铺 2：品牌
	private String filterId;		// 店铺ID或者品牌ID
	private boolean showParent;		// 是否显示父级
	private String bullId;			// 买手ID
	private String liveId;			// 直播ID
	private String commodityType;	// 商品类型1：所有商品 2：导购商品 3：买手商品 4：闪购 5：卖场  6,直播
	private String keyword;			// 关键字
	private String categoryId;		// 分类ID
	private String brandId;			// 品牌ID
	private String cityName;		// 城市名称
	private String mallId;			// 商场ID
	private String shopId;			// 店铺ID
	private String saleId;			// 闪购ID
	private String flashSaleId;		// 特卖ID
	private String minPrice;		// 价格最小范围
	private String maxPrice;		// 价格最大范围
	private List<String> brandIds;  //品牌id集合
	private List<String> mallIds;   //商场id集合
	private List<String> shopIds;   //店铺id集合
	private List<String> categoryIds;//分类id集合

	public BuyerCategoryParam() {
//		this.filterType = 0;
//		this.filterId = "";
//		this.showParent = true;
	}

	public BuyerCategoryParam(Integer filterType, String filterId, boolean showParent, String bullId, String liveId,
			String commodityType, String keyword, String categoryId, String brandId, String cityName, String mallId,
			String shopId, String saleId, String flashSaleId, String minPrice, String maxPrice,List<String> brandIds,
			List<String> mallIds,List<String> shopIds,List<String> categoryIds) {
		this.filterType = filterType;
		this.filterId = filterId;
		this.showParent = showParent;
		this.bullId = bullId;
		this.liveId = liveId;
		this.commodityType = commodityType;
		this.keyword = keyword;
		this.categoryId = categoryId;
		this.brandId = brandId;
		this.cityName = cityName;
		this.mallId = mallId;
		this.shopId = shopId;
		this.saleId = saleId;
		this.flashSaleId = flashSaleId;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.brandIds = brandIds;
		this.mallIds = mallIds;
		this.shopIds = shopIds;
		this.categoryIds = categoryIds;
	}
	public List<String> getBrandIds() {
		return brandIds;
	}

	public void setBrandIds(List<String> brandIds) {
		this.brandIds = brandIds;
	}

	public List<String> getMallIds() {
		return mallIds;
	}

	public void setMallIds(List<String> mallIds) {
		this.mallIds = mallIds;
	}

	public List<String> getShopIds() {
		return shopIds;
	}

	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public List<String> getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(List<String> categoryIds) {
		this.categoryIds = categoryIds;
	}

	public Integer getFilterType() {
		return filterType;
	}
	public void setFilterType(Integer filterType) {
		this.filterType = filterType;
	}
	public String getFilterId() {
		return filterId;
	}
	public void setFilterId(String filterId) {
		this.filterId = filterId;
	}
	public boolean isShowParent() {
		return showParent;
	}
	public void setShowParent(boolean showParent) {
		this.showParent = showParent;
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
	public String getCommodityType() {
		return commodityType;
	}
	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getSaleId() {
		return saleId;
	}
	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}
	public String getFlashSaleId() {
		return flashSaleId;
	}
	public void setFlashSaleId(String flashSaleId) {
		this.flashSaleId = flashSaleId;
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
		return "BuyerCategoryParam [filterType=" + filterType + ", filterId="
				+ filterId + ", showParent=" + showParent + ", bullId="
				+ bullId + ", liveId=" + liveId + ", commodityType="
				+ commodityType + ", keyword=" + keyword + ", categoryId="
				+ categoryId + ", brandId=" + brandId + ", cityName="
				+ cityName + ", mallId=" + mallId + ", shopId=" + shopId
				+ ", saleId=" + saleId + ", flashSaleId=" + flashSaleId
				+ ", minPrice=" + minPrice + ", maxPrice=" + maxPrice
				+ ", brandIds=" + brandIds + ", mallIds=" + mallIds
				+ ", shopIds=" + shopIds + ", categoryIds=" + categoryIds + "]";
	}
}
