package com.rongyi.easy.coupon.param;

import com.rongyi.core.constant.Constants;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Description:红包关联商品，商品查询参数
 * Author: 袁波
 * DATE: 2015/11/23 14:34
 * Package:com.rongyi.easy.coupon.param
 * Project:easy-common
 */
public class CouponCommodityParam implements Serializable{
    private String commodityId;
    private String commodityName;
    private String categoryId;
    private String brandId;
    private String mallId;
    private String temaiId;
    private String shopId;
    private Integer pageSize;
    private Integer currentPage;
    private List<String> shopMids;
    private Integer type;
    private Double begDiscount;
    private Double endDiscount;
    //  1：容易逛
    private String terminalType;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CouponCommodityParam{");
        sb.append("commodityId='").append(commodityId).append('\'');
        sb.append(", commodityName='").append(commodityName).append('\'');
        sb.append(", categoryId='").append(categoryId).append('\'');
        sb.append(", brandId='").append(brandId).append('\'');
        sb.append(", mallId='").append(mallId).append('\'');
        sb.append(", temaiId='").append(temaiId).append('\'');
        sb.append(", shopId='").append(shopId).append('\'');
        sb.append(", pageSize=").append(pageSize);
        sb.append(", currentPage=").append(currentPage);
        sb.append(", shopMids=").append(shopMids);
        sb.append(", type=").append(type);
        sb.append(", begDiscount=").append(begDiscount);
        sb.append(", endDiscount=").append(endDiscount);
        sb.append(", terminalType=").append(terminalType);
        sb.append('}');
        return sb.toString();
    }

    public Double getBegDiscount() {
        return begDiscount;
    }

    public void setBegDiscount(Double begDiscount) {
        this.begDiscount = begDiscount;
    }

    public Double getEndDiscount() {
        return endDiscount;
    }

    public void setEndDiscount(Double endDiscount) {
        this.endDiscount = endDiscount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPageSize() {
        return pageSize==null? Constants.CouponPage.PAGE_SIZE:pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage==null?Constants.CouponPage.CURRENT_PAGE:currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public List<String> getShopMids() {
        return shopMids;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public void setShopMids(List<String> shopMids) {
        this.shopMids = shopMids;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public CouponCommodityParam(String commodityId, String commodityName, String categoryId, String brandId, String shopId) {
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.shopId = shopId;
    }

    public CouponCommodityParam() {
    }

    public String getTemaiId() {
        return temaiId;
    }

    public void setTemaiId(String temaiId) {
        this.temaiId = temaiId;
    }
}
