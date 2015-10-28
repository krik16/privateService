package com.rongyi.rss.shop;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.rongyi.easy.shop.entity.ShopEntity;

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
}
