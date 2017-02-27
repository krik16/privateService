package com.rongyi.tms.excel;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.ExcelUtil;
import com.rongyi.easy.tms.vo.v2.SalesCommissionVO;
import com.rongyi.tms.service.v2.SalesCommissionService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * 导出佣金报表
 * @author chenjun
 * @date 2017/2/23 14:31
 */
@Component
public class ExportSalesCommissionExcel {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExportSalesCommissionExcel.class);

    @Autowired
    private SalesCommissionService salesCommissionService;

    /**
     * 导出推广佣金报表
     * @param request
     * @param response
     * @param map
     */
    public void exportExpandListExcel(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
        try {
            String path = request.getSession().getServletContext().getRealPath("/");
            InputStream myxls = new FileInputStream(path + "excel/ExpandCommissionExcel.xlsx");
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

            List<SalesCommissionVO> list = salesCommissionService.findCommissionList(map);

            if (CollectionUtils.isNotEmpty(list)) {
                LOGGER.info("导出推广佣金报表开始 size={}", list.size());
                for (int i = 1; i < list.size() + 1; i++) {
                    sheet.createRow(i);
                    for (int j = 0; j < 10; j++) {
                        sheet.getRow(i).createCell(j);
                        sheet.getRow(i).getCell(j).setCellStyle(bodyStyle);
                    }
                }

                for (int i = 0; i < list.size(); i++) {
                    SalesCommissionVO commissionVO = list.get(i);
                    sheet.getRow(i + 1).getCell(0).setCellValue(commissionVO.getCommNo());//返佣流水号
                    sheet.getRow(i + 1).getCell(1).setCellValue(new StringBuilder().append("每邀请一个用户返还").append(commissionVO.getCommissionAmount()).append("元").toString());//返佣说明
                    sheet.getRow(i + 1).getCell(2).setCellValue(this.convertGuideType(commissionVO.getGuideType()));//角色类型
                    sheet.getRow(i + 1).getCell(3).setCellValue(commissionVO.getInvitePhone());//推荐人账号
                    sheet.getRow(i + 1).getCell(4).setCellValue(this.convertRegisterType(commissionVO.getRegisterType()));//用户类型
                    sheet.getRow(i + 1).getCell(5).setCellValue(commissionVO.getRegisterPhone());//被推荐人账号
                    sheet.getRow(i + 1).getCell(6).setCellValue(commissionVO.getCommissionAmount() != null ? commissionVO.getCommissionAmount().toString() : "0");//返佣金额
                    sheet.getRow(i + 1).getCell(7).setCellValue(DateUtil.dateToString(commissionVO.getCreateAt()));//注册时间
                    sheet.getRow(i + 1).getCell(8).setCellValue(this.convertStatus(commissionVO.getStatus()));//审核状态
                    sheet.getRow(i + 1).getCell(9).setCellValue(commissionVO.getReason());//未通过原因
                }
            }
            String outFile = "推广返佣_" + DateUtil.getCurrentDateYYYYMMDD() + ".xlsx";
            ExcelUtil.exportExcel(response, wb, outFile);
            LOGGER.info("导出推广佣金报表结束");
        } catch (Exception e){
            e.printStackTrace();
            LOGGER.error("导出推广佣金报表异常",e);
        }
    }

    /**
     * 导出首单返佣报表
     * @param request
     * @param response
     * @param map
     */
    public void exportFirstOrderListExcel(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
        try {
            String path = request.getSession().getServletContext().getRealPath("/");
            InputStream myxls = new FileInputStream(path + "excel/FirstOrderCommissionExcel.xlsx");
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

            List<SalesCommissionVO> list = salesCommissionService.findCommissionList(map);

            if (CollectionUtils.isNotEmpty(list)) {
                LOGGER.info("导出首单返佣报表开始 size={}",list.size());
                for (int i = 1; i < list.size() + 1; i++) {
                    sheet.createRow(i);
                    for (int j = 0; j < 10; j++) {
                        sheet.getRow(i).createCell(j);
                        sheet.getRow(i).getCell(j).setCellStyle(bodyStyle);
                    }
                }

                for (int i = 0; i < list.size(); i++) {
                    SalesCommissionVO commissionVO = list.get(i);
                    sheet.getRow(i + 1).getCell(0).setCellValue(commissionVO.getCommNo());//返佣流水号
                    sheet.getRow(i + 1).getCell(1).setCellValue(new StringBuilder().append("每单返").append(commissionVO.getCommissionAmount()).append("元").toString());//返佣说明
                    sheet.getRow(i + 1).getCell(2).setCellValue(commissionVO.getOrderNo());//订单编号
                    sheet.getRow(i + 1).getCell(3).setCellValue(DateUtil.dateToString(commissionVO.getOrderCreateAt()));//订单时间
                    sheet.getRow(i + 1).getCell(4).setCellValue(commissionVO.getOrderAmount() != null ? commissionVO.getOrderAmount().toString() : "0");//订单金额
                    sheet.getRow(i + 1).getCell(5).setCellValue(this.convertGuideType(commissionVO.getGuideType()));//角色类型
                    sheet.getRow(i + 1).getCell(6).setCellValue(commissionVO.getInvitePhone());//推荐人账号
                    sheet.getRow(i + 1).getCell(7).setCellValue(commissionVO.getCommissionAmount() != null ? commissionVO.getCommissionAmount().toString() : "0");//返佣金额
                    sheet.getRow(i + 1).getCell(8).setCellValue(this.convertStatus(commissionVO.getStatus()));//审核状态
                    sheet.getRow(i + 1).getCell(9).setCellValue(commissionVO.getReason());//未通过原因
                }
            }
            String outFile = "首单返佣_" + DateUtil.getCurrentDateYYYYMMDD() + ".xlsx";
            ExcelUtil.exportExcel(response, wb, outFile);
            LOGGER.info("导出首单返佣报表结束");
        } catch (Exception e){
            e.printStackTrace();
            LOGGER.error("导出首单返佣报表异常",e);
        }
    }

    private String convertGuideType(Integer guideType) {
        String result = "";
        if (guideType != null){
            if(guideType == 1){
                result = "导购";
            }else if(guideType == 2){
                result = "买手";
            }
        }
        return result;
    }

    private String convertRegisterType(Integer registerType) {
        String result = "";
        if (registerType != null){
            switch (registerType) {
                case  1 : result="容易逛";break;
                case  2 : result="摩店买手";break;
                case  3 : result="摩店导购";break;
                case  4 : result="摩店全部";break;
                default : result="";break;
            }
        }
        return result;
    }

    private String convertStatus(Byte status) {
        String result = null;
        if (status != null)
            switch (status) {
                case -1 : result="客服审核不通过";break;
                case -2 : result="财务审核不通过";break;
                case  1 : result="客服待审核";break;
                case  2 : result="财务待审核";break;
                case  3 : result="财务审核通过";break;
                case  5 : result="当日返佣超出限制";break;
                case  6 : result="佣金已到账";break;
                default : result="";break;
            }
        return result;
    }
}
