package com.rongyi.rss.content;


import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.content_v2.param.HomePageParam;

/**
 * 容易逛首页配置业务接口
 * 只提供给malllife使用
 * 内容首页配置
 * malllife简写ML
 * Created by Breggor on 2015/9/9.
 */
public interface MLHomePageContentService {

    /**
     * 根据城市与用户查询首页配置信息
     *
     * @param param
     * @return ResponseVO
     */
    ResponseVO findHomePageContentBy(HomePageParam param);
}
