package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.coupon.entity.*;
import com.rongyi.easy.coupon.vo.operation.CouponCountVO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Description:
 * Author: 袁波
 * DATE: 2015/11/19 18:23
 * Package:com.rongyi.easy.coupon.vo
 * Project:easy-common
 */
public class RedenvelopVO implements Serializable{
    /**
     * 主键(兼容mongoId)
     */
    private String id;
    
    /**
     * 卡券名称
     */
    private String name;
    
    //活动名称
    private List<String> activityNames; 

    public List<String> getActivityNames() {
		return activityNames;
	}

	public void setActivityNames(List<String> activityNames) {
		this.activityNames = activityNames;
	}

	/**
     * 审核未通过原因
     */
    private List<CouponRejectRecord> unpassReasons;

    /**
     * 下架原因
     */
    private List<CouponRejectRecord> offShelfReasons;


	/**
     * 卡券类型:代金券[0], 抵扣券[1], 红包[2]
     */
    private Integer couponType;

    /**
     * 验证方式：容易后验证[0], 互动屏票据[1], 两者兼容[2]，商家验证[3](属于第三方导入券)
     */
    private Integer validateType;
    

	 public String getBrandCname() {
		return brandCname;
	}

	public void setBrandCname(String brandCname) {
		this.brandCname = brandCname;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	private String brandCname;
	 private String mallName;
	 private String shopName;
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
    private Integer origPrice;

    /**
     * 现价
     */
    private Integer currPrice;

    /**
     * 折扣价,属于红包字段
     */
    private Integer discount;
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
    private Date validStartAt;

    /**
     * 有效期结束时间
     */
    private Date validEndAt;

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
     * 关联类型
     * 代金券：集团[0],品牌[1], 商场 [2],店铺[3];
     * 平台促销券 ：全场[0]，品牌[1]，商场[2]，店铺[3]、分类[4]，信息[5]
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
     * 信息同步终端: 容易逛,互动屏,微信 [1,1,1]表示三个都没选中
     */
    private String synTarget;
    /**
     * 卡券发布渠道：大运营平台[0], 商家管理后台[1]
     */
    private Integer publishChannel;

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
     * 是否已下架 初始状态[false]，已下架[true], 默认false
     */
    private Boolean isOffStock;

    /**
     * 是否删除：否[false], 是[true], 默认为false未删除
     */
    private Boolean isDeleted;

    /**
     * 红包分类
     */
    private List<CouponCategory> categoryList;

    /**
     * 红包对应商品分类列表
     */
    private List<CouponCommodityCategory> commodityCategoryList;

    /**
     * 代金券关联的集团
     */
    private List<CouponGroup> couponGroups;

    /**
     * 代金券关联的品牌
     */
    private List<CouponBrand> couponBrands;

    /**
     * 代金券关联的商场
     */
    private List<CouponMall> couponMalls;

    /**
     * 代金券关联的店铺
     */
    private List<CouponShop> couponShops;

    /**
     * 优惠方式 1：满减 ；2：立减。
     */
    private Integer preferentialType;

    /**
     * 卡券关联集团、品牌、店铺时如果没有选择下面的店铺则默认是关联该类型下所有的店铺，isRelatedAll=true
     */
    private Boolean isRelatedAll;

    private Integer visitedCount;


    /**
     * 平台促销券类型,注册[0] 常规[1]
     */
    private Integer type;

    /**
     * 平台促销券适用对象，商家/买手[0] 商家[1] 买手[2]
     */
    private Integer applyObject;

    /**
     * 平台促销券适用范围维度1,商品/代金券[0] 商品[1] 代金券[2]
     */
    private Integer applyGoods;

    /**
     * 平台促销券有效期天数,领取后设置的天数
     */
    private Integer validDays;

    /**
     * 平台促销券与代金券的关系
     */
    private List<CouponVoucher> couponVouchers;

    /**
     * 红包关联的商品  related_type只有这个类型是1 并且coupon_type 为2 的时候  才有这个类型
     */
    private List<CouponCommodity> couponCommodities;
    /**
     * 备注
     */
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Integer getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Integer origPrice) {
        this.origPrice = origPrice;
    }



    public Integer getVisitedCount() {
        return visitedCount;
    }

    public void setVisitedCount(Integer visitedCount) {
        this.visitedCount = visitedCount;
    }

    public Integer getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(Integer currPrice) {
        this.currPrice = currPrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
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

    public Date getValidStartAt() {
        return validStartAt;
    }

    public void setValidStartAt(Date validStartAt) {
        this.validStartAt = validStartAt;
    }

    public Date getValidEndAt() {
        return validEndAt;
    }

    public void setValidEndAt(Date validEndAt) {
        this.validEndAt = validEndAt;
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

    public Integer getPublishChannel() {
        return publishChannel;
    }

    public void setPublishChannel(Integer publishChannel) {
        this.publishChannel = publishChannel;
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

    public List<CouponCategory> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CouponCategory> categoryList) {
        this.categoryList = categoryList;
    }

    public List<CouponCommodityCategory> getCommodityCategoryList() {
        return commodityCategoryList;
    }

    public void setCommodityCategoryList(List<CouponCommodityCategory> commodityCategoryList) {
        this.commodityCategoryList = commodityCategoryList;
    }

    public List<CouponGroup> getCouponGroups() {
        return couponGroups;
    }

    public void setCouponGroups(List<CouponGroup> couponGroups) {
        this.couponGroups = couponGroups;
    }

    public List<CouponBrand> getCouponBrands() {
        return couponBrands;
    }

    public void setCouponBrands(List<CouponBrand> couponBrands) {
        this.couponBrands = couponBrands;
    }

    public List<CouponMall> getCouponMalls() {
        return couponMalls;
    }

    public void setCouponMalls(List<CouponMall> couponMalls) {
        this.couponMalls = couponMalls;
    }

    public List<CouponShop> getCouponShops() {
        return couponShops;
    }

    public void setCouponShops(List<CouponShop> couponShops) {
        this.couponShops = couponShops;
    }

    public Integer getPreferentialType() {
        return preferentialType;
    }

    public void setPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
    }

    public Boolean getIsRelatedAll() {
        return isRelatedAll;
    }

    public void setIsRelatedAll(Boolean isRelatedAll) {
        this.isRelatedAll = isRelatedAll;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getApplyObject() {
        return applyObject;
    }

    public void setApplyObject(Integer applyObject) {
        this.applyObject = applyObject;
    }

    public Integer getApplyGoods() {
        return applyGoods;
    }

    public void setApplyGoods(Integer applyGoods) {
        this.applyGoods = applyGoods;
    }

    public Integer getValidDays() {
        return validDays;
    }

    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }

    public List<CouponVoucher> getCouponVouchers() {
        return couponVouchers;
    }

    public void setCouponVouchers(List<CouponVoucher> couponVouchers) {
        this.couponVouchers = couponVouchers;
    }

    public List<CouponCommodity> getCouponCommodities() {
        return couponCommodities;
    }

    public void setCouponCommodities(List<CouponCommodity> couponCommodities) {
        this.couponCommodities = couponCommodities;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<CouponRejectRecord> getUnpassReasons() {
        return unpassReasons;
    }

    public void setUnpassReasons(List<CouponRejectRecord> unpassReasons) {
        this.unpassReasons = unpassReasons;
    }

    public List<CouponRejectRecord> getOffShelfReasons() {
        return offShelfReasons;
    }

    public void setOffShelfReasons(List<CouponRejectRecord> offShelfReasons) {
        this.offShelfReasons = offShelfReasons;
    }

    // 促销券状态(0:待审核，1:审核未通过，2:待发布，3:进行中，4:已结束，5:已下架)
    public void setConvertStatus(Integer status, Boolean isOffStock, Date publishStartAt, Date publishEndAt) {
        if (Integer.valueOf(0).equals(status)) {
            this.setStatus(0);
        } else if (Integer.valueOf(1).equals(status)){
            this.setStatus(1);
        } else if (Integer.valueOf(2).equals(status) && Boolean.TRUE.equals(isOffStock)) {
            this.setStatus(5);
        } else if (Integer.valueOf(2).equals(status) &&  new Date().before(publishStartAt)) {
            this.setStatus(2);
        } else if(Integer.valueOf(2).equals(status) && new Date().after(publishStartAt) && new Date().before(publishEndAt)) {
            this.setStatus(3);
        } else if(Integer.valueOf(2).equals(status) && new Date().after(publishEndAt)) {
            this.setStatus(4);
        }

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RedenvelopVO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", couponType=").append(couponType);
        sb.append(", validateType=").append(validateType);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", stockCount=").append(stockCount);
        sb.append(", origPrice=").append(origPrice);
        sb.append(", currPrice=").append(currPrice);
        sb.append(", discount=").append(discount);
        sb.append(", publishStartAt=").append(publishStartAt);
        sb.append(", publishEndAt=").append(publishEndAt);
        sb.append(", validStartAt=").append(validStartAt);
        sb.append(", validEndAt=").append(validEndAt);
        sb.append(", limitDesc='").append(limitDesc).append('\'');
        sb.append(", usageDesc='").append(usageDesc).append('\'');
        sb.append(", recommend='").append(recommend).append('\'');
        sb.append(", relatedType=").append(relatedType);
        sb.append(", limitCount=").append(limitCount);
        sb.append(", limitUseCount=").append(limitUseCount);
        sb.append(", limitPublishCount=").append(limitPublishCount);
        sb.append(", synTarget='").append(synTarget).append('\'');
        sb.append(", publishChannel=").append(publishChannel);
        sb.append(", status=").append(status);
        sb.append(", createUser='").append(createUser).append('\'');
        sb.append(", createAt=").append(createAt);
        sb.append(", updateUser='").append(updateUser).append('\'');
        sb.append(", updateAt=").append(updateAt);
        sb.append(", isOffStock=").append(isOffStock);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", categoryList=").append(categoryList);
        sb.append(", commodityCategoryList=").append(commodityCategoryList);
        sb.append(", couponGroups=").append(couponGroups);
        sb.append(", couponBrands=").append(couponBrands);
        sb.append(", couponMalls=").append(couponMalls);
        sb.append(", couponShops=").append(couponShops);
        sb.append(", preferentialType=").append(preferentialType);
        sb.append(", isRelatedAll=").append(isRelatedAll);
        sb.append(", visitedCount=").append(visitedCount);
        sb.append(", type=").append(type);
        sb.append(", applyObject=").append(applyObject);
        sb.append(", applyGoods=").append(applyGoods);
        sb.append(", validDays=").append(validDays);
        sb.append(", couponVouchers=").append(couponVouchers);
        sb.append(", couponCommodities=").append(couponCommodities);
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
