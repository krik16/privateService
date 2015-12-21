package com.rongyi.settle.service.dubbo;

import com.rongyi.rss.settle.GoodPayService;
import com.rongyi.settle.service.StatementConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kejun on 2015/12/9.
 */
@Service
public class GoodPayServiceImpl implements GoodPayService {
    @Autowired
    StatementConfigService statementConfigService;

    @Override
    public boolean validateNeedPay(String shopId, String userId, Integer guideType) {
        return statementConfigService.validateNeedPay(shopId,userId,guideType);
    }
}
