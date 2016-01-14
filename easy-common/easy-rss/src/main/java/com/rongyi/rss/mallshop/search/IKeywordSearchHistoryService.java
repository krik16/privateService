package com.rongyi.rss.mallshop.search;

import com.rongyi.easy.rmmm.entity.KeywordSearchHistory;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/5/12
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/12              1.0            创建文件
 *
 */
public interface IKeywordSearchHistoryService {

    /**
     *
     * @param data
     * @return
     */
    public boolean saveLog(KeywordSearchHistory data);

    /**
     *
     * @param keywordSearchHistory
     */
    public void save(KeywordSearchHistory keywordSearchHistory);
}
