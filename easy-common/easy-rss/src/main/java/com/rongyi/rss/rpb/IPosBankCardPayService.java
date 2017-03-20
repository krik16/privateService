package com.rongyi.rss.rpb;

import com.rongyi.easy.rpb.vo.PosBankCardPayVo;
import com.rongyi.easy.rpb.vo.RyMchVo;

import java.util.Map;

/**
 * 现金支付服务接口
 * conan
 * 2017/3/15 15:15
 **/
public interface IPosBankCardPayService {

    /**
     * pos银行卡支付
     * @param ryMchVo 容易商户
     * @param posBankCardPayVo 支付参数
     * @param orderType 订单类型
     * @return map
     */
    Map<String, Object> posBankCardPay(RyMchVo ryMchVo, PosBankCardPayVo posBankCardPayVo, Integer orderType);

    /**
     * pos银行卡支付查询
     * @param ryMchVo 容易商户
     * @param orderNo 订单号
     * @param payType 支付方式
     * @return map
     */
    Map<String, Object> posBankCardPayQuery(RyMchVo ryMchVo, String orderNo, Integer payType);

    /**
     *pos银行卡退款
     * @param orderNo 订单号
     * @param refundAmount 退款金额
     * @return map
     */
    Map<String, Object> posBankCardPayRefund(String orderNo, Integer refundAmount);

    /**
     * pos银行卡退款查询
     * @param orderNo 订单号
     * @return map
     */
    Map<String, Object> posBankCardPayRefundQuery(String orderNo);
}
