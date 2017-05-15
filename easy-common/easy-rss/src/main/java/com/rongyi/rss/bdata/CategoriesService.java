package com.rongyi.rss.bdata;

import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.roa.entity.CategoryHaiXinEntity;

public interface CategoriesService {
	/**
	 * 通过上级ID查询品牌分类信息
	 * @param parentId
	 * @return
	 */
	public ResponseVO getVoListByParentId(String parentId);
	
	public String insertCategoryHaiXin(CategoryHaiXinEntity categoryHaiXin);
	
	public boolean updateCategoryHaiXin(CategoryHaiXinEntity categoryHaiXin);
	
	public CategoryHaiXinEntity getCategoryHaiXinByCode(String code, String shopMid);
	
	public List<CategoryHaiXinEntity> getCategoryHaiXinListByUpperCode(String upperCode, Integer level, String shopMid);
	
	public List<CategoryHaiXinEntity> getCategoryHaiXinByIds(List<ObjectId> ids);
	
	public void importHaiXinCategory(String url, String shopMid) throws Exception;
	
	/**
	 * 根据id查询品类信息
	 * @param ids
	 * @return
	 */
	public CategoryHaiXinEntity getCategoryHaiXinById(ObjectId id);
}
