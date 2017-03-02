package com.rongyi.easy.roa.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
/**
 * 微信版获取商品品类参数（）
 * @author user
 *
 */
public class SearchCommodityCategoryParam extends MalllifeBaseParam implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String mallId;//商场id
	private boolean showParent;//是否显示父级类别   true是  false否
	private String source;//1微信  2终端屏
	private String serviceId;//微信服务号id
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public boolean isShowParent() {
		return showParent;
	}
	public void setShowParent(boolean showParent) {
		this.showParent = showParent;
	}

	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	@Override
	public String toString() {
		return "SearchCommodityCategoryParam [mallId=" + mallId
				+ ", showParent=" + showParent +", serviceId=" + serviceId + ", source=" + source + "]";
	}

}
