package com.rongyi.rss.malllife.roa;

import java.util.List;
import java.util.Map;




import com.rongyi.easy.malllife.vo.ShopVO;
import com.rongyi.easy.malllife.vo.h5.MayLikeShopVO;


/**
 * 类ShopService.java的实现描述：TODO 类实现描述 
 * @author rongyi-13 2014年8月21日 下午6:47:14
 */
public interface ROAShopService {
	
	/**
	 * 收藏里面的店铺
	 * @param map
	 * @return
	 */
	public List<Map<String, Object>> queryCollectionShop(Map<String, Object> map) ;
	
	/**
	 * 
	 * @param mallId
	 * @param categryIds
	 * @return
	 */
	public List<ShopVO> getSimilarShops(String mallId, List<String> categoryIds);
	
	/**
	 * 通过shopId得到对应的shop信息
	 */
	public ShopVO getShopInfoByshopId(String shopId);
	/**
	 * 获取可能喜欢的店铺列表
	 * @param mallId
	 * @param categoryIds
	 * @return
	 */
	public List<MayLikeShopVO> getMayLikeShops(String mallId, List<String> categoryIds);
}
