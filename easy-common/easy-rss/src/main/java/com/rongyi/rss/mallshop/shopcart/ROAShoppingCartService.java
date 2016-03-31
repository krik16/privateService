package com.rongyi.rss.mallshop.shopcart;

import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.rmmm.param.CommodityCartParam;
import com.rongyi.easy.rmmm.param.ShoppingCartParam;
import com.rongyi.easy.rmmm.vo.ShowCartDetailVO;
import com.rongyi.easy.usercenter.entity.ShoppingCartEntity;

public interface ROAShoppingCartService {
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
	 * 编辑购物车
	 * @param userId 用户id
	 * @param shopCartId 购物车主键id
	 * @param commodityCount 商品数量  
	 * @param param
	 * @throws Exception
	 */
	public ResponseVO editShopCart(ShoppingCartParam param)  throws Exception;
	
	/**
	 * 加入购物车
	 * @return
	 * @throws Exception
	 */
	public ResponseVO addShopCart(ShoppingCartParam param)  throws Exception;
	
	/**
	 * 我的购物车列表
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public ShowCartDetailVO getShopCartList(String userId) throws Exception;
	
	/**
	 * 获取我的购物车sku
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public Integer getMyShopCartCount(String userId) throws Exception;
	
	/**
	 * 删除购物车
	 * 
	 * @param userId
	 *            用户 id
	 * @param guideIds
	 *            导购、买手id集合
	 * @throws Exception
	 */
	public int deleteShopCartByGuideIds(String userId, List<Integer> guideIds) throws Exception;
	
	/**
	 * 根据主键id集合查询
	 * @param shopCartId
	 * @return
	 * @throws Exception
	 */
	public List<ShoppingCartEntity> getShopCartByIds(List<Integer> shopCartIds) throws Exception;
	
	/**
	 * 根据主键id查询
	 * @param shopCartId
	 * @return
	 * @throws Exception
	 */
	public ShoppingCartEntity getShopCartById(Integer shopCartId) throws Exception;
	
	/**
	 * 删除购物车
	 * 
	 * @param userId
	 *            用户 id
	 * @param shoppingCartParams
	 *            导购、商品编号、商品规格集合
	 * @throws Exception
	 */
	public int deleteShopCartByModel(String userId, List<ShoppingCartParam> shoppingCartParams) throws Exception;

}
