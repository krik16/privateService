package com.rongyi.easy.roa.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
/**
 * 
 * @author user
 *
 */
public class WechatCommodityParam extends MalllifeBaseParam implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String commodityId;//商品id
	private List<String> commodityIds;

	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public List<String> getCommodityIds() {
		return commodityIds;
	}

	public void setCommodityIds(List<String> commodityIds) {
		this.commodityIds = commodityIds;
	}
}
