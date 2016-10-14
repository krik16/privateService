package com.rongyi.easy.malllife.param;

import java.io.Serializable;
/**
 * 商场下特卖参数
 * @author user
 *
 */
public class MallSpecialSaleParam extends MalllifeBaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mallId;//商场id

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	

}
