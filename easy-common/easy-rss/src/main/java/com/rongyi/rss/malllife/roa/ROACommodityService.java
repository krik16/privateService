
/**
 * @Title: ROACommodityService.java
 * @Package: com.rongyi.rss.malllife.roa
 * @Description: TODO
 * @author 袁波
 * @date 2015年6月5日 下午6:56:37
 */

package com.rongyi.rss.malllife.roa;

import java.util.List;

import com.rongyi.easy.mcmc.CommodityCategory;
import com.rongyi.easy.mcmc.entity.ThirdPartMcmcCommodity;
import com.rongyi.easy.rmmm.vo.CommodityByNoVO;
import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.malllife.param.buyer.BuyerCategoryParam;
import com.rongyi.easy.malllife.vo.CommodityBuyerVO;
import com.rongyi.easy.malllife.vo.ShopCommodityVO;
import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.vo.CommodityPageBuyerVO;
import com.rongyi.easy.mcmc.vo.CommoditySpecVO;
import com.rongyi.easy.mcmc.vo.CommodityVO;
import com.rongyi.easy.mcmc.vo.CommodityWebVO;
import com.rongyi.easy.roa.param.SearchCommodityBrandParam;
import com.rongyi.easy.roa.param.SearchCommodityCategoryParam;
import com.rongyi.easy.solr.param.CommodityBrandSearchParam;
import com.rongyi.easy.solr.param.CommoditySearchParam;

/**
 *
 * @Description
 * @author 袁波
 * @date 2015年6月5日 下午6:56:37
 */

public interface ROACommodityService {
	public CommodityBuyerVO getCommodityById(String id);

	public List<ShopCommodityVO> getCommoditysByShops(List<Long> shops);

	public List<ShopCommodityVO> getCommoditysByShopId(String shopId);

	public CommodityVO getCommoditySpecInfoById(String commodityId, String specId);

	public ResponseResult getCommodityById(String id, long shopId);

	public ResponseResult getCommodityListByShopId(int identity, String shopId, String buyerId, int orderBy,
			String keyword, int currentpage, int pagesize);

	public ResponseResult getLiveCommodityList(String keyword, int identity, String buyerId, int orderBy, int currentpage,
			int pagesize, String liveId, int isEdit);

	public String publishCommodity(CommodityVO commodityvo, long shopId, String shopMid, long brandId, long mallId,
			String mallMid, String brandName, String shopNum);

	public String publishCommodityBuyer(CommodityVO commodityvo, long brandId, long mallId, String mallMid,
			String brandName,String brandMid,String shopNum, List<Double> position, List<String> zone_ids);

	public ResponseResult commodityToShelves(String id, long shopId, int identity);

	public ResponseResult commodityOffShelves(String id, long shopId, int identity,String reason);

	public String editCommodity(CommodityVO commodityvo, long shopId, long brandId);

	public String editCommodityBuyer(CommodityVO commodityvo, long brandId, long mallId, String mallMid,
			String brandName,String brandMid,String shopNum, List<Double> position, List<String> zone_ids);

	public ResponseResult updateCommodityPics(String id, List<String> picList, long shopId, int identity);

	public ResponseResult getCommodityCategory();

	public ResponseResult getCategoryById(String id);

	public ResponseResult searchCommodity(CommoditySearchParam param);

	public ResponseResult searchCommodityForMallLife(CommoditySearchParam param);

	public ResponseResult getBrandCommodity(String brandId, String categoryId, int orderBy, int currentpage,
			int pagesize);

	public ResponseResult getShopCommodity(String shopId, String categoryId, int orderBy, int currentpage,
			int pagesize);

	public ResponseResult getMallIndexCommodity(String id, int pagesize);

	public ResponseResult getShopIndexCommodity(String id, int pagesize);

	public ResponseResult getCommoditySpecBuyerInfo(String id);

	public ResponseResult getCommodityBuyerInfo(String id, boolean ifCollected);

	public ResponseResult getBuyerCommodityCategory(String filterId, int filterType, boolean showParent);

	public ResponseResult getBuyerIndexCommodity(int currentPage, int pagesize);

	public ResponseResult getCommodityList(List<ObjectId> ids, int currentpage, int pagesize);

	public CommodityPageBuyerVO searchCommodityByMids(String keyword, String shopMid, String mallMid, int currentpage,
			int pagesize);

	public ResponseResult addCommoditySpecs(List<CommoditySpecVO> specvoList, String commodityId, String shopId,
			int identity);

	public List<String> getCommodityPicList(String commodityId);

	public CommodityWebVO getCommodityWebVoById(String id);

	public List<String> listCommoditySpecColumns(String commodityId);

	public List<String[]> listSpecColumnValues(String commodityId);

	public Commodity selectById(String id);

	public ResponseVO searchCommodityBrand(CommodityBrandSearchParam param);

	public List<com.rongyi.easy.mcmc.vo.CommodityBuyerVO> getCommodityBySPU(String commodityId, String spu);

	/**
	 * 删除指定商品
	 * @param commodityId	商品ID
	 * @param shopId		店铺ID
	 * @param identity		操作者
	 * @return
	 */
	public ResponseVO deleteCommodity(String commodityId, Long shopId, Integer identity);

	public ResponseVO  topByIds(List<String> ids,Integer sort,Integer type);

	/**
	 * 获取商品邮费
	 * @param userId
	 * @return
	 */
	public String getPostageByUserId(String userId);

	/**
     * 获取商品直播的地址和品牌
     * @param commodityIds
     * @return
     */
	public ResponseVO getLiveAddressAndBrandByCommodityIds(List<String> commodityIds);


//	/**
//	 * 获取有商品的分类列表
//	 * @param categoryParam	参数对象
//	 * @return
//	 */
//	public ResponseResult getBuyerCommodityCategoryHasCommodity(BuyerCategoryParam categoryParam);

	/**
	 * 获取有商品的分类列表
	 * @param categoryParam	参数对象
	 * @return
	 */
	public ResponseResult getBuyerCommodityCategory(BuyerCategoryParam categoryParam);

	/**
	 *
	 * @param type 3表示第三级分类
	 * @param isPopular true表示热门分类
	 * @return
	 */
	public List<CommodityCategory> selectCategory(int type,boolean isPopular);

	/**
	 * 根据商场获取品类列表(有商品的品类列表)
	 * @param mallId		商场ID
	 * @param showParent	是否显示父级
	 * @param pageSize		分页条数
	 * @param page			当前页
	 * @return
	 */
	public ResponseVO getCommodityCategorysByMall(SearchCommodityCategoryParam param);

	/**
	 * 根据商场获取品牌列表(有商品的品牌列表)
	 * @param mallId		商场ID
	 * @param keyword		搜索关键字（匹配品牌名称）
	 * @param pageSize		分页条数
	 * @param page			当前页
	 * @return
	 */
	public ResponseVO getBrandsByMall(SearchCommodityBrandParam param);

	/**
	 * 根据id查询第三方的商品
	 * @param id
	 * @return
	 */
	public ThirdPartMcmcCommodity selectByPrimaryKey(Integer id);

	/**
	 * 根据款号查询第三方商品的总数
	 * @param artNo
	 * @return
	 */
	public Integer selectCountByArtNo(String artNo);

	/**
	 * 根据款号分页查询商品
	 * @param artNo
	 * @param start
	 * @param size
	 * @return
	 */
	public List<ThirdPartMcmcCommodity> selectCommodityByArtNo(String artNo,Integer start,Integer size);

	/**
	 * 根据款号模糊配置款号
	 * @param artNo
	 * @return
	 */
	public List<CommodityByNoVO> findByAraNo(String artNo);
}
