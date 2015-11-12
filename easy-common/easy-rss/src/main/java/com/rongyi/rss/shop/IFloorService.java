package com.rongyi.rss.shop;

import java.util.List;

import com.rongyi.easy.shop.entity.FloorEntity;

public interface IFloorService {
	/**
	 * 根据名字和所在商场查找楼层
	 * @param name
	 * @param mallId
	 * @return
	 */
	public List<FloorEntity> findFloorByNameAndMallId(String name,String mallId);
	/**
	 * 插入楼层
	 * @param entity
	 */
	public String saveFloor(FloorEntity entity);
	
	/**
	 * 根据id查询楼层
	 * @param id
	 * @return
	 */
	public FloorEntity getFloorById(String id);
}
