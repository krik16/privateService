package com.rongyi.easy.malllife.param.wish;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
/**
 * 获取我的心愿列表参数
 * @author user
 *
 */
public class MyWishListParam extends MalllifeBaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer type;//1 已回复，2 待回复

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
}
