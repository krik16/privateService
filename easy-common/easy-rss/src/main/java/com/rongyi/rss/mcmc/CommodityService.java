package com.rongyi.rss.mcmc;

import java.util.Date;
import java.util.List;

import com.rongyi.easy.coupon.param.CouponCommodityParam;
import com.rongyi.easy.mcmc.param.SaleParam;

import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.CommodityShopInfo;
import com.rongyi.easy.mcmc.vo.CommodityPageBuyerVO;
import com.rongyi.easy.mcmc.vo.CommoditySpecVO;
import com.rongyi.easy.mcmc.vo.CommodityVO;
import com.rongyi.easy.mcmc.vo.CommodityWebVO;
import com.rongyi.easy.solr.param.CommodityBrandSearchParam;
import com.rongyi.easy.solr.param.CommoditySearchParam;

public interface CommodityService {

    public List<Commodity> getCommodityListByShopId(String shopId);

    public List<Commodity> getCommodityListByShopIds(List<String> shopIds);

    public CommodityVO getCommoditySpecInfoById(String commodityId, String specId);

    public ResponseResult getCommodityById(String id, long shopId);

    public ResponseResult getCommodityListByShopId(String id, int orderBy, String keyword, int currentpage, int pagesize);

    public ResponseResult getCommodityListByBuyerId(String buyerId, int orderBy, String keyword, int currentpage, int pagesize);

    public ResponseResult getLiveCommodityList(String keyword, int identity, String buyerId, int orderBy, int currentpage, int pagesize, String liveId, int isEdit);

    public String publishCommodity(CommodityVO commodityvo, long shopId, long brandId, long mallId, String mallMid, String brandName, String shopNum, CommodityShopInfo shopInfo);

    public String publishCommodityBuyer(CommodityVO commodityvo, long brandId, long mallId, String mallMid, String brandName, String brandMid, String shopNum, List<Double> position, List<String> zone_ids);

    public ResponseResult commodityToShelves(String id, long shopId, int identity);

    public ResponseResult commodityOffShelves(String id, long shopId, int identity);

    public String editCommodity(CommodityVO commodityvo, long shopId, long brandId);

    public String editCommodityBuyer(CommodityVO commodityvo, long brandId, long mallId, String mallMid, String brandName, String brandMid, String shopNum, List<Double> position, List<String> zone_ids);

    public ResponseResult updateCommodityPics(String id, List<String> picList, long shopId, int identity);

    public ResponseResult getCommodityCategory();

    public ResponseResult getCategoryById(String id);

    public ResponseResult searchCommodity(CommoditySearchParam param);

    public ResponseResult getBrandCommodity(String brandId, String categoryId, int orderBy, int currentpage, int pagesize);

    public ResponseResult getShopCommodity(String shopId, String categoryId, int orderBy, int currentpage, int pagesize);

    public ResponseResult getMallIndexCommodity(String id, int pagesize);

    public ResponseResult getShopIndexCommodity(String id, int pagesize);

    public ResponseResult getCommoditySpecBuyerInfo(String id);

    public ResponseResult getCommodityBuyerInfo(String id, boolean ifCollected);

    public ResponseResult getBuyerCommodityCategory(String filterId, int filterType, boolean showParent);

    public ResponseResult getBuyerIndexCommodity(int currentPage, int pagesize);

    public ResponseResult getCommodityList(List<ObjectId> ids, int currentpage, int pagesize);

    public CommodityPageBuyerVO searchCommodityByMids(String keyword, String shopMid, String mallMid, int currentpage, int pagesize);

    public ResponseResult addCommoditySpecs(List<CommoditySpecVO> specvoList, String commodityId, String shopId, int identity);

    public List<String> getCommodityPicList(String commodityId);

    public CommodityWebVO getCommodityWebVoById(String id);

    public List<String> listCommoditySpecColumns(String commodityId);

    public List<String[]> listSpecColumnValues(String commodityId);

    public Commodity selectById(String id);

    public ResponseVO searchCommodityBrand(CommodityBrandSearchParam param);

    void saveOrUpdateSale(SaleParam saleParam);

    /**
     * 卡券后台，关联商品查询接口
     * @param param
     * @return
     * @auther:yuanbo
     */
    public ResponseVO searchCommodityByCouponParam(CouponCommodityParam param);
    /**
     * 处理商品上下架接口
     * @param registerAt:上架时间  对应的输入状态应该是查找下架的商品，即为0
     * @param soldOutAt:下架时间，对应的输入的状态是上架的商品，即为1
     * @param status:商品的状态
     * @param pagesize：分页的条数
     */
    
    public void updateCommodityByRegisterAtAndSoldOutAt(Date registerAt,Date soldOutAt, String status, int pagesize);
    
}
