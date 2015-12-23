package com.rongyi.rss.bdata;

import java.util.List;
import java.util.Map;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.bdata.entity.Shop;

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
	 * @return 带ShopVO 的ResponseVO
	 * @throws Exception 
	 */
	ResponseVO searchShops(String mallId, String keyword, String customCateId, int page, int pageSize) throws Exception;
	
	/**
	 * 获取单个店铺详情
	 * @param id 店铺id
	 * @param timeStamp 时间戳
	 * @param sign 签名
	 * @return 带ShopVO 的ResponseVO
	 */
	ResponseVO getShopById(String id, long timeStamp, String channel, String sign);
	/**
	 * 通过店铺id列表获取店铺列表
	 * @param ids 店铺id列表
	 * @param timeStamp 时间戳
	 * @param sign 签名
	 * @return 带List&lt;ShopVO&gt;的ResponseVO
	 */
	ResponseVO getShopsByIds(String ids, long timeStamp, String channel, String sign);
	
	/**
	 * 根据楼栋信息查询店铺列表
	 * @param paramMap
	 * @return
	 */
	public List<Shop> searchShop(Map<String, Object> paramMap);
}
