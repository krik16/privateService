package com.rongyi.rss.roa;

import java.util.Map;

/**
 * 类ROAFloorService.java的描述：TODO 类实现描述
 * 
 * @author PingKang 2015年1月12日 下午2:49:20
 */
public interface ROAFloorService {

    /**
     * 根据搜索参数查询楼层数据
     * 
     * @param params mallId 商场id
     * 				 status (1) 包含“正常显示:0、已隐藏:1”。(2)	默认参数“正常显示”。
     * @return	Map<String,Object>
     * 			"success"   	成功：true;失败：false
     * 			"result"		floor列表
     * 			"totalCount"	总数
     * @throws Exception
     */
	public Map<String,Object> getFloors(Map params) throws Exception;
}
