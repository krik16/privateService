package com.rongyi.rss.redis;

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
}
