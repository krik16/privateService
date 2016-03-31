package com.rongyi.rss.smms;

import java.util.Map;

/**
 * 商超管理系统 营销活动 对外dubbo接口 类ISuperMarketActivityService.java的实现描述：TODO 类实现描述
 * @author rongyi11 2015年1月22日 上午10:41:18
 */
public interface ISuperMarketActivityService {
    /**
     * 根据参数查询
     * groupId
     * mallId 暂时没有
     * cateType 分类的类型 1 标超 2大卖场 3便利店
     * @param params
     * @return
     * @throws Exception
     */
    public Map searchSuperMarketActivityList(Map params) throws Exception;
}
