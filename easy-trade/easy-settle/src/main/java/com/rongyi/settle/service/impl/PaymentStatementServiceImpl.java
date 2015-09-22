package com.rongyi.settle.service.impl;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.settle.service.PaymentStatementService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by xgq on 2015/9/22.
 */
@Service
public class PaymentStatementServiceImpl extends BaseServiceImpl implements PaymentStatementService {

    private static final String NAMESPACE = "com.rongyi.settle.mapper.xml.PaymentStatementMapper";

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
}
