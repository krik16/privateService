package com.rongyi.settle.service.impl;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.settle.mapper.PaymentStatementMapper;
import com.rongyi.settle.service.PaymentStatementService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xgq on 2015/9/22.
 */
@Service
public class PaymentStatementServiceImpl extends BaseServiceImpl implements PaymentStatementService {

    private static final String NAMESPACE = "com.rongyi.settle.mapper.PaymentStatementMapper";

    @Autowired
    private PaymentStatementMapper mapper;

    @Override
    public List<PaymentStatementDto> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
        map.put("currentPage", currentPage * pageSize);
        map.put("pageSize", pageSize);
        return this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
    }

    @Override
    public Integer selectPageListCount(Map<String, Object> map) {
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
    }

    @Override
    public List<PaymentStatement> selectByCycleTime(Integer configId, Date yesterdayFirstSecond, Date yesterdayLastSecond) {
        Map map = new HashMap();
        map.put("configId", configId);
        map.put("cycleStartTime", yesterdayFirstSecond);
        map.put("cycleEndTime", yesterdayLastSecond);
        return this.getBaseDao().selectListBySql(NAMESPACE + ".selectByCycleTime", map);
    }

    @Override
    public boolean updatePaymentStatusByIds(List<Integer> ids, Integer status) {
        boolean result = false;
        if (CollectionUtils.isNotEmpty(ids) && status!=null){
            Map<String, Object> paramsMap = new HashMap<>();
            paramsMap.put("ids",ids);
            paramsMap.put("status", status);
            mapper.updateStatusByIds(paramsMap);
            result = true;
        }
        return result;
    }
}
