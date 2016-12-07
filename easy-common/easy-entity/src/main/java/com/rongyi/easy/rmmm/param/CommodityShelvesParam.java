package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.rmmm.base.BaseParam;

public class CommodityShelvesParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5916099021514672586L;
	
	private List<String> commodityIds;//商品id集合

	public List<String> getCommodityIds() {
		return commodityIds;
	}

	public void setCommodityIds(List<String> commodityIds) {
		this.commodityIds = commodityIds;
	}

	@Override
	public String toString() {
		return "CommodityShelvesParam [commodityIds=" + commodityIds + "]";
	}
	
	
	
}
