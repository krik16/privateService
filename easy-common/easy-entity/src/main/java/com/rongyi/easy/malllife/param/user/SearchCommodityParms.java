package com.rongyi.easy.malllife.param.user;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2016/4/7.
 */
public class SearchCommodityParms implements Serializable{

    private String commodityId;    //商品id
    private String commodityName;  //	商品名称
    private String categoryId;     //分类id  和省市区商圈一样拿
    private String brandId;        //品牌id
    private List<String> commodIds; //商品ids
    private Integer pageSize;      //分页大小
    private List<String> shopMids; //店铺id
    private Integer currentPage	;//当前页 从1开始	Integer	是

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

    public List<String> getCommodIds() {
        return commodIds;
    }

    public void setCommodIds(List<String> commodIds) {
        this.commodIds = commodIds;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<String> getShopMids() {
        return shopMids;
    }

    public void setShopMids(List<String> shopMids) {
        this.shopMids = shopMids;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "SearchCommodityParms [commodityId=" + commodityId + ", commodityName=" + commodityName + ", categoryId=" + categoryId
                + ", brandId=" + brandId + ", commodIds=" + commodIds
                + ", pageSize=" + pageSize + ", shopMids=" + shopMids
                + ", currentPage=" + currentPage + "]";
    }
}
