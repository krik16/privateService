/**
 * @Title: KeywordsService.java
 * @Package com.rongyi.rss.solr
 * @Description: 用户关键词联想
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年10月14日 下午1:36:02
 * @version V1.0
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.rss.solr;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.malllife.param.KeywordSearchParam;
import com.rongyi.easy.rmmm.entity.KeywordSearchHistory;
import org.mongodb.morphia.query.Query;

import java.util.Arrays;
import java.util.List;

/**
 * 用户关键词搜索
 *
 * @author wangjh7
 * @date 2016-07-22
 */
public interface KeywordsService {

    /**
     * 保存用户关键词历史记录
     *
     * @param history
     */
    public boolean saveSearchKeywords(KeywordSearchHistory history) throws RYServiceException;

    /**
     * 搜索关联联想词
     *
     * @param param
     * @return 返回LIST(com.rongyi.easy.solr.result.KeywordHistoryEntity)
     */
    public List<KeywordSearchHistory> searchKeywordHistory(KeywordSearchParam param) throws RYServiceException;

    /**
     * 删除无效数据
     */
    public void deleteInvalid() throws RYServiceException;

    /**
     * 获取未初始化的数据
     *
     * @param start
     * @param size
     * @return
     */
    public List<KeywordSearchHistory> getInitList(int start, int size) throws RYServiceException;

    /**
     * 更新KeywordSuggest数据
     *
     * @param history
     */
    public boolean updateKeywordSuggest(KeywordSearchHistory history) throws RYServiceException;
}
