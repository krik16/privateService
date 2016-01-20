/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年11月18日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月18日               1.0              创建文件
 */
public class RebateParam extends MalllifeBaseParam implements Serializable{
	
	private String platformRebateCode;//抵扣券券码
	
	private String coord_x;//经度
	
	private String coord_y;//纬度
	
	private String couponId;//代金券id
	
	private Integer num;//代金券购买数量
	
	private Double couponUnitPrice;//代金券单价
	
	private String status;//1 已使用 2已失效

	public RebateParam() {
		super();
	}

	public RebateParam(String couponId, Integer num, Double couponUnitPrice) {
		super();
		this.couponId = couponId;
		this.num = num;
		this.couponUnitPrice = couponUnitPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getCouponUnitPrice() {
		return couponUnitPrice;
	}

	public void setCouponUnitPrice(Double couponUnitPrice) {
		this.couponUnitPrice = couponUnitPrice;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getPlatformRebateCode() {
		return platformRebateCode;
	}

	public void setPlatformRebateCode(String platformRebateCode) {
		this.platformRebateCode = platformRebateCode;
	}

	public String getCoord_x() {
		return coord_x;
	}

	public void setCoord_x(String coord_x) {
		this.coord_x = coord_x;
	}

	public String getCoord_y() {
		return coord_y;
	}

	public void setCoord_y(String coord_y) {
		this.coord_y = coord_y;
	}

	@Override
	public String toString() {
		return "RebateParam [platformRebateCode=" + platformRebateCode + ", coord_x=" + coord_x + ", coord_y=" + coord_y + "]";
	}

}
