package com.rongyi.rss.solr;

import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.easy.solr.McmcCommodityDocument;

public interface McmcCommoditySolrService {


	public boolean addCommodityIndex(McmcCommodityDocument commodityDocument);
	
	 public List<ObjectId> selectCommodityIndex(String request);

//	boolean deleteCommodityIndex(String id);

	boolean updateCommodityIndex(McmcCommodityDocument commodityDocument);
	public boolean updateCommodityIndexName(String id, String name) ;

	public List<ObjectId> selectCommodityIndexByNameCode(String request, String shopId);
	
	/**
	 * 索引更新商品销量
	 * 
	 * @author ZhengYl
	 * @date 2015年9月8日 下午3:58:26 
	 * @param id
	 * @param sold
	 * @return
	 */
	public boolean updateCommoditySold(String id, Integer sold);
	
	/**
	 * 索引更新商品状态
	 * 
	 * @author ZhengYl
	 * @date 2015年9月8日 下午3:58:42 
	 * @param id
	 * @param status
	 * @return
	 */
	public boolean updateCommodityStatus(String id, Integer status);

}
