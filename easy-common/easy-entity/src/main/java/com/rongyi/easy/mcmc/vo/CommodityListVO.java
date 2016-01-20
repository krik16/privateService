package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

public class CommodityListVO implements Serializable{
	private static final long serialVersionUID = 2927430452258911558L;
	
	private List<CommodityVO1> commodityList;
	
	private Long commodityCategoryCount;//类别总数
	
	private Long commodityCount;//商品总数
	
	private Long  commodityOSCount;//上架商品数量
	
	private Long commodityWSCount;//待上架商品数量
	
	private Long commdoityFSCount;//已下架商品数量
	
	private Long commodityBPCount;//待处理商品数量
	
	private Long commodityCheckCount;//待审核商品数量
	
	private Long commodityCheckFailedCount;//审核失败数量
	
	public List<CommodityVO1> getCommodityList() {
		return commodityList;
	}

	public void setCommodityList(List<CommodityVO1> commodityList) {
		this.commodityList = commodityList;
	}

	public Long getCommodityCategoryCount() {
		return commodityCategoryCount;
	}

	public void setCommodityCategoryCount(Long commodityCategoryCount) {
		this.commodityCategoryCount = commodityCategoryCount;
	}

	public Long getCommodityCount() {
		return commodityCount;
	}

	public void setCommodityCount(Long commodityCount) {
		this.commodityCount = commodityCount;
	}

	public Long getCommodityOSCount() {
		return commodityOSCount;
	}

	public void setCommodityOSCount(Long commodityOSCount) {
		this.commodityOSCount = commodityOSCount;
	}

	public Long getCommodityWSCount() {
		return commodityWSCount;
	}

	public void setCommodityWSCount(Long commodityWSCount) {
		this.commodityWSCount = commodityWSCount;
	}

	public Long getCommdoityFSCount() {
		return commdoityFSCount;
	}

	public void setCommdoityFSCount(Long commdoityFSCount) {
		this.commdoityFSCount = commdoityFSCount;
	}

	public Long getCommodityBPCount() {
		return commodityBPCount;
	}

	public void setCommodityBPCount(Long commodityBPCount) {
		this.commodityBPCount = commodityBPCount;
	}

	public Long getCommodityCheckCount() {
		return commodityCheckCount;
	}

	public void setCommodityCheckCount(Long commodityCheckCount) {
		this.commodityCheckCount = commodityCheckCount;
	}

	public Long getCommodityCheckFailedCount() {
		return commodityCheckFailedCount;
	}

	public void setCommodityCheckFailedCount(Long commodityCheckFailedCount) {
		this.commodityCheckFailedCount = commodityCheckFailedCount;
	}
	
}
