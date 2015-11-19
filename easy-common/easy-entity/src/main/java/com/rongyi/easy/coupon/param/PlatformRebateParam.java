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
     * 代金券集合
     */
    private List<Voucher> vouchers = new ArrayList<>();

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

    public static class Voucher implements Serializable {
        /**
         * 代金券id
         */
        private String voucherId;

        /**
         * 商品金额
         */
        private Integer voucherAmount;

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

        @Override
        public String toString() {
            return new ToStringBuilder(this)
                    .append("voucherId", voucherId)
                    .append("voucherAmount", voucherAmount)
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

    public List<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("couponCode", couponCode)
                .append("commodities", commodities)
                .append("vouchers", vouchers)
                .toString();
    }
}
