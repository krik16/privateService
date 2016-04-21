package com.rongyi.rss.tradecenter;

import com.rongyi.easy.malllife.vo.CouponRefundDetailVO;
import com.rongyi.easy.tradecenter.TradeUserCode;
import com.rongyi.easy.tradecenter.vo.CouponOrderVO;

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

    void updateTradeUserCodeStatusByIds(List<Integer> tradeUserCodeIds, int status,String paymentId);

    Map<String, Object> findTradeUserCodeForStatistics(Map<String, Object> paramsMap);

    Map<String, Object> findTradeUserCodeForStatisticsCounts(Map<String, Object> paramsMap);

    int dailyBuyCount(String couponId, String userId);

    /**
     * 条件查询用户券码数量
     * @param paramsMap
     * @return
     */
    int getUserCodeNumByMap(Map<String, Object> paramsMap);

    CouponRefundDetailVO getRefundDetail(Integer refundId);

    List<CouponOrderVO> getCouponOrderListForWX(String buyerId,String openId,String userPhone,String type);
}
