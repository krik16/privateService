package com.rongyi.easy.malllife.vo;

import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Commodity implements Serializable{
    private ObjectId id;

    private String name;//商品名称
    private String category;//商品品类id
    private String shopId;//店铺id
    private String shopMid;//店铺的mongoid
    private int status;//状态 1上架 0下架
    private String code;//商品编码
    private String description;//商品描述
    private String postage;//商品邮费
    private int stock;//商品库存
    private int sold;//商品销量
    private Date createAt;//数据创建日期
    private Date updateAt;//数据更新日期
    private String originalPrice;//商品原价
    private String currentPrice;//商品现价
    private List<String> picList;//商品图片列表
    private List<ObjectId> specList;//商品规格列表
    private boolean supportCourierDeliver;//支持快递发货    导购：true是   false否；买手：默认true   
   	private boolean supportSelfPickup;//支持到店自提  true 是    false否

    private double price;//商品价格（现价最低价，用于排序）
    private String brandId;//商品所属品牌id
    private String mallId;//商品所属商场id
    private List<ObjectId> categoryIds;//商品所属的品类列表
//  private int commentCount;
//  private int highCommentCount;
//  private int mediumCommentCount;
//  private int lowCommentCount;
    
//  public int getCommentCount() {
//      return commentCount;
//  }
//  public void setCommentCount(int commentCount) {
//      this.commentCount = commentCount;
//  }
//  public int getHighCommentCount() {
//      return highCommentCount;
//  }
//  public void setHighCommentCount(int highCommentCount) {
//      this.highCommentCount = highCommentCount;
//  }
//  public int getMediumCommentCount() {
//      return mediumCommentCount;
//  }
//  public void setMediumCommentCount(int mediumCommentCount) {
//      this.mediumCommentCount = mediumCommentCount;
//  }
//  public int getLowCommentCount() {
//      return lowCommentCount;
//  }
//  public void setLowCommentCount(int lowCommentCount) {
//      this.lowCommentCount = lowCommentCount;
//  }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getBrandId() {
        return brandId;
    }
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }
    public String getMallId() {
        return mallId;
    }
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }
    public boolean isSupportCourierDeliver() {
		return supportCourierDeliver;
	}
	public void setSupportCourierDeliver(boolean supportCourierDeliver) {
		this.supportCourierDeliver = supportCourierDeliver;
	}
	public boolean isSupportSelfPickup() {
		return supportSelfPickup;
	}
	public void setSupportSelfPickup(boolean supportSelfPickup) {
		this.supportSelfPickup = supportSelfPickup;
	}
	public List<ObjectId> getCategoryIds() {
        return categoryIds;
    }
    public void setCategoryIds(List<ObjectId> categoryIds) {
        this.categoryIds = categoryIds;
    }
    private String oPriceMax;//商品原最高价（用于买家版）
    private String oPriceMin;//商品原最低价（用于买家版）
    private String cPriceMax;//商品现最高价（用于买家版）
    private String cPriceMin;//商品现最高价（用于买家版）

    public String getoPriceMax() {
        return oPriceMax;
    }
    public void setoPriceMax(String oPriceMax) {
        this.oPriceMax = oPriceMax;
    }
    public String getoPriceMin() {
        return oPriceMin;
    }
    public void setoPriceMin(String oPriceMin) {
        this.oPriceMin = oPriceMin;
    }
    public String getcPriceMax() {
        return cPriceMax;
    }
    public void setcPriceMax(String cPriceMax) {
        this.cPriceMax = cPriceMax;
    }
    public String getcPriceMin() {
        return cPriceMin;
    }
    public void setcPriceMin(String cPriceMin) {
        this.cPriceMin = cPriceMin;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getShopId() {
        return shopId;
    }
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPostage() {
        return postage;
    }
    public void setPostage(String postage) {
        this.postage = postage;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getSold() {
        return sold;
    }
    public void setSold(int sold) {
        this.sold = sold;
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
    public String getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }
    public String getCurrentPrice() {
        return currentPrice;
    }
    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }
    public List<String> getPicList() {
        return picList;
    }
    public void setPicList(List<String> picList) {
        this.picList = picList;
    }
    public List<ObjectId> getSpecList() {
        return specList;
    }
    public void setSpecList(List<ObjectId> specList) {
        this.specList = specList;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
    
}
