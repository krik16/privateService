package com.rongyi.rss.mcmc;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.CommodityShopInfo;
import com.rongyi.easy.mcmc.vo.CommodityPageBuyerVO;
import com.rongyi.easy.mcmc.vo.CommoditySpecVO;
import com.rongyi.easy.mcmc.vo.CommodityVO;
import com.rongyi.easy.mcmc.vo.CommodityWebVO;

import org.bson.types.ObjectId;

import java.util.List;



public interface CommodityService {

	public List<Commodity> getCommodityListByShopId(String shopId);
	
	public List<Commodity> getCommodityListByShopIds(List<String> shopIds);
	public CommodityVO getCommoditySpecInfoById(String commodityId,String specId);
	
	public ResponseResult getCommodityById(String id,long shopId);
	public ResponseResult getCommodityListByShopId(String id, int orderBy,String keyword,int currentpage,int pagesize);
	
	public String publishCommodity(CommodityVO commodityvo,long shopId,long brandId,long mallId,String mallMid,String brandName,String shopNum,CommodityShopInfo shopInfo);
	
	public ResponseResult commodityToShelves(String id,long shopId);
	
	public ResponseResult commodityOffShelves(String id,long shopId);
	
	public String editCommodity(CommodityVO commodityvo,long shopId);
	
	public ResponseResult updateCommodityPics(String id, List<String> picList,long shopId);
	
	public ResponseResult getCommodityCategory();

	public ResponseResult getCategoryById(String id);

	public ResponseResult searchCommodity(String keyword,String shopId,String brandId,String mallId, String categoryId,
			int orderBy, int currentpage, int pagesize);

	public ResponseResult getBrandCommodity(String brandId, String categoryId,
			int orderBy, int currentpage, int pagesize);

	public ResponseResult getShopCommodity(String shopId, String categoryId,
			int orderBy, int currentpage, int pagesize);

	public ResponseResult getMallIndexCommodity(String id, int pagesize);

	public ResponseResult getShopIndexCommodity(String id, int pagesize);

	public ResponseResult getCommoditySpecBuyerInfo(String id);

	public ResponseResult getCommodityBuyerInfo(String id, boolean ifCollected);

	public ResponseResult getBuyerCommodityCategory(String filterId,int filterType,boolean showParent);

	public ResponseResult getBuyerIndexCommodity(int currentPage, int pagesize);

	public ResponseResult getCommodityList(List<ObjectId> ids, int currentpage,
			int pagesize);

	public CommodityPageBuyerVO searchCommodityByMids(String keyword, String shopMid,
			String mallMid, int currentpage, int pagesize);

	public ResponseResult addCommoditySpecs(List<CommoditySpecVO> specvoList,
			String commodityId, String shopId);

	public List<String> getCommodityPicList(String commodityId);

	public CommodityWebVO getCommodityWebVoById(String id);
	
	
	public List<String> listCommoditySpecColumns(String commodityId);

	public List<String[]> listSpecColumnValues(String commodityId);
}
