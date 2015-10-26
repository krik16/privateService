package com.rongyi.rss.shop;

import java.util.List;

import com.rongyi.easy.shop.entity.ShopExclusiveCategoryEntity;

public interface ROAShopExclusiveCategoryService {

	public String insertShopExclusiveCategory(ShopExclusiveCategoryEntity entity);

	public List<ShopExclusiveCategoryEntity> getSubByTypeOrParentId(Integer type, String parentId,String mallId);
	
	public ShopExclusiveCategoryEntity getExclusiveCateogryById(String id);
}
