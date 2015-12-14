package com.rongyi.rss.bdata;

import com.rongyi.core.bean.ResponseVO;

/**
 * Desc: mall service
 * User: chris
 * Date: 2015/10/24 18:32
 */

public interface MallService {
    /**
     * 获取商场详情
     * @param mallId
     * @param channel
     * @param timeStamp
     * @param sign
     * @return
     */

    ResponseVO getMall(String mallId, String channel, long timeStamp, String sign);

    /**
     * 获取商场楼层
     * @param mallId
     * @param timeStamp
     * @param channel
     * @param sign
     * @return
     */
    ResponseVO getFloorsByMallId(String mallId, long timeStamp, String channel, String sign);

    /**
     *
     * @param ids
     * @param timeStamp
     * @param channel
     * @param sign
     * @return
     */
    ResponseVO getFloorById(String ids, long timeStamp, String channel, String sign);

    /**
     *
     * @param timeStamp
     * @param channel
     * @param sign
     * @return
     */
    ResponseVO getAllCategories(long timeStamp, String channel, String sign);

    /**
     *
     * @param mallId
     * @param timeStamp
     * @param channel
     * @param sign
     * @return
     */
    ResponseVO getCustomCategoriesByMallId(String mallId, long timeStamp, String channel, String sign);

    /**
     *
     * @param brndId
     * @param timeStamp
     * @param channel
     * @param sign
     * @return
     */
    ResponseVO getBrandById(String brndId, long timeStamp, String channel, String sign);

    /**
     *
     * @param mallId
     * @param timeStamp
     * @param channel
     * @param sign
     * @return
     */
    ResponseVO getAds(String mallId, long timeStamp, String channel, String sign);


    /**
     * get communal facility
     * @param floorId
     * @param timeStamp
     * @param channel
     * @param sign
     * @return
     */
    ResponseVO getCommunalFacility(String floorId, long timeStamp, String channel, String sign);

    /**
     * get area info
     * @param type
     * @param timeStamp
     * @param channel
     * @param sign
     * @return
     */
    ResponseVO getArea(Integer type, String parentId, long timeStamp, String channel, String sign);
    
    /**
     * 根据商场名称 模糊匹配查询商场列表
     * @param mallName		商场名称
     * @param page			当前页
     * @param pageSize		每页显示条数
     * @param timeStamp		请求时间
     * @param channel		Token值
     * @param sign			MD5码
     * @return	ResponseVO 对象
     */
    ResponseVO getMallList(String mallName, int page, int pageSize, long timeStamp, String channel, String sign);

}
