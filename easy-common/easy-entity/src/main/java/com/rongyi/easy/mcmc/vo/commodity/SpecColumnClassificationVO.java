package com.rongyi.easy.mcmc.vo.commodity;

import java.io.Serializable;
import java.util.List;
/**
 * 大运营后台规格分类返回VO
 * @author user
 *
 */
public class SpecColumnClassificationVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String SpecColumnClassificationId;//规格分类id  或者  子规格id
	private String SpecColumnClassificationName;//规格分类名称  或者  子规格名称
	private String color;//颜色编码
	private List<SpecColumnClassificationVO> subSpecColumnClassificationList;//规格分类下的子规格列表
	public String getSpecColumnClassificationId() {
		return SpecColumnClassificationId;
	}
	public void setSpecColumnClassificationId(String specColumnClassificationId) {
		SpecColumnClassificationId = specColumnClassificationId;
	}
	public String getSpecColumnClassificationName() {
		return SpecColumnClassificationName;
	}
	public void setSpecColumnClassificationName(String specColumnClassificationName) {
		SpecColumnClassificationName = specColumnClassificationName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<SpecColumnClassificationVO> getSubSpecColumnClassificationList() {
		return subSpecColumnClassificationList;
	}
	public void setSubSpecColumnClassificationList(
			List<SpecColumnClassificationVO> subSpecColumnClassificationList) {
		this.subSpecColumnClassificationList = subSpecColumnClassificationList;
	}
	@Override
	public String toString() {
		return "SpecColumnClassificationVO [SpecColumnClassificationId="
				+ SpecColumnClassificationId
				+ ", SpecColumnClassificationName="
				+ SpecColumnClassificationName + ", color=" + color
				+ ", subSpecColumnClassificationList="
				+ subSpecColumnClassificationList + "]";
	}
	
}
