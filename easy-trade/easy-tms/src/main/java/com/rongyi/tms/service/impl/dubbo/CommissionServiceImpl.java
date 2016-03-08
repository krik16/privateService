package com.rongyi.tms.service.impl.dubbo;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.malllife.pojo.InvitationUserInfoPojo;
import com.rongyi.easy.tms.entity.v2.CommissionConfig;
import com.rongyi.easy.tms.entity.v2.SalesCommission;
import com.rongyi.easy.tms.vo.v2.CommissionVO;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.rpb.OrderNoGenService;
import com.rongyi.rss.tms.CommissionService;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.v2.CommissionConfigService;
import com.rongyi.tms.service.v2.SalesCommissionService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Copyright (C), 上海容易网电子商务有限公司
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

    @Autowired
    ROAMalllifeUserService rOAMallLifeUserService;

    /**
     * 返佣列表查询（推广/首单）
     * @param commissionVO 请求参数对象
     * @return ResponseData
     */
    @Override
    public ResponseData getCommissionList(CommissionVO commissionVO){
        return null;
    }

    /**
     * 返佣详情查询（推广/首单）
     * @param id 佣金id
     * @return ResponseData
     */
    @Override
    public ResponseData getCommissionInfo(Integer id){
        return null;
    }

    @Override
    public ResponseData addCommission(CommissionVO commissionVO) {
        LOGGER.info("增加佣金,commissionVO={}", commissionVO);
        InvitationUserInfoPojo buyerInfoPojo = rOAMallLifeUserService.getUserIsByShare(commissionVO.getRegisterId(), commissionVO.getRegisterType());
        if(buyerInfoPojo == null || StringUtils.isBlank(buyerInfoPojo.getShareCode())){
            LOGGER.info("未找到对应的邀请人信息，不增加佣金,buyerInfoPojo={}", buyerInfoPojo);
            return ResponseData.failure(ConstantEnum.COMMISSION_ADD_INVITE_NOT_FOUND.getCodeInt(), ConstantEnum.COMMISSION_ADD_INVITE_NOT_FOUND.getValueStr());
        }

       boolean result = salesCommissionService.validateIsAllow(buyerInfoPojo.getUserId(),commissionVO.getRegisterId(),commissionVO.getType());
        if(!result){
            LOGGER.info("此笔返佣不是首笔返佣,不增加佣金,result={}",result);
            return ResponseData.failure(ConstantEnum.COMMISSION_ADD_NOT_FIRST.getCodeInt(),ConstantEnum.COMMISSION_ADD_NOT_FIRST.getValueStr());
        }
        //实体字段定义与本地定义不相同
        if(0 == buyerInfoPojo.getUserType()) {
            buyerInfoPojo.setUserType(1);
        }
        CommissionConfig commissionConfig = commissionConfigService.selectByTypes(commissionVO.getType(), buyerInfoPojo.getUserType(), commissionVO.getRegisterType(), commissionVO.getCreateAt());
        if(commissionConfig == null){
            LOGGER.info("未查找到符合的佣金规则配置，不增加佣金");
            return ResponseData.failure(ConstantEnum.COMMISSION_ADD_FAIL.getCodeInt(),ConstantEnum.COMMISSION_ADD_FAIL.getValueStr());
        }
        SalesCommission salesCommission = initSalesCommission(commissionVO,commissionConfig,buyerInfoPojo);
        salesCommissionService.insert(salesCommission);
        return ResponseData.success();
    }

    private SalesCommission initSalesCommission(CommissionVO commissionVO,CommissionConfig commissionConfig,InvitationUserInfoPojo buyerInfoPojo){
        SalesCommission salesCommission = new SalesCommission();
        salesCommission.setGuideId(buyerInfoPojo.getUserId().toString());
        salesCommission.setOrderNo(commissionVO.getOrderNo());
        salesCommission.setCommissionAmount(new BigDecimal(commissionConfig.getCommAmount()));
        if(ConstantEnum.COMMISSION_CONFIG_CUST_VERIFY_0.getCodeByte().equals(commissionConfig.getFinaVerify())){
            LOGGER.info("财务审核系统自动审核通过");
            salesCommission.setStatus(ConstantEnum.COMMISSION_STATUS_3.getCodeByte());
        }else if(ConstantEnum.COMMISSION_CONFIG_CUST_VERIFY_0.getCodeByte().equals(commissionConfig.getCustVerify())){//客服系统自动审核
            LOGGER.info("客服审核系统自动审核通过");
            salesCommission.setStatus(ConstantEnum.COMMISSION_STATUS_2.getCodeByte());
        }
        salesCommission.setStatus(ConstantEnum.COMMISSION_STATUS_1.getCodeByte());
        salesCommission.setRegisterTime(commissionVO.getFinishAt());
        salesCommission.setCreateAt(DateUtil.getCurrDateTime());
        salesCommission.setGuideType(buyerInfoPojo.getUserType());
        salesCommission.setCommNo(orderNoGenService.getOrderNo("5"));
        salesCommission.setInvitePhone(buyerInfoPojo.getUserPhone());
        salesCommission.setRegisterId(commissionVO.getRegisterId());
        salesCommission.setRegisterPhone(commissionVO.getRegisterPhone());
        salesCommission.setConfigId(commissionConfig.getId());
        return salesCommission;
    }
}
