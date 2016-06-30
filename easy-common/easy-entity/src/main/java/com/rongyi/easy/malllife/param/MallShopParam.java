package com.rongyi.easy.malllife.param;

import java.io.Serializable;
/**
 * 商场下的入驻店铺参数
 * @author user
 *
 */
public class MallShopParam extends MalllifeBaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mallId;//商场mongoId

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	@Override
	public String toString() {
		return "MallShopParam [mallId=" + mallId + "]";
	}
	
}
