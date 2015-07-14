package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.vo.CommoditySpecColumnVO;

/**
 * 购物车列表商品VO
 * 
 * @author zzp
 * 
 */
public class ShowCartCommodityVO implements Serializable{
	private String id;
	private String commodityId;// 我是商品编号
	private String commodityName;// 我是商品名称
	private String specId;// 我是规格编号
	private List<CommoditySpecColumnVO> specColumnValues;// 我是规格参数list
	private String commodityOriginalPrice;// 我是商品原价
	private String commodityCurrentPrice;// 我是商品现价
	private String commodityCount;// 商品数量
	private String commodityPic;// 商品图片
	private String stock;// 商品库存
	private String commodityPostage;// 邮费
	private String commodityStatus;// 是否下架 0 是下架 1是上架

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getCommodityCount() {
		return commodityCount;
	}

	public void setCommodityCount(String commodityCount) {
		this.commodityCount = commodityCount;
	}

	public String getCommodityPic() {
		return commodityPic;
	}

	public void setCommodityPic(String commodityPic) {
		this.commodityPic = commodityPic;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getCommodityPostage() {
		return commodityPostage;
	}

	public void setCommodityPostage(String commodityPostage) {
		this.commodityPostage = commodityPostage;
	}

	public String getCommodityStatus() {
		return commodityStatus;
	}

	public void setCommodityStatus(String commodityStatus) {
		this.commodityStatus = commodityStatus;
	}

}
