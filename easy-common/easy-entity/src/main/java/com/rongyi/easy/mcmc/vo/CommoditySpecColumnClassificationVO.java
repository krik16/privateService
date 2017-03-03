package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;


public class CommoditySpecColumnClassificationVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String color;//颜色规格项对应的色系
	private String colorType;//颜色类型：1 标准色系，2 特殊色系
	private String name;//规格类名
	private List<CommoditySpecColumnClassificationVO> children;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColorType() {
		return colorType;
	}
	public void setColorType(String colorType) {
		this.colorType = colorType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<CommoditySpecColumnClassificationVO> getChildren() {
		return children;
	}
	public void setChildren(List<CommoditySpecColumnClassificationVO> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "CommoditySpecColumnClassificationVO [id=" + id + ", color="
				+ color + ", colorType=" + colorType + ", name=" + name
				+ ", children=" + children + "]";
	}
	
}
