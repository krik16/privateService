package com.rongyi.rss.bdata;

import java.util.List;

import com.rongyi.core.bean.ResponseVO;

/**
 * 店铺服务
 * @author xiaobo
 *
 */
public interface ShopService {
	
	/**
	 * 店铺搜索
	 * @param keyword 关键字
	 * @param page 页数
	 * @param pageSize 页大小
	 * @param timeStamp 时间戳
	 * @param sign 签名
	 * @return 带ShopVO 的ResponseVO
	 */
	ResponseVO searchShops(String keyword,int page,int pageSize,long timeStamp,String sign);
	/**
	 * 获取单个店铺详情
	 * @param id 店铺id
	 * @param timeStamp 时间戳
	 * @param sign 签名
	 * @return 带ShopVO 的ResponseVO
	 */
	ResponseVO getShopById(String id,long timeStamp,String sign);
	/**
	 * 通过店铺id列表获取店铺列表
	 * @param ids 店铺id列表
	 * @param timeStamp 时间戳
	 * @param sign 签名
	 * @return 带List&lt;ShopVO&gt;的ResponseVO
	 */
	ResponseVO getShopsByIds(String ids,long timeStamp,String sign);
	/**
	 * 获取所有店铺分类
	 * @param timeStamp 时间戳
	 * @param sign 签名
	 * @return 带Categories的ResponseVO
	 */
	ResponseVO getAllCategories(long timeStamp,String sign);
	/**
	 * 获取商场楼层信息
	 * @param mallId 商场id
	 * @param timeStamp 时间戳
	 * @param sign 签名
	 * @return 带Floor的ResponseVO
	 */
	ResponseVO getFloorsByMallId(String mallId,long timeStamp,String sign);
	/**
	 * 获取所有用户自定义分类
	 * @param mallId 商场id
	 * @param timeStamp 时间戳
	 * @param sign 签名
	 * @return 带CustomCategory的ResponseVO
	 */
	ResponseVO getCustomCategoriesByMallId(String mallId,long timeStamp,String sign);
}
