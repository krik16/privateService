/**
 * @Title: ActivitySolrService.java
 * @Package com.rongyi.rss.solr
 * @Description: TODO
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年8月21日 下午6:00:15
 * @version V1.0
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.rss.solr;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.solr.param.ActivityAreaSearchParam;
import com.rongyi.easy.solr.param.ActivityCategorySearchParam;
import com.rongyi.easy.solr.param.ActivitySearchParam;
import com.rongyi.easy.solr.param.ActivityStickParam;
import com.rongyi.easy.solr.result.ActivityDetailSearchResult;
import com.rongyi.easy.solr.result.ActivitySearchResult;

import java.util.List;

/**
 * @author ZhengYl
 */
public interface ActivitySolrService {

    /**
     * 活动列表检索
     *
     * @param input
     * @return
     * @author ZhengYl
     * @date 2015年8月24日 下午4:27:08
     */
    public ActivitySearchResult activitySearch(ActivitySearchParam input);

    /**
     * 给定活动Id查询活动明细
     *
     * @param activityId
     * @return
     * @author ZhengYl
     * @date 2015年8月24日 下午4:27:10
     */
    public ActivityDetailSearchResult activityDetailSearch(String activityId, boolean isNew, String lat, String lng);

    /**
     * 卡劵置顶
     *
     * @param mallId     商城ID
     * @param list       需要置顶的卡劵列表
     * @param sourceType 来源：0000（终端机），0001（app），0002（微信），0003为 移动微商城， 0004-9999（其他，包括发码，活动等）
     * @return true:成功
     * @author wangjh7
     * @date 2016-04-22
     */
    public boolean setActivityStick(String mallId, Integer sourceType, List<ActivityStickParam> list);

    /**
     * 获取地区ID列表
     * 根据城市ID+店铺ids/分类ids 获取合适的卡券对应的地区ids
     *
     * @param param
     * @return
     */
    public ResponseVO getAreaIdList(ActivityAreaSearchParam param);

    /**
     * 获取分类D列表
     * 根据城市ID+店铺ids/分类ids 获取合适的卡券对应的分类ids
     *
     * @param param
     * @return
     */
    public ResponseVO getCategoryIdList(ActivityCategorySearchParam param);
}
