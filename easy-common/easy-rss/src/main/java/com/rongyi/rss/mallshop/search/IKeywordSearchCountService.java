package com.rongyi.rss.mallshop.search;

import java.util.Set;

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
public interface IKeywordSearchCountService {

    /**
     *
     * @param key
     */
    public void addCount(final String key);

    /**
     *
     * @param size
     * @return
     */
    public Set<byte[]> getHotKeys(final long size);
}
