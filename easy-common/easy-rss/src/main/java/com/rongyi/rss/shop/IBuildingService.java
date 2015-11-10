/**
 * 
 */
package com.rongyi.rss.shop;

import java.util.List;

import com.rongyi.easy.shop.entity.BuildingEntity;

/** 
 * @ClassName: IBuildingService 
 * @Description: TODO
 * @author wzh
 * @date 2015年11月9日 下午5:01:20 
 *  
 */
public interface IBuildingService {
	
	public List<BuildingEntity> searchBuildingByMallId(String mallId,Integer type);
}
