package com.rongyi.tms.service.impl.dubbo;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.constant.Constants;
import com.rongyi.easy.malllife.pojo.InvitationUserInfoPojo;
import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;
import com.rongyi.easy.tms.entity.v2.CommissionConfig;
import com.rongyi.easy.tms.entity.v2.SalesCommission;
import com.rongyi.easy.tms.vo.v2.*;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.rpb.OrderNoGenService;
import com.rongyi.rss.tms.CommissionService;
import com.rongyi.tms.Exception.PermissionException;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.SalesCommissionAuditLogService;
import com.rongyi.tms.service.v2.CommissionConfigService;
import com.rongyi.tms.service.v2.SalesCommissionService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
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
    public SalesCommissionListVO getCommissionList(Map<String, Object> params) throws Exception {
        LOGGER.debug("getCommissionList 摩店佣金列表 ,param={}", params);
        try {
            if (!params.containsKey("currentPage") || !params.containsKey("userId")) {
                return null;
            }
            if (!params.containsKey("pageSize")) {
                params.put("pageSize", Constant.PAGE.PAGESIZE);
            }
            int currentPage = params.containsKey("currentPage") ? Integer.valueOf(params.get("currentPage").toString()) : 1;
            params.put("startRecord", (currentPage - 1) * Integer.valueOf(params.get("pageSize").toString()));

            if (params.get("date") != null) {
                if (String.valueOf(Constants.TMSTimeRangeType.DAY).equals(params.get("date"))) {
                    params.put("dayRange",  Constants.TMSTimeRangeType.DAY);
                } else if (String.valueOf(Constants.TMSTimeRangeType.WEEK).equals(params.get("date"))) {
                    params.put("weekRange",Constants.TMSTimeRangeType.WEEK);
                } else if (String.valueOf(Constants.TMSTimeRangeType.MONTH).equals(params.get("date"))) {
                    params.put("monthRange",Constants.TMSTimeRangeType.MONTH);
                }
            }

            if (params.containsKey("status")) {
                List<Integer> statusList = new ArrayList<>();

                if (Integer.parseInt(params.get("status").toString()) == Constants.DrawApplyStatus.SEND) {
                    statusList.add(ConstantEnum.COMMISSION_STATUS_3.getCodeInt());
                } else if (Integer.parseInt(params.get("status").toString()) == Constants.DrawApplyStatus.PROCESSING) {
                    statusList.add(ConstantEnum.COMMISSION_STATUS_1.getCodeInt());
                    statusList.add(ConstantEnum.COMMISSION_STATUS_2.getCodeInt());
                } else if (Integer.parseInt(params.get("status").toString()) == Constants.DrawApplyStatus.FAIL) {
                    statusList.add(ConstantEnum.COMMISSION_STATUS_1_UNCHECK.getCodeInt());
                    statusList.add(ConstantEnum.COMMISSION_STATUS_2_UNCHECK.getCodeInt());
                }

                if (statusList.size() > 0) {
                    params.put("statusList", statusList);
                }
            }

            List<SalesCommissionVO> list = salesCommissionService.findCommissionListForMallShop(params);
            SalesCommissionListVO resultList = new SalesCommissionListVO();
            resultList.setSalesCommissionVOs(list);

            int totalAccount = salesCommissionService.countCommissionForMallShop(params);
            resultList.setTotalCount(totalAccount);
            resultList.setCurrentPage(currentPage);
            resultList.setPageSize(Integer.parseInt(params.get("pageSize").toString()));
            resultList.setTotalPage((int) Math.floor((totalAccount * 1.0d) / Integer.parseInt(params.get("pageSize").toString())));
            LOGGER.debug("getCommissionList end");
            return resultList;
        } catch (PermissionException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }


    }

    /**
     * 返佣详情查询（推广/首单）
     *
     * @param id 佣金id
     * @return ResponseData
     */
    @Override
    public SalesCommissionVO getCommissionInfo(Integer id) throws Exception {
        LOGGER.info("getCommissionList 摩店佣金详情 ,param={}", id);
        try {
            if (id == null) {
                return null;
            }
            SalesCommissionVO salesCommissionVO = salesCommissionService.getCommissionDetailForMallShop(id);

            if (salesCommissionVO != null) {
                Integer commissionId = salesCommissionVO.getId();
                Integer status = salesCommissionVO.getStatus().intValue();
                if (status == ConstantEnum.COMMISSION_STATUS_3.getCodeInt().intValue()) {
                    SalesCommissionAuditLog auditLog = salesCommissionAuditLogService.selectLatestLogWithCommissionId(commissionId);
                    if(auditLog != null) {
                        salesCommissionVO.setPayAt(auditLog.getCreateAt());
                        salesCommissionVO.setAuditAt(auditLog.getCreateAt());
                    }else {
                        salesCommissionVO.setPayAt(salesCommissionVO.getCreateAt());
                        salesCommissionVO.setAuditAt(salesCommissionVO.getCreateAt());
                    }
                } else if (status < 0 || status == ConstantEnum.COMMISSION_STATUS_2.getCodeInt().intValue() ||  status == ConstantEnum.COMMISSION_STATUS_5.getCodeInt().intValue()) {
                    SalesCommissionAuditLog auditLog = salesCommissionAuditLogService.selectLatestLogWithCommissionId(commissionId);
                    if (auditLog != null) {
                        salesCommissionVO.setAuditAt(auditLog.getCreateAt());
                    }else{
                        salesCommissionVO.setAuditAt(salesCommissionVO.getCreateAt());
                    }
                }
                if (salesCommissionVO.getStatus().intValue() == ConstantEnum.COMMISSION_STATUS_3.getCodeInt()) {
                    salesCommissionVO.setStatus((byte) Constants.DrawApplyStatus.SEND);
                } else if (salesCommissionVO.getStatus().intValue() >= ConstantEnum.COMMISSION_STATUS_1.getCodeInt() && salesCommissionVO.getStatus().intValue() < ConstantEnum.COMMISSION_STATUS_3.getCodeInt()) {
                    salesCommissionVO.setStatus((byte) Constants.DrawApplyStatus.PROCESSING);
                } else if (salesCommissionVO.getStatus().intValue() < ConstantEnum.COMMISSION_STATUS_0.getCodeInt() || salesCommissionVO.getStatus().intValue() == ConstantEnum.COMMISSION_STATUS_5.getCodeInt()) {
                    salesCommissionVO.setStatus((byte) Constants.DrawApplyStatus.FAIL);
                }
            }

            LOGGER.info("detail end salesCommissionVO={}",salesCommissionVO);
            return salesCommissionVO;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public ResponseData addCommission(CommissionVO commissionVO) {
        LOGGER.info("增加佣金,commissionVO={}", commissionVO);
        Integer registerType = commissionVO.getRegisterType();
        //查找邀请人信息不区分摩店买手和导购，摩店注册统一传2
        if(registerType.equals(3)){
            registerType = 2;
        }
        InvitationUserInfoPojo buyerInfoPojo = rOAMallLifeUserService.getUserIsByShare(commissionVO.getRegisterId(), registerType);
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
        //财务自动审核则打款到VA
        if(ConstantEnum.COMMISSION_STATUS_3.getCodeByte().equals(salesCommission.getStatus())){
            salesCommissionService.sendCommissionToVa(salesCommission.getId(),salesCommission.getCommissionAmount(),salesCommission.getGuideId(),commissionConfig);
        }
        if (salesCommission.getStatus().intValue() < 0 || ConstantEnum.COMMISSION_STATUS_3.getCodeByte().equals(salesCommission.getStatus()) ||ConstantEnum.COMMISSION_STATUS_5.getCodeByte().equals(salesCommission.getStatus())) {
            salesCommissionService.sendVerifyMessage(salesCommission.getGuideId(), salesCommission.getCommissionAmount(), salesCommission.getStatus(), commissionConfig.getType(), commissionConfig.getRegisterType());
        }
        return ResponseData.success();
    }


    private SalesCommission initSalesCommission(CommissionVO commissionVO, CommissionConfig commissionConfig, InvitationUserInfoPojo buyerInfoPojo) {
        SalesCommission salesCommission = new SalesCommission();
        salesCommission.setGuideId(buyerInfoPojo.getUserId().toString());
        salesCommission.setOrderNo(commissionVO.getOrderNo());
        salesCommission.setCommissionAmount(new BigDecimal(commissionConfig.getCommAmount()));
        salesCommission.setStatus(ConstantEnum.COMMISSION_STATUS_1.getCodeByte());
        salesCommission.setRegisterTime(commissionVO.getFinishAt());
        salesCommission.setCreateAt(DateUtil.getCurrDateTime());
        salesCommission.setGuideType(buyerInfoPojo.getUserType());
        salesCommission.setCommNo(orderNoGenService.getOrderNo("5"));
        salesCommission.setInvitePhone(buyerInfoPojo.getUserAccount());
        salesCommission.setRegisterId(commissionVO.getRegisterId());
        salesCommission.setRegisterPhone(commissionVO.getRegisterPhone());
        salesCommission.setConfigId(commissionConfig.getId());
        if (ConstantEnum.COMMISSION_CONFIG_CUST_VERIFY_0.getCodeByte().equals(commissionConfig.getFinaVerify()) && ConstantEnum.COMMISSION_CONFIG_CUST_VERIFY_0.getCodeByte().equals(commissionConfig.getCustVerify())) {
            LOGGER.info("客服/财务审核系统自动审核通过");
            Integer dailyCount = salesCommissionService.getGuideDayLimit(salesCommission.getGuideId(), salesCommission.getCreateAt(), ConstantEnum.COMMISSION_STATUS_3.getCodeByte(), commissionConfig.getType(),commissionConfig.getRegisterType());
           LOGGER.info("dailyCount={},limit={}",dailyCount, commissionConfig.getLimitTotal());
            if (dailyCount >= commissionConfig.getLimitTotal()) {
                salesCommission.setStatus(ConstantEnum.COMMISSION_STATUS_5.getCodeByte());
            } else {
                salesCommission.setStatus(ConstantEnum.COMMISSION_STATUS_3.getCodeByte());
            }
        } else if (ConstantEnum.COMMISSION_CONFIG_CUST_VERIFY_0.getCodeByte().equals(commissionConfig.getCustVerify())) {//客服系统自动审核
            LOGGER.info("客服审核系统自动审核通过");
            Integer dailyCount = salesCommissionService.getGuideDayLimit(salesCommission.getGuideId(), salesCommission.getCreateAt(), ConstantEnum.COMMISSION_STATUS_3.getCodeByte(), commissionConfig.getType(),commissionConfig.getRegisterType());
            if (dailyCount >= commissionConfig.getLimitTotal()) {
                salesCommission.setStatus(ConstantEnum.COMMISSION_STATUS_5.getCodeByte());
            } else {
                salesCommission.setStatus(ConstantEnum.COMMISSION_STATUS_2.getCodeByte());
            }
        }
        return salesCommission;
    }

    @Override
    public ResponseVO getCommissAppVo(Integer identity) {
        LOGGER.info("getCommissAppVo 根据摩店用户类型查询对应的返佣详情 identity:{}", identity);
        CommissionAppVo commissAppVo = new CommissionAppVo();
        if(!identity.equals(4)&&!identity.equals(5)&&!identity.equals(6)){
            return ResponseVO.failure(ConstantEnum.LIST_QUERY_PARAM.getCodeInt(),ConstantEnum.LIST_QUERY_PARAM.getValueStr());
        }
        List<CommissionConfigAppVo> configList = getConfigList(identity);
        //保存邀请类型为导购的配置
        List<CommissionConfigAppVo> massageShopConfigList = new ArrayList<CommissionConfigAppVo>();
        if(CollectionUtils.isNotEmpty(configList)){
            for(CommissionConfigAppVo config : configList){
                //容易逛配置只会有一条
                if(config.getRegisterType().equals(ConstantEnum.REGISTER_TYPE_1.getCodeByte())){
                    commissAppVo.setEasyConfig(config);
                }else{
                    massageShopConfigList.add(config);
                }
            }
            commissAppVo.setMassageShopConfigList(massageShopConfigList);
        }
        return ResponseVO.success(commissAppVo);
    }

    @Override
    public boolean hasCommissConfigApp(Integer identity) {
        LOGGER.info("查询是否有推广返佣配置identity:{}",identity);
        if(!identity.equals(4)&&!identity.equals(5)&&!identity.equals(6)){
            LOGGER.info("参数错误哟");
            return false;
        }
        List<CommissionConfigAppVo> configList = getConfigList(identity);
        return configList!=null&&configList.size()>0?true:false;
    }

    private List<CommissionConfigAppVo> getConfigList(Integer identity){
        Map paramMap = new HashMap();
        //identity 为6查询买手返佣配置
        paramMap.put("inviteType",identity.equals(6)?ConstantEnum.INVITE_TYPE_2.getCodeByte():ConstantEnum.INVITE_TYPE_1.getCodeByte());
        //查询启用状态的
        paramMap.put("status",ConstantEnum.COMMISSION_CONFIG_STATUS_3.getCodeByte());
        paramMap.put("type",ConstantEnum.COMMISSION_CONFIG_TYPE_0.getCodeStr());

        List<CommissionConfigAppVo> configList =  commissionConfigService.selectAppList(paramMap);
        return configList;
    }
}
