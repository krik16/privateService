package com.rongyi.settle.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.rss.malllife.roa.ROARedisService;
import com.rongyi.rss.roa.ROAShopService;
import com.rongyi.rss.rpb.OrderNoGenService;
import com.rongyi.rss.settle.PaymentStatementGenerateService;
import com.rongyi.settle.constants.SettleConstant;
import com.rongyi.settle.service.BussinessInfoService;
import com.rongyi.settle.service.PaymentStatementService;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.util.DateUtils;

/**
 * Created by xgq on 2015/9/22.
 * Modified by ZhengYl on 2015/12/08
 */
@Service
public class PaymentStatementGenerateServiceImpl extends BaseServiceImpl implements PaymentStatementGenerateService {

    private static Logger logger = LoggerFactory.getLogger(PaymentStatementGenerateServiceImpl.class);

    @Autowired
    private StatementConfigService statementConfigService;

    @Autowired
    private PaymentStatementService paymentStatementService;

    @Autowired
    private BussinessInfoService bussinessInfoService;

    @Autowired
    private PropertyConfigurer propertyConfigurer;

    @Autowired
    private ROAShopService roaShopService;
    
    @Autowired
    private OrderNoGenService orderNoGenService;

    @Autowired
    private ROARedisService redisService;


    @Override
    public void generateForSchedule() throws Exception {
        logger.info("定时任务-扫描对账单配置……");
        List<StatementConfig> statementConfigList = statementConfigService.selectForSchedule();
        for (StatementConfig statementConfig : statementConfigList) {
            try {
                if (SettleConstant.CountCycleType.DAY.equals(statementConfig.getCountCycle())) {
                    Date yesterdayFirstSecond = DateUtils.getYesterdayFirstSecond();
                    Date yesterdayLastSecond = DateUtils.getYesterdayLastSecond();
                    List<PaymentStatement> paymentStatements = paymentStatementService.selectByCycleTime(statementConfig.getId(), yesterdayFirstSecond, yesterdayLastSecond);
                    if (paymentStatements == null || paymentStatements.size() == 0) {
                        logger.info("定时任务-执行对账单配置id=" + statementConfig.getId());
                        PaymentStatement paymentStatement = new PaymentStatement();
                        paymentStatement.setConfigId(statementConfig.getId());
                        paymentStatement.setRuleCode(statementConfig.getRuleCode());
                        paymentStatement.setCycleStartTime(yesterdayFirstSecond);
                        paymentStatement.setCycleEndTime(yesterdayLastSecond);
                        paymentStatement.setType(SettleConstant.PaymentStatementType.SHOP);
                        paymentStatement.setBatchNo(paymentStatementService.getBatchNo());
                        paymentStatement.setStatus(SettleConstant.PaymentStatementStatus.INIT);
                        paymentStatement.setCreateAt(new Date());
                        paymentStatement.setIsDelete(new Byte("0"));
                        paymentStatement.setPayNo(orderNoGenService.getOrderNo("3"));
                        paymentStatementService.createExcel(null, paymentStatement, statementConfig, null);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("定时任务-执行对账单配置出错。id=" + statementConfig.getId());
            }
        }
    }

}
