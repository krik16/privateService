/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.vo.CommoditySpecColumnVO;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年5月28日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年5月28日 1.0 创建文件
 */
public class SonDetailListVO implements Serializable {

	private String num;// 下单数量

	private List<CommoditySpecColumnVO> specColumnValues;// 规格参数

	private String commodityPic;// 商品图片

	private String commodityCurrentPrice;// 商品现价

	private String commodityOriginalPrice;// 商品原价

	private String commodityId;// 商品编号

	private String commodityName;// 商品名称

	private String sonOrderId;// 子订单id

	private String commodityCommission;// 商品佣金

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

	public String getSonOrderId() {
		return sonOrderId;
	}

	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}

	public String getCommodityCommission() {
		return commodityCommission;
	}

	public void setCommodityCommission(String commodityCommission) {
		this.commodityCommission = commodityCommission;
	}

	@Override
	public String toString() {
		return "SonDetailListVO{" +
				"num='" + num + '\'' +
				", specColumnValues=" + specColumnValues +
				", commodityPic='" + commodityPic + '\'' +
				", commodityCurrentPrice='" + commodityCurrentPrice + '\'' +
				", commodityOriginalPrice='" + commodityOriginalPrice + '\'' +
				", commodityId='" + commodityId + '\'' +
				", commodityName='" + commodityName + '\'' +
				", sonOrderId='" + sonOrderId + '\'' +
				", commodityCommission='" + commodityCommission + '\'' +
				'}';
	}
}
