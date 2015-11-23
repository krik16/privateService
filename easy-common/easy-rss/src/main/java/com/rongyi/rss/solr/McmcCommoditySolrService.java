package com.rongyi.rss.solr;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.easy.solr.McmcCommodityDocument;
import com.rongyi.easy.solr.param.CommoditySearchParam;

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
	
	/**
	 * 索引更新商品价格
	 * 
	 * @author ZhengYl
	 * @date 2015年9月10日 下午4:40:58 
	 * @param id
	 * @param price
	 * @return
	 */
	public boolean updateCommodityPrice(String id, Double price);
	
	/**
	 * 商品检索·改
	 * 
	 * @author ZhengYl
	 * @date 2015年9月10日 下午2:36:52 
	 * @param param
	 * @return
	 */
	public List<ObjectId> commoditySearch(CommoditySearchParam param);

	/**
	 * @author ZhengYl
	 * @date 2015年9月21日 上午10:58:58 
	 * @param id
	 * @return
	 */
	public McmcCommodityDocument selectCommodityIndexById(String id);

	public boolean updateCommoditySale(Integer shopId, Integer saleId, Date activityStartTime, Date activityEndTime);

	public boolean cleanCommoditySale(Integer saleId);

	public boolean cleanCommodityFlashSale(Integer flashSaleId);

	public boolean updateCommodityFlashSale(String commodityId, Integer sortPosition, Integer flashSaleId, Date activityStartTime, Date activityEndTime);

}
