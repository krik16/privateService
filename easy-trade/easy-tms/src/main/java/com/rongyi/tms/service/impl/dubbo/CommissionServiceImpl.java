package com.rongyi.tms.service.impl.dubbo;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.tms.entity.v2.CommissionConfig;
import com.rongyi.easy.tms.entity.v2.SalesCommission;
import com.rongyi.easy.tms.vo.v2.CommissionVO;
import com.rongyi.rss.rpb.OrderNoGenService;
import com.rongyi.rss.tms.CommissionService;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.v2.CommissionConfigService;
import com.rongyi.tms.service.v2.SalesCommissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/26 10:35
 **/
@Repository
public class CommissionServiceImpl implements CommissionService{

    private static final Logger LOGGER = LoggerFactory.getLogger(CommissionServiceImpl.class);
    @Autowired
    CommissionConfigService commissionConfigService;

    @Autowired
    OrderNoGenService orderNoGenService;

    @Autowired
    SalesCommissionService salesCommissionService;

    @Override
    public ResponseData addCommission(CommissionVO commissionVO) {
        LOGGER.info("commissionVO={}",commissionVO);
        CommissionConfig commissionConfig = commissionConfigService.selectByTypes(commissionVO.getType(), commissionVO.getGuideType(), commissionVO.getRegisterType(), commissionVO.getCreateAt());
        if(commissionConfig == null){
            LOGGER.info("未查找到符合的佣金规则配置，不增加佣金");
            return ResponseData.failure(ConstantEnum.COMMISSION_ADD_FAIL.getCodeInt(),ConstantEnum.COMMISSION_ADD_FAIL.getValueStr());
        }
        SalesCommission salesCommission = initSalesCommission(commissionVO,commissionConfig);
        salesCommissionService.insert(salesCommission);
        return ResponseData.success();
    }

    private SalesCommission initSalesCommission(CommissionVO commissionVO,CommissionConfig commissionConfig){
        SalesCommission salesCommission = new SalesCommission();
        salesCommission.setGuideId(commissionVO.getGuideId());
        salesCommission.setOrderNo(commissionVO.getOrderNo());
        salesCommission.setCommissionAmount(new BigDecimal(commissionConfig.getCommAmount()));
        salesCommission.setStatus(ConstantEnum.COMMISSION_STATUS_1.getCodeInt());
        salesCommission.setCreateAt(DateUtil.getCurrDateTime());
        salesCommission.setGuideType(commissionVO.getGuideType());
        salesCommission.setCommNo(orderNoGenService.getOrderNo("5"));
        salesCommission.setInvitePhone(commissionVO.getInvitePhone());
        salesCommission.setRegisterPhone(commissionVO.getRegisterPhone());
        salesCommission.setConfigId(commissionConfig.getId());
        return salesCommission;
    }
}
