package com.rongyi.rss.content;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.content_v2.param.HomePageParam;
import com.rongyi.easy.content_v2.vo.ContentListVO;

import java.util.List;

/**
 * 容易逛首页配置业务接口
 * 只提供给malllife使用
 * 内容首页配置
 * malllife简写ML
 * Created by lijing on 2015/12/26 15:22
 * .com.rongyi.rss.content
 * easy-api
 */
public interface MLHomePageContentNewService {

    /**
     * 根据城市与用户查询首页配置信息
     *
     * @param param
     * @return ResponseVO
     */
    ResponseVO findHomePageContentNewBy(HomePageParam param);

    /**
     * @lijing
     * @param cityId
     * @param cityName
     * @param type 3代表商品  4代表买手
     * @return
     */
    List<ContentListVO> findContentList(String cityId,String cityName,int type);
}
