package com.rongyi.easy.roa.param;

import java.io.Serializable;
import java.util.List;

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
	private List<String> brandMids;  // mongo ids
	private List<String> brandIds;   // mysql ids
	private Integer serviceId;//微信服务号id

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

	public List<String> getBrandMids() {
		return brandMids;
	}

	public void setBrandMids(List<String> brandMids) {
		this.brandMids = brandMids;
	}
	public List<String> getBrandIds() {
		return brandIds;
	}
	public void setBrandIds(List<String> brandIds) {
		this.brandIds = brandIds;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	@Override
	public String toString() {
		return "SearchCommodityBrandParam [mallId=" + mallId + ", keyword="
				+ keyword + ", serviceId="
				+ serviceId +", source=" + source + "]";
	}
}
