package com.rongyi.easy.malllife.param;

import java.io.Serializable;
/**
 * 获取推荐内容参数
 * @author user
 *
 */
public class RecommendedParam extends MalllifeBaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String type;// 1 商场 2 品牌  3类目

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
