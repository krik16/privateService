package com.rongyi.rss.solr;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.malllife.param.buyer.BuyerCategoryParam;
import com.rongyi.easy.mcmc.constant.EPOIType;
import com.rongyi.easy.mcmc.param.ActivityCommodityParam;
import com.rongyi.easy.rmmm.param.BullParam;
import com.rongyi.easy.roa.param.SearchCommodityBrandParam;
import com.rongyi.easy.roa.param.SearchCommodityCategoryParam;
import com.rongyi.easy.solr.result.CommoditySolrResult;
import org.bson.types.ObjectId;

import com.rongyi.easy.solr.McmcCommodityDocument;
import com.rongyi.easy.solr.param.CommoditySearchParam;

public interface McmcCommoditySolrService {

	/**
	 * 添加商品索引
	 * @param commodityDocument
	 * @return
	 */
	public boolean addCommodityIndex(McmcCommodityDocument commodityDocument);

	/**
	 * 模糊查询商品id
	 * @param request
	 * @return
	 */
	 public List<ObjectId> selectCommodityIndex(String request);

//	boolean deleteCommodityIndex(String id);

	/**
	 * 修改商品数据
	 * @param commodityDocument
	 * @return
	 */
	boolean updateCommodityIndex(McmcCommodityDocument commodityDocument);

	/**
	 * 修改商品名
	 * @param id
	 * @param name
	 * @return
	 */
	public boolean updateCommodityIndexName(String id, String name) ;

	/**
	 * 根据商品名和商品编码查询
	 * @param request
	 * @param shopId
	 * @return
	 */
	public List<ObjectId> selectCommodityIndexByNameCode(String request, String shopId);

	/**
	 * 索引更新商品销量
	 * @author ZhengYl
	 * @date 2015年9月8日 下午3:58:26
	 * @param id
	 * @param sold
	 * @return
	 */
	public boolean updateCommoditySold(String id, Integer sold);

	/**
	 * 索引更新商品状态
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

	/**
	 * 闪购秒杀商品数量和id查询
	 * @param param
	 * @return
	 */
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
	 * 根据商品id查询商品
	 * @author ZhengYl
	 * @date 2015年9月21日 上午10:58:58
	 * @param id
	 * @return
	 */
	public McmcCommodityDocument selectCommodityIndexById(String id);

	public boolean updateCommoditySale(Integer shopId, Integer saleId, Date activityStartTime, Date activityEndTime, List<ActivityCommodityParam> commodityParams);

	/**
	 * 清除商品特卖标记
	 * @param saleId
	 * @param ids
	 * @param activityStartTime
	 * @param activityEndTime
	 * @param commodityParams
	 * @return
	 */
	public boolean cleanCommoditySale(Integer saleId,List<String> ids, Date activityStartTime, Date activityEndTime, List<ActivityCommodityParam> commodityParams);

	/**
	 * 清除商品闪购标记
	 * @param flashSaleId
	 * @param ids
	 * @param activityStartTime
	 * @param activityEndTime
	 * @param commodityParams
	 * @return
	 */
	public boolean cleanCommodityFlashSale(Integer flashSaleId,List<String> ids, Date activityStartTime, Date activityEndTime, List<ActivityCommodityParam> commodityParams);

	/**
	 * 更新闪购商品索引
	 * @param commodityId
	 * @param sortPosition
	 * @param flashSaleId
	 * @param activityStartTime
	 * @param activityEndTime
	 * @return
	 */
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

	/**
	 * 清除秒杀商品索引
	 * @param secKillSign
	 * @return
	 */
	public boolean cleanCommoditySecKill(String secKillSign);

	/**
	 * 更新秒杀商品
	 * @param commodityId
	 * @param secKillSign
	 * @return
	 */
	public boolean updateCommoditySecKill(String commodityId,String secKillSign);

	/**
	 * 搜索品牌列表
	 * @param brandParam	搜索参数
	 * @return
	 */
	public Map<String, Object> searchBrands(SearchCommodityBrandParam brandParam);

	/**
	 * 商品分类查询
	 * @param categoryParam
	 * @return
	 */
	public Map<String, Object> searchCategorys(SearchCommodityCategoryParam categoryParam);

	/**
	 * 更新秒杀商品
	 * @param commodityIds
	 * @param secKillSign
	 * @return
	 */
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
	public Map<String, Object> 	searchCommodityCategory(BuyerCategoryParam categoryParam);

	/**
	 * 修改商品折扣
	 * @param id
	 * @param discount
	 * @return
	 */
	public boolean updateCommodityDiscount(String id, Double discount);

//	public boolean updateCommoditySale(String commodityId, Integer sortPosition);

	/**
	 * 修改商品在终端机与App上的隐藏与显示
	 * @param commodityId
	 * @param weAndTeStatus
	 * @return
	 */
	public boolean updateCommodityWeAndTeStatus(String commodityId, String  weAndTeStatus);

	/**
	 * 更新solr商品终端数据
	 * @param commodityId	商品ID
	 * @param terminalType	终端
	 * @return
	 */
	public boolean updateCommodityTerminalType(String commodityId, Integer terminalType,String weAndTeStatus);

	/**
	 * 清除闪购商品索引
	 * @param ids
	 * @return
	 */
	public boolean cleanSolrByIds(List<String> ids);

	/**
	 * 更新特卖商品
	 * @param ids
	 * @param saleId
	 * @param activityStartTime
	 * @param activityEndTime
	 * @param commodityParams
	 * @param type
	 * @return
	 */
	public boolean updateCommoditySaleByIds(List<String> ids, Integer saleId, Date activityStartTime, Date activityEndTime, List<ActivityCommodityParam> commodityParams,Integer type);

	/**
	 * 清除特卖商品索引
	 * @param ids
	 * @return
	 */
	public boolean cleanSolrByIdsForFlashSale(List<String> ids);
	/**
	 * 索引更新商品SystemNumber
	 *
	 * @param commodityIds
	 * @param systemNumber
	 * @return
	 */
	public boolean updateCommoditySystemNumber(List<ObjectId> commodityIds, String systemNumber);

	public List<Integer>  selectBrandIdsByParams(BullParam param);

	/**
	 * 查询品牌列表（除用户已订阅，爱品牌品牌墙）
	 *
	 * @param brandParam
	 *
	 * @return
	 */
	public ResponseVO searchBrandsForUser(SearchCommodityBrandParam brandParam);
}
