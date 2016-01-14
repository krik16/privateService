package com.rongyi.tms.excel;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.ExcelUtil;
import com.rongyi.easy.rmmm.vo.OrderManagerVO;
import com.rongyi.rss.mallshop.order.ROAOrderFormService;
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
 * Created by hebo on 2016/1/12.
 * 导出商品订单
 */
@Component
public class ExportOsmOrderExcel {

    @Autowired
    ROAOrderFormService roaOrderFormService;

    private int currentPage = 1;
    private final int TOTAL_SIZE = 50000;//单表最多导出条数

    public void exportExcel(HttpServletRequest request, HttpServletResponse response, Map<String, Object> paramsMap) {
        try
        {
            paramsMap.put("pageSize", 10);
            paramsMap.put("currentPage", currentPage);
            PagingVO<OrderManagerVO> pagingVO = roaOrderFormService.searchListByMap(paramsMap);
            String path = request.getSession().getServletContext().getRealPath("/");
            InputStream myxls = new FileInputStream(path + "excel/OsmOrderExcel.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(myxls);
            if (pagingVO!=null)
            {
                int times = pagingVO.getRowCnt()%TOTAL_SIZE==0?pagingVO.getRowCnt()/TOTAL_SIZE:pagingVO.getRowCnt()/TOTAL_SIZE+1;
                for (int t=0; t<times; t++)
                {
                    XSSFSheet sheet = wb.getSheetAt(t);
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
                            for (int j = 0; j <= 15; j++) {
                                sheet.getRow(i).createCell(j);
                                sheet.getRow(i).getCell(j).setCellStyle(bodyStyle);
                            }
                        }
                        for (int i = 0; i < orderForms.size(); i++) {
                            OrderManagerVO vo = orderForms.get(i);
                            sheet.getRow(i + 2).getCell(0).setCellValue(vo.getOrderCartNo());
                            sheet.getRow(i + 2).getCell(1).setCellValue(vo.getOrderNo());
                            sheet.getRow(i + 2).getCell(2).setCellValue(vo.getSellerAccount());
                            sheet.getRow(i + 2).getCell(3).setCellValue(vo.getUsername());
                            sheet.getRow(i + 2).getCell(4).setCellValue(vo.getMallName());
                            sheet.getRow(i + 2).getCell(5).setCellValue(vo.getShopName());
                            sheet.getRow(i + 2).getCell(6).setCellValue(vo.getRealAmount() == null ? "0" : vo.getRealAmount().toString());
                            sheet.getRow(i + 2).getCell(7).setCellValue(vo.getCouponAmount() == null ? "0" : vo.getCouponAmount().toString());
                            sheet.getRow(i + 2).getCell(8).setCellValue(vo.getIntegralAmount() == null ? "0" : vo.getIntegralAmount().toString());
                            sheet.getRow(i + 2).getCell(9).setCellValue(vo.getPayAmount() == null ? "0" : vo.getPayAmount().toString());
                            sheet.getRow(i + 2).getCell(10).setCellValue(convertStatus(vo.getStatus()));
                            sheet.getRow(i + 2).getCell(11).setCellValue(convertOrderSource(vo.getOrderSource()));
                            sheet.getRow(i + 2).getCell(12).setCellValue(convertPayChannel(vo.getPayChannel()));
                            sheet.getRow(i + 2).getCell(13).setCellValue(DateTool.date2String(vo.getCreateAt(), DateTool.FORMAT_DATETIME2));
                            sheet.getRow(i + 2).getCell(14).setCellValue(convertGuideType(vo.getGuideType()));
                        }
                    }
                }
            }
            String outFile = "商品订单记录_" + DateUtil.getCurrentDateYYYYMMDD() + ".xlsx";
            ExcelUtil.exportExcel(response, wb, outFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<OrderManagerVO> getPageDataList(Map<String, Object> paramsMap) throws Exception {
        List<OrderManagerVO> orderForms = new ArrayList<>();
        int pageSize = 5000;//一次查询数
        for (int i=0; i<TOTAL_SIZE/pageSize; i++){
            paramsMap.put("pageSize", pageSize);
            paramsMap.put("currentPage", currentPage);
            PagingVO<OrderManagerVO> pagingVO = roaOrderFormService.searchListByMap(paramsMap);
            List<OrderManagerVO> pageData = pagingVO.getDataList();
            if (pageData!=null) {
                orderForms.addAll(pageData);
                if (pageData.size()<pageSize)
                    break;
            }
            currentPage++;
        }
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
        String result = "--";
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
