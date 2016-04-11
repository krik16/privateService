package com.rongyi.rss.content;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.content_v2.param.HomePageParam;
import com.rongyi.easy.content_v2.vo.ActivityRecomListVO;
import com.rongyi.easy.content_v2.vo.ContentListVO;
import com.rongyi.easy.content_v2.vo.LaunchAdvertListVO;

import java.util.Date;
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

    /**
     * 获取开机广告列表
     *
     * @author wangjh7
     * @param date
     * @return
     */
    LaunchAdvertListVO findLaunchAdvertList(Date date);

    /**
     * 新的活动列表查询
     * @Author lijing
     * @param cityId
     * @param cityName
     * @return
     */
    List<ActivityRecomListVO> findContentListNew(String cityId,String cityName);
}
