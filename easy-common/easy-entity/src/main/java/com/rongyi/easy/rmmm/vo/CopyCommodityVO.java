package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.vo.CommoditySpecVO;
/**
 * 抄同款返回的商品数据
 * @author user
 *
 */
public class CopyCommodityVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commodityId;//商品id
	private List<String> commodityPicList;//商品图片集合
	private String commodityName;//商品名称
	private String commodityCode;//商品编号
	private String brandEName;//品牌英文名
	private String brandCName;//品牌中文名
	private String commodityOriginalPrice;//商品原价
	private String commodityCurrentPrice;//商品现价
	private String commodityNo;//商品款号
	private List<String> goodsParam;//商品参数
	private List<CommoditySpecVO> commoditySpecList;//商品规格信息
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public List<String> getCommodityPicList() {
		return commodityPicList;
	}
	public void setCommodityPicList(List<String> commodityPicList) {
		this.commodityPicList = commodityPicList;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getCommodityCode() {
		return commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}
	public String getBrandEName() {
		return brandEName;
	}
	public void setBrandEName(String brandEName) {
		this.brandEName = brandEName;
	}
	public String getBrandCName() {
		return brandCName;
	}
	public void setBrandCName(String brandCName) {
		this.brandCName = brandCName;
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
	public String getCommodityNo() {
		return commodityNo;
	}
	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}
	public List<String> getGoodsParam() {
		return goodsParam;
	}
	public void setGoodsParam(List<String> goodsParam) {
		this.goodsParam = goodsParam;
	}
	public List<CommoditySpecVO> getCommoditySpecList() {
		return commoditySpecList;
	}
	public void setCommoditySpecList(List<CommoditySpecVO> commoditySpecList) {
		this.commoditySpecList = commoditySpecList;
	}
	@Override
	public String toString() {
		return "CopyCommodityVO [commodityId=" + commodityId
				+ ", commodityPicList=" + commodityPicList + ", commodityName="
				+ commodityName + ", commodityCode=" + commodityCode
				+ ", brandEName=" + brandEName + ", brandCName=" + brandCName
				+ ", commodityOriginalPrice=" + commodityOriginalPrice
				+ ", commodityCurrentPrice=" + commodityCurrentPrice
				+ ", commodityNo=" + commodityNo + ", goodsParam=" + goodsParam
				+ ", commoditySpecList=" + commoditySpecList + "]";
	}
	
}
