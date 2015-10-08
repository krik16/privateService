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
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.ExcelUtil;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.PaymentStatementService;

/**
 * @Author: 柯军
 * @Description: 导出结算明细
 * @datetime:2015年10月8日下午4:36:48
 * 
 **/
@Component
public class ExportStatementDetailExcel extends ExportBase {

	@Autowired
	PaymentStatementService paymentStatementService;

	public void exportExcel(HttpServletRequest request, HttpServletResponse response) {
		try {
			Map<String, Object> map = getParamMap(request);
			map.put("status", ConstantEnum.STATEMENT_STATUE_12.getCodeByte());
			if(map.get("minTotalPrice") != null && !StringUtils.isEmpty(map.get("minTotalPrice").toString()))
			map.put("minTotalPrice",Double.valueOf(map.get("minTotalPrice").toString())*100);
			if(map.get("maxTotalPrice") != null && !StringUtils.isEmpty(map.get("maxTotalPrice").toString()))
				map.put("maxTotalPrice",Double.valueOf(map.get("maxTotalPrice").toString())*100);
			String path = request.getSession().getServletContext().getRealPath("/");
			InputStream myxls = new FileInputStream(path + "excel/statementDetailExcel.xlsx");
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
			List<PaymentStatementDto> statementList = paymentStatementService.selectPageList(map, null, null);
			for (int i = 2; i <= statementList.size() + 2; i++) {
				sheet.createRow(i);
				for (int j = 0; j <= 8; j++) {
					sheet.getRow(i).createCell(j);
					sheet.getRow(i).getCell(j).setCellStyle(bodyStyle);
				}
			}
			PaymentStatementDto paymentStatementDto = new PaymentStatementDto();
			for (int i = 0; i < statementList.size(); i++) {
				paymentStatementDto = statementList.get(i);
				sheet.getRow(i + 2).getCell(0).setCellValue(paymentStatementDto.getBatchNo());
				sheet.getRow(i + 2).getCell(1).setCellValue(paymentStatementDto.getPayNo());
				sheet.getRow(i + 2).getCell(2).setCellValue(paymentStatementDto.getTradeNo());
				sheet.getRow(i + 2).getCell(3).setCellValue(paymentStatementDto.getBussinessName());
				sheet.getRow(i + 2).getCell(4).setCellValue(paymentStatementDto.getPayAccount());
				sheet.getRow(i + 2).getCell(5).setCellValue(paymentStatementDto.getPayName());
				sheet.getRow(i + 2).getCell(6).setCellValue(getPayChannel(paymentStatementDto.getPayChannel()));
				sheet.getRow(i + 2).getCell(7).setCellValue(paymentStatementDto.getPayTotal()/100);
				sheet.getRow(i + 2).getCell(8).setCellValue(DateUtil.dateToString(paymentStatementDto.getPayTime()));
			}
			String outFile = "结算明细记录_" + DateUtil.getCurrentDateYYYYMMDD() + ".xlsx";
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
	private String getPayChannel(Byte payChannel) {
		if (ConstantEnum.PAY_CHANNEL_ZHIFUBAO.getCodeByte().equals(payChannel))
			return ConstantEnum.PAY_CHANNEL_ZHIFUBAO.getValueStr();
		else if (ConstantEnum.PAY_CHANNEL_WEIXIN.getCodeByte().equals(payChannel))
			return ConstantEnum.PAY_CHANNEL_WEIXIN.getValueStr();
		else if (ConstantEnum.PAY_CHANNEL_WEIXIN.getCodeByte().equals(payChannel))
			return ConstantEnum.PAY_CHANNEL_WEIXIN.getValueStr();
		else if (ConstantEnum.PAY_CHANNEL_CASH.getCodeByte().equals(payChannel))
			return ConstantEnum.PAY_CHANNEL_CASH.getValueStr();
		return ConstantEnum.PAY_CHANNEL_TRANSFER.getValueStr();
	}
}
