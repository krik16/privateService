package com.rongyi.rss.tradecenter;

import java.util.Map;

/**
 * Created by xgq on 2015/9/14.
 */
public interface RoaTradeUserCodeService {

    Map<String, Object> findTradeUserCodeForStatistics(Map<String, Object> paramsMap);

    Map<String, Object> findTradeUserCodeForStatisticsCounts(Map<String, Object> paramsMap);


    /**
     * 条件查询用户券码数量
     * @param paramsMap
     * @return
     */
    int getUserCodeNumByMap(Map<String, Object> paramsMap);
}
