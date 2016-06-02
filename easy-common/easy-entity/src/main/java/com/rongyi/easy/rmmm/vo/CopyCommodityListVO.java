package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 抄同款返回的商品列表
 * @author user
 *
 */
public class CopyCommodityListVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<CopyCommodityVO> copyCommodityList;//抄同款返回的商品列表
	public List<CopyCommodityVO> getCopyCommodityList() {
		return copyCommodityList;
	}
	public void setCopyCommodityList(List<CopyCommodityVO> copyCommodityList) {
		this.copyCommodityList = copyCommodityList;
	}
	
}
