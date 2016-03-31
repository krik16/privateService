package com.rongyi.rss.content;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.content_v2.param.HomePageParam;
import com.rongyi.easy.content_v2.vo.BuyerLiveVO;
import com.rongyi.easy.content_v2.vo.ContentListVO;
import com.rongyi.easy.content_v2.vo.PositonBuyer;

import java.util.List;

/**
 * 容易逛首页配置业务接口
 * 只提供给malllife使用
 * 内容首页配置
 * Created by Breggor on 2015/9/10.
 */
public interface ROAHomePageContentService {


    /**
     * 根据城市与用户查询首页配置信息
     *
     * @param param
     * @return
     */
    ResponseVO findHomePageContentBy(HomePageParam param);

    /**
     *根据城市Id查询买手直播信息得到买手直播Id集合
     * @param param
     * @return
     */
    List<PositonBuyer> findHomePageBuyerLive(HomePageParam param);

    /**
     * 根据城市与用户查询新版首页配置信息
     *
     * @param param
     * @return
     */

    ResponseVO findHomePageContentNewBy(HomePageParam param);

    /**
     * @lijing
     * @param cityId
     * @param cityName
     * @return
     */
    List<ContentListVO> findCommodityList(String cityId,String cityName);


    /**
     * @lijing
     * @param cityId
     * @param cityName
     * @return
     */
    List<ContentListVO> findBuyerList(String cityId,String cityName);
}
