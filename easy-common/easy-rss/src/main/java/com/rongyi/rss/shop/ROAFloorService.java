package com.rongyi.rss.shop;

import java.util.List;

import com.rongyi.easy.shop.entity.FloorEntity;

public interface ROAFloorService {
	
	/**
	 * 根据名字和所在商场查找楼层
	 * @param name
	 * @param mallId
	 * @return
	 */
	public List<FloorEntity> findFloorByNameAndMallId(String name,String mallId);
	/**
	 * 新增或者修改楼层
	 * @param entity
	 */
	public String saveFloor(FloorEntity entity);
	
	/**
	 * 根据id查询楼层
	 * @param id
	 * @return
	 */
	public FloorEntity getFloorById(String id);
	
	/**
	 * 批量插入楼层有id的不插
	 * @param entities
	 * @return
	 */
	public List<String> saveFloors(List<FloorEntity> entities);
	
	public List<FloorEntity> findFloorByBuildingId(String buildingId);
	
}
