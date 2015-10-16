package com.rongyi.rss.bdata;

import java.util.List;

import com.rongyi.core.bean.ResponseVO;

public interface ShopService {
	ResponseVO getShopById(String id);
	ResponseVO getShopsByIds(List<String> ids);
	ResponseVO getAllCategories();
	ResponseVO getFloorsByMallId(String mallId);
	ResponseVO getCustomCategoriesByMallId(String mallId);
	
}
