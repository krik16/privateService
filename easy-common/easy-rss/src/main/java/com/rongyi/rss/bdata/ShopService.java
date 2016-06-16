package com.rongyi.rss.bdata;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.bdata.entity.Shop;

import java.util.List;
import java.util.Map;

/**
 * 店铺服务
 * @author xiaobo
 *
 */
public interface ShopService {
	
	 
	/**
	 * 店铺搜索
	 * @param mallId		商场ID
	 * @param keyword		关键词（商场名称）
	 * @param customCateId	自定义分类ID
	 * @param page			当前页
	 * @param pageSize		分页条数
	 * @param zoneId		区域Id（省市区商圈商场楼层）
	 * @return 带ShopVO 的ResponseVO
	 * @throws Exception
	 */
	ResponseVO searchShops(String mallId, String keyword, String customCateId, String zoneId, int page, int pageSize) throws Exception;

	/**
	 * 获取单个店铺详情
	 * @param id 店铺id
	 * @return 带ShopVO 的ResponseVO
	 */
	ResponseVO getShopById(String id);
	/**
	 * 通过店铺id列表获取店铺列表
	 * @param ids 店铺id列表
	 * @return 带List&lt;ShopVO&gt;的ResponseVO
	 */
	ResponseVO getShopsByIds(String ids);
	
	/**
	 * 根据楼栋信息查询店铺列表
	 * @param paramMap
	 * @return
	 */
	List<Shop> searchShop(Map<String, Object> paramMap);
	
	/**
	 * 根据商场ID || 店铺名称获取店铺列表
	 * @param mallId		商场ID
	 * @param shopName		店铺名称
	 * @param page			当前页
	 * @param pageSize		分页条数
	 * @return
	 */
	public ResponseVO getShopListForName(String mallId, String shopName, Integer page, Integer pageSize);

	public ResponseVO getCouponInfoByShopIds(String ids);
}
