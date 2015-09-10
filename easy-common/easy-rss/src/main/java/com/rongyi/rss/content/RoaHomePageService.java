package com.rongyi.rss.content;

import com.rongyi.core.bean.ResponseData;

/**
 * 容易逛首页配置业务接口
 * 只提供给malllife使用
 * 内容首页配置
 * Created by Breggor on 2015/9/10.
 */
public interface RoaHomePageService {


    /**
     * 根据城市与用户查询首页配置信息
     *
     * @param cityId 城市Id
     * @param cityId 城市名
     * @param userId 用户Id
     * @return
     */
    ResponseData findHomePageBy(String cityId, String cityName, String userId);
}
