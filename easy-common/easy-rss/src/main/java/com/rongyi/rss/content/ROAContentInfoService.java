package com.rongyi.rss.content;

import com.rongyi.easy.content_v2.vo.ForumVO;

/**
 * 得到app首页模块内容
 *
 * @author lijing
 */
public interface ROAContentInfoService {

    /**
     * 得到banner     cityId和provId 不可以都为空
     *
     * @param cityId
     * @param provId
     * @return
     */
    public ForumVO getBanner(String cityId, String provId);

    /**
     * 得到快捷入口信息
     *
     * @return
     */
    public ForumVO getQuick();

    /**
     * 得到热点信息 cityId和provId 不可以都为空
     *
     * @param cityId
     * @param provId
     * @return
     */
    public ForumVO getHotRecommend(String cityId, String provId);

    /**
     * 得到卡卷信息 cityId和provId 不可以都为空
     *
     * @param cityId
     * @param provId
     * @return
     */
    public ForumVO getCouponRecommend(String cityId, String provId);

    /**
     * 得到活动信息 cityId和provId 不可以都为空
     *
     * @param cityId
     * @param provId
     * @return
     */
    public ForumVO getActivityRecommend(String cityId, String provId);

    /**
     * 得到明星店铺 cityId和provId 不可以都为空
     *
     * @param cityId
     * @param provId
     * @return
     */
    public ForumVO getStarShop(String cityId, String provId);

    /**
     * 得到浮标广告 cityId和provId 不可以都为空
     *
     * @param cityId
     * @param provId
     * @return
     */
    public ForumVO getFloatAD(String cityId, String provId);

}
