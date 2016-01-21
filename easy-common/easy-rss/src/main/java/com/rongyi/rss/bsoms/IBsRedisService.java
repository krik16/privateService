package com.rongyi.rss.bsoms;

/**
 * 
 * @author kenny
 *
 */
public interface IBsRedisService {


    /**
     * 设置参数
     * @param key
     * @param strValue
     */
    public void  set(String key,String strValue)throws Exception;


    /**
     * 设置对象
     * @param key
     * @param object
     */
    public void  setObject(String key, Object object)throws Exception;

    /**
     *
     * @param key
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getByKey(String key,Class<T> clazz)throws Exception;


    /**
     * 获取keyValue
     * @param key
     * @return
     */
    public String getValueByKey(String key)throws Exception;


    /**
     *
     * @param key
     * @return
     */
    public Long getLenByKey(String key)throws Exception;


    /**
     * 获取第一个value
     * @param key
     * @return
     */
    public String getfirstValue(String key)throws Exception;

    /**
     * 添加参数
     * @param key
     * @param vual
     * @return
     */
    public Long rpush(String key,String vual)throws Exception;

    /**
     * 设置时长
     * @param key
     * @param seconds
     * @return
     */
    public Long expire(String key, int seconds)throws Exception;

    public Boolean del(String key)throws Exception;



}
