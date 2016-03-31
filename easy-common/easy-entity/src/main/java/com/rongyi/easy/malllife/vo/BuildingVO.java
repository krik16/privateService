package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

public class BuildingVO implements Serializable{
	private String name;//栋的名字
	private List<FloorVO> sub_result;//栋的楼层

	public String getName() {
		return name;
	}

	public List<FloorVO> getSub_result() {
		return sub_result;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSub_result(List<FloorVO> sub_result) {
		this.sub_result = sub_result;
	}

}
