package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

public interface ROABusinessPlatformService {
	
	/**
	 * 获取商家后台昨日数据
	 * @param shopId
	 * @param userId
	 * @return
	 */
	public List<Map<String, Object>> getLastDayData(String shopId,String userId);
}
