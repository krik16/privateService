package com.rongyi.settle.service.impl;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.entity.ConfigShop;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.rss.rpb.OrderNoGenService;
import com.rongyi.rss.settle.PaymentStatementGenerateService;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.constants.SettleConstant;
import com.rongyi.settle.service.ConfigShopService;
import com.rongyi.settle.service.PaymentStatementService;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.util.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.IllegalFieldValueException;
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

    @Autowired
    ConfigShopService configShopService;

    /**
     * 定时任务执行生成对账单操作的入口，分为两种生成模式
     * <p> <p>
     * 第一种模式：指定日期间隔出账单，例如每隔3天出账单、账单有效期为2016-02-01 ~ 2016-03-01
     * <p/>
     * 那么在02-04凌晨会生成 02-01 00:00:00 至 02-03 23:59:59期间完成的交易的对账单数据
     * <p/>
     * 以此类推02-07凌晨会生成 02-04 00:00:00 至 02-06 23:59:59期间完成的交易的对账单数据
     * <p/>
     * 第二种模式：固定day of month生成对账单，例如每月5、15 、25日出账单，账单有效期为2016-02-01 ~ 2016-03-01
     * <p/>
     * 那么在02-05凌晨会生成 02-01 00:00:00 至 02-04 23:59:59期间完成的交易的对账单数据
     * <p/>
     * 以此类推02-15凌晨会生成 02-05 00:00:00 至 02-14 23:59:59期间完成的交易的对账单数据
     * <p/>
     * 以此类推02-25凌晨会生成 02-15 00:00:00 至 02-24 23:59:59期间完成的交易的对账单数据
     * <p/>
     * 最后，请注意，03-05凌晨会生成 02-25 00:00:00 至 03-01 23:59:59期间完成的交易的对账单数据
     *
     * @throws Exception
     */
    @Override
    public void generateForSchedule() throws Exception {
        logger.info("定时任务-扫描对账单配置……");
        //第一种模式
        List<StatementConfig> statementConfigList = statementConfigService.selectForScheduleSpacing();
        for (StatementConfig statementConfig : statementConfigList) {
            //验证是否有最新店铺未加入对账单
            if(ConstantEnum.BIZ_TYPE1.getCodeByte().equals(statementConfig.getBussinessType()) && ConstantEnum.LINK_TYPE_0.getCodeByte().equals(statementConfig.getLinkType())){
                this.addMallNewShopConfig(statementConfig.getBussinessId(),statementConfig.getId());
            }
            try {
                // 从配置中取时间间隔
                Integer spacingDays = statementConfig.getCycleDay();
                if (spacingDays == null || spacingDays == 0)
                    spacingDays = 1;

                DateTime settleDay = new DateTime(statementConfig.getEffectStartTime());
                // 实际结算生成的开始时间
                settleDay = settleDay.plusDays(spacingDays);

                DateTime settleEndDay = new DateTime(statementConfig.getEffectEndTime());
                // 实际结算生成的结束时间
                settleEndDay = settleEndDay.plusDays(spacingDays);

                DateTime currentDateTime = new DateTime();
                while (settleDay.isBefore(settleEndDay)) {
                    // 判断今天是否处于固定间隔的日期上，通过从结算生成的开始时间（settleDay）开始累加固定间隔天数（spacingDays）的方式循环判断
                    if (Days.daysBetween(currentDateTime, settleDay).getDays() == 0) {
                        // 结算计算开始时间，精确到秒
                        Date settlePeriodFirstSecond = DateUtils.getSomedayFirstSecond(spacingDays);
                        // 结算计算结束时间，精确到秒
                        Date settlePeriodLastSecond;
                        if (currentDateTime.isAfter(settleEndDay)) {
                            // 判断计算结束时间是否超过了结算生效时间，如果超过，取结算生效时间的最后一秒
                            settlePeriodLastSecond = DateUtils.getAllocatedDayLastSecond(statementConfig.getEffectEndTime());
                        } else {
                            // 没超过，按照配置的时间间隔，取昨天的最后一秒
                            settlePeriodLastSecond = DateUtils.getYesterdayLastSecond();
                        }
                        // 拿到settlePeriodFirstSecond/LastSecond后在历史对账单里查询这张单是否生成过
                        List<PaymentStatement> paymentStatements = paymentStatementService.selectByCycleTime(statementConfig.getId(), settlePeriodFirstSecond, settlePeriodLastSecond);
                        // 没有生成，进入制作excel对账单的过程
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

        //第二种模式
        List<StatementConfig> statementConfigJumpingList = statementConfigService.selectForScheduleJumping();
        outer:
        for (StatementConfig statementConfig : statementConfigJumpingList) {
            //验证是否有最新店铺未加入对账单
            if(ConstantEnum.BIZ_TYPE1.getCodeByte().equals(statementConfig.getBussinessType()) && ConstantEnum.LINK_TYPE_0.getCodeByte().equals(statementConfig.getLinkType())){
                this.addMallNewShopConfig(statementConfig.getBussinessId(),statementConfig.getId());
            }
            try {
                // 先从配置中取出生成账单的固定日期串，比如"5&15&25"
                List<String> regularDays = Arrays.asList(statementConfig.getCycleRegularDay().split("&"));
                DateTime effectEndTime = new DateTime(statementConfig.getEffectEndTime());
                DateTime effectStartTime = new DateTime(statementConfig.getEffectStartTime());
                DateTime currentTime = new DateTime();

                // 首先判断今天在不在这个固定日期上
                if (regularDays.contains(String.valueOf(currentTime.getDayOfMonth()))) {
                    Integer toDayOfMonth = currentTime.getDayOfMonth();
                    Date settlePeriodFirstSecond;
                    Date settlePeriodLastSecond;
                    DateTime settlementStartTime = new DateTime();

                    if (currentTime.isAfter(effectEndTime) && Months.monthsBetween(effectEndTime, currentTime).getMonths() <= 1) {
                        // 当前日期在结算生效日期结束后的一个月内
                        int settlementStartDay = 0;
                        for (String dayStr : regularDays) {
                            int day = Integer.valueOf(dayStr);

                            DateTime configTime = new DateTime();
                            configTime = configTime.withDayOfMonth(day);
                            if (effectEndTime.isBefore(configTime) && currentTime.isAfter(configTime)) {
                                continue outer;
                            }

                            if (day <= effectEndTime.getDayOfMonth()) {
                                settlementStartDay = day;
                            }
                        }

                        if (settlementStartDay == 0) {
                            settlementStartDay = Integer.valueOf(regularDays.get(regularDays.size() - 1));
                            settlementStartTime = settlementStartTime.minusMonths(1);
                        }
                        settlementStartTime = settlementStartTime.withDayOfMonth(settlementStartDay);

                        settlePeriodFirstSecond = DateUtils.getAllocatedDayFirstSecond(settlementStartTime.toDate());
                        settlePeriodLastSecond = DateUtils.getAllocatedDayLastSecond(statementConfig.getEffectEndTime());
                    } else if (currentTime.isBefore(effectEndTime)) {
                        int index = regularDays.indexOf(toDayOfMonth.toString());
                        if (--index < 0) {
                            index = regularDays.size() - 1;
                        }
                        String startDayOfMonth = regularDays.get(index);
                        settlementStartTime = settlementStartTime.withDayOfMonth(Integer.valueOf(startDayOfMonth));
                        if (index == regularDays.size() - 1) {
                            settlementStartTime = settlementStartTime.minusMonths(1);
                        }
                        if (settlementStartTime.isBefore(effectStartTime)) {
                            settlementStartTime = effectStartTime;
                        }
                        settlePeriodFirstSecond = DateUtils.getAllocatedDayFirstSecond(settlementStartTime.toDate());
                        settlePeriodLastSecond = DateUtils.getYesterdayLastSecond();
                    } else {
                        continue;
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
            } catch (IllegalFieldValueException illDateE) {
                logger.error(illDateE.getMessage());
                logger.error("定时任务-执行对账单配置出错，自定义类型配置不支持>29日的日期。id=" + statementConfig.getId() + ", regularDays: " + statementConfig.getRegularDay());
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("定时任务-执行对账单配置出错。id=" + statementConfig.getId());
            }
        }
    }

    /**
     * 商场对账单配置为所有的时候去获取该商场下所有店铺，防止后续新增店铺未加在配置中
     * @param mallId 商场id
     * @param configId 配置id
     */
    private void addMallNewShopConfig(String mallId, Integer configId){
        try {
            List<String> shopIdList = statementConfigService.findAllShopByMallId(mallId);
            List<String> configShopList = configShopService.getConfigShopIdsByConfigId(configId);
            for (String shopId : shopIdList) {
                if(!configShopList.contains(shopId)){
                    ConfigShop configShop = new ConfigShop();
                    configShop.setConfigId(configId);
                    configShop.setShopId(shopId);
                    configShopService.insert(configShop);
                }
            }
        }catch (Exception e){
            logger.warn("检查商场下最新店铺数据出错,忽略此次店铺信息更新,继续结算,errMsg={}",e.getMessage());
        }

    }

}
