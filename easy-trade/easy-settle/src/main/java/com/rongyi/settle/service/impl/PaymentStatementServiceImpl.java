package com.rongyi.settle.service.impl;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.settle.entity.OperationLog;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.settle.mapper.OperationLogMapper;
import com.rongyi.settle.mapper.PaymentStatementMapper;
import com.rongyi.settle.service.PaymentStatementService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(PaymentStatementServiceImpl.class);

    @Autowired
    private PaymentStatementMapper paymentStatementMapper;
    
    @Autowired
    private OperationLogMapper operationLogMapper;

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
    public boolean updatePaymentStatusByIds(List<Integer> ids, Integer status, String desc, String userId) {
        boolean result = false;
        try {
            if (CollectionUtils.isNotEmpty(ids) && status!=null){
                Map<String, Object> paramsMap = new HashMap<>();
                paramsMap.put("ids", ids);
                paramsMap.put("status", status);
                paramsMap.put("statusUpdateTime", new Date());
                paymentStatementMapper.updateStatusByIds(paramsMap);
                for (Integer id : ids){
                    saveOperationLog(id, status, desc, userId);
                }
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        return result;
    }

    /**
     * 插入日志记录
     * @param id
     * @param status
     * @param desc
     * @param userId
     */
    private void saveOperationLog(Integer id,  Integer status, String desc, String userId) {
        OperationLog operatioLog = new OperationLog();
        operatioLog.setCreateUserId(userId);
        operatioLog.setDesc(desc);
        operatioLog.setOperationModel((byte) 1);
        operatioLog.setOperationType(Byte.valueOf(status.toString()));
        operatioLog.setCreadeAt(new Date());
        operatioLog.setOperationId(id);
        operatioLog.setIsDelete(Byte.valueOf((byte)0));
        operationLogMapper.insertSelective(operatioLog);
    }
}
