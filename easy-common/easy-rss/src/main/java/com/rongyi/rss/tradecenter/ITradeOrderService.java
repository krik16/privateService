package com.rongyi.rss.tradecenter;

import com.rongyi.easy.rmmm.param.OrderListParam;
import com.rongyi.easy.tradecenter.TradeOrder;
import com.rongyi.easy.tradecenter.TradeSubOrder;
import com.rongyi.easy.tradecenter.param.TradeOrderCreateParam;

import java.util.List;
import java.util.Map;

/**
 * @author xgq
 * @version 2015/8/20
 */
public interface ITradeOrderService {

    TradeOrder findOneByOrderNo(String orderNo);

    Map<String, Object> createTradeOrder(TradeOrderCreateParam param);

    TradeOrder findCouponOrderById(Integer id);

    List<TradeSubOrder> findTradeSubOrdersByNo(String orderNo);

    List<TradeSubOrder> findTradeSubOrdersById(Integer orderId);

    Map<String, Object> getTradeOrders(Map<String, Object> paramsMap, Integer currentpage, Integer pagesize);

    Map<String, Object> findAllTradeOrdersByType(Map<String, Object> paramsMap, Integer currentPage, Integer pageSize);

    Map<String, Object> findAllTradeOrdersByStatus(Map<String, Object> paramsMap, Integer currentPage, Integer pageSize);

    Map<String, Object> processOrderNotify(String orderNo, int payChannel, String payNo, String payAccount);

    Map<String, Object> calcRefundAmount(String orderNo, Integer number, String userId);

    Map<String, Object> refundCoupons(String orderNo, int refundNum, int refundAmount, String refundWay, String refundReason, String userId);

    String deleteTradeOrder(String orderNoStr, String userId);

    Map<String, Object> noPayCouponOrder(String orderNo, String userId);

    List<Map<String, Object>> obtainCouponOrderForPayed(String orderNo);

    void updateOrderRefundedByNo(String orderNo);

    Map<String, Object> insertTradeOrder(TradeOrderCreateParam param);

    int getMaxIntegral(OrderListParam param, double limit, double scoreExchangeMoney,double platformRebateAmount);
}
