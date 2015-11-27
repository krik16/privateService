/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.vo.CommodityBuyerVO;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年11月18日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月18日               1.0              创建文件
 */
public class RebateVO implements Serializable{
	
	private Double originalPrice;//满多少元

	private Double currentPrice;//抵扣多少元
	
	private String validStartTime;//有效期开始
	
	private String validEndTime;//有效期结束时间
	
	private String platformRebateId;//抵扣券id
	
	private String platformRebateCode;//抵扣券券码
	
	private String useDescription;//使用范围说明
	
	private Integer status;//状态 ：0未使用 1已使用 2 已过期
	
	private String desc;//未满足使用条件
	
	private Integer applyScope;// 0都适用 1商品适用 2代金券适用
	
	private List<CommodityBuyerVO> commodityList;//可使用商品列表
	
	private List<RebateCouponVO> couponList;//可使用代金券列表

	public Integer getApplyScope() {
		return applyScope;
	}

	public void setApplyScope(Integer applyScope) {
		this.applyScope = applyScope;
	}

	public Double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getValidStartTime() {
		return validStartTime;
	}

	public void setValidStartTime(String validStartTime) {
		this.validStartTime = validStartTime;
	}

	public String getValidEndTime() {
		return validEndTime;
	}

	public void setValidEndTime(String validEndTime) {
		this.validEndTime = validEndTime;
	}

	public String getPlatformRebateId() {
		return platformRebateId;
	}

	public void setPlatformRebateId(String platformRebateId) {
		this.platformRebateId = platformRebateId;
	}

	public String getPlatformRebateCode() {
		return platformRebateCode;
	}

	public void setPlatformRebateCode(String platformRebateCode) {
		this.platformRebateCode = platformRebateCode;
	}

	public String getUseDescription() {
		return useDescription;
	}

	public void setUseDescription(String useDescription) {
		this.useDescription = useDescription;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<CommodityBuyerVO> getCommodityList() {
		return commodityList;
	}

	public void setCommodityList(List<CommodityBuyerVO> commodityList) {
		this.commodityList = commodityList;
	}

	public List<RebateCouponVO> getCouponList() {
		return couponList;
	}

	public void setCouponList(List<RebateCouponVO> couponList) {
		this.couponList = couponList;
	}

	@Override
	public String toString() {
		return "RebateVO [originalPrice=" + originalPrice + ", currentPrice=" + currentPrice + ", validStartTime="
				+ validStartTime + ", validEndTime=" + validEndTime + ", platformRebateId=" + platformRebateId
				+ ", platformRebateCode=" + platformRebateCode + ", useDescription=" + useDescription + ", status=" + status
				+ ", desc=" + desc + ", applyScope=" + applyScope + ", commodityList=" + commodityList
				+ ", couponList=" + couponList + "]";
	}

}
