package com.rongyi.rss.mcmc;

import java.util.List;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.CommodityCategoryHistory;

/**
 * 品牌搜索记录
 *
 * @author wangjh7
 * @date 2016-09-21
 */
public interface ICommodityCategoryHistoryService {

    /**
     * 查询历史列目
     *
     * @param
     * @return
     */
    public List<CommodityCategoryHistory> listCategoryByUserId(Integer userId, Integer type);

    /**
     * 根据用户获取历史搜索列表
     *
     * @param userId
     * @param size
     * @return
     */
    public ResponseVO getList(String userId, int size);

    /**
     * 清除用户的历史搜素列表
     *
     * @param userId
     * @return
     */
    public ResponseVO clean(String userId);

    /**
     * 保存用户搜索历史
     *
     * @param commodityCategoryId
     * @param userId
     * @param commodityCount
     * @return
     */
    public ResponseVO save(String commodityCategoryId, String userId, int commodityCount);
}
