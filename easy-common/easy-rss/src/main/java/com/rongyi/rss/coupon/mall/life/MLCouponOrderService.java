package com.rongyi.rss.coupon.mall.life;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.coupon.entity.CouponOrder;
import com.rongyi.easy.coupon.entity.CouponOrderItem;
import com.rongyi.easy.coupon.param.CouponOrderParam;
import com.rongyi.easy.coupon.param.WechatPaySignParam;
import com.rongyi.easy.rmmm.param.OrderListParam;
import com.rongyi.easy.tradecenter.vo.CouponOrderVO;

import java.util.List;
import java.util.Map;


/**
 * @author lqy
 * @ClassName: MMCouponOrderService
 * @Description: (卡券订单接口，提供给mall-shop的controller使用)
 * @date 2015年6月8日 下午5:07:12
 */
public interface MLCouponOrderService {

    /**
     * @param orderNo      订单编号
     * @param number       退款数量
     * @param totalFee     退款金额
     * @param refundWay    退款方式
     * @param refundReason 退款原因
     * @param userId
     * @return Map<String,Object>    返回类型
     * @throws Exception 设定文件
     * @Title: refundActivities
     * @Description: TODO(优惠券退款，改变优惠ActivitiesDetail状态)
     */
    Map<String, Object> refundCoupons(String orderNo, Integer number, Double totalFee, String refundWay, String refundReason, String userId)
            throws Exception;


    /**
     * @param orderIdStr: 订单号字符串（多个以逗号隔开）
     * @param userId
     * @return
     * @Title: updateTradeStatusDelete
     * @Description: (优惠券订单删除（逻辑删除）)
     */
    String updateTradeStatusDelete(String orderIdStr, String userId);

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
     * 用户已购买代金券数
     *
     * @param couponId
     * @param userId
     * @return
     */
    int buyedCount(String couponId, String userId);

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
     * 获取已支付优惠券订单
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
     * 获取未支付订单及订单项
     *
     * @param orderId
     * @return
     */
    Map<String, Object> noPayCouponOrder(String orderId, String userId);

    /**
     * 生成订单支付签名信息
     *
     * @param orderNo
     * @param payType
     * @return
     */
    Map<String, Object> generatePaySign(String orderNo, String payType);


    /**
     * 优惠券退款通知
     *
     * @param orderNo       优惠券订单号
     * @param couponName    优惠券名称
     * @param refundAmount  退款金额
     * @param paymentNo     支付订单号
     * @param userCouponIds 用户优惠券Ids
     */
    void sendRefundCouponMsg(String orderNo, String couponName, double refundAmount, String paymentNo, String userCouponIds);

    /**
     * 根据订单Id查询订单
     *
     * @param orderId
     * @return
     */
    CouponOrder findCouponOrderById(Long orderId);


    /**
     * 根据单号查询订单
     *
     * @param orderNo
     * @return
     */
    CouponOrder findCouponOrderByNo(String orderNo);

    /**
     * 根据订单号查询订单详情
     *
     * @param orderNo
     * @return
     */
    CouponOrderVO findOrderDetailByOrderNo(String orderNo);

    /**
     * 优惠券订单列表（全部、待付款）
     *
     * @param paramsMap
     * @param currentPage
     * @param pageSize
     * @return
     */
    Map<String, Object> findAllOrdersByType(Map<String, Object> paramsMap,
                                            Integer currentPage, Integer pageSize);

    /**
     * 根据订单号，券类型查询
     *
     * @param orderNo
     * @param couponType
     * @return
     */
//    List<CouponOrderItem> findItemListByOrderNoAndCouponType(String orderNo, String couponType);


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
     * 本次可退最大金额
     *
     * @param orderNo
     * @param number
     * @param userId
     * @return
     */
    Map<String, Object> calcRefundAmount(String orderNo, Integer number, String userId);

    /**
     * 根据卡券类型购买代金券或领取红包
     * @param param
     * @param couponType
     * @return
     */
    ResponseResult createCouponOrder(CouponOrderParam param, String couponType);

    /**
     * 买家已购买数量
     *
     * @param couponId
     * @param userId
     * @return
     */
    int dailyBuyCount(String couponId, String userId);

    /**
     * 定时关闭未支付订单
     *
     * @return
     */
//    void closeUnpayOrder();

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
     public Map<String, Object> generateWechatPaySign(WechatPaySignParam param);
}
