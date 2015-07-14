package com.rongyi.rss.msob;

import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.rmmm.param.CommodityCartParam;
import com.rongyi.easy.rmmm.vo.ShowCartDetailVO;

public interface IShoppingCartService {
	/**
	 * 加入购物车
	 * @param param
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public ResponseResult insertCommodityCartEntity(CommodityCartParam param, String userId) throws Exception;
	
	/**
	 * 修改购物车商品数量
	 * 
	 * @param param
	 * @param userId
	 * @throws Exception
	 */
	public ResponseResult updateCommodityCartEntity(CommodityCartParam param, String userId) throws Exception;
	
	/**
	 * 购物车删除商品
	 * 
	 * @param param
	 * @param userId
	 * @throws Exception
	 */
	public void deleteCommodityOffCart(CommodityCartParam param, String userId) throws Exception;
	
	/**
	 * 获取我的购物车列表的信息
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public ShowCartDetailVO getMyCartCommodityDetailVO(String userId) throws Exception;

}
