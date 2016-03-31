package com.rongyi.easy.solr.result;

import java.io.Serializable;
import java.util.List;

public class ShopSearchResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7069638671878214433L;
	
	private SearchMeta meta;
	private List<ShopSearchInfo> result;
	public SearchMeta getMeta() {
		return meta;
	}
	public void setMeta(SearchMeta meta) {
		this.meta = meta;
	}
	public List<ShopSearchInfo> getResult() {
		return result;
	}
	public void setResult(List<ShopSearchInfo> result) {
		this.result = result;
	}

}
