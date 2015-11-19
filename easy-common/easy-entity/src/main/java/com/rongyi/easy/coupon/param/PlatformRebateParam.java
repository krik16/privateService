package com.rongyi.easy.coupon.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 平台抵扣券参数实体
 * Created by lqy on 2015/11/18.
 */
public class PlatformRebateParam implements Serializable {

    /**
     * 券码
     */
    private String couponCode;

    /**
     * 商品集合
     */
    private List<Commodity> commodities = new ArrayList<>();

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
     * 券状态：可使用[1] 已失效[2]
     */
    private Integer status;

    /**
     * 当前页从1开始
     */
    private Integer currentPage;

    /**
     * 每页行数
     */
    private Integer pageSize;

    public static class Commodity implements Serializable {
        /**
         * 商品id
         */
        private String commodityId;

        /**
         * 商品金额
         */
        private Integer commodityAmount;

        /**
         * 适用对象: 商家[1] 买手[2]
         */
        private Integer applyObject;

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

        public Integer getApplyObject() {
            return applyObject;
        }

        public void setApplyObject(Integer applyObject) {
            this.applyObject = applyObject;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this)
                    .append("commodityId", commodityId)
                    .append("commodityAmount", commodityAmount)
                    .append("applyObject", applyObject)
                    .toString();
        }
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<Commodity> commodities) {
        this.commodities = commodities;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
                .append("commodities", commodities)
                .append("voucherId", voucherId)
                .append("voucherAmount", voucherAmount)
                .append("userId", userId)
                .append("status", status)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .toString();
    }
}
