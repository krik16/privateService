package com.rongyi.rss.rpb;

import com.rongyi.easy.rpb.domain.PaymentEntity;

import java.util.List;

/**
 * 查询接口
 * conan
 * 2017/2/27 13:46
 **/
public interface IQueryService {

    List<PaymentEntity> batchQueryByOrderNos(List<String> orderNoList,Integer tradeType);

   }
