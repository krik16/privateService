package com.rongyi.easy.coupon.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class CouponParam implements Serializable {


    /**
     * 当前页
     */
    private Integer currentPage;

    /**
     * 页大小
     */
    private Integer pageSize;

    /**
     * 起始行数
     */
    private Integer offset;

    /**
     * 店铺ID
     */
    private String shopId;

    /**
     * 状态
     */
    private Integer status;


    /**
     * 券Id
     */
    private String couponId;

    /**
     * 是否下架
     */
    private Boolean isOffStock;

    /**
     * 卡券类型:代金券[0], 抵扣券[1], 红包[2]
     */
    private Integer couponType;

    /**
     * 排序字段
     */
    private String orderBy;

    /**
     * 商场ID
     */
    private String mallId;

    /**
     * 信息同步终端: 容易逛,互动屏,微信 [1,1,1]表示三个都没选中
     */
    private String synTarget;

    /**
     * 代金券发布状态: 待发布[0] 进行中[1] 已结束[2] 已下架[3]
     */
    private List<Integer> publishStatusList;

    /**
     * 关联类型
     * 代金券：集团[0],品牌[1], 商场 [2],店铺[3];
     * 红包 ：全场[0],商品[1]
     */
    private Integer relatedType;

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
     * 是否已关联活动 已关联[true] 未关联[false]默认为false
     */
    private Boolean isRelatedActivity;

    /**
     * 商场名称
     */
    private String mallName;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 卡券发布渠道：大运营平台[0], 商家管理后台[1]
     */
    private Integer publishChannel;

    /**
     * 库存
     */
    private Integer stockCount;

    /**
     * ID集合
     */
    private List<String> ids;

    /**
     * 展示区域：常规区域,活动区域;未选中[0]，选中[1] 例如 "1,1"表示都选中
     */
    private String displayRegion;

    /**
     * 卡券名称
     */
    private String name;


    /**
     * 是否删除：否[false], 是[true], 默认为false未删除
     */
    private Boolean isDeleted;

    /**
     * 卡券关联商品Id
     */
    private String productId;

//    是否是通用券
    private Boolean isGeneral;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 是否已被领取 是[true] 否[false]
     */
    private Boolean hasReceived;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsOffStock() {
        return isOffStock;
    }

    public void setIsOffStock(Boolean isOffStock) {
        this.isOffStock = isOffStock;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getSynTarget() {
        return synTarget;
    }

    public void setSynTarget(String synTarget) {
        this.synTarget = synTarget;
    }

    public List<Integer> getPublishStatusList() {
        return publishStatusList;
    }

    public void setPublishStatusList(List<Integer> publishStatusList) {
        this.publishStatusList = publishStatusList;
    }

    public Integer getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(Integer relatedType) {
        this.relatedType = relatedType;
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

    public Boolean getIsRelatedActivity() {
        return isRelatedActivity;
    }

    public void setIsRelatedActivity(Boolean isRelatedActivity) {
        this.isRelatedActivity = isRelatedActivity;
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

    public Integer getPublishChannel() {
        return publishChannel;
    }

    public void setPublishChannel(Integer publishChannel) {
        this.publishChannel = publishChannel;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String getDisplayRegion() {
        return displayRegion;
    }

    public void setDisplayRegion(String displayRegion) {
        this.displayRegion = displayRegion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }


    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getOffset() {
        if (this.currentPage != null && this.pageSize != null
                && this.currentPage > 0 && this.pageSize > 0) {
            return (this.currentPage - 1) * pageSize;
        }
        return offset;
    }

    public Boolean getIsGeneral() {
        return isGeneral;
    }

    public void setIsGeneral(Boolean isGeneral) {
        this.isGeneral = isGeneral;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Boolean getHasReceived() {
        return hasReceived;
    }

    public void setHasReceived(Boolean hasReceived) {
        this.hasReceived = hasReceived;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .append("shopId", shopId)
                .append("status", status)
                .append("couponId", couponId)
                .append("isOffStock", isOffStock)
                .append("couponType", couponType)
                .append("orderBy", orderBy)
                .append("mallId", mallId)
                .append("synTarget", synTarget)
                .append("publishStatusList", publishStatusList)
                .append("relatedType", relatedType)
                .append("publishStartAt", publishStartAt)
                .append("publishEndAt", publishEndAt)
                .append("validStartAt", validStartAt)
                .append("validEndAt", validEndAt)
                .append("isRelatedActivity", isRelatedActivity)
                .append("mallName", mallName)
                .append("shopName", shopName)
                .append("publishChannel", publishChannel)
                .append("stockCount", stockCount)
                .append("ids", ids)
                .append("displayRegion", displayRegion)
                .append("name", name)
                .append("isDeleted", isDeleted)
                .append("productId", productId)
                .append("isGeneral", isGeneral)
                .append("hasReceived", hasReceived)
                .toString();
    }
}
