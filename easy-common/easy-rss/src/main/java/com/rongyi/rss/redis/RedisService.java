package com.rongyi.rss.redis;

import java.util.List;

/**
 * Created by wangzehui on 2016/2/19.
 */
public interface RedisService {

    /**
     * 自增操作
     * @param key
     * @return
     * @throws Exception
     */
    public Long incr(String key) throws Exception;

    /**
     * 自减操作
     * @param key
     * @return
     * @throws Exception
     */
    public Long decr(String key) throws Exception;

    /**
     * 获取value
     * @param key
     * @return
     */
    public String get(String key);

    /**
     * set key value
     * @param key
     * @param value
     * @return
     */
    public String set(String key,String value);

    /**
     * set key value
     * @param key
     * @param value
     * @return
     */
    public String setObject(String key,Object value);
    /**
     * 批量插入
     * @param keys
     * @param values
     * @param time
     * @throws Exception
     */
    public void setObject(List<String> keys, List<Object> values,int time) throws Exception;

    /**
     * 获取hash对象
     * @param key
     * @param c
     * @return
     * @throws Exception
     */
    public Object getObject(String key ,Class c) throws Exception;
}
