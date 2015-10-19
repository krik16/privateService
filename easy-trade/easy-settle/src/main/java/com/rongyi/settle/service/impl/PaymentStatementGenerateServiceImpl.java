package com.rongyi.settle.service.impl;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.roa.vo.ShopVO;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.rss.malllife.roa.ROARedisService;
import com.rongyi.rss.roa.ROAShopService;
import com.rongyi.rss.rpb.OrderNoGenService;
import com.rongyi.rss.settle.PaymentStatementGenerateService;
import com.rongyi.settle.constants.SettleConstant;
import com.rongyi.settle.dto.CouponCodeExcelDto;
import com.rongyi.settle.dto.CouponExcelDto;
import com.rongyi.settle.dto.PaymentStatementDetailDto;
import com.rongyi.settle.dto.PaymentStatementExcelDto;
import com.rongyi.settle.service.BussinessInfoService;
import com.rongyi.settle.service.PaymentStatementService;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.util.AmountUtil;
import com.rongyi.settle.util.DateUtils;
import com.rongyi.settle.util.ExcelUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * Created by xgq on 2015/9/22.
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
            logger.info("定时任务-执行对账单配置id=" + statementConfig.getId());
            try {
                if (SettleConstant.CountCycleType.DAY.equals(statementConfig.getCountCycle())) {
                    Date yesterdayFirstSecond = DateUtils.getYesterdayFirstSecond();
                    Date yesterdayLastSecond = DateUtils.getYesterdayLastSecond();
                    List<PaymentStatement> paymentStatements = paymentStatementService.selectByCycleTime(statementConfig.getId(), yesterdayFirstSecond, yesterdayLastSecond);
                    if (paymentStatements == null || paymentStatements.size() == 0) {
                        PaymentStatement paymentStatement = new PaymentStatement();
                        paymentStatement.setConfigId(statementConfig.getId());
                        paymentStatement.setRuleCode(statementConfig.getRuleCode());
                        paymentStatement.setCycleStartTime(yesterdayFirstSecond);
                        paymentStatement.setCycleEndTime(yesterdayLastSecond);
                        paymentStatement.setType(SettleConstant.PaymentStatementType.SHOP);
                        paymentStatement.setBatchNo(getBatchNo());
                        paymentStatement.setStatus(SettleConstant.PaymentStatementStatus.INIT);
                        paymentStatement.setCreateAt(new Date());
                        paymentStatement.setIsDelete(new Byte("0"));
                        paymentStatement.setPayNo(orderNoGenService.getOrderNo("3"));
                        createExcel(paymentStatement, statementConfig);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("定时任务-执行对账单配置出错。id=" + statementConfig.getId());
            }
        }
    }

    private List<CouponExcelDto> adjustCouponExcelDtoList(List<CouponExcelDto> list) {
        Map<String, CouponExcelDto> map = new HashMap();
        for (CouponExcelDto couponExcelDto : list) {
            CouponExcelDto existCouponExcelDto = map.get(couponExcelDto.getCouponId());
            if (existCouponExcelDto == null) {
                map.put(couponExcelDto.getCouponId(), couponExcelDto);
            } else {
                existCouponExcelDto.setCouponCount(existCouponExcelDto.getCouponCount() + couponExcelDto.getCouponCount());
                existCouponExcelDto.setCouponPayAmount((existCouponExcelDto.getCouponPayAmount() == null ? 0 : existCouponExcelDto.getCouponPayAmount()) + (couponExcelDto.getCouponPayAmount() == null ? 0 : couponExcelDto.getCouponPayAmount()));
                existCouponExcelDto.setCouponTotalAmount((existCouponExcelDto.getCouponTotalAmount() == null ? 0 : existCouponExcelDto.getCouponTotalAmount()) + (couponExcelDto.getCouponTotalAmount() == null ? 0 : couponExcelDto.getCouponTotalAmount()));
            }
        }
        return new ArrayList(map.values());
    }

    private String getBatchNo() {
        String dateStr = "";
        String batchNo = "";
        try {
            dateStr = DateUtils.getYesterdayDateSimpleStr();
            String key = "PAYMENT_STATEMENT_BATCH_NO_" + dateStr;
            batchNo = redisService.get(key);
            if (StringUtils.isEmpty(batchNo)) {
                batchNo = "0001";
            }
            int num = Integer.valueOf(batchNo);
            String nextBatchNo = String.format("%04d", ++num);
            redisService.set(key, nextBatchNo);
            redisService.expire(key, 60 * 60 * 48);// 两天后失效
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return dateStr + batchNo;
    }

    private void createExcel(PaymentStatement paymentStatement, StatementConfig statementConfig) throws Exception {
        PaymentStatementExcelDto paymentStatementExcelDto = new PaymentStatementExcelDto();
        List<PaymentStatementDetailDto> paymentStatementDetailDtoList = new ArrayList<>();
        List<CouponExcelDto> couponExcelDtoList = new ArrayList<>();
        if (statementConfig.getBussinessType().equals(SettleConstant.BussinessType.SHOP)) {
            ShopVO shopVO = roaShopService.getShopVOById(statementConfig.getBussinessId());
            paymentStatementDetailDtoList =
                    paymentStatementService.selectForStatementDetails(statementConfig.getBussinessId(), paymentStatement.getCycleStartTime(), paymentStatement.getCycleEndTime(), statementConfig.getCycleStartTime(), statementConfig.getCycleEndTime(), shopVO.getName(), shopVO.getPosition().getMallId(), shopVO.getPosition().getMall());
            couponExcelDtoList = paymentStatementService.selectForCouponExcelDto(statementConfig.getBussinessId(), paymentStatement.getCycleStartTime(), paymentStatement.getCycleEndTime(), statementConfig.getCycleStartTime(), statementConfig.getCycleEndTime());
            paymentStatementExcelDto.setShopName(shopVO.getName());
            paymentStatementExcelDto.setMallName(shopVO.getPosition().getMall());
        } else if (statementConfig.getBussinessType().equals(SettleConstant.BussinessType.MALL)) {
            Map map = new HashMap();
            map.put("mallId", statementConfig.getBussinessId());
            Map result = roaShopService.getShops(map, 0, 10000);
            List<ShopVO> shopVOs = (List<ShopVO>) result.get("list");
            for (ShopVO shopVO : shopVOs) {
                paymentStatementDetailDtoList.addAll(paymentStatementService.selectForStatementDetails(shopVO.getId(), paymentStatement.getCycleStartTime(), paymentStatement.getCycleEndTime(), statementConfig.getCycleStartTime(), statementConfig.getCycleEndTime(), shopVO.getName(), shopVO.getPosition().getMallId(), shopVO.getPosition().getMall()));
                couponExcelDtoList.addAll(paymentStatementService.selectForCouponExcelDto(shopVO.getId(), paymentStatement.getCycleStartTime(), paymentStatement.getCycleEndTime(), statementConfig.getCycleStartTime(), statementConfig.getCycleEndTime()));
            }
            if (shopVOs != null && shopVOs.size() > 0) {
                paymentStatementExcelDto.setMallName(shopVOs.get(0).getPosition().getMall());
            }

            adjustCouponExcelDtoList(couponExcelDtoList);
        }

        List<CouponCodeExcelDto> couponCodeExcelDtoList = new ArrayList<>();
        double total = 0;
        double payTotal = 0;
        for (PaymentStatementDetailDto paymentStatementDetailDto : paymentStatementDetailDtoList) {
            CouponCodeExcelDto couponCodeExcelDto = paymentStatementDetailDto.toCouponCodeExcelDto();
            couponCodeExcelDtoList.add(couponCodeExcelDto);
            total += paymentStatementDetailDto.getOrigPrice();
            payTotal += paymentStatementDetailDto.getPayAmount();
        }
        paymentStatementExcelDto.setBatchNo(paymentStatement.getBatchNo());
        paymentStatementExcelDto.setCycleTime(DateUtils.getDateTimeStr(paymentStatement.getCycleStartTime()) + " - " + DateUtils.getDateTimeStr(paymentStatement.getCycleEndTime()));
        paymentStatementExcelDto.setPayTotal(total);
        paymentStatementExcelDto.setRongyiDiscount(total - payTotal);

        BussinessInfo bussinessInfo = bussinessInfoService.selectByConfigId(statementConfig.getId());
        paymentStatementExcelDto.setShopAccountName(bussinessInfo.getPayName());
        paymentStatementExcelDto.setShopAccountNo(bussinessInfo.getPayAccount());
        paymentStatementExcelDto.setShopBank(bussinessInfo.getBlankName());
        paymentStatementExcelDto.setPayChannel(getPayChannelName(statementConfig.getPayChannel()));
        paymentStatementExcelDto.setCouponExcelDtoList(couponExcelDtoList);
        paymentStatementExcelDto.setCouponCodeExcelDtoList(couponCodeExcelDtoList);
        ExcelUtils.write(propertyConfigurer.getProperty("settle.template.file"), propertyConfigurer.getProperty("settle.file.path"), statementConfig.getBussinessId(), getFileName(statementConfig.getBussinessName(), DateUtils.getDateStr(paymentStatement.getCycleStartTime())), paymentStatementExcelDto);
        paymentStatement.setPayTotal(AmountUtil.changYuanToFen(total));
        paymentStatementService.insert(paymentStatement);
    }

    private String getPayChannelName(Byte payChannel) {
        if (SettleConstant.PayChannel.ZHIFUBAO.equals(payChannel)) {
            return "支付宝";
        }
        if (SettleConstant.PayChannel.WECHAT.equals(payChannel)) {
            return "微信";
        }
        if (SettleConstant.PayChannel.UNION.equals(payChannel)) {
            return "银联";
        }
        if (SettleConstant.PayChannel.CASH.equals(payChannel)) {
            return "现金";
        }
        return "支付宝";
    }

    private String getFileName(String name, String date) {
        return "容易网商户对账单-" + name + "-" + date + ".xlsx";
    }
}
