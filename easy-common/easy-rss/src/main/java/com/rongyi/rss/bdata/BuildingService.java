package com.rongyi.rss.bdata;

import java.util.List;
import java.util.Map;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.bdata.vo.BuildingVO;
import com.rongyi.easy.bdata.vo.MallVO;

/**
 * Desc: BuildingService
 * User: chris
 * Date: 2015/10/24 18:32
 */

public interface BuildingService {
    
	boolean checkBuildBlockName(String mallId,String bildingName,String bildingId);
	
	List<BuildingVO> queryBuildList(Map<String, Object> queryMap);
	
	void insertbuildingBlock(String[] buildValue, String mallId, String[] buildType);
	
	void updateBuilding(List<Map<String, Object>> bulidMapList);
	
	

}
