/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月27日下午5:17:58
 * @Description: TODO
 *
 **/

package com.rongyi.tms.excel;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.ExcelUtil;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.TradeDetailService;

/**
 * @Author: 柯军
 * @Description: 导出交易明细
 * @datetime:2015年5月27日下午5:17:58
 * 
 **/
@Component
public class ExportTradeDetailExcel {

    @Autowired
    TradeDetailService tradeDetailService;

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

    public void exportExcel(HttpServletRequest request, HttpServletResponse response) {
        try {
            Map<String, Object> map = getParamMap(request);
            String path = request.getSession().getServletContext().getRealPath("/");
            InputStream myxls = new FileInputStream(path + "excel/TradeDetailExcel.xlsx");
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
            List<TradeVO> tradeList = tradeDetailService.selectTradePageList(map, null, null);
            for (int i = 2; i <= tradeList.size() + 2; i++) {
                sheet.createRow(i);
                for (int j = 0; j <= 17; j++) {
                    sheet.getRow(i).createCell(j);
                    sheet.getRow(i).getCell(j).setCellStyle(bodyStyle);
                }
            }
            TradeVO tradeVO = new TradeVO();
            for (int i = 0; i < tradeList.size(); i++) {
                tradeVO = tradeList.get(i);
                sheet.getRow(i + 2).getCell(0).setCellValue(tradeVO.getTradeNo());
                sheet.getRow(i + 2).getCell(1).setCellValue(DateUtil.dateToString(tradeVO.getTradeTime()));
                sheet.getRow(i + 2).getCell(2).setCellValue((tradeVO.getTradeType() != null && tradeVO.getTradeType() == 0) ? "收入" : "支出");
                sheet.getRow(i + 2).getCell(3).setCellValue(getPayChannel(tradeVO.getPayChannel()));
                sheet.getRow(i + 2).getCell(4).setCellValue(tradeVO.getMallName());
                sheet.getRow(i + 2).getCell(5).setCellValue(tradeVO.getShopName());
                sheet.getRow(i + 2).getCell(6).setCellValue(tradeVO.getOrderNo());
                sheet.getRow(i + 2).getCell(7).setCellValue(DateUtil.dateToString(tradeVO.getOrderTime()));
                //TODO 买家账号需从mongo中单独查询
                sheet.getRow(i + 2).getCell(8).setCellValue(tradeVO.getBuyerAccount());
                sheet.getRow(i + 2).getCell(9).setCellValue(tradeVO.getBuyerName());
                sheet.getRow(i + 2).getCell(10).setCellValue(tradeVO.getSellerAccount());
                sheet.getRow(i + 2).getCell(11).setCellValue(tradeVO.getSellerName());
                if(ConstantEnum.USER_ACCOUNT_TYPE_ZHIFUBAO.getCodeInt().equals(tradeVO.getSellerPayType())){
                    sheet.getRow(i + 2).getCell(12).setCellValue(tradeVO.getSellerPayAccount());// 支付宝账号
                    sheet.getRow(i + 2).getCell(13).setCellValue(tradeVO.getSellerPayName());//支付宝姓名
                }else if(ConstantEnum.USER_ACCOUNT_TYPE_YINLIAN.getCodeInt().equals(tradeVO.getSellerPayType())){
                    sheet.getRow(i + 2).getCell(14).setCellValue("");// TODO 银行卡开户行，暂无
                    sheet.getRow(i + 2).getCell(15).setCellValue(tradeVO.getSellerPayAccount());// 银行卡号
                    sheet.getRow(i + 2).getCell(16).setCellValue(tradeVO.getSellerPayName());//持卡人姓名
                }
                if (tradeVO.getOrderPrice() != null)
                    sheet.getRow(i + 2).getCell(17).setCellValue(tradeVO.getOrderPrice().toString());
            }
            String outFile = "交易明细记录_"+DateUtil.getCurrentDateYYYYMMDD()+".xlsx";
            ExcelUtil.exportExcel(response, wb, outFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description: 付款方式
     * @param payChannel
     * @return
     * @Author: 柯军
     * @datetime:2015年5月27日下午7:36:22
     **/
    private String getPayChannel(Integer payChannel) {
        if (ConstantEnum.PAY_CHANNEL_ZHIFUBAO.getCodeInt().equals(payChannel))
            return ConstantEnum.PAY_CHANNEL_ZHIFUBAO.getValueStr();
        else if (ConstantEnum.PAY_CHANNEL_WEIXIN.getCodeInt().equals(payChannel))
            return ConstantEnum.PAY_CHANNEL_WEIXIN.getValueStr();
        return ConstantEnum.PAY_CHANNEL_YINLIAN.getValueStr();
    }
}
