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
import com.rongyi.easy.solr.result.ShopSearchIdsResult;
import com.rongyi.easy.solr.result.ShopSearchResult;

/**
 * @author ZhengYl
 *
 */
public interface ShopSolrService {
	
	/**
	 * C端店铺商场搜索主入口
	 * 
	 * @author ZhengYl
	 * @date 2015年10月17日 下午2:37:10 
	 * @param input
	 * @return
	 */
	public ShopSearchResult poiSearch(ShopSearchParam input);

	/**
	 * poi更新
	 * 
	 * @author ZhengYl
	 * @date 2015年10月17日 下午2:37:12 
	 * @param id
	 * @param mid
	 * @param status
	 * @return
	 */
	public boolean updatePoiStatus(String id, String mid, int status);
	
	/**
	 * B端店铺关键词检索
	 * 
	 * @author ZhengYl
	 * @date 2015年10月17日 下午2:37:15 
	 * @param input
	 * @return
	 */
	public ShopSearchIdsResult selectShopIndexByName(ShopSearchParam input);
}
