package com.rongyi.easy.coupon.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 平台抵扣券和红包参数实体
 * Created by lqy on 2015/11/18.
 */
public class RebateAndRedenvelopParam implements Serializable {

    public static String RECEIVE_AT_DESC = "receive_at desc";// 可使用列表排序(按领取时间排序)
    public static String USE_VALID_AT_DESC = "use_valid_at desc";// 可使用列表排序(按过期及使用时间排序，最新过期或使用后的券优先排列)

    /**
     * 券码
     */
    private String couponCode;

    /**
     * 商品集合
     */
    private List<OrderCommodity> orderCommodities;

    /**
     * 商品id
     */
    private String commodityId;

    /**
     * 适用对象: 商家[1] 买手[2]
     */
    private Integer applyObject;

    /**
     * 代金券id
     */
    private String voucherId;

    /**
     * 代金券金额
     */
    private Integer voucherAmount;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 券状态：可使用[true] 已失效[false](已失效包括已使用和已过期)
     */
    private Boolean isUsable;

    /**
     * 领取券码时间
     */
    private Date receiveAt;

    /**
     * 使用规则：满减[0] 立减[1]
     */
    private Integer preferentialType;

    /**
     * 是否校验抵扣券的状态，下单后如果商品改价了，这个时候不校验状态，默认校验[抵扣券购买商品时]
     */
    private Boolean isValidStatus = Boolean.TRUE;

    /**
     * 当前页从1开始
     */
    private Integer currentPage;

    /**
     * 每页行数
     */
    private Integer pageSize;

    /**
     * 排序
     */
    private String orderBy;

    public static class OrderCommodity implements Serializable {
        /**
         * 商品id
         */
        private String commodityId;

        /**
         * 商品金额
         */
        private Integer commodityAmount;

        public String getCommodityId() {
            return commodityId;
        }

        public void setCommodityId(String commodityId) {
            this.commodityId = commodityId;
        }

        public Integer getCommodityAmount() {
            return commodityAmount;
        }

        public void setCommodityAmount(Integer commodityAmount) {
            this.commodityAmount = commodityAmount;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this)
                    .append("commodityId", commodityId)
                    .append("commodityAmount", commodityAmount)
                    .toString();
        }
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public List<OrderCommodity> getOrderCommodities() {
        return orderCommodities;
    }

    public void setOrderCommodities(List<OrderCommodity> orderCommodities) {
        this.orderCommodities = orderCommodities;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public Integer getVoucherAmount() {
        return voucherAmount;
    }

    public void setVoucherAmount(Integer voucherAmount) {
        this.voucherAmount = voucherAmount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getIsUsable() {
        return isUsable;
    }

    public void setIsUsable(Boolean isUsable) {
        this.isUsable = isUsable;
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

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Date getReceiveAt() {
        return receiveAt;
    }

    public void setReceiveAt(Date receiveAt) {
        this.receiveAt = receiveAt;
    }

    public Integer getPreferentialType() {
        return preferentialType;
    }

    public void setPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getApplyObject() {
        return applyObject;
    }

    public void setApplyObject(Integer applyObject) {
        this.applyObject = applyObject;
    }

    public Boolean getIsValidStatus() {
        return isValidStatus;
    }

    public void setIsValidStatus(Boolean isValidStatus) {
        this.isValidStatus = isValidStatus;
    }

    /**
     * 分页起始行数
     * @return
     */
    public Integer getOffset() {
        if (this.currentPage == null || this.pageSize == null) {
            return null;
        }
        return  (this.currentPage -1) * this.pageSize < 0 ? 0 : (this.currentPage -1) * this.pageSize;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("couponCode", couponCode)
                .append("orderCommodities", orderCommodities)
                .append("commodityId", commodityId)
                .append("applyObject", applyObject)
                .append("voucherId", voucherId)
                .append("voucherAmount", voucherAmount)
                .append("userId", userId)
                .append("isUsable", isUsable)
                .append("receiveAt", receiveAt)
                .append("preferentialType", preferentialType)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .append("orderBy", orderBy)
                .toString();
    }
}
