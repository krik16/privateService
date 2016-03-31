package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.rmmm.base.BaseParam;
/**
 * 获取直播商品的地址和品牌参数
 * @author user
 *
 */
public class CommodityLiveParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> commodityIds;//商品id集合

	public List<String> getCommodityIds() {
		return commodityIds;
	}

	public void setCommodityIds(List<String> commodityIds) {
		this.commodityIds = commodityIds;
	}
	
	
}
