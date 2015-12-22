package com.rongyi.rss.malllife.roa;

import java.util.List;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/6/30
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/6/30              1.0            创建文件
 *
 */
public interface ROARedisService {



    /**
     * 设置单个值
     *
     * @param key
     * @param value
     * @return
     */
    public String set(String key, String value);

    /**
     *
     * @param key
     * @param value
     * @return
     */
    public Long setnx(String key, String value)throws Exception;

    /**
     * 保存对象
     * @param key
     * @param value
     * @return
     */
    public String setObject(String key,Object value)throws Exception;

    /**
     * 删除
     * @param key
     * @return
     */
    public Boolean del(String key)throws Exception;

    /**
     * 获取单个值
     *
     * @param key
     * @return
     */
    public String get(String key) ;


    /**
     * 根据key 获取对象
     * @param key
     * @return
     */
    public <T> T get(String key,Class<T> clazz);

    /**
     * 在某段时间后消失
     *
     * @param key
     * @param seconds
     * @return
     */
    public Long expire(String key, int seconds) ;

    /**
     * 获取列表
     * @param key
     * @param fields
     * @return
     */
    public List<String> hmget(String key, String... fields);

    /**
     * 在某个时间点失效
     *
     * @param key
     * @param unixTime
     * @return
     */
    public Long expireAt(String key, long unixTime) ;


    /**
     * 在对应key尾部加入元素
     * @param key
     * @param string
     * @return
     */
    public Long rpush(String key, String string) ;


    /**
     * 获取key长度
     * @param key
     * @return
     */
    public Long llen(String key) ;


    /**
     * 取数据 从第一个开始取
     * 取完之后删除
     * @param key
     * @return
     */
    public String lpop(String key) ;


}
