package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.vo.CommodityBuyerVO;

public class ClearanceCommodityVO implements Serializable{

	private List<CommodityBuyerVO> list;// 清仓商品详情列表

	private String title = "标题";

	public List<CommodityBuyerVO> getList() {
		return list;
	}

	public void setList(List<CommodityBuyerVO> list) {
		this.list = list;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
