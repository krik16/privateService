package com.rongyi.rss.mcmc;

import java.util.List;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.CommodityCategoryHistory;




public interface ROACommodityCategoryHistoryService {

	/**
	 * 查询历史列目
	 * @param parentId
	 * @return
	 */
	public List<CommodityCategoryHistory> listCategoryByUserId(Integer userId,Integer type);
	
	/**
     * 根据用户获取历史搜索列表
     *
     * @param userId
     * @param size
     * @return List<TrdClassCategory>
     */
    public ResponseVO getList(String userId, int size);

    /**
     * 获取热门分类
     *
     * @return List<TrdClassCategory>
     */
    public ResponseVO getHotList();

    /**
     * 清除用户的历史搜素列表
     *
     * @param userId
     * @return boolean
     */
    public ResponseVO clean(String userId);

    /**
     * 保存用户搜索历史
     *
     * @param commodityCategoryId
     * @param userId
     * @param commodityCount
     * @return boolean
     */
    public ResponseVO save(String commodityCategoryId, String userId, int commodityCount);
	
}
