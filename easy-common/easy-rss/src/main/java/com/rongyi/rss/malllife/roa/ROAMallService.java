package com.rongyi.rss.malllife.roa;

import java.util.List;
import java.util.Map;




/**
 * 类MallService.java的实现描述：TODO 类实现描述 
 * @author rongyi-13 2014年8月21日 下午6:48:05
 */
public interface ROAMallService {
	
	/**
	 * 收藏里面的店铺
	 * @param map
	 * @return
	 */
	public List<Map<String, Object>> queryCollectionMall(Map<String, Object> map);
}
