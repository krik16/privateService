package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * 直播VO中的商品VO
 * 
 * @author xiaobo
 *
 */
public class LiveCommodityVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 商品id
	 */
	private String commodityId;
	
	/**
	 * 商品图片
	 */
	private String commodityPic;

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getCommodityPic() {
		return commodityPic;
	}

	public void setCommodityPic(String commodityPic) {
		this.commodityPic = commodityPic;
	}	
}
