package com.rongyi.rss.tradecenter;

import com.rongyi.easy.tradecenter.TradeUserCode;

import java.util.List;
import java.util.Map;

/**
 * Created by xgq on 2015/8/19.
 */
public interface ITradeUserCodeService {

    TradeUserCode getTradeUserCode(String code);

    void updateTradeUserCode(TradeUserCode tradeUserCode);

    TradeUserCode findTradeUserCouponById(Integer id);

    int buyedCouponCount(String couponId, String userId);

    List<TradeUserCode> findTradeUserCodeList(Integer orderId, String couponId);

    void updateTradeUserCodeStatusByIds(List<Integer> tradeUserCodeIds, int status);

    Map<String, Object> findTradeUserCodeForStatistics(Map<String, Object> paramsMap);

    Map<String, Object> findTradeUserCodeForStatisticsCounts(Map<String, Object> paramsMap);

}
