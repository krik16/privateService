package com.rongyi.easy.mcmc.vo;

import java.util.List;


public class CommoditySpecColumnClassificationVO{
	
	private String id;
	private String color;//颜色规格项对应的色系
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
	
	
}
