package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 购物车VO
 * 
 * @author chenjun
 * 
 */
public class ShoppingCartVO implements Serializable{

	private String shopId;// 店铺mongoId
	private String shopName;// 店铺名称
	private String shopLogo;// 店铺logo	
	private String mallName;// 商场名称
	private String guideLogo;// 品导购或买手logo
	private String guideName;// 导购或买手名字
	private String guideImId;// 导购或买手环信账号
	private Integer guideId;//导购或买手id
	private Integer guideType = 1;//1导购 2买手
	private List<ShowCartCommodityVO> commodityList;// 商品信息列表
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
	public String getShopLogo() {
		return shopLogo;
	}
	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getGuideLogo() {
		return guideLogo;
	}
	public void setGuideLogo(String guideLogo) {
		this.guideLogo = guideLogo;
	}
	public String getGuideName() {
		return guideName;
	}
	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}
	public String getGuideImId() {
		return guideImId;
	}
	public void setGuideImId(String guideImId) {
		this.guideImId = guideImId;
	}
	public Integer getGuideId() {
		return guideId;
	}
	public void setGuideId(Integer guideId) {
		this.guideId = guideId;
	}
	public Integer getGuideType() {
		return guideType;
	}
	public void setGuideType(Integer guideType) {
		this.guideType = guideType;
	}
	public List<ShowCartCommodityVO> getCommodityList() {
		return commodityList;
	}
	public void setCommodityList(List<ShowCartCommodityVO> commodityList) {
		this.commodityList = commodityList;
	}
	@Override
	public String toString() {
		return "ShoppingCartVO [shopId=" + shopId + ", shopName=" + shopName + ", shopLogo=" + shopLogo + ", mallName="
				+ mallName + ", guideLogo=" + guideLogo + ", guideName=" + guideName + ", guideImId=" + guideImId + ", guideId="
				+ guideId + ", guideType=" + guideType + ", commodityList=" + commodityList + "]";
	}

}
