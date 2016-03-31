package com.rongyi.rss.gcc;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.content.entity.ContentHelpCategory;

public interface ROAContentHelpCategoryService {
	public List<ContentHelpCategory> selectCategoryByLevelAndPId(Map<String, Object> paraMap);
	
	
	public List<ContentHelpCategory> selectFirstLevelCategory(Integer type);
	
	public List<ContentHelpCategory> selectByStatus();
	
	public ContentHelpCategory getHelpCategoryInfo(Integer id);
}
