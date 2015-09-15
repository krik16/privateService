package com.rongyi.rss.tradecenter;

import java.util.Map;

/**
 * Created by xgq on 2015/9/14.
 */
public interface RoaTradeUserCodeService {

    Map<String, Object> findTradeUserCodeForStatistics(Map<String, Object> paramsMap);

    Map<String, Object> findTradeUserCodeForStatisticsCounts(String couponId);
}
