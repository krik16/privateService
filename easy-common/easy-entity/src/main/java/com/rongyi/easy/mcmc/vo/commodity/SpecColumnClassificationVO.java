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
	private String id;//规格分类id  或者  子规格id
	private String name;//规格分类名称  或者  子规格名称
	private String color;//颜色编码
	private Integer colorType;//色系
	private List<SpecColumnClassificationVO> specColumnClassificationParamList;//规格分类下的子规格列表
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getColorType() {
		return colorType;
	}
	public void setColorType(Integer colorType) {
		this.colorType = colorType;
	}
	public List<SpecColumnClassificationVO> getSpecColumnClassificationParamList() {
		return specColumnClassificationParamList;
	}
	public void setSpecColumnClassificationParamList(
			List<SpecColumnClassificationVO> specColumnClassificationParamList) {
		this.specColumnClassificationParamList = specColumnClassificationParamList;
	}
	@Override
	public String toString() {
		return "SpecColumnClassificationVO [id=" + id + ", name=" + name
				+ ", color=" + color + ", colorType=" + colorType
				+ ", specColumnClassificationParamList="
				+ specColumnClassificationParamList + "]";
	}
	
}
