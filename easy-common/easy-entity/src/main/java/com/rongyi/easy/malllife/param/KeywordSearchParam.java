package com.rongyi.easy.malllife.param;

import java.io.Serializable;
/**
 * 搜索关联联想词参数
 * @author user
 *
 */
public class KeywordSearchParam extends MalllifeBaseParam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;//商品或店铺或者商场或代金券名称
	private Integer type;//1商品 2找店 3优惠
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "KeywordSearchParam [name=" + name + ", type=" + type + "]";
	}
	
	
}
