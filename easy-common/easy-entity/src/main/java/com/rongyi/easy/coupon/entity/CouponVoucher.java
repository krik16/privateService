package com.rongyi.easy.coupon.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lqy on 2015/11/17.
 * 平台促销券与代金券的关系实体
 */
public class CouponVoucher implements Serializable {

    /**
     * PK
     */
    private Integer id;

    /**
     * 平台促销券id
     */
    private String couponId;

    /**
     * 代金券id
     */
    private String voucherId;

    /**
     * 代金券名称
     */
    private String voucherName;

    /**
     * 创建时间
     */
    private Date createAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public String getVoucherName() {
        return voucherName;
    }

    public void setVoucherName(String voucherName) {
        this.voucherName = voucherName;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("couponId", couponId)
                .append("voucherId", voucherId)
                .append("voucherName", voucherName)
                .append("createAt", createAt)
                .toString();
    }
}
