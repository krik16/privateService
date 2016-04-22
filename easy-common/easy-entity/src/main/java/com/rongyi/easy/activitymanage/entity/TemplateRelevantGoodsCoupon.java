package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 *模版关联的卡券商品
 * @author 李靖 2015-11-17 15：58
 */
public class TemplateRelevantGoodsCoupon implements Serializable{
    /***/
    private Integer id;
    /***/
    private Integer labelId;
    /**卡券*/
    private String couponId;
    /**商品id*/
    private String commodityId;
    /**标题*/
    private String title;
    /**原标题*/
    private String currentTitle;
    /**卡券类型 卡券类型 代金券[0], 抵扣券[1], 红包[2]*/
    private Integer couponType;
    /**排序信息*/
    private Integer orderPosition;
    /**库存*/
    private Integer stockCount;
    /**图片*/
    private String pic;
    /**容易补贴价格*/
    private Integer rySubsidy;
    /**活动价格*/
    private Integer activityPrice;
    /**false表示删除  true表示 没有删除*/
    private Boolean isDeleted;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createAt;
    /**修改时间*/
    private Date updateAt;
    /**版本*/
    private Integer version;
    /**
     * 用于判断这条记录的
     * 0 无修改
     * 1表示新增
     * 2表示删除
     * 3表示修改
     */
    private Integer isCommodityUp;


    private String shopId;

    private String shopName;

    private Integer createBy;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCurrentTitle() {
        return currentTitle;
    }

    public void setCurrentTitle(String currentTitle) {
        this.currentTitle = currentTitle;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getOrderPosition() {
        return orderPosition;
    }

    public void setOrderPosition(Integer orderPosition) {
        this.orderPosition = orderPosition;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getRySubsidy() {
        return rySubsidy;
    }

    public void setRySubsidy(Integer rySubsidy) {
        this.rySubsidy = rySubsidy;
    }

    public Integer getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(Integer activityPrice) {
        this.activityPrice = activityPrice;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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

    public Integer getIsCommodityUp() {
        return isCommodityUp;
    }

    public void setIsCommodityUp(Integer isCommodityUp) {
        this.isCommodityUp = isCommodityUp;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("labelId", labelId)
                .append("couponId", couponId)
                .append("commodityId", commodityId)
                .append("title", title)
                .append("currentTitle", currentTitle)
                .append("couponType", couponType)
                .append("orderPosition", orderPosition)
                .append("stockCount", stockCount)
                .append("pic", pic)
                .append("rySubsidy", rySubsidy)
                .append("activityPrice", activityPrice)
                .append("isDeleted", isDeleted)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("version", version)
                .append("isCommodityUp", isCommodityUp)
                .append("shopId", shopId)
                .append("shopName", shopName)
                .append("createBy", createBy)
                .toString();
    }
}