
/**   
 * @Title: ROACommodityService.java 
 * @Package: com.rongyi.rss.malllife.roa 
 * @Description: TODO
 * @author 袁波 
 * @date 2015年6月5日 下午6:56:37 
 */

package com.rongyi.rss.malllife.roa;

import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.malllife.vo.CommodityBuyerVO;
import com.rongyi.easy.malllife.vo.ShopCommodityVO;
import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.vo.CommodityPageBuyerVO;
import com.rongyi.easy.mcmc.vo.CommoditySpecVO;
import com.rongyi.easy.mcmc.vo.CommodityVO;
import com.rongyi.easy.mcmc.vo.CommodityWebVO;
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

	public ResponseResult commodityOffShelves(String id, long shopId, int identity);

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
	public ResponseResult deleteCommodity(String commodityId, Long shopId, Integer identity);
}
