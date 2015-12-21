package com.rongyi.rss.msob;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.rmmm.param.ShoppingCartParam;

public interface IShoppingCartService {
	/**
	 * 删除购物车
	 * @param userId  用户 id
	 * @param shopCartId  购物车主键id
	 * @throws Exception
	 */
	public int deleteShopCart(String userId, Integer shopCartId)  throws Exception;
	
	/**
	 * 清空购物车
	 * @param userId 用户 id
	 * @throws Exception
	 */
	public int emptyShopCart(String userId)  throws Exception;
	
	/**
	 * 更换购物车店铺导购
	 * @param userId 用户id
	 * @param shopId 店铺id
	 * @param guideId 导购id
	 * @throws Exception
	 */
	public int editShopCartGuide(ShoppingCartParam param)  throws Exception;
	
	/**
	 * @param userId 用户id
	 * @param shopCartId 购物车主键id
	 * @param commodityCount 商品数量  
	 * @param param
	 * @throws Exception
	 */
	public int editShopCart(ShoppingCartParam param)  throws Exception;
	
	/**
	 * 加入购物车
	 * @return
	 * @throws Exception
	 */
	public ResponseVO addShopCart(ShoppingCartParam param)  throws Exception;

}
