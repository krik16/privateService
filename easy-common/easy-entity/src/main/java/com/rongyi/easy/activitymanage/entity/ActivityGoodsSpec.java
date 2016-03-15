package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 活动商品规格
 */
public class ActivityGoodsSpec implements Serializable {
    public Integer getAppendCount() {
		return appendCount;
	}

	public void setAppendCount(Integer appendCount) {
		this.appendCount = appendCount;
	}

	private Integer id;

    /**
     * 活动商品关联表id
     */
    private Integer activityGoodsId;

    /**
     * 商品规格id
     */
    private String specId;

    /**
     * 活动商品/卡券参与量
     */
    private Integer joinCount;

    /**
     * 商品/卡券活动库存
     */
    private Integer stockCount;

    /**
     * 活动价
     */
    private Integer activityPrice;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 修改时间
     */
    private Date updateAt;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 追加数
     */
    private Integer appendCount;

    /**
     * 是否恢复库存 0 没有 1恢复
     */
    private Integer recStock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityGoodsId() {
        return activityGoodsId;
    }

    public void setActivityGoodsId(Integer activityGoodsId) {
        this.activityGoodsId = activityGoodsId;
    }

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public Integer getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(Integer joinCount) {
        this.joinCount = joinCount;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(Integer activityPrice) {
        this.activityPrice = activityPrice;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getRecStock() {
        return recStock;
    }

    public void setRecStock(Integer recStock) {
        this.recStock = recStock;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityGoodsId", activityGoodsId)
                .append("specId", specId)
                .append("joinCount", joinCount)
                .append("stockCount", stockCount)
                .append("activityPrice", activityPrice)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("version", version)
                .append("appendCount", appendCount)
                .append("recStock", recStock)
                .toString();
    }
}