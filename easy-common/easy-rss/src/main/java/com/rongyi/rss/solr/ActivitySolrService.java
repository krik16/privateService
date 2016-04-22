/**
* @Title: ActivitySolrService.java
* @Package com.rongyi.rss.solr
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年8月21日 下午6:00:15
* @version V1.0
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.solr;

import com.rongyi.easy.solr.param.ActivitySearchParam;
import com.rongyi.easy.solr.param.ActivityStickParam;
import com.rongyi.easy.solr.result.ActivityDetailSearchResult;
import com.rongyi.easy.solr.result.ActivitySearchResult;

import java.util.List;

/**
 * @author ZhengYl
 */
public interface ActivitySolrService {

	/**
	 * 活动列表检索
	 *
	 * @author ZhengYl
	 * @date 2015年8月24日 下午4:27:08
	 * @param input
	 * @return
	 */
	public ActivitySearchResult activitySearch(ActivitySearchParam input);

	/**
	 * 给定活动Id查询活动明细
	 *
	 * @author ZhengYl
	 * @date 2015年8月24日 下午4:27:10
	 * @param activityId
	 * @return
	 */
	public ActivityDetailSearchResult activityDetailSearch(String activityId, boolean isNew,String lat,String lng);

	/**
	 * 卡劵置顶
	 *
	 * @param mallId 商城ID
	 * @param list   需要置顶的卡劵列表
	 * @return true:成功
	 * @author wangjh7
	 * @date 2016-04-22
	 */
	public boolean setActivityStick(String mallId, List<ActivityStickParam> list);

}
