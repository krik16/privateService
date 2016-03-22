package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rongyi.easy.mcmc.constant.CommodityTerminalType;
import com.rongyi.easy.mcmc.mvc.DateJson.JsonDateSerializer;

public class CommodityVO1 implements  Serializable {
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
	@JsonSerialize(using=JsonDateSerializer.class)
	private Date time;//相关时间
	private String update_by;//修改人
	private Integer source;//来源
	private String reason;//审核失败原因

	private int identity = 5;//0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购6买手
	private Integer terminalType = 1; // com.rongyi.easy.mcmc.constant.CommodityTerminalType常量定义
	private String terminalTypeDesc = CommodityTerminalType.CommodityTerminalCommon.getName(terminalType);

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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}
	public Integer getTerminalType() {
		return terminalType;
	}
	
	public void setTerminalType(Integer terminalType) {
		this.terminalType = terminalType;
	}
	
	public String getTerminalTypeDesc() {
		return terminalTypeDesc;
	}
	
	public void setTerminalTypeDesc(String terminalTypeDesc) {
		this.terminalTypeDesc = terminalTypeDesc;
	}
	
}
