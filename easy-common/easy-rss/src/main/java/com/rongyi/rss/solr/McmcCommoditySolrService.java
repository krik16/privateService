package com.rongyi.rss.solr;

import com.rongyi.easy.solr.McmcCommodityDocument;
import org.bson.types.ObjectId;

import java.util.List;

public interface McmcCommoditySolrService {


	public boolean addCommodityIndex(McmcCommodityDocument commodityDocument);
	
	 public List<ObjectId> selectCommodityIndex(String request);

//	boolean deleteCommodityIndex(String id);

	boolean updateCommodityIndex(McmcCommodityDocument commodityDocument);
	public boolean updateCommodityIndexName(String id, String name) ;

	public List<ObjectId> selectCommodityIndexByNameCode(String request, String shopId);

}
