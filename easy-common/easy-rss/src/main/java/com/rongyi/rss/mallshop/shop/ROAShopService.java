package com.rongyi.rss.mallshop.shop;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.rongyi.easy.entity.ShopEntity;
import com.rongyi.easy.malllife.vo.ShopRmmmVO;
import com.rongyi.easy.malllife.vo.ShopVO;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.rmmm.entity.ShopInfoEntity;
import com.rongyi.easy.rmmm.exception.RmmmException;
import com.rongyi.easy.rmmm.param.BrandParam;
import com.rongyi.easy.rmmm.param.PrincipalAndCategoryParam;
import com.rongyi.easy.rmmm.vo.BrandShopDetailVO;
import com.rongyi.easy.rmmm.vo.BrandShopListVO;
import com.rongyi.easy.rmmm.vo.ShopDetailVO;
import com.rongyi.easy.rmmm.vo.ShopInfoVO;
import com.rongyi.easy.rmmm.vo.ShopMallVO;
import com.rongyi.easy.rmmm.vo.CouponShopVO;

public interface ROAShopService {

	/**
	 * 根据店铺mongoId查mongo店铺表信息
	 * @param shopMId
	 * @return
	 * @throws Exception
	 */
	public ShopEntity getShopEntityByMongoId(String shopMId) throws Exception;
    /**
     * 通过商场和品牌的mongoId获得mongo中的店铺
     *
     * @param param
     * @return
     * @throws Exception
     */
    public ShopEntity getShopEntityByBrandIdAndMallId(PrincipalAndCategoryParam param) throws Exception;

    /**
     * 插入店铺信息
     * 注：添加负责人使用
     *
     * @param param
     * @param brandId
     * @param mallId
     * @return
     * @throws Exception
     */
    public Integer insertCooperateShop(PrincipalAndCategoryParam param, Integer brandId, Integer mallId) throws Exception;

    /**
     * 通过shopId得到ShopDetailVO
     */
    public ShopDetailVO getShopVOByShopId(Integer shopId) throws Exception;

    /**
     * 通过shopId得到ShopEntity
     *
     * @param shopId
     * @return
     */
    public ShopInfoEntity getShopByShopId(Integer shopId) throws RmmmException;

    /**
     * 通过mall MongoId，brand MongoId获取店铺信息
     */
    public ShopInfoEntity getShopByMallIdAndBrandId(PrincipalAndCategoryParam param) throws Exception;

    /**
     * 更改店铺信息
     */
    public void updateShopInfo(ShopInfoEntity shop) throws Exception;

    /**
     * （品牌详情下的）品牌店铺API
     *
     * @param param
     * @return
     * @throws Exception
     */
    public BrandShopListVO getBrandShopListVOByBrandId(BrandParam param) throws Exception;


    /**
     * 在商品页面增加商品所在店铺信息API
     *
     * @param shopId
     * @return
     * @throws Exception
     */
    public BrandShopDetailVO getBrandShopDetail(String shopId, UserInfoVO user) throws Exception;
 

 
    /**
	 * 微商城商品所在店铺信息V0116
	 * @param shopId
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public BrandShopDetailVO getCommodityShopDetail(String shopId, UserInfoVO user) throws Exception;
	/**
	 * 商品所在店铺信息V0202
	 * @param shopId
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public BrandShopDetailVO getCommodityShopInfoDetail(String shopId, UserInfoVO user) throws Exception;
    public List<String> getSellerImIdByShopId(String shopId);

    public ShopInfoEntity getShopByShopMId(String shopMId) throws RmmmException;


    public Integer saveTestCooperateShop(final String ids) throws Exception;


    public List<ShopEntity> getShopEntityByMallId(String mallId) throws Exception;


    /**
     * 以下接口是从rongyi.app.content 移过来的接口
     *
     * @author 袁波
     */
    public ShopRmmmVO getResult(Integer id);

    public Integer getShopId(String id);

    public List<Integer> getShopIds(Integer mallId);

    public Map<String, Object> searchShopList(Map<String, Object> paramsMap);

    public ShopInfoVO getShopInfoByShopId(String shopId);

    public List<Integer> getAllShopIdBuMallId(Map<String, Object> paramsMap);

    /**
     * 根据店铺名模糊获取店铺所在商场下的店铺列表
     *
     * @param
     * @return
     * @throws Exception
     */
    public List<ShopInfoEntity> getShopListByShopName(String shopName, Integer mallId) throws Exception;

    /**
     * 根据店铺的mongoId获取店铺信息
     *
     * @param shopMId
     * @return
     * @throws Exception
     */
    public ShopInfoVO getShopInfoByShopMId(String shopMId) throws Exception;

    /**
     * 根据userId获取店铺的mongoId
     *
     * @param userId
     * @return
     * @throws Exception
     */
    public String selectShopMidByUserId(Integer userId) throws Exception;

    /**
     * 通过店铺的mongoId获取店铺的详细信息
     *
     * @param shopMid
     * @return
     * @throws Exception
     */
    public ShopDetailVO getShopVOByShopMid(String shopMid) throws Exception;

    /**
     * 验券成功后，发消息通知买家
     *
     * @param
     * @param
     * @throws Exception
     */
    public void sendShopMessageToIMUser(final String userId, final String shopMid) throws Exception;
    
    /**
	 * 通过店铺id 获得店铺、商场信息
	 * 
	 * @return
	 * @throws Exception
	 */
	public ShopMallVO getShopMallVOByOrderNum(Integer shopId) throws Exception;
	
	public Integer insertCooperateShopByshopMid(String shopMid, Integer brandId, Integer mallId) throws Exception;
	
	/**
     * 查询店铺列表
     *
     * @param ids : 店铺id集合   userLocation 用户地理位置
     * @return
     * @throws Exception
     */
    public List<CouponShopVO> getShopsByIds(List<ObjectId> ids,List<Double> userLocation)  throws Exception;
    
    /**
	 * 品牌查询店铺
	 * @return
	 */
    public List<ShopEntity> getShopsByBrandId(String brandId) throws Exception;
    /**
	 * 商场id查询店铺
	 * @return
	 */
    public List<ShopEntity> getShopsbyMallId(String mallId) throws Exception;
    
}
