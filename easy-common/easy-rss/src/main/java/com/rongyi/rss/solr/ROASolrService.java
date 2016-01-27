package com.rongyi.rss.solr;

/**
 * Created by wangzehui on 2016/1/27.
 */
public interface ROASolrService {

    /**
     * 全量更新索引
     * @param core
     * @throws Exception
     */
    public void updateCore(String core) throws Exception;

    /**
     * 增量更新索引
     * @param core
     * @param id
     * @throws Exception
     */
    public void updateIndex(String core,String id) throws Exception;
}
