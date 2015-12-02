package com.rongyi.settle.web.controller.params;

/**
 * Created by Ventures on 2015/12/2.
 * 关联参数
 */
public class RelevanceParam {

    private String id;//关联id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Integer currPage;
    private Integer pageSize;
    private Integer type;//类型（0:店铺，1:商场，2: 品牌，3: 分公司，4:集团公司）
    private String shopName;//店铺名称（店铺查询使用）
    private String shopId;//店铺id（店铺查询使用）
    private String zoneId;//区域id，店铺/商场地址（店铺/商场查询使用，去最小地址id）
    private String mallName;//商场名称（商场查询使用）
    private String mallId;//商场Id（商场查询使用）
    private String filialeName;//分公司名称（分公司查询使用）
    private String filialeId;//分公司id（分公司查询使用）
    private String brandId;//品牌id（分公司 / 品牌查询使用）
    private String brandNameC;//品牌中文名称（品牌查询使用）
    private String BrandNameE;//品牌中文名（品牌查询使用）
    private String groupId;//集团id（集团查询使用）
    private String groupName;//集团名称（集团查询使用）

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getFilialeName() {
        return filialeName;
    }

    public void setFilialeName(String filialeName) {
        this.filialeName = filialeName;
    }

    public String getFilialeId() {
        return filialeId;
    }

    public void setFilialeId(String filialeId) {
        this.filialeId = filialeId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandNameC() {
        return brandNameC;
    }

    public void setBrandNameC(String brandNameC) {
        this.brandNameC = brandNameC;
    }

    public String getBrandNameE() {
        return BrandNameE;
    }

    public void setBrandNameE(String brandNameE) {
        BrandNameE = brandNameE;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "RelevanceParam{" +
                "id=" + id +
                ", currPage=" + currPage +
                ", pageSize=" + pageSize +
                ", type=" + type +
                ", shopName='" + shopName + '\'' +
                ", shopId='" + shopId + '\'' +
                ", zoneId='" + zoneId + '\'' +
                ", mallName='" + mallName + '\'' +
                ", mallId='" + mallId + '\'' +
                ", filialeName='" + filialeName + '\'' +
                ", filialeId='" + filialeId + '\'' +
                ", brandId='" + brandId + '\'' +
                ", brandNameC='" + brandNameC + '\'' +
                ", BrandNameE='" + BrandNameE + '\'' +
                ", groupId='" + groupId + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
