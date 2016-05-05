package com.rongyi.rss.mcmc;

import java.util.Date;
import java.util.List;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.param.CouponCommodityParam;
import com.rongyi.easy.malllife.param.buyer.BuyerCategoryParam;
import com.rongyi.easy.malllife.param.user.SearchCommodityParms;
import com.rongyi.easy.mcmc.*;
import com.rongyi.easy.mcmc.param.SaleParam;
import com.rongyi.easy.mcmc.vo.*;

import com.rongyi.easy.solr.McmcCommodityDocument;
import com.rongyi.easy.roa.param.SearchCommodityBrandParam;
import com.rongyi.easy.roa.param.SearchCommodityCategoryParam;
import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.solr.param.CommodityBrandSearchParam;
import com.rongyi.easy.solr.param.CommoditySearchParam;

public interface CommodityService {

    public List<Commodity> getCommodityListByShopId(String shopId);

    public List<Commodity> getCommodityListByShopIds(List<String> shopIds);

    public CommodityVO getCommoditySpecInfoById(String commodityId, String specId);

    /**
     * 查询店铺的商品
     * @param id
     * @param shopId
     * @return
     */
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

    /**
     * app商品列表查询
     * @param param
     * @return
     */
    public ResponseResult searchCommodityForMallLife(CommoditySearchParam param);

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
    public PagingVO<Commodity> searchCommodityByCouponParam(CouponCommodityParam param);
    /**
     * 处理商品上下架接口
     * @param registerAt:上架时间  对应的输入状态应该是查找待下架的商品，即为3
     * @param soldOutAt:下架时间，对应的输入的状态是上架的商品，即为1
     * @param status:商品的状态
     * @param pagesize：分页的条数
     */
    
    public void updateCommodityByRegisterAtAndSoldOutAt(Date registerAt,Date soldOutAt, String status, int pagesize);
    

    /***
     * 查询商品 一二三级分类
     * type =1  parent Id 不传   是查询商品一级分类
     * type =2 parentId 必须传入  查询的是二级分类 在一级分类下的
     * type =3 parentId 必须传入  查询的是 三级分类  在二级分类下的
     * @param parentId
     * @Author lijing
     * @param type   1代表查询1级分类   2代表查询2级分类  3代表查询3级分类
     * @return List<CommodityCategory>
     */
    public List<CommodityCategory> getCommodityCategoryByTypeAndParentId(String parentId,int type);

    public CommodityCategory findCommodityCategoryById(ObjectId commodityCategoryId);

    public CommoditySpec findCommoditySpecById(ObjectId id);

    public CommoditySpecColumn findCommoditySpecColumnById(ObjectId id);

    public List<Commodity> getCommodityByIds(List<ObjectId> ids);

    public List<CommodityBuyerVO> getCommodityBySPU(String commodityId, String spu);

    public List<McmcCommodityDocument> getMcmcCommodityDocumentList(int skip,int pageSize) throws Exception;

    public McmcCommodityDocument getMmcmcCommodityDocumentById(String commodityId) throws Exception;

    public long getCommodityCount();
    /**
	 * 获取有商品的分类列表 （新）
	 * @param categoryParam	参数对象
	 * @return
	 */
    public ResponseResult getBuyerCommodityCategory(BuyerCategoryParam categoryParam);

    /**
     * 根据商场获取品类列表(有商品的品类列表)
     * @param categoryParam		商场搜索品类列表参数对象
     * @return
     */
    public ResponseVO getCommodityCategorysByMall(SearchCommodityCategoryParam categoryParam);

    /**
     * 根据商场获取品牌列表(有商品的品牌列表)
     * @param brandParam	商场搜索品牌列表参数对象
     * @return
     */
    public ResponseVO getBrandsByMall(SearchCommodityBrandParam brandParam);

    /**
     * 删除商品
     * @param commodityId	商品ID
     * @param shopId		店铺ID
     * @param identity		角色
     * @return
     */
	public ResponseVO deleteCommodity(String commodityId, Long shopId, Integer identity);

    /**
     * 置顶，取消置顶接口，type为1，置顶，为0，取消置顶
     * @param ids
     * @param sort
     * @param type
     * @return
     */
    ResponseVO  topByIds(List<String> ids,Integer sort,Integer type);
    /**
     * 获取商品直播的地址和品牌
     * @param commodityIds
     * @return
     */
	public ResponseVO getLiveAddressAndBrandByCommodityIds(List<String> commodityIds);

    /**
     * 获取商品邮费
     * @param userId
     * @return
     */
    public String getPostageByUserId(String userId);

    /**
     *
     * @param type 3表示第三级分类
     * @param isPopular true表示热门分类
     * @return
     */
    public List<CommodityCategory> selectCategory(int type,boolean isPopular);

    public PagingVO<Commodity> findCommdityList(SearchCommodityParms searchCommodityParms);

    /**
     * 根据特卖ID获取前3（暂定）个商品列表
     *
     * @param saleId 特卖Id
     * @return List<com.rongyi.easy.mcmc.Commodity>
     * @author wangjh7
     * @date 2016-05-04
     */
    public ResponseVO topCommodityListBySaleId(Integer saleId);

}
