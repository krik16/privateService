package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.coupon.entity.CouponOrder;
import com.rongyi.easy.coupon.entity.CouponOrderItem;
import com.rongyi.easy.coupon.param.CouponOrderParam;
import com.rongyi.easy.coupon.param.RoaCouponOrderParam;

import java.util.List;
import java.util.Map;

/**
 * 卡券订单接口：目前提供零支付订单
 *
 * @author Breggor
 */
public interface RoaCouponOrderService {
    /**
     * 创建优惠券订单
     *
     * @param order
     */
    void createCouponOrder(CouponOrder order);

    /**
     * 更新优惠券订单
     *
     * @param order
     */
    void updateCouponOrder(CouponOrder order);

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
     * @param orderIdStr
     * @param userId
     * @return
     */
    String updateTradeStatusDelete(String orderIdStr, String userId);


    /**
     * 创建优惠券订单项
     *
     * @param item
     */
    void createCouponOrderItem(CouponOrderItem item);


    /**
     * 根据订单号查询订单项
     *
     * @param orderNo
     * @return
     */
    List<CouponOrderItem> findItemListByOrderNo(String orderNo);

    /**
     * 更新优惠券订单项
     *
     * @param item
     */
    void updateCouponOrderItem(CouponOrderItem item);

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
     * @param orderNo   订单号
     * @param tradeWay  支付方式
     * @param paymentNo 支付单号
     * @return
     */
    boolean processCouponOrderForPayed(String orderNo, int tradeWay, String paymentNo);

    /**
     * 优惠券立即购买
     *
     * @param couponId
     * @param userId
     * @return
     */
    Map<String, Object> buyCoupon(String couponId, String userId);

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
     * 根据卡券类型查询订单信息
     *
     * @param paramsMap
     * @param currentPage
     * @param pageSize
     * @return Map<String,Object>    返回类型
     * @Title: getCouponOrdersByType
     * @Description: TODO(根据卡券类型查询我的订单列表)
     */
    Map<String, Object> getCouponOrdersByType(Map<String, Object> paramsMap,
                                              Integer currentPage, Integer pageSize);

    /**
     * 根据订单号，券类型查询
     *
     * @param orderNo
     * @param couponType
     * @return
     */
    List<CouponOrderItem> findItemListByOrderNoAndCouponType(String orderNo, String couponType);

    /**
     * @param paramsMap
     * @param currentPage
     * @param pageSize
     * @return Map<String,Object>    返回类型
     * @Title: getCouponOrderByStatus
     * @Description: TODO(查询未消费或退款订单列表)
     */
    Map<String, Object> getCouponOrderByStatus(Map<String, Object> paramsMap,
                                               Integer currentPage, Integer pageSize);
}
