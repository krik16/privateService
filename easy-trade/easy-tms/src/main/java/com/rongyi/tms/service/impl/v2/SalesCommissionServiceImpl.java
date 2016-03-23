package com.rongyi.tms.service.impl.v2;

import com.rongyi.core.constant.Constants;
import com.rongyi.core.constant.VirtualAccountEventTypeEnum;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;
import com.rongyi.easy.tms.entity.v2.CommissionConfig;
import com.rongyi.easy.tms.entity.v2.SalesCommission;
import com.rongyi.easy.tms.vo.v2.SalesCommissionVO;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.moudle.vo.CommissionAmountTotalVO;
import com.rongyi.tms.mq.Sender;
import com.rongyi.tms.service.SalesCommissionAuditLogService;
import com.rongyi.tms.service.v2.CommissionConfigService;
import com.rongyi.tms.service.v2.SalesCommissionService;
import com.rongyi.easy.tms.vo.v2.VerifyCommissionParam;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/25 17:53
 **/
@Service("salesCommissionService")
public class SalesCommissionServiceImpl extends BaseServiceImpl implements SalesCommissionService {

    Logger logger = LoggerFactory.getLogger(SalesCommissionServiceImpl.class);

    private static final String NAMESPACE = "com.rongyi.tms.mapper.xml.v2.SalesCommissionMapper";

    @Autowired
    private SalesCommissionAuditLogService salesCommissionAuditLogService;

    @Autowired
    private CommissionConfigService commissionConfigService;

    @Autowired
    Sender sender;

    /**
     * 通过主键id查询
     *
     * @param id
     * @return
     */
    @Override
    public SalesCommission selectById(Integer id) {
        SalesCommission salesCommission = null;
        if (id != null) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", id);
            salesCommission = this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByPrimaryKey", map);
        }
        return salesCommission;
    }

    @Override
    public void insert(SalesCommission salesCommission) {

        this.getBaseDao().insertBySql(NAMESPACE + ".insertSelective", salesCommission);
    }

    /**
     * 佣金列表
     *
     * @param map
     * @return
     */
    @Override
    public List<SalesCommissionVO> findCommissionList(Map<String, Object> map) {
        logger.info("service findCommissionList start map={}", map);
        if (map.containsKey("status")) {
            map.put("statuses", convertToStatus(Integer.valueOf(map.get("status").toString()), Integer.valueOf(map.get("searchType").toString())));
        }
        List<SalesCommissionVO> reList = new ArrayList<>();
        List<SalesCommissionVO> list = new ArrayList<>();
        logger.info("============= searchMap={}", map);
        if (ConstantEnum.COMMISSION_TYPE_0.getCodeInt().intValue() == Integer.valueOf(map.get("type").toString())) {
            list = this.getBaseDao().selectListBySql(NAMESPACE + ".findCommissionListExpand", map);
        }
        if (ConstantEnum.COMMISSION_TYPE_1.getCodeInt().intValue() == Integer.valueOf(map.get("type").toString())) {
            list = this.getBaseDao().selectListBySql(NAMESPACE + ".findCommissionListFirst", map);
        }

        if (CollectionUtils.isNotEmpty(list)){
            for (SalesCommissionVO vo : list){
                if (ConstantEnum.COMMISSION_STATUS_2_UNCHECK.getCodeByte().equals(vo.getStatus()) ||
                        ConstantEnum.COMMISSION_STATUS_1_UNCHECK.getCodeByte().equals(vo.getStatus())){
                    SalesCommissionAuditLog log = salesCommissionAuditLogService.selectFailedLog(vo.getId());
                    vo.setReason(log.getMemo());
                }
                reList.add(vo);
            }
        }
        logger.info("service findCommissionList start size={}", list.size());
        return reList;
    }

    /**
     * 根据业务需求转换状态集合
     *
     * @param status
     * @return
     */
    private List<Integer> convertToStatus(Integer status, Integer searchType) {
        List<Integer> reList = new ArrayList<>();
        if (status.intValue() == ConstantEnum.COMMISSION_STATUS_2.getCodeInt() && searchType.intValue() == ConstantEnum.COMMISSION_VERIFY_0.getCodeInt()) {
            reList.add(ConstantEnum.COMMISSION_STATUS_2.getCodeInt());
            reList.add(ConstantEnum.COMMISSION_STATUS_3.getCodeInt());
            reList.add(ConstantEnum.COMMISSION_STATUS_2_UNCHECK.getCodeInt());
            reList.add(ConstantEnum.COMMISSION_STATUS_5.getCodeInt());
        } else if (status.intValue() == ConstantEnum.COMMISSION_STATUS_3.getCodeInt()) {
            reList.add(ConstantEnum.COMMISSION_STATUS_3.getCodeInt());
            reList.add(ConstantEnum.COMMISSION_STATUS_5.getCodeInt());
        } else
            reList.add(status);
        return reList;
    }

    /**
     * 佣金详情
     *
     * @param id
     * @return
     */
    @Override
    public SalesCommissionVO getCommissionDetail(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        SalesCommissionVO vo = this.getBaseDao().selectOneBySql(NAMESPACE + ".getCommissionDetail", map);
        if (vo != null && (vo.getStatus() == -1 || vo.getStatus() == -2)) {
            SalesCommissionAuditLog log = salesCommissionAuditLogService.selectFailedLog(id);
            if (log != null)
                vo.setReason(log.getMemo());
        }
        return vo;
    }

    /**
     * 摩店佣金详情
     *
     * @param id
     * @return
     */
    @Override
    public SalesCommissionVO getCommissionDetailForMallShop(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        SalesCommissionVO vo = this.getBaseDao().selectOneBySql(NAMESPACE + ".getCommissionDetail", map);

        if (vo.getCommissionType() == ConstantEnum.COMMISSION_TYPE_1.getCodeInt()) {
            vo.setCommissionType(3);
        } else if (vo.getCommissionType() == ConstantEnum.COMMISSION_TYPE_0.getCodeInt()) {
            if (vo.getRegisterType() == ConstantEnum.COMMISSION_REGISTER_RONGYI.getCodeInt()) {
                vo.setCommissionType(1);
            } else if (vo.getRegisterType() == ConstantEnum.COMMISSION_REGISTER_MALLSHOP.getCodeInt()) {
                vo.setCommissionType(2);
            }
        }

        if (vo != null && (vo.getStatus() == -1 || vo.getStatus() == -2)) {
            SalesCommissionAuditLog log = salesCommissionAuditLogService.selectFailedLog(id);
            if (log != null)
                vo.setReason(log.getMemo());
        }
        return vo;
    }

    /**
     * 佣金总条数
     *
     * @param map
     * @return
     */
    @Override
    public int countCommission(Map<String, Object> map) {
        int totalCount = 0;
        if (ConstantEnum.COMMISSION_TYPE_0.getCodeInt().intValue() == Integer.valueOf(map.get("type").toString())) {
            totalCount = this.getBaseDao().count(NAMESPACE + ".countSalesCommissionExpand", map);
        }
        if (ConstantEnum.COMMISSION_TYPE_1.getCodeInt().intValue() == Integer.valueOf(map.get("type").toString())) {
            totalCount = this.getBaseDao().count(NAMESPACE + ".countSalesCommissionFirst", map);
        }
        return totalCount;
    }

    @Override
    public boolean verifyCommission(VerifyCommissionParam param, String user) {
        int resultNum = 0;
        Map<String, Object> paramsMap = new HashMap<>();
        List<String> ids = Arrays.asList(param.getIds().split(","));
        for (String idStr : ids) {
            SalesCommission commission = selectById(Integer.valueOf(idStr));
            if (commission != null) {
                SalesCommission salesCommission = new SalesCommission();
                salesCommission.setId(Integer.valueOf(idStr));
                salesCommission.setStatus(param.getStatus().byteValue());
                salesCommission.setUpdateAt(new Date());
                CommissionConfig config = commissionConfigService.selectById(commission.getConfigId());
                if (config != null) {
                    if (param.getStatus().intValue() == ConstantEnum.COMMISSION_STATUS_3.getCodeInt()) {
                        //二级审核获取当天已通过审核数
                        paramsMap.clear();
                        paramsMap.put("guideId", commission.getGuideId());
                        paramsMap.put("createAt", commission.getCreateAt());
                        paramsMap.put("status", param.getStatus());
                        paramsMap.put("type", config.getType());
                        Integer dailyCount = this.getBaseDao().count(NAMESPACE + ".selectDailyCount", paramsMap);
                        if (dailyCount >= config.getLimitTotal()) {
                            salesCommission.setStatus(ConstantEnum.COMMISSION_STATUS_5.getCodeByte());
                        }
                    }
                    int updateNum = this.getBaseDao().updateBySql(NAMESPACE + ".updateByPrimaryKeySelective", salesCommission);
                    if (updateNum > 0 && ConstantEnum.COMMISSION_STATUS_3.getCodeByte().equals(salesCommission.getStatus())) {
                        logger.info("更新成功，发送消息到 va");
                        CommissionAmountTotalVO commissionAmountTotalVO = new CommissionAmountTotalVO();
                        commissionAmountTotalVO.setId(commission.getId());
                        commissionAmountTotalVO.setCommissionAmount(commission.getCommissionAmount());
                        commissionAmountTotalVO.setGuideId(commission.getGuideId());
                        JSONObject jsonObject = JSONObject.fromObject(commissionAmountTotalVO);
                        Map<String, Object> bodyMap = new HashMap<>();
                        JSONArray array = new JSONArray();
                        array.add(jsonObject);
                        bodyMap.put("detailList", array);
                        logger.info(array.toString());
                        MessageEvent event = null;
                        if (config.getType().byteValue() == ConstantEnum.COMMISSION_TYPE_0.getCodeByte())
                            event = MessageEvent.getMessageEvent(bodyMap, "tms", "va", VirtualAccountEventTypeEnum.COMMISSION_TYPE_EXPAND.getCode());
                        else if (config.getType().byteValue() == ConstantEnum.COMMISSION_TYPE_1.getCodeByte())
                            event = MessageEvent.getMessageEvent(bodyMap, "tms", "va", VirtualAccountEventTypeEnum.COMMISSION_TYPE_FIRST.getCode());
                        sender.convertAndSend(event);
                        resultNum++;
                    } else {
                        logger.info("佣金审核修改失败");
                    }
                }
            }
        }

        if (resultNum > 0) {
            for (String idStr : ids) {
                SalesCommissionAuditLog auditLog = new SalesCommissionAuditLog();
                auditLog.setAuditUserId(user);
                auditLog.setCreateAt(new Date());
                auditLog.setMemo(param.getDesc());
                auditLog.setOperateBiz(param.getOperateType());
                auditLog.setSalesCommissionId(Integer.valueOf(idStr));
                salesCommissionAuditLogService.createCommissionAuditLog(auditLog);
            }
        }
        return resultNum > 0;
    }

    @Override
    public boolean validateIsAllow(Integer guideId, String registerId, Integer type) {
        Map<String, Object> map = new HashMap<>();
        map.put("guideId", guideId);
        map.put("registerId", registerId);
        map.put("type", type);
        int count = this.getBaseDao().selectOneBySql(NAMESPACE + ".validateIsAllow", map);
        return count <= 0;
    }

    @Override
    public List<SalesCommissionVO> findCommissionListForMallShop(Map<String, Object> map) {
        logger.info("service findCommissionListForMallShop start map={}", map);

        List<SalesCommissionVO> list = this.getBaseDao().selectListBySql(NAMESPACE + ".selectCommissionByUserId", map);
        for (SalesCommissionVO vo : list) {
            if (vo.getCommissionType() == ConstantEnum.COMMISSION_TYPE_1.getCodeInt()) {
                vo.setCommissionType(3);
            } else if (vo.getCommissionType() == ConstantEnum.COMMISSION_TYPE_0.getCodeInt()) {
                if (vo.getRegisterType() == ConstantEnum.COMMISSION_REGISTER_RONGYI.getCodeInt()) {
                    vo.setCommissionType(1);
                } else if (vo.getRegisterType() == ConstantEnum.COMMISSION_REGISTER_MALLSHOP.getCodeInt()) {
                    vo.setCommissionType(2);
                }
            }

            if (vo.getStatus().intValue() == ConstantEnum.COMMISSION_STATUS_3.getCodeInt()) {
                vo.setStatus((byte) Constants.DrawApplyStatus.SEND);
            } else if (vo.getStatus().intValue() >= ConstantEnum.COMMISSION_STATUS_1.getCodeInt() && vo.getStatus().intValue() < ConstantEnum.COMMISSION_STATUS_3.getCodeInt()) {
                vo.setStatus((byte) Constants.DrawApplyStatus.PROCESSING);
            } else if (vo.getStatus().intValue() < ConstantEnum.COMMISSION_STATUS_0.getCodeInt() || vo.getStatus().intValue() ==  ConstantEnum.COMMISSION_STATUS_5.getCodeInt()) {
                vo.setStatus((byte) Constants.DrawApplyStatus.FAIL);
            }
        }

        logger.info("service findCommissionListForMallShop end size={}", list.size());
        return list;
    }

    /**
     * 佣金总条数(摩店)
     *
     * @param map
     * @return
     */
    @Override
    public int countCommissionForMallShop(Map<String, Object> map) {
        return this.getBaseDao().count(NAMESPACE + ".countCommissionByUserId", map);
    }
}
