package com.rongyi.rss.malllife;

import java.util.List;
import java.util.Map;




import org.bson.types.ObjectId;

import com.rongyi.easy.malllife.entity.ActivityEntity;
import com.rongyi.easy.malllife.vo.GroupVO;


/**
 * 类ArticlesService.java的实现描述：TODO 类实现描述 
 * @author rongyi-13 2014年8月21日 下午6:49:05
 */
public interface MallLifeActivitiesService {
	
	
	 /**
		 * 收藏里面的优惠
		 * @param map
		 * @return
		 */
	public List<GroupVO> queryCollectionActivities(Map<String, Object> map) ;
	
	/**
	 * Check if there are activities around the given point.
	 * @param cityId
	 * @return true or false
	 * @throws Exception
	 */
	public List<Object> checkActNotification(String cityId) throws Exception;
	
	public void updateGrouponNum(String id, Integer grouponNum);
	
	   
    /**
     * 根据id集合查找我的收藏列表里的数据
     * @param ids
     * @return
     */
    public List<GroupVO>listActivities(List<String> ids);

    /**
     * 根据id查找activity
     * @param id
     * @return
     */
    public ActivityEntity searchActivityById(ObjectId id);

	public void updateVisitedNum(String id, int visitedCount);
}
