package com.rongyi.easy.roa.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
/**
 * 微信版获取商品品牌列表参数
 * @author user
 *
 */
public class SearchCommodityBrandParam extends MalllifeBaseParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallId;		//商场id
	private String keyword;//品牌搜索关键字
	private String source;//1微信  2终端屏
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	@Override
	public String toString() {
		return "SearchCommodityBrandParam [mallId=" + mallId + ", keyword="
				+ keyword + ", source=" + source + "]";
	}
}
