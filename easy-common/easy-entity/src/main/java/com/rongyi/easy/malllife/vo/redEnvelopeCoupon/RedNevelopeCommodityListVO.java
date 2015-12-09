package com.rongyi.easy.malllife.vo.redEnvelopeCoupon;

import java.io.Serializable;
import java.util.List;
/**
 * 可使用红包的商品列表
 * @author user
 *
 */
public class RedNevelopeCommodityListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<RedNevelopeCommodityVO> commodityList;//

	public List<RedNevelopeCommodityVO> getCommodityList() {
		return commodityList;
	}

	public void setCommodityList(List<RedNevelopeCommodityVO> commodityList) {
		this.commodityList = commodityList;
	}
	
}
