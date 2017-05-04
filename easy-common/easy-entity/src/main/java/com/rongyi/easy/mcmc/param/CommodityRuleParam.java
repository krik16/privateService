package com.rongyi.easy.mcmc.param;

import com.rongyi.core.annotation.NeedCheck;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yaoyiwei on 2016/9/27.
 */
public class CommodityRuleParam implements Serializable {
    private String id;
    private String keyword;
    private String buyerId;
    private String shopId;
    private String shopMid;
    private List<String> shopIds;
    private List<String> shopMids;
    private Integer orderBy = 0;
    private Integer currentPage = 1;
    private Integer pageSize = 10;
    private String category;
    private List<String> categoryIds;
    private Integer identity;
    private Integer status;
    private Integer statusType; //1:上架  2:上架和待上架 3:非删除
    private String code;
    private String brandId;
    private String brandMid;
    private List<String> brandIds;
    private List<String> brandMids;
    private String mallId;
    private String mallMid;
    private String type;
    private String name;
    private List<ObjectId> ids;
    private String liveId;
    private String create_by;
    private String updateBy;
    private Integer commodityRange;
    private String systemNumber;
    private Boolean noTemplate = false;
    private Boolean picExists = false;
    private Boolean notBuyer = false;
    private String terminalType;
    private List<String> terminalTypes;

    public Boolean getNoTemplate() {
        return noTemplate;
    }

    public void setNoTemplate(Boolean noTemplate) {
        this.noTemplate = noTemplate;
    }

    @NeedCheck(getFieldName = "systemNumber")
    public String getSystemNumber() {
		return systemNumber;
	}
    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public List<String> getTerminalTypes() {
        return terminalTypes;
    }

    public void setTerminalTypes(List<String> terminalTypes) {
        this.terminalTypes = terminalTypes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getNotBuyer() {
        return notBuyer;
    }

    public void setNotBuyer(Boolean notBuyer) {
        this.notBuyer = notBuyer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getPicExists() {
        return picExists;
    }

    public void setPicExists(Boolean picExists) {
        this.picExists = picExists;
    }

	public void setSystemNumber(String systemNumber) {
		this.systemNumber = systemNumber;
	}

	public Integer getCommodityRange() {
        return commodityRange;
    }

    public void setCommodityRange(Integer commodityRange) {
        this.commodityRange = commodityRange;
    }

    public Integer getStatusType() {
        return statusType;
    }

    public void setStatusType(Integer statusType) {
        this.statusType = statusType;
    }

    @NeedCheck(getFieldName = "shopMids")
    public List<String> getShopMids() {
        return shopMids;
    }

    public void setShopMids(List<String> shopMids) {
        this.shopMids = shopMids;
    }

    @NeedCheck(getFieldName = "brandMid")
    public String getBrandMid() {
        return brandMid;
    }

    public void setBrandMid(String brandMid) {
        this.brandMid = brandMid;
    }

    @NeedCheck(getFieldName = "brandMids")
    public List<String> getBrandMids() {
        return brandMids;
    }

    public void setBrandMids(List<String> brandMids) {
        this.brandMids = brandMids;
    }

    @NeedCheck(getFieldName = "shopIds")
    public List<String> getShopIds() {
        return shopIds;
    }

    public void setShopIds(List<String> shopIds) {
        this.shopIds = shopIds;
    }

    public List<String> getBrandIds() {
        return brandIds;
    }

    public void setBrandIds(List<String> brandIds) {
        this.brandIds = brandIds;
    }

    @NeedCheck(getFieldName = "create_by")
    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getLiveId() {
        return liveId;
    }

    public void setLiveId(String liveId) {
        this.liveId = liveId;
    }

    @NeedCheck(getFieldName = "ids")
    public List<ObjectId> getIds() {
        return ids;
    }

    public void setIds(List<ObjectId> ids) {
        this.ids = ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NeedCheck(getFieldName = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @NeedCheck(getFieldName = "mallMid")
    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
    }

    @NeedCheck(getFieldName = "mallId")
    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    @NeedCheck(getFieldName = "brandId")
    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    @NeedCheck(getFieldName = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @NeedCheck(getFieldName = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @NeedCheck(getFieldName = "shopMid")
    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    @NeedCheck(getFieldName = "shopId")
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
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

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    @NeedCheck(getFieldName = "categoryIds")
    public List<String> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }
    
	public String getUpdateBy() {
		return updateBy;
	}
	
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
}
