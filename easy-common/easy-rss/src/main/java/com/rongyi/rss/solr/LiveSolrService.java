/** 
* @Title: LiveSolrService.java 
* @Package com.rongyi.rss.solr 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年10月20日 上午10:31:53 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.solr;

import com.rongyi.easy.solr.LiveSolrDocument;
import com.rongyi.easy.solr.param.LiveSearchParam;
import com.rongyi.easy.solr.result.LiveSearchResult;

/**
 * @author ZhengYl
 *
 */
public interface LiveSolrService {
	
	/**
	 * 直播列表检索
	 * 
	 * @author ZhengYl
	 * @date 2015年10月20日 上午10:32:41 
	 * @param input
	 * @return
	 */
	public LiveSearchResult liveSearch(LiveSearchParam input);
	
	/**
	 * 更新直播索引
	 * 
	 * @author ZhengYl
	 * @date 2015年10月20日 上午11:05:32 
	 * @param liveDocument
	 * @return
	 */
	public boolean updateLiveIndex(LiveSolrDocument liveDocument);
	
	/**
	 * 插入直播索引
	 * 
	 * @author ZhengYl
	 * @date 2015年10月28日 上午10:57:45 
	 * @param liveDocument
	 * @return
	 */
	public boolean insertLiveIndex(LiveSolrDocument liveDocument);

	/**
	 * 根据直播id删除直播
	 * @param id
	 * @return
	 */
	public  boolean deleteLiveById(String id);
}
