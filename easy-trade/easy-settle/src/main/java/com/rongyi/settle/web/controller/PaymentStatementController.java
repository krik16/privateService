/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年9月21日上午11:15:53
 * @Description: TODO
 **/

package com.rongyi.settle.web.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rongyi.easy.roa.vo.ShopVO;
import com.rongyi.rss.roa.ROAShopService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.constants.ResponseData;
import com.rongyi.settle.constants.SettleConstant;
import com.rongyi.settle.dto.CouponCodeExcelDto;
import com.rongyi.settle.dto.CouponExcelDto;
import com.rongyi.settle.dto.PaymentStatementDetailDto;
import com.rongyi.settle.dto.PaymentStatementExcelDto;
import com.rongyi.settle.excel.ExportDataToExcel;
import com.rongyi.settle.service.BussinessInfoService;
import com.rongyi.settle.service.PaymentStatementService;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.util.DateUtils;
import com.rongyi.settle.util.ExcelUtils;

/**
 * @Author: 柯军
 * @Description: 对账单列表
 * @datetime:2015年9月21日上午11:15:53
 *
 **/
@Controller
@RequestMapping("/paymentStatement")
public class PaymentStatementController {

    Logger logger = LoggerFactory.getLogger(PaymentStatementController.class);

    @Autowired
    private PropertyConfigurer propertyConfigurer;

    @Autowired
    private PaymentStatementService paymentStatementService;

    @Autowired
    private StatementConfigService statementConfigService;

    @Autowired
    private BussinessInfoService bussinessInfoService;

    @Autowired
    private ExportDataToExcel exportDataToExcel;

    @Autowired
    private ROAShopService roaShopService;

    /**
     * @Description: 对账单列表（包括所有列表，审核列表，商家对账单列表）
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:01:04
     **/
    @RequestMapping("/list")
    @ResponseBody
    public ResponseData list(@RequestBody Map<String, Object> map) {
        try {
            Integer currentPage = Integer.valueOf(map.get("currentPage").toString());
            Integer searchType = Integer.valueOf(map.get("searchType").toString());
            Integer searchStatus = Integer.valueOf(map.get("searchStatus").toString());
            if (searchType == 0) {//查询对账单列表
                if (searchStatus == 0) {
                    map.put("searchStatus", null);
                } else map.put("searchStatus", 5);
            } else if (searchType == 1) {//查询对账单审核列表
                if (searchStatus == 0) {
                    map.put("searchStatus", 0);
                } else map.put("searchStatus", 3);
            } else if (searchType == 2) {//查询待付款列表
                if (searchStatus == 0) {
                    map.put("searchStatus", 4);
                } else map.put("searchStatus", 6);
            } else if (searchType == 3) {//查询付款列表
                map.put("searchStatus", 6);
            } else if (searchType == 4) {//查询付款记录列表
                map.put("searchStatus", 11);
            }
            List<PaymentStatementDto> list = paymentStatementService.selectPageList(map, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt());
            Integer count = paymentStatementService.selectPageListCount(map);
            return ResponseData.success(list, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt(), count);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseData.failure(CodeEnum.FIAL_STATEMENT_LIST.getCodeInt(), CodeEnum.FIAL_STATEMENT_LIST.getValueStr());
        }
    }

    /**
     * @Description: 对账单明细
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:02:58
     **/
    @RequestMapping("/info")
    public ResponseData info(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 对账单审核（代付款）
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:03:17
     **/
    @RequestMapping("/verify")
    public ResponseData verify(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        ResponseData result = null;
        try {
            //获取用户
            String userId = "1";

            logger.info("============ 对账/代付款批量审核 =============");
            String idStr = map.containsKey("ids") ? map.get("ids").toString() : null;
            Integer status = map.containsKey("status") ? Integer.valueOf(map.get("status").toString()) : null;
            String desc = map.containsKey("desc") ? map.get("desc").toString() : null;
            if (StringUtils.isBlank(idStr) || status==null){
                return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt()
                        ,CodeEnum.FIAL_PARAMS_ERROR.getValueStr()) ;
            }
            List<Integer> ids = new ArrayList<>();
            for (String id : idStr.split(",")){
                ids.add(Integer.valueOf(id.trim()));
            }
            if (paymentStatementService.updatePaymentStatusByIds(ids, status, desc,userId)) {
                result = ResponseData.success();
            }else{
                result = ResponseData.failure(CodeEnum.FIAL_UPDATE_PAYMENT.getCodeInt()
                        ,CodeEnum.FIAL_UPDATE_PAYMENT.getValueStr());
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
        logger.info(result.toString());
        return result;
    }

    /**
     * @Description: 导出对账单明细（财务操作）
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:03:26
     **/
    @RequestMapping("/exportFinanceExcel")
    public ResponseData exportFinanceExcel(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 导出付款清单（财务操作）
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:03:26
     **/
    @RequestMapping("/exportPaymentExcel")
    public ResponseData exportPaymentSchedule(Map<String, Object> map, HttpServletResponse response
    , HttpServletRequest request) {
        logger.info("导出付款清单参数>>>>>>>>>>>:map={}"+map);
        String ids = map.get("ids")==null?"3":map.get("ids").toString();
        ResponseData result;
        if (StringUtils.isBlank(ids)) {
           return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
        }
        exportDataToExcel.exportPaymentScheduleExcel(request,response,ids);
        result = ResponseData.success();
        return result;
    }



    /**
     * @Description: 作废
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:04:09
     **/
    @RequestMapping("/invalid")
    public ResponseData invalid(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 商品订单查询(商家操作)
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:04:23
     **/
    @RequestMapping("/merchandiseList")
    public ResponseData merchandiseList(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 导出商品订单明细(商家操作)
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:04:46
     **/
    @RequestMapping("exportMerchandiseExcel")
    public ResponseData exportMerchandiseExcel(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 优惠券订单查询(商家操作)
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:05:09
     **/
    @RequestMapping("/couponList")
    public ResponseData couponList(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 导出优惠券订单明细(商家操作)
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:05:30
     **/
    @RequestMapping("exportCouponExcel")
    public ResponseData exportCouponExcel(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 定时任务调用生成对账单
     * @Author: xgq
     **/
    @RequestMapping("/generateForSchedule")
    public void generateForSchedule() {
        try {
            List<StatementConfig> statementConfigList = statementConfigService.selectForSchedule();
            for (StatementConfig statementConfig : statementConfigList) {
                if (SettleConstant.CountCycleType.DAY.equals(statementConfig.getCountCycle())) {
                    Calendar instance = Calendar.getInstance();
                    Date yesterdayFirstSecond = DateUtils.getYesterdayFirstSecond(instance);
                    Date yesterdayLastSecond = DateUtils.getYesterdayLastSecond(instance);
                    List<PaymentStatement> paymentStatements = paymentStatementService.selectByCycleTime(statementConfig.getId(), yesterdayFirstSecond, yesterdayLastSecond);
                    if (paymentStatements == null) {
                        PaymentStatement paymentStatement = new PaymentStatement();
                        paymentStatement.setConfigId(statementConfig.getId());
                        paymentStatement.setRuleCode(statementConfig.getRuleCode());
                        paymentStatement.setCycleStartTime(yesterdayFirstSecond);
                        paymentStatement.setCycleEndTime(yesterdayLastSecond);
                        paymentStatement.setType(SettleConstant.PaymentStatementType.SHOP);
                        paymentStatement.setBatchNo(getBatchNo(statementConfig.getBussinessCode(), instance));
                        paymentStatement.setStatus(SettleConstant.PaymentStatementStatus.INIT);
                        paymentStatement.setCreateAt(new Date());
                        paymentStatement.setIsDelete(new Byte("0"));
                        paymentStatementService.insert(paymentStatement);
                        createExcel(paymentStatement, statementConfig);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description: 生成对账单
     **/
    @RequestMapping("/generate")
    @ResponseBody
    public ResponseData generate(@RequestBody Map<String, Object> map) {
        try {
            Integer id = Integer.valueOf(map.get("id").toString());
            PaymentStatement paymentStatement = paymentStatementService.get(id);
            StatementConfig statementConfig = statementConfigService.selectById(paymentStatement.getConfigId());
            paymentStatementService.cancel(id);

            PaymentStatement paymentStatementNew = new PaymentStatement();
            paymentStatementNew.setConfigId(statementConfig.getId());
            paymentStatementNew.setRuleCode(statementConfig.getRuleCode());
            paymentStatementNew.setCycleStartTime(paymentStatement.getCycleStartTime());
            paymentStatementNew.setCycleEndTime(paymentStatement.getCycleEndTime());
            paymentStatementNew.setType(SettleConstant.PaymentStatementType.SHOP);
            paymentStatementNew.setBatchNo(getBatchNo(paymentStatement.getBatchNo()));
            paymentStatementNew.setStatus(SettleConstant.PaymentStatementStatus.INIT);
            paymentStatementNew.setCreateAt(new Date());
            paymentStatementNew.setIsDelete(new Byte("0"));
            paymentStatementService.insert(paymentStatementNew);
            createExcel(paymentStatementNew, statementConfig);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
        return ResponseData.success();
    }

    private String getBatchNo(String shopId, Calendar instance) {
        return shopId + DateUtils.getYesterdayDateSimpleStr(instance) + "01";
    }

    public String getBatchNo(String batchNo) {
        String endTwo = StringUtils.substring(batchNo, batchNo.length() - 2, batchNo.length());
        Integer count = Integer.valueOf(endTwo);
        count = count + 1;
        if (count < 10) {
            return StringUtils.substring(batchNo, 0, batchNo.length() - 2) + "0" + count;
        } else return StringUtils.substring(batchNo, 0, batchNo.length() - 2) + count.toString();
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
            List<ShopVO> shopVOs = (List<ShopVO>)result.get("list");
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
        ExcelUtils.write(propertyConfigurer.getProperty("settle.template.file"), propertyConfigurer.getProperty("settle.file.path"), getFileName(statementConfig.getBussinessName(), DateUtils.getDateStr(paymentStatement.getCycleStartTime())), paymentStatementExcelDto);
    }

    private String getFileName(String name, String date) {
        return "容易网商户对账单-" + name + "-" + date + ".xlsx";
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

    /**
     * 浏览器下载对账单
     * @param id
     * @param response
     * @throws Exception
     */
    @RequestMapping("/export/{id}")
    public void export(@PathVariable Integer id, HttpServletResponse response) throws Exception {
        PaymentStatement paymentStatement = paymentStatementService.get(id);
        StatementConfig statementConfig = statementConfigService.selectById(paymentStatement.getConfigId());
        String fileName = getFileName(statementConfig.getBussinessName(), DateUtils.getDateStr(paymentStatement.getCycleStartTime()));
        File f = new File(propertyConfigurer.getProperty("settle.file.path") + fileName);
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(f));
        byte[] buf = new byte[2048];
        int len = 0;
        response.reset();
        response.setContentType("application/x-msdownload");
        response.setHeader("Content-Disposition", "attachment; filename=" + toUTF8(f.getName()));
        OutputStream out = response.getOutputStream();
        while ((len = br.read(buf)) > 0)
            out.write(buf, 0, len);
        out.flush();
        br.close();
        out.close();
    }

    public String toUTF8(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 0 && c <= 255) {
                sb.append(c);
            } else {
                byte[] b;
                try {
                    b = Character.toString(c).getBytes("utf-8");
                } catch (Exception ex) {
                    System.out.println(ex);
                    b = new byte[0];
                }
                for (int j = 0; j < b.length; j++) {
                    int k = b[j];
                    if (k < 0)
                        k += 256;
                    sb.append("%" + Integer.toHexString(k).toUpperCase());
                }
            }
        }
        return sb.toString();
    }
}

