package com.rongyi.easy.shop.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 批量增加增加楼层
 * 
 * @author wzh
 *
 */
public class FloorVOList implements Serializable {
	
	private List<FloorVO> floorVOs;
	
	public List<FloorVO> getFloorVOs() {
		return floorVOs;
	}

	public void setFloorVOs(List<FloorVO> floorVOs) {
		this.floorVOs = floorVOs;
	}
}
