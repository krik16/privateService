package com.rongyi.rpb.service.impl;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.rpb.domain.PaymentOrderOp;
import com.rongyi.rpb.service.PaymentOrderOpService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kejun on 2015/12/17.
 */
@Service
public class PaymentOrderOpServiceImpl extends BaseServiceImpl implements PaymentOrderOpService{

    private static final String NAMESPACE = "com.rongyi.rpb.mapper.PaymentOrderOpMapper";
    @Override
    public void insert(PaymentOrderOp paymentOrderOp) {
        this.getBaseDao().insertBySql(NAMESPACE+".insert",paymentOrderOp);
    }

    @Override
    public void update(PaymentOrderOp paymentOrderOp) {
        this.getBaseDao().updateBySql(NAMESPACE + ".update", paymentOrderOp);
    }

    @Override
    public PaymentOrderOp selectById(Integer id) {
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        return this.getBaseDao().selectOneBySql(NAMESPACE+".selectByPrimaryKey",map);
    }

    @Override
    public PaymentOrderOp selectByPaymentId(Integer paymentId) {
        Map<String,Object> map = new HashMap<>();
        map.put("paymentId",paymentId);
        return this.getBaseDao().selectOneBySql(NAMESPACE+".selectByPaymentId",map);
    }
}
