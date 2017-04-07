package com.rongyi.rss.rpb;

import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.param.PaymentOrderParam;

import java.util.List;

/**
 * 查询接口
 * conan
 * 2017/2/27 13:46
 **/
public interface IQueryService {

    /**
     * 根据支付流水号及类型查询订单详情
     * @param orderNoList 支付流水号集合
     * @param tradeType 0支付  1退款
     * @return 订单详情列表
     */
    List<PaymentEntity> batchQueryByOrderNos(List<String> orderNoList,Integer tradeType);

    /**
     * 查询订单支付数据
     * @param orderNo 订单号
     * @param tradeType 交易类型
     * @param status 状态
     * @param payChannel 支付类型
     * @return PaymentEntity
     */
    PaymentEntity queryByOrderNoAndTradeType(String orderNo, Integer tradeType, Integer status, Integer payChannel);

    /**
     * 查询订单列表数据
     * @param param
     * @return
     */
    List<PaymentEntity> queryListByParam(PaymentOrderParam param);
    /**
     * 查询订单总记录数
     * @param paymentParam
     * @return
     */
    Integer queryCountByParam(PaymentOrderParam paymentParam);

    /**
     * 根据支付单号查询paymentOrder
     * @param payNo
     * @return
     */
    PaymentEntity queryByPayNo(String payNo);
}
