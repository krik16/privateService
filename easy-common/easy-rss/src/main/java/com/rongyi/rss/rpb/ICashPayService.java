package com.rongyi.rss.rpb;

import com.rongyi.easy.rpb.vo.CashPayVo;
import com.rongyi.easy.rpb.vo.RyMchVo;

import java.util.Map;

/**
 * 现金支付服务接口
 * conan
 * 2017/3/15 15:15
 **/
public interface ICashPayService {

    /**
     * 现金支付
     * @param ryMchVo 容易商户
     * @param cashPayVo 支付参数
     * @param orderType 订单类型
     * @return map
     */
    Map<String, Object> cashPay(RyMchVo ryMchVo, CashPayVo cashPayVo,Integer orderType);

    /**
     * 现金支付查询
     * @param ryMchVo 容易商户
     * @param orderNo 订单号
     * @param payType 支付方式
     * @return map
     */
    Map<String, Object> cashPayQuery(RyMchVo ryMchVo, String orderNo,Integer payType);

    /**
     *现金退款
     * @param orderNo 订单号
     * @param refundAmount 退款金额
     * @return map
     */
    Map<String, Object> cashRefund(String orderNo, Integer refundAmount);

    /**
     * 现金退款查询
     * @param orderNo 订单号
     * @return map
     */
    Map<String, Object> cashRefundQuery(String orderNo);
}
