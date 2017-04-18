package com.rongyi.rss.mcmc;

import java.util.List;
import java.util.Map;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.mcmc.param.CommoditySpecSerachParam;
import com.rongyi.easy.mcmc.vo.CategoryNodeVO;
import com.rongyi.easy.mcmc.vo.CommodityCategorySaleVO;
import com.rongyi.easy.mcmc.vo.CommodityCategoryVO3;
import com.rongyi.easy.mcmc.vo.SndClassCategory;

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

	public CommodityCategory selectCategoryByNameAndType(String name,Integer type);


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
	 * 修改商品分类单个值
	 * @return
	 */
	List<CategoryNodeVO> getAllCategories();

	List<String> getCategoryNames(List<ObjectId> categoryIds);

	public List<CommodityCategoryVO3>  selectCommodityCategoryByTypeAndParentId(CommoditySpecSerachParam commoditySpecSerachParam);

	public boolean insertOrUpdateCommodityCategory(CommodityCategoryVO3 commodityCategoryVO3);
	
	public List<CommodityCategory> findCategoryByColumnIds(List<ObjectId> columnIds);
	
	public List<CommodityCategory> getCategoryByIds(List<ObjectId> categoryIds);
	
	public void updateCategory(CommodityCategory category) throws Exception;
	
	public Map<ObjectId, CommodityCategorySaleVO> getFirstCommodityCategoryCache(Map<ObjectId, SndClassCategory> sndCommodityCategoryCache) throws Exception;
	
	public Map<ObjectId, SndClassCategory> getSecondCommodityCategoryCache(List<ObjectId> category3IdList) throws Exception;

	Map<String, CommodityCategory> getFirstAndSecondCategory(String categoryId);

	ResponseResult getCommodityCategory();

	ResponseResult getThirdCategoryById(String id);

	List<CommodityCategory> getCommodityCategoryByTypeAndParentId(String parentId, int type);
}
