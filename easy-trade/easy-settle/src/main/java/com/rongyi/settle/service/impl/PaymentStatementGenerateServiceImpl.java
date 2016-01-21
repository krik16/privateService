package com.rongyi.settle.service.impl;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.rss.rpb.OrderNoGenService;
import com.rongyi.rss.settle.PaymentStatementGenerateService;
import com.rongyi.settle.constants.SettleConstant;
import com.rongyi.settle.service.PaymentStatementService;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.util.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Months;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by xgq on 2015/9/22.
 * Modified by erliang on 2015/12/08
 */
@Service
public class PaymentStatementGenerateServiceImpl extends BaseServiceImpl implements PaymentStatementGenerateService {

    private static Logger logger = LoggerFactory.getLogger(PaymentStatementGenerateServiceImpl.class);

    @Autowired
    private StatementConfigService statementConfigService;

    @Autowired
    private PaymentStatementService paymentStatementService;

    @Autowired
    private OrderNoGenService orderNoGenService;

    @Override
    public void generateForSchedule() throws Exception {
        logger.info("定时任务-扫描对账单配置……");
        List<StatementConfig> statementConfigList = statementConfigService.selectForScheduleSpacing();
        for (StatementConfig statementConfig : statementConfigList) {
            try {
                Integer spacingDays = statementConfig.getCycleDay();
                DateTime settleDay = new DateTime(statementConfig.getEffectStartTime());
                settleDay = settleDay.plusDays(spacingDays);
                DateTime settleEndDay = new DateTime(statementConfig.getEffectEndTime());
                settleEndDay = settleEndDay.plusDays(spacingDays);
                DateTime currentDateTime = new DateTime();
                while (!settleDay.isAfter(settleEndDay)) {
                    if (Days.daysBetween(currentDateTime, settleDay).getDays() == 0) {
                        Date settlePeriodFirstSecond = DateUtils.getSomedayFirstSecond(spacingDays);
                        Date settlePeriodLastSecond;
                        if(currentDateTime.isAfter(settleEndDay)){
                            settlePeriodLastSecond = DateUtils.getAllocatedDayLastSecond(statementConfig.getEffectEndTime());
                        }else{
                            settlePeriodLastSecond = DateUtils.getYesterdayLastSecond();
                        }
                        List<PaymentStatement> paymentStatements = paymentStatementService.selectByCycleTime(statementConfig.getId(), settlePeriodFirstSecond, settlePeriodLastSecond);
                        if (paymentStatements == null || paymentStatements.size() == 0) {
                            logger.info("定时任务-执行对账单配置id=" + statementConfig.getId());
                            PaymentStatement paymentStatement = new PaymentStatement();
                            paymentStatement.setConfigId(statementConfig.getId());
                            paymentStatement.setRuleCode(statementConfig.getRuleCode());
                            paymentStatement.setCycleStartTime(settlePeriodFirstSecond);
                            paymentStatement.setCycleEndTime(settlePeriodLastSecond);
                            paymentStatement.setType(SettleConstant.PaymentStatementType.SHOP);
                            paymentStatement.setBatchNo(paymentStatementService.getBatchNo());
                            paymentStatement.setStatus(SettleConstant.PaymentStatementStatus.INIT);
                            paymentStatement.setCreateAt(new Date());
                            paymentStatement.setIsDelete(new Byte("0"));
                            paymentStatement.setPayNo(orderNoGenService.getOrderNo("3"));
                            paymentStatementService.createExcel(null, paymentStatement, statementConfig, null);
                        }
                        break;
                    }
                    settleDay = settleDay.plusDays(spacingDays);
                }

            } catch (Exception e) {
                e.printStackTrace();
                logger.error("定时任务-执行对账单配置出错。id=" + statementConfig.getId());
            }
        }

        List<StatementConfig> statementConfigJumpingList = statementConfigService.selectForScheduleJumping();
        outer:
        for (StatementConfig statementConfig : statementConfigJumpingList) {
            try {
                List<String> regularDays = Arrays.asList(statementConfig.getCycleRegularDay().split(","));
                DateTime effectEndTime = new DateTime(statementConfig.getEffectEndTime());
                DateTime currentTime = new DateTime(new Date());

                if (regularDays.contains(String.valueOf(currentTime.getDayOfMonth()))) {
                    Date settlePeriodFirstSecond = new Date();
                    Date settlePeriodLastSecond = new Date();

                    if (currentTime.isAfter(effectEndTime) && Months.monthsBetween(effectEndTime, currentTime).getMonths() <= 1) {
                        int settlementStartDay = 0;
                        for (String dayStr : regularDays) {
                            int day = Integer.valueOf(dayStr);

                            DateTime configTime = new DateTime();
                            configTime = configTime.withDayOfMonth(day);
                            if (effectEndTime.isBefore(configTime) && currentTime.isAfter(configTime)) {
                                continue outer;
                            }

                            if (day < effectEndTime.getDayOfMonth()) {
                                settlementStartDay = day;
                            }
                        }

                        DateTime settlementStartTime = new DateTime();
                        if (settlementStartDay == 0) {
                            settlementStartDay = Integer.valueOf(regularDays.get(regularDays.size() - 1));
                            settlementStartTime = settlementStartTime.minusMonths(1);
                        }
                        settlementStartTime = settlementStartTime.withDayOfMonth(settlementStartDay);

                        settlePeriodFirstSecond = settlementStartTime.toDate();
                        settlePeriodLastSecond = DateUtils.getAllocatedDayLastSecond(statementConfig.getEffectEndTime());
                    }

                    List<PaymentStatement> paymentStatements = paymentStatementService.selectByCycleTime(statementConfig.getId(), settlePeriodFirstSecond, settlePeriodLastSecond);
                    if (paymentStatements == null || paymentStatements.size() == 0) {
                        logger.info("定时任务-执行对账单配置id=" + statementConfig.getId());
                        PaymentStatement paymentStatement = new PaymentStatement();
                        paymentStatement.setConfigId(statementConfig.getId());
                        paymentStatement.setRuleCode(statementConfig.getRuleCode());
                        paymentStatement.setCycleStartTime(settlePeriodFirstSecond);
                        paymentStatement.setCycleEndTime(settlePeriodLastSecond);
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

    public static void main(String[] args) {

        DateTime currentTime = new DateTime(new Date());
        currentTime = currentTime.plusDays(3);
        System.out.println(currentTime.toString());
    }

}
