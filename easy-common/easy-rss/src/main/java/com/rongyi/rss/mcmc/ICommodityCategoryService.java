package com.rongyi.rss.mcmc;

import java.util.List;

import com.rongyi.easy.mcmc.vo.CategoryNodeVO;
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
	 * 修改商品分类 热门和图片
	 * @param categoryId
	 * @param isPopular
	 * @param popularImg
	 * @return
	 */
	public boolean updateCategoryPopular(String categoryId,boolean isPopular,String popularImg);

	/**
	 * 查询所有类目
	 *
	 * @return list
	 */
	List<CategoryNodeVO> getAllCategories();
}
