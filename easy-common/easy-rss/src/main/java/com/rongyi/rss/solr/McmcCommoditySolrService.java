package com.rongyi.rss.solr;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.malllife.param.buyer.BuyerCategoryParam;
import com.rongyi.easy.mcmc.param.ActivityCommodityParam;
import com.rongyi.easy.roa.param.SearchCommodityBrandParam;
import com.rongyi.easy.roa.param.SearchCommodityCategoryParam;
import com.rongyi.easy.solr.result.CommoditySolrResult;
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
	 * @param currentPriceList 多规格当前价格列表
	 * @return
	 */
	public boolean updateCommodityPrice(String id, Double price, List<Double> currentPriceList);
	
	/**
	 * 商品检索·改
	 * 
	 * @author ZhengYl
	 * @date 2015年9月10日 下午2:36:52 
	 * @param param
	 * @return
	 */
	public List<ObjectId> commoditySearch(CommoditySearchParam param);

	public CommoditySolrResult commoditySearchTotalCountAndIds(CommoditySearchParam param);

	/**
	 * 商品检索 - 容易逛商品聚合
	 *
	 * @author xgq
	 * @date 2015年12月24日 下午2:36:52
	 * @param param
	 * @return
	 */
	public Map<?, ?> searchCommodityForMallLife(CommoditySearchParam param);

	/**
	 * @author ZhengYl
	 * @date 2015年9月21日 上午10:58:58 
	 * @param id
	 * @return
	 */
	public McmcCommodityDocument selectCommodityIndexById(String id);

	public boolean updateCommoditySale(Integer shopId, Integer saleId, Date activityStartTime, Date activityEndTime, List<ActivityCommodityParam> commodityParams);

	public boolean cleanCommoditySale(Integer saleId,List<String> ids, Date activityStartTime, Date activityEndTime, List<ActivityCommodityParam> commodityParams);

	public boolean cleanCommodityFlashSale(Integer flashSaleId,List<String> ids, Date activityStartTime, Date activityEndTime, List<ActivityCommodityParam> commodityParams);

	public boolean updateCommodityFlashSale(String commodityId, Integer sortPosition, Integer flashSaleId, Date activityStartTime, Date activityEndTime);

	/**
	 * 批量修改商品闪购信息
	 * @param commodityParams
	 * @param flashSaleId
	 * @param activityStartTime
	 * @param activityEndTime
	 * @return
	 */
	public boolean updateCommodityFlashSale(List<ActivityCommodityParam> commodityParams,  Integer flashSaleId, Date activityStartTime, Date activityEndTime);

	public boolean cleanCommoditySecKill(String secKillSign);

	public boolean updateCommoditySecKill(String commodityId,String secKillSign);

	/**
	 * 搜索品牌列表
	 * @param brandParam	搜索参数
	 * @return
	 */
	public Map<String, Object> searchBrands(SearchCommodityBrandParam brandParam);

	public Map<String, Object> searchCategorys(SearchCommodityCategoryParam categoryParam);

	public boolean updateCommoditySecKill(List<String> commodityIds, String secKillSign);

//	/**
//	 * 搜索有商品的商品分类列表
//	 * @param categoryParam	参数对象
//	 * @return
//	 */
//	public Map<String, Object> searchCommodityCategoryHasCommodity(BuyerCategoryParam categoryParam);

	/**
	 * 删除指定ID的商品
	 * @param commodityId	商品ID
	 * @return
	 */
	public boolean deleteCommodity(String commodityId);

	/**
	 * 搜索有商品的商品分类列表
	 * @param categoryParam	参数对象
	 * @return
	 */
	public Map<String, Object> searchCommodityCategory(BuyerCategoryParam categoryParam);

	public boolean updateCommodityDiscount(String id, Double discount);

//	public boolean updateCommoditySale(String commodityId, Integer sortPosition);
	public boolean updateCommodityWeAndTeStatus(String commodityId, String  weAndTeStatus);

	/**
	 * 更新solr商品终端数据
	 * @param commodityId	商品ID
	 * @param terminalType	终端
	 * @return
	 */
	public boolean updateCommodityTerminalType(String commodityId, Integer terminalType,String weAndTeStatus);

	public boolean cleanSolrByIds(List<String> ids);

	public boolean updateCommoditySaleByIds(List<String> ids, Integer saleId, Date activityStartTime, Date activityEndTime, List<ActivityCommodityParam> commodityParams,Integer type);

	public boolean cleanSolrByIdsForFlashSale(List<String> ids);
}
