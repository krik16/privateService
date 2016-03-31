package com.rongyi.rss.mcmc;

import java.util.List;

import com.rongyi.easy.mcmc.CommodityCategoryHistory;




public interface ICommodityCategoryHistoryService {

	/**
	 * 查询历史列目
	 * @param parentId
	 * @return
	 */
	public List<CommodityCategoryHistory> listCategoryByUserId(Integer userId,Integer type);
	
}
