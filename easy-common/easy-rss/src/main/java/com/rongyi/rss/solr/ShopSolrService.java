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

import com.rongyi.easy.solr.retrival.PoiShopInput;
import com.rongyi.easy.solr.retrival.result.ShopRetrivalResult;

/**
 * @author ZhengYl
 *
 */
public interface ShopSolrService {
	
	public ShopRetrivalResult poiSearch(PoiShopInput input);

	public boolean updatePoiStatus(String id, String mid, int status);
}
