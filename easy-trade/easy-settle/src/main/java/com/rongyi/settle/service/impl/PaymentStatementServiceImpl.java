package com.rongyi.settle.service.impl;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.rpb.vo.PaymentParamVO;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.settle.entity.OperationLog;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.rss.rpb.IRpbService;
import com.rongyi.settle.dto.CouponExcelDto;
import com.rongyi.settle.dto.PaymentStatementDetailDto;
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

    @Autowired
    IRpbService iRpbService;

    @Override
    public List<PaymentStatementDto> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
        map.put("currentPage", (currentPage-1) * pageSize);
        map.put("pageSize", pageSize);
        return this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
    }

    @Override
    public Integer selectPageListCount(Map<String, Object> map) {
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
    }

    @Override
    public void insert(PaymentStatement paymentStatement) {
        this.getBaseDao().insertBySql(NAMESPACE + ".insert", paymentStatement);
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
            if (CollectionUtils.isNotEmpty(ids) && status != null) {
                Map<String, Object> paramsMap = new HashMap<>();
                paramsMap.put("ids", ids);
                paramsMap.put("status", status);
                paramsMap.put("statusUpdateTime", new Date());
                for (int i=0; i<ids.size(); i++) {
                    if (status.intValue()==6){
                        //待付款审核通过，生成付款
                        Map<String, Object> reMap =  generatePayment(ids.get(i), userId);
                        if (!(boolean)reMap.get("success")){
                            logger.info(ids.get(i)+"未生成付款，原因:"+reMap.get("message"));
                            ids.remove(i);
                        }
                    }
                    saveOperationLog(ids.get(i), status, desc, userId);
                }
                paymentStatementMapper.updateStatusByIds(paramsMap);
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        return result;
    }

    private Map<String, Object> generatePayment(Integer id, String userId) {
        PaymentParamVO param = new PaymentParamVO();
        param.setUserId(userId);
        PaymentStatementDto dto = paymentStatementMapper.searchDtoById(id);
        param.setCreateAt(new Date());
        param.setOperateNo(dto.getPayNo());
        param.setOperateType("15");
        param.setPayAccount(dto.getPayAccount());
        param.setPayChannel(Integer.valueOf(dto.getPayChannel().toString()));
        param.setPayName(dto.getPayName());
        param.setPayTotal(Double.valueOf(dto.getPayTotal().toString()));
        return iRpbService.generatePayment(param);
    }

    @Override
    public List<PaymentStatementDetailDto> selectForStatementDetails(String shopId, Date startTime, Date endTime, Date cycleStartTime, Date cycleEndTime, String shopName, String mallId, String mallName) {
        Map map = new HashMap();
        map.put("shopId", shopId);
        map.put("cycleStartTime", DateUtil.dateToString(cycleStartTime));
        map.put("cycleEndTime", DateUtil.dateToString(cycleEndTime));
        map.put("startTime", DateUtil.dateToString(startTime));
        map.put("endTime", DateUtil.dateToString(endTime));
        map.put("shopName", shopName);
        map.put("mallId", mallId);
        map.put("mallName", mallName);
        return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForStatementDetails", map);
    }

    @Override
    public List<CouponExcelDto> selectForCouponExcelDto(String shopId, Date startTime, Date endTime, Date cycleStartTime, Date cycleEndTime) {
        Map map = new HashMap();
        map.put("shopId", shopId);
        map.put("cycleStartTime", cycleStartTime);
        map.put("cycleEndTime", cycleEndTime);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForCouponExcelDto", map);
    }

    /**
     * 插入日志记录
     *
     * @param id
     * @param status
     * @param desc
     * @param userId
     */
    private void saveOperationLog(Integer id, Integer status, String desc, String userId) {
        OperationLog operatioLog = new OperationLog();
        operatioLog.setCreateUserId(userId);
        operatioLog.setDesc(desc);
        operatioLog.setOperationModel((byte) 1);
        operatioLog.setOperationType(Byte.valueOf(status.toString()));
        operatioLog.setCreadeAt(new Date());
        operatioLog.setOperationId(id);
        operatioLog.setIsDelete(Byte.valueOf((byte) 0));
        operationLogMapper.insertSelective(operatioLog);
    }

    @Override
    public void cancel(Integer id) {
        this.getBaseDao().updateBySql(NAMESPACE + ".cancel", id);
    }

    @Override
    public PaymentStatement get(Integer id) {
        Map<String, Object> map = new HashMap();
        map.put("id", id);
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByPrimaryKey", map);
    }
}
