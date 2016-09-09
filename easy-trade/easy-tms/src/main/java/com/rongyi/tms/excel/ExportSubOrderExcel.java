package com.rongyi.tms.excel;

import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.ExcelUtil;
import com.rongyi.easy.rmmm.vo.OrderManagerVO;
import com.rongyi.rss.malllife.roa.ROACommodityService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * 导出商品订单
 */
@Component
public class ExportSubOrderExcel {

    @Autowired
    ROACommodityService commodityService;

    public void exportExcel(HttpServletRequest request, HttpServletResponse response, Map<String, Object> paramsMap) {
        try
        {
            String path = request.getSession().getServletContext().getRealPath("/");
            InputStream myxls = new FileInputStream(path + "excel/SubOrderExcel.xlsx");
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

            List<OrderManagerVO> orderForms = getPageDataList(paramsMap);
            if (CollectionUtils.isNotEmpty(orderForms)) {
                for (int i = 2; i <= orderForms.size() + 2; i++) {
                    sheet.createRow(i);
                    for (int j = 0; j <= 17; j++) {
                        sheet.getRow(i).createCell(j);
                        sheet.getRow(i).getCell(j).setCellStyle(bodyStyle);
                    }
                }
                for (int i = 0; i < orderForms.size(); i++) {
                    OrderManagerVO vo = orderForms.get(i);
                    sheet.getRow(i + 2).getCell(0).setCellValue(vo.getOrderNo());
//                    if(vo.getCommodityMid()!= null && vo.getCommoditySpecMid() != null) {
//                        CommodityVO commodityVO = commodityService.getCommoditySpecInfoById(vo.getCommodityMid(), vo.getCommoditySpecMid());
//                        if(commodityVO != null) {
//                            sheet.getRow(i + 2).getCell(1).setCellValue(commodityVO.getCommodityName());
//                        }
//                    }
//                    sheet.getRow(i + 2).getCell(2).setCellValue(vo.getUnitPrice());
//                    sheet.getRow(i + 2).getCell(3).setCellValue(vo.getQuantity());
                    sheet.getRow(i + 2).getCell(4).setCellValue(vo.getSellerAccount());
                    sheet.getRow(i + 2).getCell(5).setCellValue(vo.getUsername());
                    sheet.getRow(i + 2).getCell(6).setCellValue(vo.getMallName());
                    sheet.getRow(i + 2).getCell(7).setCellValue(vo.getShopName());
                    sheet.getRow(i + 2).getCell(8).setCellValue(vo.getRealAmount() == null ? "0" : vo.getRealAmount().toString());
                    sheet.getRow(i + 2).getCell(9).setCellValue(vo.getCouponAmount() == null ? "0" : vo.getCouponAmount().toString());
                    sheet.getRow(i + 2).getCell(10).setCellValue(vo.getIntegralAmount()== null ? "0" : vo.getIntegralAmount().toString());
                    sheet.getRow(i + 2).getCell(11).setCellValue(vo.getPayAmount()== null ? "0" : vo.getPayAmount().toString());
                    sheet.getRow(i + 2).getCell(12).setCellValue(convertStatus(vo.getStatus()));
                    sheet.getRow(i + 2).getCell(13).setCellValue(convertOrderSource(vo.getOrderSource()));
                    sheet.getRow(i + 2).getCell(14).setCellValue(convertPayChannel(vo.getPayChannel()));
                    sheet.getRow(i + 2).getCell(15).setCellValue(DateTool.date2String(vo.getCreateAt(), DateTool.FORMAT_DATETIME2));
                    sheet.getRow(i + 2).getCell(16).setCellValue(convertGuideType(vo.getGuideType()));
                }
            }
            String outFile = "商品子订单记录_" + DateUtil.getCurrentDateYYYYMMDD() + ".xlsx";
            ExcelUtil.exportExcel(response, wb, outFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<OrderManagerVO> getPageDataList(Map<String, Object> paramsMap) throws Exception {
        List<OrderManagerVO> orderForms = new ArrayList<>();
        int pageSize = 1000;
        int TOTAL_SIZE = paramsMap.containsKey("pageSize")?Integer.valueOf(paramsMap.get("pageSize").toString()):5000;
        int currentPage = 1;
//        for (int i=0; i< TOTAL_SIZE / pageSize; i++){
//            paramsMap.put("pageSize", pageSize);
//            paramsMap.put("currentPage", currentPage);
//            PagingVO<OrderManagerVO> pagingVO = iOrderQueryService.searchSubListByMap(paramsMap);
//            List<OrderManagerVO> pageData = pagingVO.getDataList();
//            if (pageData!=null) {
//                orderForms.addAll(pageData);
//                if (pageData.size()< pageSize)
//                    break;
//            }else
//                break;
//            currentPage++;
//        }
        return orderForms;
    }

    private String convertGuideType(Integer guideType) {
        String result = "--";
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

    private String convertOrderSource(Integer orderSource) {
        String result = "--";
        if (orderSource!=null){
            switch (orderSource){
                case 0: result = "微网站"; break;
                case 1: result = "容易逛"; break;
                case 2: result = "终端机"; break;
                case 3: result = "其他"; break;
            }
        }
        return result;
    }

    private String convertStatus(String status) {
        String result = "--";
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

}
