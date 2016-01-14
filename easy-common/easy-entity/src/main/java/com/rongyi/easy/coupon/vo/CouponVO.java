package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.coupon.entity.CouponCommodity;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 卡券基本信息
 * 类型：代金券、红包、抵扣券
 *
 * @author Breggor
 */

public class CouponVO implements Serializable {

    private static final long serialVersionUID = 1L;


    private String id;

    private String title;// 券名称


    private String couponType;// 券类型: 优惠券[02] 红包[03]


    private Integer totalCount;// 总量


    private Integer limitCount;// 每人限购数量


    private Integer limitPublishCount;// 每日限量发行张数


    private Integer limitUseCount;// 每人每日限用张数


    private Integer receiveCount = Integer.valueOf(0);// 已领取数

    private Double discount;// 折扣价

    private String recommend;// 推荐说明


    private String validateType;// 验证方式 0：容易后验证 1:互动屏票据 2:两者兼容


    private Double originalPrice;// 原价


    private Double currentPrice;// 现价

    private String type;// 配置类型 0:商场 1:店铺；红包 0：全场，1：商品


    private String checkDescription;// 审核未通过信息描述


    private String listPicUrl;// 列表图url


    private List<String> detailPicUrls;// 详情图url


    private String sourceTarget;// 信息渠道 0：大运营管理平台 1：百货管理平台 2:摩店管理平台 3：摩店App


    private String synTarget;// 信息同步终端包含“互动屏:0、微信:1、摩生活:2”。（考虑）


    private String synStatus;// 同步状态 0： 待同步 1：已同步 审核已通过将状态置为 1 反之置为0


    private String operateType;// 新增 [0] 修改[1] 删除[2] 用来百货今日重点显示用 信息渠道为1：百货管理平台


    private List<CouponMall> malls = new ArrayList<CouponMall>();// 关联商场集合


    private List<CouponShop> shops = new ArrayList<CouponShop>();// 关联店铺集合

    private String status; // 状态(审核中[0]、已上线[1]、已使用[2]、已过期[3]、已下线[4]), 规则：比如100张优惠券有一张被领用将状态置为2，被领用后就不能对优惠券进行操作了


    private String checkStatus;// 审核状态 0：待审核 1：未通过 2：已通过


    private String activityStatus;// 是否关联活动 未关联 [0] 关联翻牌购[1] 关联推送[2]


    private String delStatus;// 是否删除 'Y' 删除 'N' 未删除


    private Date publishBeginDate;// 发布开始时间


    private Date publishEndDate;// 发布结束时间


    private Date validBeginDate;// 有效期开始时间


    private Date validEndDate;// 有效期结束时间


    private String createUser;// 创建人id


    private Date createDate;// 创建时间


    private String updateUser;// 修改人id


    private Date updateDate;// 修改时间


    private String useRestriction;// 使用限制

    private String useDescription;// 使用说明 对应老优惠券使用方式

    private String sourceMallId;// 百货平台当前管理员所在的商场id

    private List<CouponProduct> products = new ArrayList<CouponProduct>(); // 现金劵关联商品

    private Integer visitedCount = Integer.valueOf(0);//卡券详情浏览数


    private Integer sortIndex = Integer.valueOf(0);//优惠券排序字段，目前作用是置顶

    private Integer purchaseType = Integer.valueOf(0);//购买类型 0正常购买类型 1抢购类型

    private List<Integer> afterSaleService; // = CouponConst.AFTER_SALE_SERVICE;//[1,1,1,1] 1为支持，0为不支持。第一位：随时退、第二位：过期退 第三位： 免预约、第四位：不可退

    /**
     * 优惠方式 0：满减 ；1：立减。
     */
    private Integer preferentialType;

    public Integer getPreferentialType() {
        return preferentialType;
    }

    public void setPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
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

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public void setConvertCouponType(Integer convertCouponType) {
        if (convertCouponType != null) {
            switch (convertCouponType) {
                case 0:
                    this.setCouponType("02"); break;
                case 2:
                    this.setCouponType("03"); break;
                default:
                    throw new IllegalArgumentException(String.format("couponType=%s,没匹配上", convertCouponType));
            }
        }
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // 状态: 进行中[1] 非进行中[0]
    public void setConvertStatus(Integer status, Boolean isOffStock, Date publishStartAt, Date publishEndAt) {
        if (publishStartAt != null && publishEndAt != null && Integer.valueOf(2).equals(status)
                && !isOffStock && new Date().after(publishStartAt) && new Date().before(publishEndAt)) {
            this.setStatus("1");
        } else {
            this.setStatus("0");
        }
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

    public void setConvertDelStatus(Boolean convertDelStatus) {
        if (Boolean.TRUE.equals(convertDelStatus)) {
            this.setDelStatus("Y");
        }
        if (Boolean.FALSE.equals(convertDelStatus)) {
            this.setDelStatus("N");
        }
    }

    public Date getPublishBeginDate() {
        return publishBeginDate;
    }

    public void setPublishBeginDate(Date publishBeginDate) {
        this.publishBeginDate = publishBeginDate;
    }

    public Date getPublishEndDate() {
        return publishEndDate;
    }

    public void setPublishEndDate(Date publishEndDate) {
        this.publishEndDate = publishEndDate;
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


        private String productId;

        private String marketName;

        private String shopName;

        private String productNum;

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

        private String mallName;

        private String mallAddress;

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

        private String shopName;

        private String mallName;

        private String shopLogoUrl;

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

    public void setConvertMalls(List<com.rongyi.easy.coupon.entity.CouponMall> convertMalls) {
        if (CollectionUtils.isNotEmpty(convertMalls)) {
            List<CouponMall> malls = new ArrayList<>();
            for (com.rongyi.easy.coupon.entity.CouponMall mall : convertMalls) {
                if (mall != null) {
                    CouponMall cmall = new CouponMall();
                    cmall.setId(mall.getMallId());
                    cmall.setMallAddress(mall.getMallAddress());
//                    cmall.setMallLogoUrl(mall.getMallLogUrl());
                    cmall.setMallName(mall.getMallName());
                    malls.add(cmall);
                }
            }
            this.setMalls(malls);
        }
    }

    public void setConvertProducts(List<CouponCommodity> convertProducts) {
        if (CollectionUtils.isNotEmpty(convertProducts)) {
            List<CouponProduct> prodList = new ArrayList<>();
            for (CouponCommodity comm : convertProducts) {
                if (comm != null) {
                    CouponProduct prod = new CouponProduct();
                    prod.setProductId(comm.getCommodityId());
                    prod.setMarketName(comm.getMallName());
                    prod.setPics(comm.getPics2List());
                    prod.setProductName(comm.getCommodityName());
                    prod.setProductNum(comm.getCommodityCode());
                    prod.setShopName(comm.getShopName());
                    prod.setStatus(comm.getStatus() != null ? comm.getStatus().toString() : "");
                    prodList.add(prod);
                }
            }
            this.setProducts(prodList);
        }
    }

    public void setConvertShops(List<com.rongyi.easy.coupon.entity.CouponShop> convertShops) {
        if (CollectionUtils.isNotEmpty(convertShops)) {
            List<CouponShop> shops = new ArrayList<>();
            for (com.rongyi.easy.coupon.entity.CouponShop shop : convertShops) {
                if (shop != null) {
                    CouponShop cshop = new CouponShop();
                    cshop.setId(shop.getShopId());
                   /* cshop.setBrandName(shop.getShopBrand());
                    cshop.setMallName(shop.getShopMallName());
                    cshop.setShopLogoUrl(shop.getShopLogoUrl());*/
                    cshop.setShopName(shop.getShopName());
                    shops.add(cshop);
                }
            }
            this.setShops(shops);
        }
    }

    public void setConvertType(Integer convertType) {
        if (Integer.valueOf(2).equals(convertType))
            this.setType("0");
        if (Integer.valueOf(3).equals(convertType)) {
            this.setType("1");
        }
        if (Integer.valueOf(0).equals(convertType))
            this.setType("0");
        if (Integer.valueOf(1).equals(convertType)) {
            this.setType("1");
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
                .toString();
    }
}