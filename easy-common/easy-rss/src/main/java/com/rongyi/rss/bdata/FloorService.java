package com.rongyi.rss.bdata;

import java.util.List;

import com.rongyi.easy.bdata.entity.Floor;

public interface FloorService {
	/**
	 * 根据名字和所在商场查找楼层
	 * @param name
	 * @param mallId
	 * @return
	 */
	public List<Floor> findFloorByNameAndMallId(String name,String mallId);
	
	/**
	 * 根据id查询楼层
	 * @param id
	 * @return
	 */
	public Floor getFloorById(String id);
	
}
