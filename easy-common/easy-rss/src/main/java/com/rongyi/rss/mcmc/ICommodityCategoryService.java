package com.rongyi.rss.mcmc;

import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.easy.mcmc.CommodityCategory;




public interface ICommodityCategoryService {
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
	
	public CommodityCategory selectCategoryByNameAndParent(String name,String parentId);

	/**
	 * 修改商品分类单个值
	 * @param categoryIds 商品分类id
	 * @param property 属性名
	 * @param value 属性值
	 * @return
	 */
	public boolean updateCategoryProperty(List<String> categoryIds,String property,Object value);
}
