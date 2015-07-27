package com.rongyi.easy.coupon.entity.mysql;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Coupon {
    private Integer id;

    private String name;

    private Integer couponType;

    private Integer validateType;

    private Integer totalCount;

    private Integer stockCount;

    private Double originalPrice;

    private Double currentPrice;

    private Double discount;

    private String displayRegion;

    private String afterSaleService;

    private Date publishStartTime;

    private Date publishEndTime;

    private Date validBeginTime;

    private Date validEndDate;

    private String useRestriction;

    private String useDescription;

    private String recommend;

    private String marks;

    private String listPicUrl;

    private String detailPicUrl;

    private Integer relatedType;

    private Integer limitCount;

    private Integer limitUseCount;

    private Integer limitPublishCount;

    private String synTarget;

    private Integer sourceTarget;

    private Integer status;

    private String createUser;

    private Date createAt;

    private String updateUser;

    private Date updateAt;

    private Boolean outStatus;

    private Boolean enabled;

    private Integer sortIndex;

    private String sourceName;


    private CouponBrand couponBrand = new CouponBrand();

    private List<CouponMall> malls = new ArrayList<CouponMall>();

    private List<CouponShop> shops = new ArrayList<CouponShop>();

    private CouponCategory couponCategory = new CouponCategory();





    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getValidateType() {
        return validateType;
    }

    public void setValidateType(Integer validateType) {
        this.validateType = validateType;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getDisplayRegion() {
        return displayRegion;
    }

    public void setDisplayRegion(String displayRegion) {
        this.displayRegion = displayRegion;
    }

    public String getAfterSaleService() {
        return afterSaleService;
    }

    public void setAfterSaleService(String afterSaleService) {
        this.afterSaleService = afterSaleService;
    }

    public Date getPublishStartTime() {
        return publishStartTime;
    }

    public void setPublishStartTime(Date publishStartTime) {
        this.publishStartTime = publishStartTime;
    }

    public Date getPublishEndTime() {
        return publishEndTime;
    }

    public void setPublishEndTime(Date publishEndTime) {
        this.publishEndTime = publishEndTime;
    }

    public Date getValidBeginTime() {
        return validBeginTime;
    }

    public void setValidBeginTime(Date validBeginTime) {
        this.validBeginTime = validBeginTime;
    }

    public Date getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(Date validEndDate) {
        this.validEndDate = validEndDate;
    }

    public String getUseRestriction() {
        return useRestriction;
    }

    public void setUseRestriction(String useRestriction) {
        this.useRestriction = useRestriction;
    }

    public String getUseDescription() {
        return useDescription;
    }

    public void setUseDescription(String useDescription) {
        this.useDescription = useDescription;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    public String getDetailPicUrl() {
        return detailPicUrl;
    }

    public void setDetailPicUrl(String detailPicUrl) {
        this.detailPicUrl = detailPicUrl;
    }

    public Integer getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(Integer relatedType) {
        this.relatedType = relatedType;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public Integer getLimitUseCount() {
        return limitUseCount;
    }

    public void setLimitUseCount(Integer limitUseCount) {
        this.limitUseCount = limitUseCount;
    }

    public Integer getLimitPublishCount() {
        return limitPublishCount;
    }

    public void setLimitPublishCount(Integer limitPublishCount) {
        this.limitPublishCount = limitPublishCount;
    }

    public String getSynTarget() {
        return synTarget;
    }

    public void setSynTarget(String synTarget) {
        this.synTarget = synTarget;
    }

    public Integer getSourceTarget() {
        return sourceTarget;
    }

    public void setSourceTarget(Integer sourceTarget) {
        this.sourceTarget = sourceTarget;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getOutStatus() {
        return outStatus;
    }

    public void setOutStatus(Boolean outStatus) {
        this.outStatus = outStatus;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }






	public CouponBrand getCouponBrand() {
		return couponBrand;
	}

	public void setCouponBrand(CouponBrand couponBrand) {
		this.couponBrand = couponBrand;
	}

	public List<CouponMall> getMalls() {
		return malls;
	}

	public void setMalls(List<CouponMall> malls) {
		this.malls = malls;
	}

	public List<CouponShop> getShops() {
		return shops;
	}

	public void setShops(List<CouponShop> shops) {
		this.shops = shops;
	}

	public CouponCategory getCouponCategory() {
		return couponCategory;
	}

	public void setCouponCategory(CouponCategory couponCategory) {
		this.couponCategory = couponCategory;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coupon [id=").append(id).append(", name=").append(name)
				.append(", couponType=").append(couponType)
				.append(", validateType=").append(validateType)
				.append(", totalCount=").append(totalCount)
				.append(", stockCount=").append(stockCount)
				.append(", originalPrice=").append(originalPrice)
				.append(", currentPrice=").append(currentPrice)
				.append(", discount=").append(discount)
				.append(", displayRegion=").append(displayRegion)
				.append(", afterSaleService=").append(afterSaleService)
				.append(", publishStartTime=").append(publishStartTime)
				.append(", publishEndTime=").append(publishEndTime)
				.append(", validBeginTime=").append(validBeginTime)
				.append(", validEndDate=").append(validEndDate)
				.append(", useRestriction=").append(useRestriction)
				.append(", useDescription=").append(useDescription)
				.append(", recommend=").append(recommend).append(", marks=")
				.append(marks).append(", listPicUrl=").append(listPicUrl)
				.append(", detailPicUrl=").append(detailPicUrl)
				.append(", relatedType=").append(relatedType)
				.append(", limitCount=").append(limitCount)
				.append(", limitUseCount=").append(limitUseCount)
				.append(", limitPublishCount=").append(limitPublishCount)
				.append(", synTarget=").append(synTarget)
				.append(", sourceTarget=").append(sourceTarget)
				.append(", status=").append(status).append(", createUser=")
				.append(createUser).append(", createAt=").append(createAt)
				.append(", updateUser=").append(updateUser)
				.append(", updateAt=").append(updateAt).append(", outStatus=")
				.append(outStatus).append(", enabled=").append(enabled)
				.append(", sortIndex=").append(sortIndex)
				.append(", sourceName=").append(sourceName).append(", malls=")
				.append(malls).append(", shops=").append(shops).append("]");
		return builder.toString();
	}



}