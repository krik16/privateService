package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
/**
 * 搜索关联联想词返回VO
 * @author user
 *
 */
public class KeywordSearchVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;//名称
	private Integer count;//数量
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "KeywordSearchVO [name=" + name + ", count=" + count + "]";
	}
	
}
