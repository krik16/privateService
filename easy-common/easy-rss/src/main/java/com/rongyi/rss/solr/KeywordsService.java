/** 
* @Title: KeywordsService.java 
* @Package com.rongyi.rss.solr 
* @Description: 用户关键词联想
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年10月14日 下午1:36:02 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.solr;

import java.util.List;

/**
 * @author ZhengYl
 *
 */
public interface KeywordsService {

	/**
	 * 定时同步用户关键词历史记录
	 * 
	 * @author ZhengYl
	 * @date 2015年10月14日 下午7:57:09 
	 * @param searchType 1:commodity 2:poi 3:activity
	 */
	public void SyncSearchKeywords(String searchType);
	
	/**
	 * 关键词联想主入口
	 * 
	 * @author ZhengYl
	 * @date 2015年10月14日 下午1:38:45 
	 * @param type   1:commodity 2:poi 3:activity
	 * @param prefix 用户输入的前缀内容
	 * @return 联想词列表
	 */
	public List<String> GetSuggestKeywords(String type, String prefix);
}
