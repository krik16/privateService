package com.rongyi.easy.coupon.entity;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.beans.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 新版卡券基础数据
 *
 * @see OldCoupon mongo卡券信息
 */
public class Coupon implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键(兼容mongoId)
     */
    private String id;

    /**
     * 卡券名称
     */
    private String name;

    /**
     * 卡券类型:代金券[0], 抵扣券[1], 红包[2]
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
     * 展示区域：常规区域,活动区域;未选中[0]，选中[1] 例如 "1,1"表示都选中
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
     * 销售开始时间
     */
    private Date saleStartAt;

    /**
     * 销售结束时间
     */
    private Date saleEndAt;

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
     * 代金券：集团[0],品牌[1], 商场 [2],店铺[3];
     * 红包 ：全场[0],商品[1]
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
     * 导入渠道
     */
    private Integer inChannel;

    /**
     * 导入渠道名称
     */
    private String inChannelName;

    /**
     * 推广渠道
     */
    private Integer outChannel;

    /**
     * 推广渠道名称
     */
    private String outChannelName;

    /**
     * 店铺对应的公司名
     */
    private String sourceName;

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
    private Boolean isThird;

    /**
     * 是否已下架 初始状态[false]，已下架[true], 默认false
     */
    private Boolean isOffStock;

    /**
     * 是否删除：否[false], 是[true], 默认为false未删除
     */
    private Boolean isDeleted;

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
//    private CouponMall couponMall;

    /**
     * 代金券关联的店铺
     */
    private List<CouponShop> couponShops;

    /**
     * 关联的商场列表
     */
    private List<CouponMall> couponMalls;


    /**
     * 优惠方式 1：满减 ；2：立减。
     */
    private Integer preferentialType;

    /**
     * 红包关联的商品  related_type只有这个类型是1 并且coupon_type 为2 的时候  才有这个类型
     */
    private List<CouponCommodity> couponCommodities;


    private Integer purchaseType = Integer.valueOf(0);//购买类型 0正常购买类型 1抢购类型

    private Integer visitedCount = Integer.valueOf(0);//卡券详情浏览数

    /**
     * 是否是通用券，特指集团或商场发布的且只能在商场总台验券的券，例如：停车券等券
     * 默认 false;
     */
    private Boolean isGeneral;

    /**
     * 是否已关联活动 已关联[true] 未关联[false]默认为false
     */
    private Boolean isRelatedActivity;

    private Integer activityType;

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

    public double getOrigPrice2Double() {
        double val = 0D;
        if (origPrice != null) {
            val = BigDecimal.valueOf(origPrice).divide(BigDecimal.valueOf(100.00D)).setScale(2).doubleValue();
        }
        return val;
    }

    public void setOrigPrice(Integer origPrice) {
        this.origPrice = origPrice;
    }

    public Integer getCurrPrice() {
        return currPrice;
    }

    public double getCurrPrice2Double() {
        double val = 0D;
        if (currPrice != null) {
            val = BigDecimal.valueOf(currPrice).divide(BigDecimal.valueOf(100.00D)).setScale(2).doubleValue();
        }
        return val;
    }

    public void setCurrPrice(Integer currPrice) {
        this.currPrice = currPrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public double getDiscount2Double() {
        double val = 0D;
        if (discount != null) {
            val = BigDecimal.valueOf(discount).divide(BigDecimal.valueOf(100.00D)).setScale(2).doubleValue();
        }
        return val;
    }

    public void setDiscount(Integer discount) {
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

    public List<Integer> getAfterSaleService2List() {
        List<Integer> list = new ArrayList<>();
        if (StringUtils.isNotBlank(afterSaleService)) {
            for (String e : afterSaleService.split(",")) {
                list.add(Integer.valueOf(e));
            }
        }
        return list;
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

    public List<String> getDetailPicUrls() {
        List<String> list = ListUtils.EMPTY_LIST;
        if (StringUtils.isNotBlank(detailPicUrl)) {
            list = Arrays.asList(detailPicUrl.split(";"));
        }
        return list;
    }

    /**
     * 优惠券缩略图
     *
     * @return
     */
    public String getThumbnail() {
        String pic = "";
        if (!this.getDetailPicUrls().isEmpty()) {
            pic = this.getDetailPicUrls().get(0);
        }
        return pic;
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

    public Integer getInChannel() {
        return inChannel;
    }

    public void setInChannel(Integer inChannel) {
        this.inChannel = inChannel;
    }

    public Integer getOutChannel() {
        return outChannel;
    }

    public void setOutChannel(Integer outChannel) {
        this.outChannel = outChannel;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
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

    public Boolean getIsThird() {
        return isThird;
    }

    public void setIsThird(Boolean isThird) {
        this.isThird = isThird;
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

//    public CouponMall getCouponMall() {
//        return couponMall;
//    }
//
//    public void setCouponMall(CouponMall couponMall) {
//        this.couponMall = couponMall;
//    }

    public List<CouponShop> getCouponShops() {
        return couponShops;
    }

    public void setCouponShops(List<CouponShop> couponShops) {
        this.couponShops = couponShops;
    }

    public List<CouponMall> getCouponMalls() {
        return couponMalls;
    }

    public void setCouponMalls(List<CouponMall> couponMalls) {
        this.couponMalls = couponMalls;
    }

    public Integer getPreferentialType() {
        return preferentialType;
    }

    public void setPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
    }

    public List<CouponCommodity> getCouponCommodities() {
        return couponCommodities;
    }

    public void setCouponCommodities(List<CouponCommodity> couponCommodities) {
        this.couponCommodities = couponCommodities;
    }

    @Transient
    public List<String> getCouponCommodityIds() {
        List<String> list = ListUtils.EMPTY_LIST;
        if (CollectionUtils.isNotEmpty(couponCommodities)) {
            list = new ArrayList<>();
            for (CouponCommodity e : couponCommodities) {
                list.add(e.getCommodityId());
            }
        }
        return list;
    }

    public Integer getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(Integer purchaseType) {
        this.purchaseType = purchaseType;
    }


    public Integer getVisitedCount() {
        return visitedCount;
    }

    public void setVisitedCount(Integer visitedCount) {
        this.visitedCount = visitedCount;
    }

    public Date getSaleStartAt() {
        return saleStartAt;
    }

    public void setSaleStartAt(Date saleStartAt) {
        this.saleStartAt = saleStartAt;
    }

    public Date getSaleEndAt() {
        return saleEndAt;
    }

    public void setSaleEndAt(Date saleEndAt) {
        this.saleEndAt = saleEndAt;
    }

    public Integer getSaledCount() {
        return (totalCount - stockCount < 0) ? 0 : totalCount - stockCount;
    }

    public Boolean getIsGeneral() {
        return isGeneral;
    }

    public void setIsGeneral(Boolean isGeneral) {
        this.isGeneral = isGeneral;
    }

    public String getInChannelName() {
        return inChannelName;
    }

    public void setInChannelName(String inChannelName) {
        this.inChannelName = inChannelName;
    }

    public String getOutChannelName() {
        return outChannelName;
    }

    public void setOutChannelName(String outChannelName) {
        this.outChannelName = outChannelName;
    }

    public Boolean getIsRelatedActivity() {
        return isRelatedActivity;
    }

    public void setIsRelatedActivity(Boolean isRelatedActivity) {
        this.isRelatedActivity = isRelatedActivity;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("couponType", couponType)
                .append("validateType", validateType)
                .append("totalCount", totalCount)
                .append("stockCount", stockCount)
                .append("origPrice", origPrice)
                .append("currPrice", currPrice)
                .append("discount", discount)
                .append("displayRegion", displayRegion)
                .append("afterSaleService", afterSaleService)
                .append("publishStartAt", publishStartAt)
                .append("publishEndAt", publishEndAt)
                .append("saleStartAt", saleStartAt)
                .append("saleEndAt", saleEndAt)
                .append("validStartAt", validStartAt)
                .append("validEndAt", validEndAt)
                .append("limitDesc", limitDesc)
                .append("usageDesc", usageDesc)
                .append("recommend", recommend)
                .append("remark", remark)
                .append("listPicUrl", listPicUrl)
                .append("detailPicUrl", detailPicUrl)
                .append("relatedType", relatedType)
                .append("limitCount", limitCount)
                .append("limitUseCount", limitUseCount)
                .append("limitPublishCount", limitPublishCount)
                .append("synTarget", synTarget)
                .append("publishChannel", publishChannel)
                .append("status", status)
                .append("inChannel", inChannel)
                .append("inChannelName", inChannelName)
                .append("outChannel", outChannel)
                .append("outChannelName", outChannelName)
                .append("sourceName", sourceName)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("isThird", isThird)
                .append("isOffStock", isOffStock)
                .append("isDeleted", isDeleted)
                .append("couponCategory", couponCategory)
                .append("couponGroup", couponGroup)
                .append("couponBrand", couponBrand)
                .append("couponShops", couponShops)
                .append("couponMalls", couponMalls)
                .append("preferentialType", preferentialType)
                .append("couponCommodities", couponCommodities)
                .append("purchaseType", purchaseType)
                .append("visitedCount", visitedCount)
                .append("isGeneral", isGeneral)
                .append("isRelatedActivity", isRelatedActivity)
                .toString();
    }
}
