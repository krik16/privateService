/** 
* @Title: ROAShopSolrService.java 
* @Package com.rongyi.rss.solr 
* @Description: TODO
* @author 朱泽 zhuze@rongyi.com
* @date 2015年6月2日 下午4:04:32 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.solr;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.solr.BrandDocument;
import org.bson.types.ObjectId;

/** 
 * 
 */
public interface ROABrandSolrService {
	Map<String,Object> getBrandPage(Map params, int currentpage, int pagesize) throws Exception;

	/**
	 * 查询品牌列表
	 *
	 * @param param
	 * @param currentPage
	 * @param pageSize
	 *
	 * @return document list
	 */
	List<BrandDocument> getBrandList(Map param, int currentPage, int pageSize);

}
