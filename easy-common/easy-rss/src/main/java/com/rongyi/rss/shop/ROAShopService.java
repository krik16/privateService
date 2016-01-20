package com.rongyi.rss.shop;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.rongyi.easy.shop.entity.ShopEntity;
import com.rongyi.easy.shop.vo.ShopVO;

public interface ROAShopService {
	
	public String updateShop(ShopEntity entity);
	
	public ShopEntity getShopById(String id);
	//商家后台店铺列表
	public List<ShopEntity> searchShop(Map<String,Object> paramMap,int currpage,int pageSize);
	
	public Long searchShopCount(Map<String,Object> paramMap);
	
	public void updateStatus(List<ObjectId> ids,String reason,int type,int userId) throws Exception;
	//运营平台店铺列表
	public List<ShopEntity> searchShopForOperation(Map<String, Object> paramMap,int currpage, int pageSize);
	
	public Long searchShopCountForOperation(Map<String, Object> paramMap);
	
	/**
	 * 微信端查询店铺
	 * @param paramMap
	 * @return
	 */
	public List<ShopEntity> searchShop(Map<String,Object> paramMap);
	
	public void insertShopList(List<ShopEntity> shops);
	
	/**
	 * 根据系统编号查询
	 * @param number		店铺编号
	 * @param filialeMid	分公司ID
	 * @return
	 */
	public ShopEntity serachShopByNumber(String number,String filialeMid);
	
	/**
	 * 根据商场和店铺性质查询店铺
	 * @param mallId
	 * @param type
	 * @param pageSize >0分页 <=0部分页
	 * @param currpage
	 * @return
	 */
	public List<ShopVO> searchShopByMallAreaIdAndType(String mallId,
			int type, int pageSize, int currpage);
	
	
	/**
	 * 根据商场和店铺性质查询店铺数量
	 * @param mallId
	 * @param type
	 * @return
	 */
	public Long searchShopCountByMallAreaIdAndType(String mallId,int type);
}
