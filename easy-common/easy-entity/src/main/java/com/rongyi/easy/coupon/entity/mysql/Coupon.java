package com.rongyi.easy.coupon.entity.mysql;

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
     * 卡券类型:抵扣券[rebate], 代金券[voucher], 红包[redenvelope]
     */
    private String couponType;

    /**
     * 验证方式：容易后验证[after_check], 互动屏票据[interact_check], 两者兼容[all]
     */
    private String validateType;

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
    private Double origPrice;

    /**
     * 现价
     */
    private Double currPrice;

    /**
     * 折扣价,属于红包字段
     */
    private Double discount;

    /**
     * 大运营平台，平台代金券;展示区域：常规区域,活动区域;未选中[0]，选中[1] 例如 "1,1"表示都选中
     */
    private String displayRegion;

    /**
     * 大运营平台，平台代金券 售后:随时退,过期退,免预约 ；未选中[0]，选中[1] 例如 "1,1,1"表示都选中
     */
    private String afterSaleService;

    /**
     * 发布开始时间
     */
    private Date publishStartAt;

    /**
     * 发布结束时间
     */
    private Date publishEndAt;

    /**
     * 有效期开始时间
     */
    private Date enableStartAt;

    /**
     * 有效期结束时间
     */
    private Date enableEndAt;

    /**
     * 使用限制
     */
    private String limitDesc;

    /**
     * 使用说明
     */
    private String usageDesc;

    /**
     * 推荐说明，属于红包字段
     */
    private String recommend;

    /**
     * 备注
     */
    private String remark;

    /**
     * 列表图url,只有一张
     */
    private String listPicUrl;

    /**
     * 详情图url，多张图以";"隔开
     */
    private String detailPicUrl;

    /**
     * 关联类型
     * 代金券：集团[group],品牌[brand], 商场 [mall],店铺[shop];
     * 红包 ：全场[all_court],商品[commodity]
     */
    private String relatedType;

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
     * 信息同步终端: 互动屏,微信,容易逛 [1,1,1]表示三个都没选中
     */
    private String synTarget;

    /**
     * 卡券发布渠道：大运营平台[operation], 商家管理后台[merchant]
     */
    private String publishChannel;

    /**
     * 状态: 待审核[uncheck], 审核未通过[unpass], 审核通过[pass]
     */
    private String status;

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
     * 是否是第三方券 否[false], 是[true], 默认不是第三方券fasle
     */
    private Boolean is3rd;

    /**
     * 是否已下架 初始状态[false]，已下架[true]
     */
    private Boolean isOffStock;

    /**
     * 是否删除：否[false], 是[true], 默认为false未删除
     */
    private Boolean isDeleted;

    /**
     * 店铺对应的公司名
     */
    private String sourceName;


    /**
     * 代金券分类
     */
    private CouponCategory couponCategory;

    /**
     * 代金券关联的集团
     */
    private CouponGroup couponGroup;

    /**
     * 代金券关联的品牌
     */
    private CouponBrand couponBrand;

    /**
     * 代金券关联的商场
     */
    private CouponMall mall;

    /**
     * 代金券关联的店铺
     */
    private List<CouponShop> shops;


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

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getValidateType() {
        return validateType;
    }

    public void setValidateType(String validateType) {
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

    public Double getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Double origPrice) {
        this.origPrice = origPrice;
    }

    public Double getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(Double currPrice) {
        this.currPrice = currPrice;
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

    public Date getPublishStartAt() {
        return publishStartAt;
    }

    public void setPublishStartAt(Date publishStartAt) {
        this.publishStartAt = publishStartAt;
    }

    public Date getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(Date publishEndAt) {
        this.publishEndAt = publishEndAt;
    }

    public Date getEnableStartAt() {
        return enableStartAt;
    }

    public void setEnableStartAt(Date enableStartAt) {
        this.enableStartAt = enableStartAt;
    }

    public Date getEnableEndAt() {
        return enableEndAt;
    }

    public void setEnableEndAt(Date enableEndAt) {
        this.enableEndAt = enableEndAt;
    }

    public String getLimitDesc() {
        return limitDesc;
    }

    public void setLimitDesc(String limitDesc) {
        this.limitDesc = limitDesc;
    }

    public String getUsageDesc() {
        return usageDesc;
    }

    public void setUsageDesc(String usageDesc) {
        this.usageDesc = usageDesc;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(String relatedType) {
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

    public String getPublishChannel() {
        return publishChannel;
    }

    public void setPublishChannel(String publishChannel) {
        this.publishChannel = publishChannel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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


    public Boolean getIs3rd() {
		return is3rd;
	}

	public void setIs3rd(Boolean is3rd) {
		this.is3rd = is3rd;
	}

	public Boolean getIsOffStock() {
		return isOffStock;
	}

	public void setIsOffStock(Boolean isOffStock) {
		this.isOffStock = isOffStock;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

	public CouponCategory getCouponCategory() {
		return couponCategory;
	}

	public void setCouponCategory(CouponCategory couponCategory) {
		this.couponCategory = couponCategory;
	}

	public CouponGroup getCouponGroup() {
		return couponGroup;
	}

	public void setCouponGroup(CouponGroup couponGroup) {
		this.couponGroup = couponGroup;
	}

	public CouponBrand getCouponBrand() {
		return couponBrand;
	}

	public void setCouponBrand(CouponBrand couponBrand) {
		this.couponBrand = couponBrand;
	}

	public CouponMall getMall() {
		return mall;
	}

	public void setMall(CouponMall mall) {
		this.mall = mall;
	}

	public List<CouponShop> getShops() {
		return shops;
	}

	public void setShops(List<CouponShop> shops) {
		this.shops = shops;
	}

}