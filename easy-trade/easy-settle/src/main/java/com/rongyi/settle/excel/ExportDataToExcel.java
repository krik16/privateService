/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月27日下午5:17:58
 * @Description: TODO
 *
 **/

package com.rongyi.settle.excel;

import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.ExcelUtil;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.settle.service.impl.PaymentStatementServiceImpl;
import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * @Author: 柯军
 * @Description: 导出各种数据
 * @datetime:2015年5月27日下午5:17:58
 * 
 **/
@Component
public class ExportDataToExcel {

    @Autowired
    PaymentStatementServiceImpl paymentStatementService;

    @SuppressWarnings("unchecked")
    public Map<String, Object> getParamMap(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            String paramsJson = new String(request.getParameter("paramsJson").getBytes("iso8859-1"), "UTF-8");
            map = JsonUtil.getMapFromJson(paramsJson);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 导出付款清单
     * @param request
     * @param response
     * @param ids
     */
    public void exportPaymentScheduleExcel(HttpServletRequest request, HttpServletResponse response, String ids) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("ids", "("+ids+")");
            map.put("searchStatus",11);
            List<PaymentStatementDto> payments= paymentStatementService.selectPageList(map, 0, 10000);
            Set<String> businessIds = null;
            if (CollectionUtils.isNotEmpty(payments)) {
                businessIds = new HashSet<>();
                for(PaymentStatementDto dto : payments){
                    businessIds.add(dto.getBussinessId());
                }
            }
            List<List<PaymentStatementDto>> parentsDtoList = new ArrayList<>();
            if(CollectionUtils.isNotEmpty(businessIds)){
                for(String businessId : businessIds){
                    List<PaymentStatementDto> sonDtoList = new ArrayList<>();
                    for (PaymentStatementDto p : payments){
                        if (businessId!=null && businessId.equals(p.getBussinessId())){
                            sonDtoList.add(p);
                        }
                    }
                    parentsDtoList.add(sonDtoList);
                }
            }
            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFFont titleFont = wb.createFont();
            titleFont.setFontName("宋体");
            titleFont.setFontHeightInPoints((short) 11);
            titleFont.setBold(true);
            XSSFFont bodyFont = wb.createFont();
            bodyFont.setFontName("宋体");
            bodyFont.setFontHeightInPoints((short) 12);

            XSSFCellStyle titleStyle = wb.createCellStyle();
            XSSFCellStyle bodyStyle = wb.createCellStyle();
            titleStyle.setFont(titleFont);
            titleStyle.setWrapText(true);
            titleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);// 指定单元格居中对齐
            titleStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
//            titleStyle.setFillBackgroundColor(Colour);

            bodyStyle.setFont(bodyFont);
            titleStyle.setWrapText(true);
            bodyStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);// 指定单元格居中对齐
            bodyStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
            if (CollectionUtils.isNotEmpty(parentsDtoList)){
                for (List<PaymentStatementDto> sonDtoList : parentsDtoList){
                    XSSFSheet sheet = wb.createSheet(sonDtoList.get(0).getBussinessName());
                    for (int i = 0; i <= sonDtoList.size(); i++) {
                        sheet.createRow(i);
                        for (int j = 0; j <= 9; j++) {
                            sheet.getRow(i).createCell(j);
                            if (i==0)
                                sheet.getRow(i).getCell(j).setCellStyle(titleStyle);
                            else
                                sheet.getRow(i).getCell(j).setCellStyle(bodyStyle);
                        }
                    }
                    PaymentStatementDto dto;
                    for (int i = 0; i < sonDtoList.size()+1; i++) {
                        if(i==0){
                            sheet.getRow(i).getCell(0).setCellValue("对账单批次");
                            sheet.getRow(i).getCell(1).setCellValue("商户类型");
                            sheet.getRow(i).getCell(2).setCellValue("对账单周期");
                            sheet.getRow(i).getCell(3).setCellValue("名称");
                            sheet.getRow(i).getCell(4).setCellValue("结算方式");
                            sheet.getRow(i).getCell(5).setCellValue("账户");
                            sheet.getRow(i).getCell(6).setCellValue("开户行名称");
                            sheet.getRow(i).getCell(7).setCellValue("应付总金额");
                            sheet.getRow(i).getCell(8).setCellValue("对账单状态");
                        }else{
                            dto = sonDtoList.get(i-1);
                            sheet.getRow(i).getCell(0).setCellValue(dto.getBatchNo());
                            String businessType = "";
                            switch (dto.getBussinessType()){
                                case 0 : businessType="店铺"; break;
                                case 1 : businessType="商场"; break;
                                case 2 : businessType="品牌"; break;
                                case 3 : businessType="分公司"; break;
                                case 4 : businessType="集团公司"; break;
                            }
                            sheet.getRow(i).getCell(1).setCellValue(businessType);
                            sheet.getRow(i).getCell(2).setCellValue(DateTool.date2String(dto.getCycleStartTime(),DateTool.FORMAT_DATE_2)
                                    +"-"+DateTool.date2String(dto.getCycleEndTime(),DateTool.FORMAT_DATE_2));
                            sheet.getRow(i).getCell(3).setCellValue(dto.getBussinessName());
                            sheet.getRow(i).getCell(4).setCellValue("现金");
                            sheet.getRow(i).getCell(5).setCellValue(dto.getBussinessName());
                            sheet.getRow(i).getCell(6).setCellValue(dto.getBlankName());
                            sheet.getRow(i).getCell(7).setCellValue(dto.getPayTotal());
                            sheet.getRow(i).getCell(8).setCellValue("未下载");
                        }
                    }
                }
                String outFile = "付款清单_"+ DateUtil.getCurrentDateYYYYMMDD() +".xlsx";
                ExcelUtil.exportExcel(response, wb, outFile);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
