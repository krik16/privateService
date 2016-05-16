package com.rongyi.rss.shop;

import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.easy.shop.entity.ShopExclusiveCategoryEntity;

public interface ROAShopExclusiveCategoryService {

	public String insertShopExclusiveCategory(ShopExclusiveCategoryEntity entity);

	public List<ShopExclusiveCategoryEntity> getSubByTypeOrParentId(Integer type, String parentId,String mallId);
	
	public ShopExclusiveCategoryEntity getExclusiveCateogryById(String id);
	
	public List<String> insertShopExclusiveCategoryList(List<ShopExclusiveCategoryEntity> entities);
	
	public void deleteExclusiveCategoryList(List<ObjectId> ids);
}
