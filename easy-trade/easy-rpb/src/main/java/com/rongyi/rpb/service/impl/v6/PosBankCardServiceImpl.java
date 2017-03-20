package com.rongyi.rpb.service.impl.v6;

import com.rongyi.easy.rpb.vo.PosBankCardPayVo;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.rss.rpb.IPosBankCardPayService;

import java.util.Map;

/**
 * conan
 * 2017/3/17 10:47
 **/
public class PosBankCardServiceImpl implements IPosBankCardPayService{

    @Override
    public Map<String, Object> posBankCardPay(RyMchVo ryMchVo, PosBankCardPayVo posBankCardPayVo, Integer orderType) {
        return null;
    }

    @Override
    public Map<String, Object> posBankCardPayQuery(RyMchVo ryMchVo, String orderNo, Integer payType) {
        return null;
    }

    @Override
    public Map<String, Object> posBankCardPayRefund(String orderNo, Integer refundAmount) {
        return null;
    }

    @Override
    public Map<String, Object> posBankCardPayRefundQuery(String orderNo) {
        return null;
    }
}
