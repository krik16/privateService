/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.vo.CommoditySpecColumnVO;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年5月19日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年5月19日 1.0 创建文件
 */
public class OrderDetailModelParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String commodityId;// 商品编号
	private String specId;// 商品规格
	private String commodityCommission;// 商品佣金
	private String orderDetailModelId;// 子模板id
	private String num;// 商品数量
	private String commodityAppStatus;//商品状态 0下架 1上架
	private Integer commodityStock;//商品库存

	private List<CommoditySpecColumnVO> specColumnValues;// 规格参数

	private String commodityPic;// 商品图片

	private String commodityCurrentPrice;// 商品现价

	private String commodityOriginalPrice;// 商品原价

	private String commodityName;// 商品名称

	private String commodityPostage;// 邮费
	
	private boolean supportCourierDeliver = true;//支持快递发货字段  true 是    false否

	private boolean supportSelfPickup = true;//支持到店自提  true 是    false否
	
	private Integer hongBaoNum = 0;// 可使用红包数量
	
	private String supportWay;//1仅支持自提 2仅支持快递 3都支持
	
	private String couponCode;//红包券码
	
	private String couponName;//红包名称
	
	private Double discount;// 红包抵扣金额

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getSupportWay() {
		if(supportCourierDeliver && supportSelfPickup){
			return "3";
		}else if(supportCourierDeliver && !supportSelfPickup){
			return "2";
		}else if(!supportCourierDeliver && supportSelfPickup){
			return "1";
		}
		return "0";
	}

	public void setSupportWay(String supportWay) {
		this.supportWay = supportWay;
	}

	public Integer getHongBaoNum() {
		return hongBaoNum;
	}

	public void setHongBaoNum(Integer hongBaoNum) {
		this.hongBaoNum = hongBaoNum;
	}

	public boolean isSupportCourierDeliver() {
		return supportCourierDeliver;
	}

	public void setSupportCourierDeliver(boolean supportCourierDeliver) {
		this.supportCourierDeliver = supportCourierDeliver;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getSpecId() {
		return specId;
	}

	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public String getCommodityCommission() {
		return commodityCommission;
	}

	public void setCommodityCommission(String commodityCommission) {
		this.commodityCommission = commodityCommission;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public List<CommoditySpecColumnVO> getSpecColumnValues() {
		return specColumnValues;
	}

	public void setSpecColumnValues(List<CommoditySpecColumnVO> specColumnValues) {
		this.specColumnValues = specColumnValues;
	}

	public String getCommodityPic() {
		return commodityPic;
	}

	public void setCommodityPic(String commodityPic) {
		this.commodityPic = commodityPic;
	}

	public String getCommodityCurrentPrice() {
		return commodityCurrentPrice;
	}

	public void setCommodityCurrentPrice(String commodityCurrentPrice) {
		this.commodityCurrentPrice = commodityCurrentPrice;
	}

	public String getCommodityOriginalPrice() {
		return commodityOriginalPrice;
	}

	public void setCommodityOriginalPrice(String commodityOriginalPrice) {
		this.commodityOriginalPrice = commodityOriginalPrice;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getOrderDetailModelId() {
		return orderDetailModelId;
	}

	public void setOrderDetailModelId(String orderDetailModelId) {
		this.orderDetailModelId = orderDetailModelId;
	}

	public String getCommodityPostage() {
		return commodityPostage;
	}

	public void setCommodityPostage(String commodityPostage) {
		this.commodityPostage = commodityPostage;
	}

	public boolean isSupportSelfPickup() {
		return supportSelfPickup;
	}

	public void setSupportSelfPickup(boolean supportSelfPickup) {
		this.supportSelfPickup = supportSelfPickup;
	}

	public String getCommodityAppStatus() {
		return commodityAppStatus;
	}

	public void setCommodityAppStatus(String commodityAppStatus) {
		this.commodityAppStatus = commodityAppStatus;
	}

	public Integer getCommodityStock() {
		return commodityStock;
	}

	public void setCommodityStock(Integer commodityStock) {
		this.commodityStock = commodityStock;
	}

	@Override
	public String toString() {
		return "OrderDetailModelParam{" +
				"commodityId='" + commodityId + '\'' +
				", specId='" + specId + '\'' +
				", commodityCommission='" + commodityCommission + '\'' +
				", orderDetailModelId='" + orderDetailModelId + '\'' +
				", num='" + num + '\'' +
				", specColumnValues=" + specColumnValues +
				", commodityPic='" + commodityPic + '\'' +
				", commodityCurrentPrice='" + commodityCurrentPrice + '\'' +
				", commodityOriginalPrice='" + commodityOriginalPrice + '\'' +
				", commodityName='" + commodityName + '\'' +
				", commodityPostage='" + commodityPostage + '\'' +
				", supportCourierDeliver=" + supportCourierDeliver +
				", supportSelfPickup=" + supportSelfPickup +
				", commodityAppStatus=" + commodityAppStatus +
				", commodityStock=" + commodityStock +
				'}';
	}
}
