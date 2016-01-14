package com.rongyi.rss.shop;

import java.util.List;

import com.rongyi.easy.shop.entity.MallCustomCategoryEntity;

public interface IMallCustomCategoryService {
	
	/*public String insertShopExclusiveCategory(MallCustomCategoryEntity entity);*/
	/**
	 * 查询商场自定义类目下级分类或者第一级 第二级分类
	 * @param type
	 * @param parentId
	 * @param mallId
	 * @return
	 */
	public List<MallCustomCategoryEntity> getSubByTypeOrParentId(Integer type,String parentId,String mallId);
	
	/**
	 * 根据id查询店铺专属分类 店铺专属分类就是商场自定义类目
	 * @param id
	 * @return
	 */
	public MallCustomCategoryEntity getCustomCateogryById(String id);
	
	/*public List<String> insertShopExclusiveCategoryList(List<MallCustomCategoryEntity> entities);*/
	
	/*public void deleteExclusiveCategoryList(List<ObjectId> ids);*/
}
