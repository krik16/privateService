package com.rongyi.easy.roa.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

public class SearchCommodityBrandParam extends MalllifeBaseParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallId;		//商场id
	private String keywords;	//搜索关键词
	
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	
	@Override
	public String toString() {
		return super.toString() + "SearchCommodityBrandParam [mallId=" + mallId + ", keywords=" + keywords + "]";
	}
}
