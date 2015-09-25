package com.rongyi.settle.service;

import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.settle.entity.PaymentStatement;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by xgq on 2015/9/22.
 */
public interface PaymentStatementService {
    /**
     * @param map
     * @param currentPage
     * @param pageSize
     * @Description: 分页查询
     **/
    List<PaymentStatementDto> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize);

    Integer selectPageListCount(Map<String, Object> map);

    List<PaymentStatement> selectByCycleTime(Integer configId, Date yesterdayFirstSecond, Date yesterdayLastSecond);

    /**
     * 批量修改对账单状态
     * @param ids
     * @return
     */
    boolean updatePaymentStatusByIds(List<Integer> ids, Integer status);
}
