/**
 * 
 */
package com.rongyi.rss.shop;

import java.util.List;

import com.rongyi.easy.shop.entity.BuildingEntity;

/** 
 * @ClassName: ROABuildingService 
 * @Description: 楼栋查询
 * @author wzh
 * @date 2015年11月9日 下午5:01:38 
 *  
 */
public interface ROABuildingService {
	
	/**
	 * 根据商场查询楼栋
	 * @param mallId
	 * @param type
	 * @return
	 */
	public List<BuildingEntity> searchBuildingByMallId(String mallId,Integer type);
	
	/**
	 * 根据id查询楼栋
	 * @param id
	 * @return
	 */
	public BuildingEntity getBuildingById(String id);
}
