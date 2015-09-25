package com.rongyi.easy.malllife.param;

import java.io.Serializable;
/**
 * 
 * 获取清仓商品详情列表参数
 * @author zzp
 *
 */
public class ClearanceCommodityParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String clearCommodityCode;//清仓商品板块代码

	public String getClearCommodityCode() {
		return clearCommodityCode;
	}

	public void setClearCommodityCode(String clearCommodityCode) {
		this.clearCommodityCode = clearCommodityCode;
	}
	
}
