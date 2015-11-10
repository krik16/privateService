/**
 * 
 */
package com.rongyi.rss.shop;

import java.util.List;

import com.rongyi.easy.shop.entity.BuildingEntity;

/** 
 * @ClassName: ROABuildingService 
 * @Description: TODO
 * @author wzh
 * @date 2015年11月9日 下午5:01:38 
 *  
 */
public interface ROABuildingService {
	
	public List<BuildingEntity> searchBuildingByMallId(String mallId,Integer type);
}
