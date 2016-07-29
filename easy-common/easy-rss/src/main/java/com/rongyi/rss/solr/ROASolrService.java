package com.rongyi.rss.solr;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

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
     * @param ids
     * @throws Exception
     */
    public void replaceIndex(String core,List<String> ids) throws Exception;

    /**
     * 导入索引
     * @param core
     * @param map
     */
    public void importIndex(String core,Map<String,Object> map) throws Exception;

    /**
     * 获取core的fields
     * @param core
     * @return
     * @throws Exception
     */
    public List<String> getFields(String core) throws  Exception;

    /**
     * 修改core某个id的field
     * @param core
     * @param paramMap
     */
    public void updateIndex(String core,Map<String,Object> paramMap) throws Exception;

    /**
     * 备份core
     * @param core
     * @return
     */
    public boolean backup(String core) throws MalformedURLException, Exception;
    
    /**
     * 增量更新索引
     * @param core
     * @param ids
     * @throws Exception
     */
    public void updateIndex(String core,List<String> ids) throws Exception;
}
