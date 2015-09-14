/** 
* @Title: ShopSolrService.java 
* @Package com.rongyi.rss.solr 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年8月17日 上午11:45:38 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.solr;

import com.rongyi.easy.solr.param.ShopSearchParam;
import com.rongyi.easy.solr.result.ShopSearchResult;

/**
 * @author ZhengYl
 *
 */
public interface ShopSolrService {
	
	public ShopSearchResult poiSearch(ShopSearchParam input);

	public boolean updatePoiStatus(String id, String mid, int status);
}
