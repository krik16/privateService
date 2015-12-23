package com.rongyi.rss.tradecenter;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.coupon.entity.CouponOrder;
import com.rongyi.easy.coupon.entity.CouponOrderItem;
import com.rongyi.easy.coupon.param.CouponOrderParam;
import com.rongyi.easy.coupon.param.RoaCouponOrderParam;
import com.rongyi.easy.rmmm.param.OrderListParam;
import com.rongyi.easy.tradecenter.vo.CouponOrderVO;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * 现有coupon-service相关接口的代理实现，
 * 和之前接口请求和返回类型一样，
 * 目的是最小代价将依赖从coupon-service切换过来
 *
 * @author liuhao
 * @version 2015/8/13
 */
public interface ProxyCouponOrderService {

    /**
     * 创建优惠券订单
     *
     * @param order
     */
    @Deprecated
    void createCouponOrder(CouponOrder order);

    /**
     * 更新优惠券订单
     *
     * @param order
     */
    @Deprecated
    void updateCouponOrder(CouponOrder order);

    /**
     * 更新订单号更新订单状态为退款完成
     *
     * @param orderNo
     */
    void updateOrderRefundedByNo(String orderNo);

    /**
     * 订单参数创建优惠订单
     */
    ResponseResult createCouponOrder(CouponOrderParam param);


    /**
     * 根据订单号查询订单
     *
     * @param orderNo
     * @return
     */
    CouponOrder findOneByOrderNo(String orderNo);

    /**
     * 根据订单号查询订单详情
     *
     * @param orderNo
     * @return
     */
    CouponOrderVO findOrderDetailByOrderNo(String orderNo);

    /**
     * 根据订单PK查询
     *
     * @param orderId
     * @return
     */
    CouponOrder findCouponOrderById(Long orderId);

    /**
     * 创建微信公众号/互动屏优惠券订单
     *
     * @param param
     * @return
     */
    Map<String, Object> createCouponOrderInfo(RoaCouponOrderParam param);

    /**
     * 优惠券批量订单删除（逻辑删除）
     *
     * @param orderNoStr
     * @param userId
     * @return
     */
    String updateTradeStatusDelete(String orderNoStr, String userId);

    /**
     * 创建优惠券订单项
     *
     * @param item
     */
    @Deprecated
    void createCouponOrderItem(CouponOrderItem item);

    /**
     * 根据订单号查询订单项
     *
     * @param orderNo
     * @return
     */
    List<CouponOrderItem> findOrderItemsByNo(String orderNo);


    /**
     * 根据订单Id查询订单项
     *
     * @param orderId
     * @return
     */
    List<CouponOrderItem> findOrderItemsById(Long orderId);

    /**
     * 优惠券退款处理
     *
     * @param orderNo      订单编号
     * @param number       退款数量
     * @param totalFee     退款金额
     * @param refundWay    退款方式
     * @param refundReason 退款原因
     * @param userId
     * @return Map<String,Object>    返回类型
     */
    Map<String, Object> refundCoupons(String orderNo, Integer number, Double totalFee, String refundWay, String refundReason, String userId);


    /**
     * 根据订单号获取已生成的未支付优惠券订单列表
     *
     * @param orderNo
     * @return
     */
    Map<String, Object> noPayCouponOrder(String orderNo, String userId);


    /**
     * 提交优惠券订单
     *
     * @param orderMap
     * @param userId
     * @param userName
     * @return
     */
    Map<String, Object> submitCouponOrder(Map<String, Object> orderMap, String userId, String userName);

    /**
     * 获取已成功付款的订单项
     *
     * @param orderId
     * @return
     */
    List<Map<String, Object>> obtainCouponOrderForPayed(String orderId);

    /**
     * 支付成功后处理订单状态
     *
     * @param orderNo    订单号
     * @param tradeWay   支付方式
     * @param paymentNo  支付单号
     * @param payAccount 支付账户(例如支付宝账户)
     * @return
     */
    Map<String, Object> processCouponOrderForPayed(String orderNo, int tradeWay, String paymentNo, String payAccount);

    /**
     * @param paramsMap
     * @param currentpage
     * @param pagesize
     * @return List<CouponOrder>    返回类型
     * @Title: getCouponOrders
     * @Description: TODO(分页查询订单信息)
     */
    Map<String, Object> getCouponOrders(Map<String, Object> paramsMap,
                                        Integer currentpage, Integer pagesize);


    /**
     * 优惠券列表（全部、未付款）
     *
     * @param paramsMap
     * @param currentPage
     * @param pageSize
     * @return
     */
    Map<String, Object> findAllOrdersByType(Map<String, Object> paramsMap,
                                            Integer currentPage, Integer pageSize);

    /**
     * 优惠券列表（未消费、已退款、退款中）
     *
     * @param paramsMap
     * @param currentPage
     * @param pageSize
     * @return
     */
    Map<String, Object> findOrdersByStatus(Map<String, Object> paramsMap,
                                           Integer currentPage, Integer pageSize);

    /**
     * @param orderNo
     * @param number
     * @param userId
     * @return
     */
    Map<String, Object> calcRefundAmount(String orderNo, Integer number, String userId);

    /**
     * 代金券已购买数
     *
     * @param couponId
     * @param userId
     * @return
     */
    int buyedCount(String couponId, String userId);

    /**
     * 买家已购买数量
     *
     * @param couponId
     * @param userId
     * @return
     */
    int dailyBuyCount(String couponId, String userId);

    /**
     * 获取代金券生成订单最大使用积分
     *
     * @param param
     * @param limit 积分抵扣限制
     * @param scoreExchangeMoney 积分抵扣金额
     * @param platformRebateAmount 满减抵扣券抵扣价格
     * @return
     * @throws Exception
     */
    int getMaxIntegral(OrderListParam param, double limit, double scoreExchangeMoney,double platformRebateAmount);
}
