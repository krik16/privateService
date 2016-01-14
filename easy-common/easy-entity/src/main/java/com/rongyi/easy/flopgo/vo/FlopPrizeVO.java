package com.rongyi.easy.flopgo.vo;

import java.io.Serializable;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.vo.CouponVO;


/**
 * 翻牌购活动对应的奖品信息VO
 * @author user
 *
 */
public class FlopPrizeVO implements Serializable{

	private static final long serialVersionUID = -2482835233592807478L;
	private String id;//券id

	private String title;//优惠券名称
	private Integer totalCount;//总量
	private Integer buyedCount;//已买数量
	private Integer restCount;//剩余数量
	private Double nowPrice;//现价
	private Double originalPrice;//原价
	private Double discount;// 折扣价
	private Date updateDate;// 修改时间
	private Date createDate;// 创建时间
	private String useRestriction;//使用限制
	private String useDescription;// 使用说明
	private Date validBeginDate;// 有效期开始时间
	private Date validEndDate;//有效期结束时间
	private Date publicStart;//发布开始时间
	private Date publicEnd;//发布结束时间
	private String checkStatus;//审核状态 0：待审核 1：未通过 2：已通过
	private String isRebate;//0代表不是抵扣券 1代表是抵扣券
	private String activityStatus;
	public String getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	private String ticketType;//券类型 02：优惠券 03：现金券 04：抵扣券
	private String listPicUrl;// 列表图url
	private String recommend;// 推荐说明
	private List<String> detailPicUrls;// 详情图url
	private List<CouponVO.CouponProduct> products = new ArrayList<CouponVO.CouponProduct>(); // 现金劵关联商品
	private Integer cardSurfaceIsShow;//牌面是否显示  0表示不显示 1表示显示

	public List<CouponVO.CouponProduct> getProducts() {
		return products;
	}

	public void setProducts(List<CouponVO.CouponProduct> products) {
		this.products = products;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public FlopPrizeVO(){

	}

//	public FlopPrizeVO(CouponEntity couponEntity){
//		this.id=couponEntity.getId();
//		this.title=couponEntity.getTitle();
//		this.totalCount=couponEntity.getTotalCount();
//		this.buyedCount=couponEntity.getBuyedCount();
//		this.restCount=couponEntity.getRestCount();
//		this.checkStatus=couponEntity.getCheckStatus();
//		this.ticketType=couponEntity.getTicketType();
//
//	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public FlopPrizeVO(CouponVO coupon){
		if(coupon!=null){
			this.id=coupon.getId().toString();
			this.title=coupon.getTitle();
			this.totalCount=coupon.getTotalCount();
			this.buyedCount=coupon.getReceiveCount();
			if(coupon.getReceiveCount()==null){
				this.restCount=coupon.getTotalCount();//这个是计算库存
			}else{
				this.restCount=coupon.getTotalCount()-coupon.getReceiveCount();//计算库存
			}
			this.activityStatus=coupon.getActivityStatus();
			this.nowPrice=coupon.getCurrentPrice();
			this.originalPrice=coupon.getOriginalPrice();
			this.discount=coupon.getDiscount();
			this.recommend=coupon.getRecommend();
			this.updateDate=coupon.getUpdateDate();
			this.createDate=coupon.getCreateDate();
			this.useRestriction=coupon.getUseRestriction();
			this.useDescription=coupon.getUseDescription();//优惠卷使用说明
			this.validBeginDate=coupon.getValidBeginDate();
			this.validEndDate=coupon.getValidEndDate();
			this.publicStart=coupon.getPublishBeginDate();
			this.publicEnd=coupon.getPublishEndDate();
			this.checkStatus=coupon.getCheckStatus();
			this.ticketType=coupon.getCouponType();
			this.listPicUrl=coupon.getListPicUrl();
			this.detailPicUrls=coupon.getDetailPicUrls();
			this.products=coupon.getProducts();

		}
	}

	public String getUseDescription() {
		return useDescription;
	}

	public void setUseDescription(String useDescription) {
		this.useDescription = useDescription;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getBuyedCount() {
		return buyedCount;
	}
	public void setBuyedCount(Integer buyedCount) {
		this.buyedCount = buyedCount;
	}
	public Integer getRestCount() {
		return restCount;
	}
	public void setRestCount(Integer restCount) {
		this.restCount = restCount;
	}
	public Double getNowPrice() {
		return nowPrice;
	}
	public void setNowPrice(Double nowPrice) {
		this.nowPrice = nowPrice;
	}

	public Double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUseRestriction() {
		return useRestriction;
	}

	public void setUseRestriction(String useRestriction) {
		this.useRestriction = useRestriction;
	}

	public Date getValidBeginDate() {
		return validBeginDate;
	}

	public void setValidBeginDate(Date validBeginDate) {
		this.validBeginDate = validBeginDate;
	}

	public Date getValidEndDate() {
		return validEndDate;
	}

	public void setValidEndDate(Date validEndDate) {
		this.validEndDate = validEndDate;
	}

	public Date getPublicStart() {
		return publicStart;
	}

	public void setPublicStart(Date publicStart) {
		this.publicStart = publicStart;
	}

	public Date getPublicEnd() {
		return publicEnd;
	}

	public void setPublicEnd(Date publicEnd) {
		this.publicEnd = publicEnd;
	}

	public String getListPicUrl() {
		return listPicUrl;
	}

	public void setListPicUrl(String listPicUrl) {
		this.listPicUrl = listPicUrl;
	}

	public List<String> getDetailPicUrls() {
		return detailPicUrls;
	}

	public void setDetailPicUrls(List<String> detailPicUrls) {
		this.detailPicUrls = detailPicUrls;
	}

	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public Integer getCardSurfaceIsShow() {
		return cardSurfaceIsShow;
	}
	public void setCardSurfaceIsShow(Integer cardSurfaceIsShow) {
		this.cardSurfaceIsShow = cardSurfaceIsShow;
	}

	public String getIsRebate() {
		return isRebate;
	}

	public void setIsRebate(String isRebate) {
		this.isRebate = isRebate;
	}
}