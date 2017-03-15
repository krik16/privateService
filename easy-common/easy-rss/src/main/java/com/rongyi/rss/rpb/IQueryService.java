package com.rongyi.rss.rpb;

import com.rongyi.easy.rpb.domain.PaymentEntity;

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

   }
