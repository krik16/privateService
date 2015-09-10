package com.rongyi.rss.content;


import java.util.Map;

/**
 * 容易逛首页配置业务接口
 * 只提供给malllife使用
 * 内容首页配置
 * malllife=简写ML
 * Created by Breggor on 2015/9/9.
 */
public interface MLHomePageService {

    /**
     * 根据城市Id/userId查询首页配置信息
     *
     * @param cityId 城市
     * @param userId 用户Id
     * @return
     */
    Map<String, Object> findHomePageBy(String cityId, String userId);
}
