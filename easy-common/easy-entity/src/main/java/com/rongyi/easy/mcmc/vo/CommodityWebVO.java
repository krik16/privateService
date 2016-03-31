package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.Date;

import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.constant.CommodityDataStatus;

public class CommodityWebVO implements Serializable, CommodityDataStatus {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String category;
	private boolean status;
	private String stock;
	private String sold;
	private String originalPrice;
	private String currentPrice;
	private Date updateAt;
	private String code;//系统编码
	private String commodityCategory;//商品的分类
	private String shopName;//店铺名字
	private String mallName;//商场名字
	private boolean cashCoupon=false;//是否关联了现金卷
	private String postage;
	private String descrite;//商品描述
	private String typeName; //渠道  1商家，2买手
	private String spotName;// 是否现货
	public CommodityWebVO(){
		
	}
	
	public String getDescrite() {
		return descrite;
	}

	public void setDescrite(String descrite) {
		this.descrite = descrite;
	}

	public CommodityWebVO(Commodity commodity){
		this.id = commodity.getId().toString();
		this.name = commodity.getName();
		if(commodity.getStatus() == STATUS_COMMODITY_UNSHELVE){
			this.status = false;
		}else{
			this.status = true;
		}
		this.stock = String.valueOf(commodity.getStock());
		this.sold = String.valueOf(commodity.getSold());
		this.originalPrice = commodity.getOriginalPrice();
		this.currentPrice = commodity.getCurrentPrice();
		this.updateAt = commodity.getUpdateAt();
		this.code=commodity.getCode();
		this.postage=commodity.getPostage();
		this.descrite=commodity.getDescription();
		this.typeName = (commodity.getType() == 1 ? "买手" : "商家");
		if (commodity.getType() == 1) {
			this.spotName = (commodity.isSpot() ? "自采" : "非自采");
		} else {
			this.spotName = "";
		}
	}
	
	
	public String getPostage() {
		return postage;
	}

	public void setPostage(String postage) {
		this.postage = postage;
	}

	public boolean isCashCoupon() {
		return cashCoupon;
	}

	public void setCashCoupon(boolean cashCoupon) {
		this.cashCoupon = cashCoupon;
	}

	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCommodityCategory() {
		return commodityCategory;
	}
	public void setCommodityCategory(String commodityCategory) {
		this.commodityCategory = commodityCategory;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getSold() {
		return sold;
	}
	public void setSold(String sold) {
		this.sold = sold;
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

	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getSpotName() {
		return spotName;
	}

	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}
}
