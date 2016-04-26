package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.vo.CommoditySpecColumnVO;

/**
 * 购物车列表商品VO
 * 
 * @author chenjun
 * 
 */
public class ShowCartCommodityVO implements Serializable{
	private Integer shopCartId;
	private String commodityId;// 我是商品编号
	private String commodityName;// 我是商品名称
	private String specId;// 我是规格编号
	private List<CommoditySpecColumnVO> specColumnValues;// 我是规格参数list
	private String commodityOriginalPrice;// 我是商品原价
	private String commodityCurrentPrice;// 我是商品现价
	private Integer commodityCount;// 商品数量
	private String commodityPic;// 商品图片
	private String commodityStock;// 商品库存
	private String commodityPostage;// 邮费
	private int commodityAppStatus;// 商品状态 0下架 1上架 3待上架
	private String supportWay;//1仅支持自提 2仅支持快递 3都支持
	private Integer purchaseCount;// 限购数量     小于0不限购  大于等于0 限购
	public Integer getPurchaseCount() {
		return purchaseCount;
	}
	public void setPurchaseCount(Integer purchaseCount) {
		this.purchaseCount = purchaseCount;
	}
	public Integer getShopCartId() {
		return shopCartId;
	}
	public void setShopCartId(Integer shopCartId) {
		this.shopCartId = shopCartId;
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
	public String getSpecId() {
		return specId;
	}
	public void setSpecId(String specId) {
		this.specId = specId;
	}
	public List<CommoditySpecColumnVO> getSpecColumnValues() {
		return specColumnValues;
	}
	public void setSpecColumnValues(List<CommoditySpecColumnVO> specColumnValues) {
		this.specColumnValues = specColumnValues;
	}
	public String getCommodityOriginalPrice() {
		return commodityOriginalPrice;
	}
	public void setCommodityOriginalPrice(String commodityOriginalPrice) {
		this.commodityOriginalPrice = commodityOriginalPrice;
	}
	public String getCommodityCurrentPrice() {
		return commodityCurrentPrice;
	}
	public void setCommodityCurrentPrice(String commodityCurrentPrice) {
		this.commodityCurrentPrice = commodityCurrentPrice;
	}
	public Integer getCommodityCount() {
		return commodityCount;
	}
	public void setCommodityCount(Integer commodityCount) {
		this.commodityCount = commodityCount;
	}
	public String getCommodityPic() {
		return commodityPic;
	}
	public void setCommodityPic(String commodityPic) {
		this.commodityPic = commodityPic;
	}
	public String getCommodityStock() {
		return commodityStock;
	}
	public void setCommodityStock(String commodityStock) {
		this.commodityStock = commodityStock;
	}
	public String getCommodityPostage() {
		return commodityPostage;
	}
	public void setCommodityPostage(String commodityPostage) {
		this.commodityPostage = commodityPostage;
	}
	
	public int getCommodityAppStatus() {
		return commodityAppStatus;
	}
	public void setCommodityAppStatus(int commodityAppStatus) {
		this.commodityAppStatus = commodityAppStatus;
	}
	public String getSupportWay() {
		return supportWay;
	}
	public void setSupportWay(String supportWay) {
		this.supportWay = supportWay;
	}
	@Override
	public String toString() {
		return "ShowCartCommodityVO [shopCartId=" + shopCartId + 
				", commodityId=" + commodityId + 
				", commodityName=" + commodityName + 
				", specId=" + specId + 
				", specColumnValues=" + specColumnValues + 
				", commodityOriginalPrice=" + commodityOriginalPrice + 
				", commodityCurrentPrice=" + commodityCurrentPrice + 
				", commodityCount=" + commodityCount + 
				", commodityPic=" + commodityPic + 
				", commodityStock=" + commodityStock
				+ ", commodityPostage=" + commodityPostage + 
				", commodityAppStatus=" + commodityAppStatus + 
				", supportWay=" + supportWay + 
				", purchaseCount=" + purchaseCount +
				"]";
	}

}
