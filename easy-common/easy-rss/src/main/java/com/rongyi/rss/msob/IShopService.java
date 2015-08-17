package com.rongyi.rss.msob;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.entity.ShopEntity;
import com.rongyi.easy.malllife.vo.ShopRmmmVO;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.rmmm.entity.ShopInfoEntity;
import com.rongyi.easy.rmmm.exception.RmmmException;
import com.rongyi.easy.rmmm.param.BrandParam;
import com.rongyi.easy.rmmm.param.PrincipalAndCategoryParam;
import com.rongyi.easy.rmmm.vo.BrandShopDetailVO;
import com.rongyi.easy.rmmm.vo.BrandShopListVO;
import com.rongyi.easy.rmmm.vo.ShopDetailVO;
import com.rongyi.easy.rmmm.vo.ShopInfoVO;

public interface IShopService{
	
	/**
	 * 通过商场和品牌的mongoId获得mongo中的店铺
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ShopEntity getShopEntityByBrandIdAndMallId(PrincipalAndCategoryParam param)throws Exception;
	
	/**
	 * 插入店铺信息
	 * 注：添加负责人使用
	 * @param param
	 * @param brandId
	 * @param mallId
	 * @return
	 * @throws Exception
	 */
	public Integer insertCooperateShop(PrincipalAndCategoryParam param,Integer brandId,Integer mallId) throws Exception;
	
	/**
	 * 通过shopId得到ShopDetailVO
	 */
	public ShopDetailVO getShopVOByShopId(Integer shopId) throws Exception;
	
	/**
	 * 通过shopId得到ShopEntity
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
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public BrandShopListVO getBrandShopListVOByBrandId(BrandParam param) throws Exception;
	
	
	
	/**
	 * 在商品页面增加商品所在店铺信息API
	 * @param shopId
	 * @return
	 * @throws Exception
	 */
	public BrandShopDetailVO getBrandShopDetail(String shopId,UserInfoVO user) throws Exception;



	public List<String> getSellerImIdByShopId(String shopId);

	public ShopInfoEntity getShopByShopMId(String shopMId) throws RmmmException;




	public Integer saveTestCooperateShop(final String  ids) throws Exception;


	/**
	 * 返回商场店铺信息
	 * @param mallId
	 * @return
	 * @throws Exception
	 */
	public List<ShopEntity> getShopEntityByMallId(String  mallId) throws Exception;

	public Integer insertCooperateShopByshopMid(String shopMid, Integer brandId, Integer mallId) throws Exception;

	/**
	 * 以下接口是从rongyi.app.content 移过来的接口
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
	 * @param mallName
	 * @return
	 * @throws Exception
	 */
	public List<ShopInfoEntity> getShopListByShopName(String shopName,Integer mallId) throws Exception;
	
	/**
	 * 根据店铺的mongoId获取店铺信息
	 * @param shopMId
	 * @return
	 * @throws Exception
	 */
	public ShopInfoVO getShopInfoByShopMId(String shopMId)  throws Exception;
}
