package com.rongyi.tms.excel;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.ExcelUtil;
import com.rongyi.easy.rmmm.vo.OrderManagerCommodityVO;
import com.rongyi.easy.rmmm.vo.OrderManagerVO;
import com.rongyi.easy.tradecenter.vo.MerchantOsmOrderVO;
import com.rongyi.rss.tradecenter.osm.IOrderQueryService;
import com.rongyi.tms.util.Num;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 * Created by hebo on 2016/1/12.
 * 导出商品订单
 */
@Component
public class ExportOsmOrderExcel {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExportOsmOrderExcel.class);
    private static final int MAX_THREAD = 10;

    @Autowired
    private IOrderQueryService iOrderQueryService;

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;


    public void exportExcel(HttpServletRequest request, HttpServletResponse response, Map<String, Object> paramsMap) {
        try
        {
            String path = request.getSession().getServletContext().getRealPath("/");
            InputStream myxls = new FileInputStream(path + "excel/OsmOrderExcel.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(myxls);
            XSSFSheet sheet = wb.getSheetAt(0);
            XSSFCellStyle bodyStyle = wb.createCellStyle();
            XSSFFont bodyFont = wb.createFont();
            bodyStyle.setWrapText(true);
            bodyFont.setFontName("宋体");
            bodyFont.setFontHeightInPoints((short) 12);
            bodyStyle.setFont(bodyFont);
            bodyStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);// 指定单元格居中对齐
            bodyStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐

            List<OrderManagerCommodityVO> orderCommoditys = new ArrayList<>();
            List<OrderManagerVO> orderForms = getPageDataList(paramsMap);
//            List<OrderManagerVO> orderForms = listOrderByThread(paramsMap);
            if (CollectionUtils.isNotEmpty(orderForms)) {
                LOGGER.info("导出的商品订单数 szie={}",orderForms.size());
                for (int i = 2; i <= orderForms.size() + 2; i++) {
                    sheet.createRow(i);
                    for (int j = 0; j <= 30; j++) {
                        sheet.getRow(i).createCell(j);
                        sheet.getRow(i).getCell(j).setCellStyle(bodyStyle);
                    }
                }
                for (int i = 0; i < orderForms.size(); i++) {
                    OrderManagerVO vo = orderForms.get(i);
                    String deliveryType = convertDeliveryType(vo.getDeliveryType());//快递方式
                    String createAt = DateTool.date2String(vo.getCreateAt(), DateTool.FORMAT_DATETIME2);//下单时间
                    String deleverAt = DateTool.date2String(vo.getPayAt(), DateTool.FORMAT_DATETIME2);//发货时间
                    String payAt = DateTool.date2String(vo.getDeleverAt(), DateTool.FORMAT_DATETIME2);//付款时间
                    String reveiveAt = DateTool.date2String(vo.getReveiveAt(), DateTool.FORMAT_DATETIME2);//确认书后货时间
                    if (CollectionUtils.isNotEmpty(vo.getOrderCommoditys())) {
                        for (OrderManagerCommodityVO orderCommodity : vo.getOrderCommoditys()) {
                            orderCommodity.setDeliveryType(deliveryType);
                            orderCommodity.setCreateAt(createAt);
                            orderCommodity.setDeleverAt(deleverAt);
                            orderCommodity.setPayAt(payAt);
                            orderCommodity.setReveiveAt(reveiveAt);
                        }
                    }
                    orderCommoditys.addAll(vo.getOrderCommoditys());

                    sheet.getRow(i + 2).getCell(0).setCellValue(vo.getOrderCartNo());
                    sheet.getRow(i + 2).getCell(1).setCellValue(vo.getOrderNo());
                    sheet.getRow(i + 2).getCell(2).setCellValue(vo.getSellerAccount());
                    sheet.getRow(i + 2).getCell(3).setCellValue(vo.getUsername());
                    sheet.getRow(i + 2).getCell(4).setCellValue(vo.getMallName());
                    sheet.getRow(i + 2).getCell(5).setCellValue(vo.getShopName());
                    sheet.getRow(i + 2).getCell(6).setCellValue(vo.getOperationRedDiscount() != null ? vo.getOperationRedDiscount().toString() : "0");
                    sheet.getRow(i + 2).getCell(7).setCellValue(vo.getMerchantRedDiscount() != null ? vo.getMerchantRedDiscount().toString() : "0");
                    sheet.getRow(i + 2).getCell(8).setCellValue(this.convertRebateAmount(vo.getOperationRebateDiscount(),vo.getMerchantRebateDiscount()));
                    sheet.getRow(i + 2).getCell(9).setCellValue(this.convertRebateType(vo.getOperationRebateDiscount(),vo.getMerchantRebateDiscount()));
                    sheet.getRow(i + 2).getCell(10).setCellValue(vo.getIntegralAmount() == null ? "0" : vo.getIntegralAmount().toString());
                    // 新增满减+满减平台  start
                    BigDecimal reductionFee = vo.getReductionFee() == null ? BigDecimal.ZERO : vo.getReductionFee();
                    sheet.getRow(i + 2).getCell(11).setCellValue(reductionFee.toString());
                    sheet.getRow(i + 2).getCell(12).setCellValue(reductionFee.compareTo(BigDecimal.ZERO) != 0 ? "商户" : "");
                    // end
                    sheet.getRow(i + 2).getCell(13).setCellValue(vo.getRealAmount() == null ? "0" : vo.getRealAmount().toString());
                    sheet.getRow(i + 2).getCell(14).setCellValue(vo.getPayAmount() == null ? "0" : vo.getPayAmount().toString());
                    sheet.getRow(i + 2).getCell(15).setCellValue(convertActivityType(vo.getActivityType()));
                    sheet.getRow(i + 2).getCell(16).setCellValue(vo.getActivityName());
                    sheet.getRow(i + 2).getCell(17).setCellValue(convertStatus(vo.getStatus()));
                    sheet.getRow(i + 2).getCell(18).setCellValue(convertActivityStatus(vo.getActivityStatus()));
                    sheet.getRow(i + 2).getCell(19).setCellValue(convertOrderSource(vo.getOrderSource(), vo.getOrderSourceForWeiXin(), vo.getOrderChannel()));
                    sheet.getRow(i + 2).getCell(20).setCellValue(convertPayChannel(vo.getPayChannel()));
                    sheet.getRow(i + 2).getCell(21).setCellValue(deliveryType);
                    sheet.getRow(i + 2).getCell(22).setCellValue(createAt);
                    sheet.getRow(i + 2).getCell(23).setCellValue(payAt);
                    sheet.getRow(i + 2).getCell(24).setCellValue(deleverAt);
                    sheet.getRow(i + 2).getCell(25).setCellValue(reveiveAt);
                    sheet.getRow(i + 2).getCell(26).setCellValue(convertPaymentId(vo.getPaymentId()));
                    sheet.getRow(i + 2).getCell(27).setCellValue(vo.getReceiverName());
                    sheet.getRow(i + 2).getCell(28).setCellValue(vo.getReceiverPhone());
                    sheet.getRow(i + 2).getCell(29).setCellValue(vo.getReceiverAddress());
                    sheet.getRow(i + 2).getCell(30).setCellValue(convertGuideType(vo.getGuideType()));
                }
            }

            XSSFSheet sheet2 = wb.getSheetAt(1);
            for (int i = 2; i <= orderCommoditys.size() + 2; i++) {
                sheet2.createRow(i);
                for (int j = 0; j <= 14; j++) {
                    sheet2.getRow(i).createCell(j);
                    sheet2.getRow(i).getCell(j).setCellStyle(bodyStyle);
                }
            }

            if(CollectionUtils.isNotEmpty(orderCommoditys)){
                for (int i = 0; i < orderCommoditys.size(); i++) {
                    OrderManagerCommodityVO vo = orderCommoditys.get(i);
                    sheet2.getRow(i + 2).getCell(0).setCellValue(vo.getOrderCartNo());
                    sheet2.getRow(i + 2).getCell(1).setCellValue(vo.getOrderNo());
                    sheet2.getRow(i + 2).getCell(2).setCellValue(vo.getMallName());
                    sheet2.getRow(i + 2).getCell(3).setCellValue(vo.getShopName());
                    sheet2.getRow(i + 2).getCell(4).setCellValue(vo.getCommodityNo());
                    sheet2.getRow(i + 2).getCell(5).setCellValue(vo.getCommodityName());
                    sheet2.getRow(i + 2).getCell(6).setCellValue(vo.getCommodityCategory());
                    sheet2.getRow(i + 2).getCell(7).setCellValue(vo.getCommoditySpec());
                    sheet2.getRow(i + 2).getCell(8).setCellValue(vo.getUnitPrice());
                    sheet2.getRow(i + 2).getCell(9).setCellValue(vo.getCommodityNum());
                    sheet2.getRow(i + 2).getCell(10).setCellValue(vo.getDeliveryType());
                    sheet2.getRow(i + 2).getCell(11).setCellValue(vo.getCreateAt());
                    sheet2.getRow(i + 2).getCell(12).setCellValue(vo.getPayAt());
                    sheet2.getRow(i + 2).getCell(13).setCellValue(vo.getDeleverAt());
                    sheet2.getRow(i + 2).getCell(14).setCellValue(vo.getReveiveAt());
                }
            }
            String outFile = "商品订单记录_" + DateUtil.getCurrentDateYYYYMMDD() + ".xlsx";
            ExcelUtil.exportExcel(response, wb, outFile);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("商品订单导出记录异常", e);
        }
    }

    private List<OrderManagerVO> listOrderByThread(final Map<String, Object> paramsMap){
        LOGGER.info("多线程查询商品订单开始 param={}",paramsMap);
        final List<OrderManagerVO> orderForms = new ArrayList<>();
        final Map<String,List<OrderManagerVO>> map = new HashMap<>();
        try {
            int pageSize = 200;//每个线程查询300条数据
            paramsMap.put("pageSize",pageSize);
            final CountDownLatch latch = new CountDownLatch(MAX_THREAD);
            final Num num = new Num(1);
            for(int i = 1; i <= MAX_THREAD; i++){
                threadPoolTaskExecutor.execute(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            int currt = num.getNum();
                            int size = 0;
                            PagingVO<OrderManagerVO> pagingVO = iOrderQueryService.searchListByMap(paramsMap, currt);
                            if(CollectionUtils.isNotEmpty(pagingVO.getDataList())){
                                map.put(currt + "",pagingVO.getDataList());
                                size = pagingVO.getDataList().size();
                            }
                            LOGGER.info("线程{}查询商品订单返回 ,szie={}",currt,size);
                        } catch (Exception e) {
                            e.printStackTrace();
                            LOGGER.error("多线程查询商品订单开始 param={}", paramsMap);
                        }
                        latch.countDown();
                    }
                });
            }
            latch.await();

            for(int i = 1; i <= MAX_THREAD; i++){
                List<OrderManagerVO> list = map.get( i + "");
                if(CollectionUtils.isNotEmpty(list)){
                    orderForms.addAll(list);
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
            LOGGER.error("多线程查询商品订单异常", e);
        }
        return orderForms;
    }

    private List<OrderManagerVO> getPageDataList(Map<String, Object> paramsMap) throws Exception {
        List<OrderManagerVO> orderForms = new ArrayList<>();
        int pageSize = 1000;
        int TOTAL_SIZE = paramsMap.containsKey("pageSize")?Integer.valueOf(paramsMap.get("pageSize").toString()):2000;
        int currentPage = 1;
        for (int i=0; i< TOTAL_SIZE / pageSize; i++){
            paramsMap.put("pageSize", pageSize);
//            paramsMap.put("currentPage", currentPage);
            PagingVO<OrderManagerVO> pagingVO = iOrderQueryService.searchListByMap(paramsMap,currentPage);
            List<OrderManagerVO> pageData = pagingVO.getDataList();
            if (pageData!=null) {
                orderForms.addAll(pageData);
                if (pageData.size()< pageSize)
                    break;
            }else
                break;
            currentPage++;
        }
        return orderForms;
    }

    private String convertGuideType(Integer guideType) {
        String result = "其他";
        if (guideType!=null){
            switch (guideType){
                case 1 : result = "商家"; break;
                case 2 : result = "买手"; break;
            }
        }
        return result;
    }

    private String convertPayChannel(Byte payChannel) {
        String result = "其他";
        if (payChannel!=null){
            switch (payChannel){
                case 1:
                case 3: result = "支付宝"; break;
                case 5: result = "微信"; break;
            }
        }
        return result;
    }

    private String convertDeliveryType(Integer deliveryType) {
        String result = "";
        if (deliveryType != null){
            switch (deliveryType){
                case 1: result = "自提"; break;
                case 2: result = "快递"; break;
            }
        }
        return result;
    }

    private String convertPaymentId(String paymentId){
        String result = "";
        if(StringUtils.isNotBlank(paymentId)){
            result = paymentId.split(",")[0];
        }
        return result;
    }

    /**
     *
     * @param orderSource 0为微网站，1为容易逛，2为终端机，3其他
     * @param orderSourceForWeiXin 订单渠道微信来源     1 微商城 ，2 标准微信
     * @param orderChannel 下单渠道 SmallProgram:小程序
     * @return
     */
    private String convertOrderSource(Integer orderSource, String orderSourceForWeiXin, String orderChannel) {
        String result = "其他";
        if (orderSource!=null){
            switch (orderSource){
                case 0:
                    if("2".equals(orderSourceForWeiXin)){
                        result = "微商城"; break;
                    }else if("1".equals(orderSourceForWeiXin)){
                        result = "容易逛（微商城）"; break;
                    }
                case 1:
                    if("SmallProgram".equals(orderChannel)){
                        result = "容易逛（小程序）"; break;
                    }else{
                        result = "容易逛（APP）"; break;
                    }
                case 2: result = "终端机"; break;
                case 3: result = "其他"; break;
            }
        }
        return result;
    }

    private String convertStatus(String status) {
        String result = "其他";
        if (StringUtils.isNotBlank(status))
            switch (status) {
                case "1" : result="未付款";break;
                case "2" : result="待发货";break;
                case "3" : result="已发货";break;
                case "4" : result="已完成";break;
                case "5" : result="已关闭";break;
                case "8" : result="已退款";break;
            }
        return result;
    }

    private String convertActivityType(Integer activityType){
        String result = "普通";
        if (activityType != null){
            switch (activityType){
                case 0: result = "普通"; break;
                case 1: result = "闪购"; break;
                case 2: result = "特卖"; break;
                case 3: result = "秒杀"; break;
                case 4: result = "拼团"; break;
                case 5: result = "预约"; break;
                case 6: result = "断码好货"; break;
            }
        }
        return result;
    }

    private String convertActivityStatus(String activityStatus) {
        String result = "";
        if (StringUtils.isNotBlank(activityStatus) && !"0".equals(activityStatus)) {
            switch (activityStatus) {
                case "2":
                    result = "进行中";
                    break;
                case "3":
                    result = "成功";
                    break;
                case "4":
                    result = "失败";
                    break;
                case "5":
                    result = "失败";
                    break;
            }
        }
        return result;
    }

    private String convertRebateAmount(BigDecimal operationRebateDiscount,BigDecimal merchantRebateDiscount){
        BigDecimal rebateAmount = BigDecimal.ZERO;
        if(operationRebateDiscount != null){
            rebateAmount = rebateAmount.add(operationRebateDiscount);
        }
        if(merchantRebateDiscount != null){
            rebateAmount = rebateAmount.add(merchantRebateDiscount);
        }
        return rebateAmount.toString();
    }

    private String convertRebateType(BigDecimal operationRebateDiscount,BigDecimal merchantRebateDiscount){
        String reabteType = "平台";
        if(merchantRebateDiscount != null && merchantRebateDiscount.compareTo(BigDecimal.ZERO) > 0){
            reabteType = "商户";
        }
        return reabteType;
    }

}
