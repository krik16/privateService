package com.rongyi.rss.mallshop.user;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/5/11
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/11              1.0            创建文件
 *
 */
public interface IOperateRedisService {


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
     * @param value
     * @return
     */
    public Long setnx(String key, String value)throws Exception ;

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

    /**
     * 批量删除
     * @param key
     * @return
     * @throws Exception
     */
    //public Boolean batchDel(String key)throws Exception;



}
