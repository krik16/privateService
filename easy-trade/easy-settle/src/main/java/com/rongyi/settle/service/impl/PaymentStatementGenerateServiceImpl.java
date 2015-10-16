package com.rongyi.settle.service.impl;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.roa.vo.ShopVO;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.easy.settle.entity.StatementConfig;
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by xgq on 2015/9/22.
 */
@Service
public class PaymentStatementGenerateServiceImpl extends BaseServiceImpl implements PaymentStatementGenerateService {

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


    @Override
    public void generateForSchedule() throws Exception {
        List<StatementConfig> statementConfigList = statementConfigService.selectForSchedule();
        for (StatementConfig statementConfig : statementConfigList) {
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
                    paymentStatement.setBatchNo(getBatchNoFirst(statementConfig.getBussinessCode()));
                    paymentStatement.setStatus(SettleConstant.PaymentStatementStatus.INIT);
                    paymentStatement.setCreateAt(new Date());
                    paymentStatement.setIsDelete(new Byte("0"));
                    paymentStatement.setPayNo(orderNoGenService.getOrderNo("3"));
                    createExcel(paymentStatement, statementConfig);
                }
            }
        }
    }

    private String getBatchNoFirst(String shopId) {
//        return (shopId != null) ? shopId : ""  + DateUtils.getYesterdayDateSimpleStr() + "01";
        return DateUtils.getYesterdayDateSimpleStr() + "01";
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
