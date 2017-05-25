package com.rongyi.easy.mcmc.vo.commodity.new1;

import com.rongyi.easy.mcmc.CommodityShopInfo;

import java.io.Serializable;

/**
 *  发布、编辑商品时，方法参数详情类
 */
public class CommodityFunctionParamVO implements  Serializable, Cloneable {

	private static final long serialVersionUID = 8138633174546500349L;
	private String shopId;
	private Integer brandId;
	private String mallId;
	private String mallMid;
	private String brandName;
	private String shopNum;
	private CommodityShopInfo shopInfo;
	private String brandMid;
	private boolean isBuyer = false; // 是否是买手。默认非买手
	private boolean sourceParamIsApp = false; // 本次操作的来源: 是否app。默认false

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getShopNum() {
		return shopNum;
	}

	public void setShopNum(String shopNum) {
		this.shopNum = shopNum;
	}

	public CommodityShopInfo getShopInfo() {
		return shopInfo;
	}

	public void setShopInfo(CommodityShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

	public String getBrandMid() {
		return brandMid;
	}

	public void setBrandMid(String brandMid) {
		this.brandMid = brandMid;
	}

	public boolean isBuyer() {
		return isBuyer;
	}

	public void setBuyer(boolean buyer) {
		isBuyer = buyer;
	}

	public boolean isSourceParamIsApp() {
		return sourceParamIsApp;
	}

	public void setSourceParamIsApp(boolean sourceParamIsApp) {
		this.sourceParamIsApp = sourceParamIsApp;
	}

	@Override
	public String toString() {
		return "CommodityFunctionParamVO{" +
				"shopId='" + shopId + '\'' +
				", brandId=" + brandId +
				", mallId='" + mallId + '\'' +
				", mallMid='" + mallMid + '\'' +
				", brandName='" + brandName + '\'' +
				", shopNum='" + shopNum + '\'' +
				", shopInfo=" + shopInfo +
				", brandMid='" + brandMid + '\'' +
				", isBuyer=" + isBuyer +
				", sourceParamIsApp=" + sourceParamIsApp +
				'}';
	}
}
