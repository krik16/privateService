package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class HappyLifeWayVO implements Serializable{
	
	private String name;// 	入口名称
	private String pic;// 入口图片
	private Integer type;//1：优惠资讯，2：代金券，3：全城找店
	public HappyLifeWayVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HappyLifeWayVO(String name, String pic, Integer type) {
		super();
		this.name = name;
		this.pic = pic;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "HappyLifeWayVO [name=" + name + ", pic=" + pic + ", type="
				+ type + "]";
	}

}
