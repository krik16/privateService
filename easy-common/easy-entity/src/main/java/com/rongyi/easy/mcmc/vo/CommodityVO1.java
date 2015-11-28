package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.mongodb.morphia.annotations.Entity;

@Entity("mcmc_commodity")
public class CommodityVO1 implements  Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = -3022699601318372490L;
	
	private String id;//系统编号
	private String name;//商品名称
	private Integer status;//状态 0下架 1上架 (当前时间在上架时间和下架时间之间)2是删除3待上架4待处理 
	private String code;//商品编码
	private Integer remain;//商品库存
	
	private String originalPrice;//商品原价
	private String currentPrice;//商品现价
	private List<CommodityVOByColor> specList;//商品规格列表
	private List<String> categoryIds;//商品所属的品类列表

	private Date time;//相关时间
	private String update_by;//修改人
	private Integer source;//来源
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getRemain() {
		return remain;
	}
	public void setRemain(Integer remain) {
		this.remain = remain;
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
	public List<CommodityVOByColor> getSpecList() {
		return specList;
	}
	public void setSpecList(List<CommodityVOByColor> specList) {
		this.specList = specList;
	}
	public List<String> getCategoryIds() {
		return categoryIds;
	}
	public void setCategoryIds(List<String> categoryIds) {
		this.categoryIds = categoryIds;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	public Integer getSource() {
		return source;
	}
	public void setSource(Integer source) {
		this.source = source;
	}

	
}
