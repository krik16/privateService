package com.rongyi.rss.mcmc;

import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.easy.mcmc.CommodityCategory;




public interface ROACommodityCategoryService {
	/**
	 * 查询特定级别的分类
	 * @param type
	 * @return
	 */
	public List<CommodityCategory> findCategoryByType(int type);
	/**
	 * 根据父类id查子类
	 * @param parentId
	 * @return
	 */
	public List<CommodityCategory> listCategoryByParentId(ObjectId parentId);
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public CommodityCategory selectCategoryById(String id);
	
	public CommodityCategory selectCategoryByName(String name);
	
	public CommodityCategory selectCategoryByNameAndParent(String name, String parentId);
}
