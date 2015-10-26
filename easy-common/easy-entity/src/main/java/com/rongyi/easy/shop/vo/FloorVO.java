package com.rongyi.easy.shop.vo;

import java.io.Serializable;

/**
 * 增加楼层
 * 
 * @author wzh
 *
 */
public class FloorVO implements Serializable {

	private String mallId;
	
	private String floorName;//楼层名字

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getFloorName() {
		return floorName;
	}

	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	
	
}
