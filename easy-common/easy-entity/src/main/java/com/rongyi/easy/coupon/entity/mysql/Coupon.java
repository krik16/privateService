package com.rongyi.easy.coupon.entity.mysql;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Coupon {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 卡券名称
     */
    private String name;

    /**
     * 卡券类型:抵扣券[1], 代金券[2], 红包[3]
     */
    private Integer couponType;

    /**
     * 验证方式：容易后验证[0], 互动屏票据[1], 两者兼容[2]
     */
    private Integer validateType;

    /**
     * 券码发行量
     */
    private Integer totalCount;

    /**
     * 库存量
     */
    private Integer stockCount;

    /**
     * 原价
     */
    private Double originalPrice;

    /**
     * 现价
     */
    private Double currentPrice;

    /**
     * 折扣价,属于红包字段
     */
    private Double discount;

    /**
     * 大运营平台，平台代金券;
     * 展示区域：常规区域,活动区域;
     * 未选中：[0] 选中：[1] 例如： "1,1"表示都选中
     */
    private String displayRegion;

    /**
     * 大运营平台，平台代金券
     * 售后:随时退,过期退,免预约 ；
     * 未选中：[0] 选中：[1] 例如： "1,1,1"表示都选中
     */
    private String afterSaleService;

    /**
     * 发布开始时间
     */
    private Date publishStartTime;

    /**
     * 发布结束时间
     */
    private Date publishEndTime;

    /**
     * 有效期开始时间
     */
    private Date validBeginTime;

    /**
     * 有效期结束时间
     */
    private Date validEndTime;

    /**
     * 使用限制
     */
    private String useRestriction;

    /**
     * 使用说明
     */
    private String useDescription;

    /**
     * 推荐说明，属于红包字段
     */
    private String recommend;

    /**
     * 备注
     */
    private String marks;

    /**
     * 列表图url
     */
    private String listPicUrl;

    /**
     * 详情图url，多张图以";"隔开
     */
    private String detailPicUrl;

    /**
     * 关联类型
     * 代金券：集团[0], 品牌[1], 商场 [2], 店铺[3]
     * 红包 ：全场[0], 商品[1]
     */
    private Integer relatedType;

    /**
     * 每人限购数量
     */
    private Integer limitCount;

    /**
     * 每人每日限用张数
     */
    private Integer limitUseCount;

    /**
     * 每日最大发行张数
     */
    private Integer limitPublishCount;

    /**
     * 信息同步终端: 互动屏,微信,容易逛 ，例如 [1,1,1]表示三个都选中
     */
    private String synTarget;

    /**
     * 卡券发布渠道：大运营平台[0], 商家管理后台[1]
     */
    private Integer sourceTarget;

    /**
     * 状态: 待审核[0], 审核未通过[1], 审核通过[2]
     */
    private Integer status;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 更新时间
     */
    private Date updateAt;

    /**
     * 是否是第三方券 否[false], 是[true], 默认不是第三方券
     */
    private Boolean outStatus;

    /**
     * 是否已下架  否[false], 是[true], 默认没有下架
     */
    private Boolean offShelfStatus;

    /**
     * 是否可用：否[false], 是[true], 默认为true 可用
     */
    private Boolean enabled;

    /**
     * 店铺对应的公司名  属于商家管理平台字段
     */
    private String sourceName;




    /**
     * 代金券关联的品牌
     */
    private CouponBrand couponBrand = new CouponBrand();

    /**
     * 代金券关联的商场
     */
    private List<CouponMall> malls = new ArrayList<CouponMall>();

    /**
     * 代金券关联的店铺
     */
    private List<CouponShop> shops = new ArrayList<CouponShop>();

    /**
     * 代金券分类
     */
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

    public Date getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
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

    public Boolean getOffShelfStatus() {
		return offShelfStatus;
	}

	public void setOffShelfStatus(Boolean offShelfStatus) {
		this.offShelfStatus = offShelfStatus;
	}

	public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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
				.append(", validEndTime=").append(validEndTime)
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
				.append(", sourceName=").append(sourceName).append(", malls=")
				.append(malls).append(", shops=").append(shops).append("]");
		return builder.toString();
	}



}