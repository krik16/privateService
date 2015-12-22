package com.rongyi.rss.malllife;

import java.util.Map;




/**
 * 类CollectionsService.java的实现描述：TODO 类实现描述 
 * @author rongyi-13 2014年8月21日 下午8:53:54
 */
public interface MallLifeCollectionsService {

	/**
	 * 20140821 lim
	 * 收藏
	 * @param page
	 * @param pageSize
	 * @param userId
	 * @param type
	 * @return
	 */
	public Map<String, Object> queryByTypeAndUserId(Integer page, Integer pageSize, String userId, String type) ;
	
	/**
	 * 判断是否已经被收藏
	 * @param userId
	 * @param contentId
	 * @param collectableType
	 * @return
	 */
	public String getContentByContentId(String userId, String contentId, String collectableType);
	
	public long queryCountByTypeAndId(String type, String id);
}
