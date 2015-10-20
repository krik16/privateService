package com.rongyi.easy.coupon.entity;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 卡券信息
 * 类型：代金券、红包、抵扣券
 *
 * @author Breggor
 * @see Coupon   --新卡券基础数据
 */

@Deprecated
@Entity(value = "coupon", noClassnameStored = true)
public class OldCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;// 券id

    private String title;// 券名称

    @Property("coupon_type")
    private String couponType;// 券类型: 优惠券[02] 现金券[03]

    @Property("total_count")
    private Integer totalCount;// 总量

    @Property("limit_count")
    private Integer limitCount;// 每人限购数量

    @Property("limit_publish_count")
    private Integer limitPublishCount;// 每日限量发行张数

    @Property("limit_use_count")
    private Integer limitUseCount;// 每人每日限用张数

    @Property("receive_count")
    private Integer receiveCount = Integer.valueOf(0);// 已领取数

    private Double discount;// 折扣价

    private String recommend;// 推荐说明

    @Property("validate_type")
    private String validateType;// 验证方式 0：容易后验证 1:互动屏票据 2:两者兼容

    @Property("original_price")
    private Double originalPrice;// 原价

    @Property("current_price")
    private Double currentPrice;// 现价

    private String type;// 配置类型 0:商场 1:店铺；现金券 0：全场，1：商品

    @Property("check_description")
    private String checkDescription;// 审核未通过信息描述

    @Property("list_pic_url")
    private String listPicUrl;// 列表图url

    @Property("detail_pic_urls")
    private List<String> detailPicUrls;// 详情图url

    @Property("source_target")
    private String sourceTarget;// 信息渠道 0：大运营管理平台 1：百货管理平台 2:摩店管理平台 3：摩店App

    @Property("syn_target")
    private String synTarget;// 信息同步终端包含“互动屏:0、微信:1、摩生活:2”。（考虑）

    @Property("syn_status")
    private String synStatus;// 同步状态 0： 待同步 1：已同步 审核已通过将状态置为 1 反之置为0

    @Property("operate_type")
    private String operateType;// 新增 [0] 修改[1] 删除[2] 用来百货今日重点显示用 信息渠道为1：百货管理平台

    @Embedded("malls")
    private List<CouponMall> malls = new ArrayList<CouponMall>();// 关联商场集合

    @Embedded("shops")
    private List<CouponShop> shops = new ArrayList<CouponShop>();// 关联店铺集合

    /**
     * 代金券关联的品牌
     */
    private CouponBrand couponBrand;

    /**
     * 代金券关联的集团
     */
    private CouponGroup couponGroup;

    private String status; // 状态(审核中[0]、已上线[1]、已使用[2]、已过期[3]、已下线[4]), 规则：比如100张优惠券有一张被领用将状态置为2，被领用后就不能对优惠券进行操作了


    @Property("check_status")
    private String checkStatus;// 审核状态 0：待审核 1：未通过 2：已通过

    @Property("activity_status")
    private String activityStatus;// 是否关联活动 未关联 [0] 关联翻牌购[1] 关联推送[2]

    @Property("del_status")
    private String delStatus;// 是否删除 'Y' 删除 'N' 未删除

    @Property("publish_begin_date")
    private Date publishBeginDate;// 发布开始时间

    @Property("publish_end_date")
    private Date publishEndDate;// 发布结束时间

    @Property("valid_begin_date")
    private Date validBeginDate;// 有效期开始时间

    @Property("valid_end_date")
    private Date validEndDate;// 有效期结束时间

    @Property("create_user")
    private String createUser;// 创建人id

    @Property("create_date")
    private Date createDate;// 创建时间

    @Property("update_user")
    private String updateUser;// 修改人id

    @Property("update_date")
    private Date updateDate;// 修改时间

    @Property("use_restriction")
    private String useRestriction;// 使用限制

    @Property("use_description")
    private String useDescription;// 使用说明 对应老优惠券使用方式

    @Property("source_mall_id")
    private String sourceMallId;// 百货平台当前管理员所在的商场id

    @Embedded("products")
    private List<CouponProduct> products = new ArrayList<CouponProduct>(); // 现金劵关联商品

    @Property("visited_count")
    private Integer visitedCount = Integer.valueOf(0);//卡券详情浏览数

    @Property("sort_index")
    private Integer sortIndex = Integer.valueOf(0);//优惠券排序字段，目前作用是置顶

    @Property("purchase_type")
    private Integer purchaseType = Integer.valueOf(0);//购买类型 0正常购买类型 1抢购类型

    private List<Integer> afterSaleService; // = CouponConst.AFTER_SALE_SERVICE;//[1,1,1,1] 1为支持，0为不支持。第一位：随时退、第二位：过期退 第三位： 免预约、第四位：不可退

    @Version
    private Long version; // 乐观锁

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public Integer getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(Integer purchaseType) {
        this.purchaseType = purchaseType;
    }

    public Integer getTotalCount() {
        return (totalCount == null) ? Integer.valueOf(0) : totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getLimitCount() {
        return (limitCount == null) ? Integer.valueOf(0) : limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public Integer getLimitPublishCount() {
        return (limitPublishCount == null) ? Integer.valueOf(0) : limitPublishCount;
    }

    public void setLimitPublishCount(Integer limitPublishCount) {
        this.limitPublishCount = limitPublishCount;
    }

    public Integer getLimitUseCount() {
        return (limitUseCount == null) ? Integer.valueOf(0) : limitUseCount;
    }

    public void setLimitUseCount(Integer limitUseCount) {
        this.limitUseCount = limitUseCount;
    }

    public Integer getReceiveCount() {
        return (receiveCount == null) ? Integer.valueOf(0) : receiveCount;
    }

    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    public Double getDiscount() {
        return (discount == null) ? Double.valueOf(0.00D) : discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getValidateType() {
        return validateType;
    }

    public void setValidateType(String validateType) {
        this.validateType = validateType;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getCheckDescription() {
        return checkDescription;
    }

    public void setCheckDescription(String checkDescription) {
        this.checkDescription = checkDescription;
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

    public String getSourceTarget() {
        return sourceTarget;
    }

    public void setSourceTarget(String sourceTarget) {
        this.sourceTarget = sourceTarget;
    }

    public String getSynTarget() {
        return synTarget;
    }

    public void setSynTarget(String synTarget) {
        this.synTarget = synTarget;
    }

    public String getSynStatus() {
        return synStatus;
    }

    public void setSynStatus(String synStatus) {
        this.synStatus = synStatus;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
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

    public CouponBrand getCouponBrand() {
        return couponBrand;
    }

    public void setCouponBrand(CouponBrand couponBrand) {
        this.couponBrand = couponBrand;
    }

    public CouponGroup getCouponGroup() {
        return couponGroup;
    }

    public void setCouponGroup(CouponGroup couponGroup) {
        this.couponGroup = couponGroup;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus;
    }

    public Date getPublishBeginDate() {
        return publishBeginDate;
    }

    public void setPublishBeginDate(Date publishBeginDate) {
//        if (publishBeginDate != null) {
//            publishBeginDate = DateUtils.setHours(publishBeginDate, 0);
//            publishBeginDate = DateUtils.setMinutes(publishBeginDate, 0);
//            publishBeginDate = DateUtils.setSeconds(publishBeginDate, 0);
//        }
        this.publishBeginDate = publishBeginDate;
    }

    public Date getPublishEndDate() {
        return publishEndDate;
    }

    public void setPublishEndDate(Date publishEndDate) {
//        if (publishEndDate != null) {
//            publishEndDate = DateUtils.setHours(publishEndDate, 23);
//            publishEndDate = DateUtils.setMinutes(publishEndDate, 59);
//            publishEndDate = DateUtils.setSeconds(publishEndDate, 59);
//        }
        this.publishEndDate = publishEndDate;
    }

    public Date getValidBeginDate() {
        return validBeginDate;
    }

    public void setValidBeginDate(Date validBeginDate) {
//        if (validBeginDate != null) {
//            validBeginDate = DateUtils.setHours(validBeginDate, 0);
//            validBeginDate = DateUtils.setMinutes(validBeginDate, 0);
//            validBeginDate = DateUtils.setSeconds(validBeginDate, 0);
//        }
        this.validBeginDate = validBeginDate;
    }

    public Date getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(Date validEndDate) {
//        if (validEndDate != null) {
//            validEndDate = DateUtils.setHours(validEndDate, 23);
//            validEndDate = DateUtils.setMinutes(validEndDate, 59);
//            validEndDate = DateUtils.setSeconds(validEndDate, 59);
//        }
        this.validEndDate = validEndDate;
    }

    public String getCreateUser() {
        return StringUtils.isBlank(createUser) ? "" : createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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

    public String getSourceMallId() {
        return sourceMallId;
    }

    public void setSourceMallId(String sourceMallId) {
        this.sourceMallId = sourceMallId;
    }

    public List<CouponProduct> getProducts() {
        return products;
    }

    public void setProducts(List<CouponProduct> products) {
        this.products = products;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getVisitedCount() {
        return visitedCount;
    }

    public void setVisitedCount(Integer visitedCount) {
        this.visitedCount = visitedCount;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }

    /**
     * 剩余库存量
     *
     * @return
     */
    public int getRestAmount() {
        int amount = this.getTotalCount() - this.getReceiveCount();
        return (amount < 0) ? 0 : amount;
    }

    /**
     * 优惠券缩略图
     *
     * @return
     */
    public String getThumbnail() {
        String pic = "";
        if (this.detailPicUrls != null && !this.detailPicUrls.isEmpty())
            pic = this.detailPicUrls.get(0);
        return pic;
    }

    public List<Integer> getAfterSaleService() {
        return afterSaleService;
    }

    public void setAfterSaleService(List<Integer> afterSaleService) {
        this.afterSaleService = afterSaleService;
    }

    public static class CouponProduct implements Serializable {

        private static final long serialVersionUID = 1L;

        @Property("product_id")
        private String productId;

        @Property("market_name")
        private String marketName;

        @Property("shop_name")
        private String shopName;

        @Property("product_num")
        private String productNum;

        @Property("product_name")
        private String productName;

        private List<String> pics;// 商品图片

        private String status;

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getMarketName() {
            return marketName;
        }

        public void setMarketName(String marketName) {
            this.marketName = marketName;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getProductNum() {
            return productNum;
        }

        public void setProductNum(String productNum) {
            this.productNum = productNum;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<String> getPics() {
            return pics;
        }

        public void setPics(List<String> pics) {
            this.pics = pics;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).append("productId", productId).append("marketName", marketName)
                    .append("shopName", shopName).append("productNum", productNum).append("productName", productName)
                    .append("pics", pics).append("status", status).toString();
        }

    }

    public static class CouponMall implements Serializable {

        private static final long serialVersionUID = 1L;
        private String id;

        @Property("mall_name")
        private String mallName;

        @Property("mall_address")
        private String mallAddress;

        @Property("mall_logo_url")
        private String mallLogoUrl;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMallName() {
            return mallName;
        }

        public void setMallName(String mallName) {
            this.mallName = mallName;
        }

        public String getMallAddress() {
            return mallAddress;
        }

        public void setMallAddress(String mallAddress) {
            this.mallAddress = mallAddress;
        }

        public String getMallLogoUrl() {
            return mallLogoUrl;
        }

        public void setMallLogoUrl(String mallLogoUrl) {
            this.mallLogoUrl = mallLogoUrl;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).append("id", id).append("mallName", mallName)
                    .append("mallAddress", mallAddress).append("mallLogoUrl", mallLogoUrl).toString();
        }

    }

    public static class CouponShop implements Serializable {

        private static final long serialVersionUID = 1L;
        private String id;

        @Property("shop_name")
        private String shopName;

        @Property("mall_name")
        private String mallName;

        @Property("shop_logo_url")
        private String shopLogoUrl;

        @Property("brand_name")
        private String brandName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getMallName() {
            return mallName;
        }

        public void setMallName(String mallName) {
            this.mallName = mallName;
        }

        public String getShopLogoUrl() {
            return shopLogoUrl;
        }

        public void setShopLogoUrl(String shopLogoUrl) {
            this.shopLogoUrl = shopLogoUrl;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).append("id", id).append("shopName", shopName).append("mallName", mallName)
                    .append("shopLogoUrl", shopLogoUrl).append("brandName", brandName).toString();
        }

    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("couponType", couponType)
                .append("totalCount", totalCount)
                .append("limitCount", limitCount)
                .append("limitPublishCount", limitPublishCount)
                .append("limitUseCount", limitUseCount)
                .append("receiveCount", receiveCount)
                .append("discount", discount)
                .append("recommend", recommend)
                .append("validateType", validateType)
                .append("originalPrice", originalPrice)
                .append("currentPrice", currentPrice)
                .append("type", type)
                .append("checkDescription", checkDescription)
                .append("listPicUrl", listPicUrl)
                .append("detailPicUrls", detailPicUrls)
                .append("sourceTarget", sourceTarget)
                .append("synTarget", synTarget)
                .append("synStatus", synStatus)
                .append("operateType", operateType)
                .append("malls", malls)
                .append("shops", shops)
                .append("couponBrand", couponBrand)
                .append("couponGroup", couponGroup)
                .append("status", status)
                .append("checkStatus", checkStatus)
                .append("activityStatus", activityStatus)
                .append("delStatus", delStatus)
                .append("publishBeginDate", publishBeginDate)
                .append("publishEndDate", publishEndDate)
                .append("validBeginDate", validBeginDate)
                .append("validEndDate", validEndDate)
                .append("createUser", createUser)
                .append("createDate", createDate)
                .append("updateUser", updateUser)
                .append("updateDate", updateDate)
                .append("useRestriction", useRestriction)
                .append("useDescription", useDescription)
                .append("sourceMallId", sourceMallId)
                .append("products", products)
                .append("visitedCount", visitedCount)
                .append("sortIndex", sortIndex)
                .append("purchaseType", purchaseType)
                .append("afterSaleService", afterSaleService)
                .append("version", version)
                .toString();
    }
}
