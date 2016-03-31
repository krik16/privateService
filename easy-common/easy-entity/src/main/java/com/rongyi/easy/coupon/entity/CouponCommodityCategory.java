package com.rongyi.easy.coupon.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lqy on 2015/11/17.
 * 平台促销券商品分类
 */
public class CouponCommodityCategory implements Serializable {

    /**
     * PK
     */
    private Integer id;

    /**
     * 平台促销券id
     */
    private String couponId;

    /**
     * 商品分类2级id
     */
    private String lv2Id;

    /**
     * 商品分类2级名称
     */
    private String lv2Name;

    /**
     * 商品分类3级id
     */
    private String lv3Id;

    /**
     * 商品分类3级名称
     */
    private String lv3Name;

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

    public String getLv2Id() {
        return lv2Id;
    }

    public void setLv2Id(String lv2Id) {
        this.lv2Id = lv2Id;
    }

    public String getLv2Name() {
        return lv2Name;
    }

    public void setLv2Name(String lv2Name) {
        this.lv2Name = lv2Name;
    }

    public String getLv3Id() {
        return lv3Id;
    }

    public void setLv3Id(String lv3Id) {
        this.lv3Id = lv3Id;
    }

    public String getLv3Name() {
        return lv3Name;
    }

    public void setLv3Name(String lv3Name) {
        this.lv3Name = lv3Name;
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
                .append("lv2Id", lv2Id)
                .append("lv2Name", lv2Name)
                .append("lv3Id", lv3Id)
                .append("lv3Name", lv3Name)
                .append("createAt", createAt)
                .toString();
    }
}
