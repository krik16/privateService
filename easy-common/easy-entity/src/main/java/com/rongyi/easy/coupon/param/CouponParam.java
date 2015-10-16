package com.rongyi.easy.coupon.param;

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
     * 卡券类型
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
     * 关联活动类型： 未关联[0] 关联翻牌购[1] 关联推送[2]
     */
    private Integer activityType;

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
     * 是否有库存
     */
    private Boolean hasStockCount;

    /**
     * ID集合
     */
    private List<String> ids;

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

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
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

    public Boolean getHasStockCount() {
        return hasStockCount;
    }

    public void setHasStockCount(Boolean hasStockCount) {
        this.hasStockCount = hasStockCount;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
