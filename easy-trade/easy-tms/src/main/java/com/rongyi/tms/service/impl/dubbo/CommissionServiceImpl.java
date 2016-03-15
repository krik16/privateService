package com.rongyi.tms.service.impl.dubbo;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.constant.Constants;
import com.rongyi.easy.malllife.pojo.InvitationUserInfoPojo;
import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;
import com.rongyi.easy.tms.entity.v2.CommissionConfig;
import com.rongyi.easy.tms.entity.v2.SalesCommission;
import com.rongyi.easy.tms.vo.v2.CommissionVO;
import com.rongyi.easy.tms.vo.v2.SalesCommissionListVO;
import com.rongyi.easy.tms.vo.v2.SalesCommissionVO;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.rpb.OrderNoGenService;
import com.rongyi.rss.tms.CommissionService;
import com.rongyi.tms.Exception.PermissionException;
import com.rongyi.tms.constants.CodeEnum;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.SalesCommissionAuditLogService;
import com.rongyi.tms.service.v2.CommissionConfigService;
import com.rongyi.tms.service.v2.SalesCommissionService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/26 10:35
 **/
@Repository
public class CommissionServiceImpl implements CommissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommissionServiceImpl.class);
    @Autowired
    CommissionConfigService commissionConfigService;

    @Autowired
    OrderNoGenService orderNoGenService;

    @Autowired
    SalesCommissionService salesCommissionService;

    @Autowired
    ROAMalllifeUserService rOAMallLifeUserService;

    @Autowired
    SalesCommissionAuditLogService salesCommissionAuditLogService;

    /**
     * 摩店返佣列表查询（推广/首单）
     *
     * @param params 请求参数对象
     * @return ResponseData
     */
    @Override
    public ResponseData getCommissionList(Map<String, Object> params) {
        ResponseData result;
        LOGGER.debug("getCommissionList 摩店佣金列表 ,param={}", params);
        try {
            if (!params.containsKey("currentPage") || !params.containsKey("userId")) {
                return ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_PARAM.getActionCode()), CodeEnum.ERROR_PARAM.getMessage());
            }
            if (!params.containsKey("pageSize")) {
                params.put("pageSize", Constant.PAGE.PAGESIZE);
            }
            int currentPage = params.containsKey("currentPage") ? Integer.valueOf(params.get("currentPage").toString()) : 1;
            params.put("startRecord", (currentPage - 1) * Integer.valueOf(params.get("pageSize").toString()));

            if (params.get("getTimeRange") != null) {
                if (params.get("getTimeRange") == Constants.TMSTimeRangeType.DAY) {
                    params.put("dayRange", 1);
                } else if (params.get("getTimeRange") == Constants.TMSTimeRangeType.WEEK) {
                    params.put("weekRange", 1);
                } else if (params.get("getTimeRange") == Constants.TMSTimeRangeType.MONTH) {
                    params.put("monthRange", 1);
                }
            }

            if (params.containsKey("status")) {
                List<Integer> statusList = new ArrayList<>();

                if (params.get("status") == Constants.DrawApplyStatus.SEND) {
                    statusList.add(ConstantEnum.COMMISSION_STATUS_6.getValueInt());
                } else if (params.get("status") == Constants.DrawApplyStatus.PROCESSING) {
                    statusList.add(ConstantEnum.COMMISSION_STATUS_1.getValueInt());
                    statusList.add(ConstantEnum.COMMISSION_STATUS_2.getValueInt());
                    statusList.add(ConstantEnum.COMMISSION_STATUS_3.getValueInt());
                } else if (params.get("status") == Constants.DrawApplyStatus.FAIL) {
                    statusList.add(ConstantEnum.COMMISSION_STATUS_1_UNCHECK.getValueInt());
                    statusList.add(ConstantEnum.COMMISSION_STATUS_2_UNCHECK.getValueInt());
                }

                if (statusList.size() > 0) {
                    params.put("statusList", statusList);
                }
            }

            List<SalesCommissionVO> list = salesCommissionService.findCommissionListForMallShop(params);
            SalesCommissionListVO resultList = new SalesCommissionListVO();
            resultList.setSalesCommissionVOs(list);
            int totalAccount = salesCommissionService.countCommissionForMallShop(params);
            result = ResponseData.success(resultList, currentPage, Integer.parseInt(params.get("pageSize").toString()), totalAccount);
            LOGGER.debug("getCommissionList end");
        } catch (PermissionException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_SYSTEM.getActionCode()), CodeEnum.ERROR_SYSTEM.getMessage());
        }

        return result;
    }

    /**
     * 返佣详情查询（推广/首单）
     *
     * @param id 佣金id
     * @return ResponseData
     */
    @Override
    public ResponseData getCommissionInfo(Integer id) {
        LOGGER.debug("getCommissionList 摩店佣金详情 ,param={}", id);
        ResponseData result;
        try {
            if (id == null) {
                return ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_PARAM.getActionCode()), CodeEnum.ERROR_PARAM.getMessage());
            }
            SalesCommissionVO salesCommissionVO = salesCommissionService.getCommissionDetailForMallShop(id);

            if (salesCommissionVO != null) {
                Integer commissionId = salesCommissionVO.getId();
                Integer status = salesCommissionVO.getStatus().intValue();
                if (status == ConstantEnum.COMMISSION_STATUS_6.getValueInt().intValue()) {
                    SalesCommissionAuditLog auditLog = salesCommissionAuditLogService.selectLatestLogWithCommissionId(commissionId);
                    salesCommissionVO.setPayAt(auditLog.getCreateAt());
                    salesCommissionVO.setAuditAt(auditLog.getCreateAt());
                } else if (status < 0 || status == ConstantEnum.COMMISSION_STATUS_3.getValueInt().intValue()) {
                    SalesCommissionAuditLog auditLog = salesCommissionAuditLogService.selectLatestLogWithCommissionId(commissionId);
                    salesCommissionVO.setAuditAt(auditLog.getCreateAt());
                }
            }

            result = ResponseData.success(salesCommissionVO);
            LOGGER.debug("detail end");
        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_SYSTEM.getActionCode()), CodeEnum.ERROR_SYSTEM.getMessage());
        }
        return result;
    }

    @Override
    public ResponseData addCommission(CommissionVO commissionVO) {
        LOGGER.info("增加佣金,commissionVO={}", commissionVO);
        InvitationUserInfoPojo buyerInfoPojo = rOAMallLifeUserService.getUserIsByShare(commissionVO.getRegisterId(), commissionVO.getRegisterType());
        if (buyerInfoPojo == null || StringUtils.isBlank(buyerInfoPojo.getShareCode())) {
            LOGGER.info("未找到对应的邀请人信息，不增加佣金,buyerInfoPojo={}", buyerInfoPojo);
            return ResponseData.failure(ConstantEnum.COMMISSION_ADD_INVITE_NOT_FOUND.getCodeInt(), ConstantEnum.COMMISSION_ADD_INVITE_NOT_FOUND.getValueStr());
        }

        boolean result = salesCommissionService.validateIsAllow(buyerInfoPojo.getUserId(), commissionVO.getRegisterId(), commissionVO.getType());
        if (!result) {
            LOGGER.info("此笔返佣不是首笔返佣,不增加佣金,result={}", false);
            return ResponseData.failure(ConstantEnum.COMMISSION_ADD_NOT_FIRST.getCodeInt(), ConstantEnum.COMMISSION_ADD_NOT_FIRST.getValueStr());
        }
        //实体字段定义与本地定义不相同
        if (0 == buyerInfoPojo.getUserType()) {
            buyerInfoPojo.setUserType(1);
        }
        CommissionConfig commissionConfig = commissionConfigService.selectByTypes(commissionVO.getType(), buyerInfoPojo.getUserType(), commissionVO.getRegisterType(), commissionVO.getCreateAt());
        if (commissionConfig == null) {
            LOGGER.info("未查找到符合的佣金规则配置，不增加佣金");
            return ResponseData.failure(ConstantEnum.COMMISSION_ADD_FAIL.getCodeInt(), ConstantEnum.COMMISSION_ADD_FAIL.getValueStr());
        }
        SalesCommission salesCommission = initSalesCommission(commissionVO, commissionConfig, buyerInfoPojo);
        salesCommissionService.insert(salesCommission);
        return ResponseData.success();
    }

    private SalesCommission initSalesCommission(CommissionVO commissionVO, CommissionConfig commissionConfig, InvitationUserInfoPojo buyerInfoPojo) {
        SalesCommission salesCommission = new SalesCommission();
        salesCommission.setGuideId(buyerInfoPojo.getUserId().toString());
        salesCommission.setOrderNo(commissionVO.getOrderNo());
        salesCommission.setCommissionAmount(new BigDecimal(commissionConfig.getCommAmount()));
        if (ConstantEnum.COMMISSION_CONFIG_CUST_VERIFY_0.getCodeByte().equals(commissionConfig.getFinaVerify())) {
            LOGGER.info("财务审核系统自动审核通过");
            salesCommission.setStatus(ConstantEnum.COMMISSION_STATUS_3.getCodeByte());
        } else if (ConstantEnum.COMMISSION_CONFIG_CUST_VERIFY_0.getCodeByte().equals(commissionConfig.getCustVerify())) {//客服系统自动审核
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
