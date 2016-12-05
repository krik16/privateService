package com.rongyi.easy.malllife.vo.h5;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.malllife.vo.CommentsVO;
import com.rongyi.easy.notice.vo.MMNoticeVO;

/**
 * 店铺分享详情
 * @author user
 *
 */
public class ShopDetailVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String shopId;//店铺id
	private String shopName;//店铺名
	private String address;//店铺地址
	private Integer sameCityShopNum; //同城同类型商铺数量
	private String transportInfo;//交通信息
	private String shopLogo;//店铺logo
	private List<String> locationPic; //商铺底图
	private String businessHours; // 营业时间
	private String mallId; // 店铺所在商场ID
	private String floorId; // 店铺所在楼层ID
	private String floorName; //店铺所在楼层名称
	private String rankAvg;//评分
	private String mallName;//店铺所在商场名称
	private String description;//店铺简介
	private String brandId;//品牌id
	private String brandName;//品牌名称
	private Integer collectionNum; //收藏数
    private String avgCost;//平均消费
    private String cityId;//城市ID
	private String cityName;//城市名称
	private List<String> categoryIds;//
	private String parking;//停车场信息
	private String telephone; //电话号码
	private List<CouponVO> coupons;//优惠信息
	private List<CommodityShareVO> commodityList;//商品列表
	private List<CommodityShareVO> galleryCommodityList;//橱窗商品列表
	private Integer commodityCount;//
	private List<MayLikeShopVO> mayLikeShops;//可能喜欢的店铺列表
	private MMNoticeVO noticeVo;//店铺公告
	private List<CommentsVO> commentList;//评论列表
	private Integer commentCount;//评论数量
	private boolean hasWonderFulAct; //精彩活动
    private boolean hasDiscountAct; //优惠资讯
    private boolean hasRaiders;//潮人攻略
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getSameCityShopNum() {
		return sameCityShopNum;
	}
	public void setSameCityShopNum(Integer sameCityShopNum) {
		this.sameCityShopNum = sameCityShopNum;
	}
	public String getTransportInfo() {
		return transportInfo;
	}
	public void setTransportInfo(String transportInfo) {
		this.transportInfo = transportInfo;
	}
	public String getShopLogo() {
		return shopLogo;
	}
	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}
	public List<String> getLocationPic() {
		return locationPic;
	}
	public void setLocationPic(List<String> locationPic) {
		this.locationPic = locationPic;
	}
	public String getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getFloorId() {
		return floorId;
	}
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}
	public String getFloorName() {
		return floorName;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	public String getRankAvg() {
		return rankAvg;
	}
	public void setRankAvg(String rankAvg) {
		this.rankAvg = rankAvg;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Integer getCollectionNum() {
		return collectionNum;
	}
	public void setCollectionNum(Integer collectionNum) {
		this.collectionNum = collectionNum;
	}
	public String getAvgCost() {
		return avgCost;
	}
	public void setAvgCost(String avgCost) {
		this.avgCost = avgCost;
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
	public List<String> getCategoryIds() {
		return categoryIds;
	}
	public void setCategoryIds(List<String> categoryIds) {
		this.categoryIds = categoryIds;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public List<CouponVO> getCoupons() {
		return coupons;
	}
	public void setCoupons(List<CouponVO> coupons) {
		this.coupons = coupons;
	}
	public List<CommodityShareVO> getCommodityList() {
		return commodityList;
	}
	public void setCommodityList(List<CommodityShareVO> commodityList) {
		this.commodityList = commodityList;
	}
	public List<CommodityShareVO> getGalleryCommodityList() {
		return galleryCommodityList;
	}
	public void setGalleryCommodityList(List<CommodityShareVO> galleryCommodityList) {
		this.galleryCommodityList = galleryCommodityList;
	}
	public List<MayLikeShopVO> getMayLikeShops() {
		return mayLikeShops;
	}
	public void setMayLikeShops(List<MayLikeShopVO> mayLikeShops) {
		this.mayLikeShops = mayLikeShops;
	}
	public MMNoticeVO getNoticeVo() {
		return noticeVo;
	}
	public void setNoticeVo(MMNoticeVO noticeVo) {
		this.noticeVo = noticeVo;
	}
	public List<CommentsVO> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<CommentsVO> commentList) {
		this.commentList = commentList;
	}
	public boolean isHasWonderFulAct() {
		return hasWonderFulAct;
	}
	public void setHasWonderFulAct(boolean hasWonderFulAct) {
		this.hasWonderFulAct = hasWonderFulAct;
	}
	public boolean isHasDiscountAct() {
		return hasDiscountAct;
	}
	public void setHasDiscountAct(boolean hasDiscountAct) {
		this.hasDiscountAct = hasDiscountAct;
	}
	public boolean isHasRaiders() {
		return hasRaiders;
	}
	public void setHasRaiders(boolean hasRaiders) {
		this.hasRaiders = hasRaiders;
	}
	public Integer getCommodityCount() {
		return commodityCount;
	}
	public void setCommodityCount(Integer commodityCount) {
		this.commodityCount = commodityCount;
	}
	public Integer getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	@Override
	public String toString() {
		return "ShopDetailVO [shopId=" + shopId + ", shopName=" + shopName
				+ ", address=" + address + ", sameCityShopNum="
				+ sameCityShopNum + ", transportInfo=" + transportInfo
				+ ", shopLogo=" + shopLogo + ", locationPic=" + locationPic
				+ ", businessHours=" + businessHours + ", mallId=" + mallId
				+ ", floorId=" + floorId + ", floorName=" + floorName
				+ ", rankAvg=" + rankAvg + ", mallName=" + mallName
				+ ", description=" + description + ", brandId=" + brandId
				+ ", brandName=" + brandName + ", collectionNum="
				+ collectionNum + ", avgCost=" + avgCost + ", cityId=" + cityId
				+ ", cityName=" + cityName + ", categoryIds=" + categoryIds
				+ ", parking=" + parking + ", telephone=" + telephone
				+ ", coupons=" + coupons + ", commodityList=" + commodityList + ", galleryCommodityList=" + galleryCommodityList
				+ ", commodityCount=" + commodityCount + ", mayLikeShops="
				+ mayLikeShops + ", noticeVo=" + noticeVo + ", commentList="
				+ commentList + ", commentCount=" + commentCount
				+ ", hasWonderFulAct=" + hasWonderFulAct + ", hasDiscountAct="
				+ hasDiscountAct + ", hasRaiders=" + hasRaiders + "]";
	}
	
}
