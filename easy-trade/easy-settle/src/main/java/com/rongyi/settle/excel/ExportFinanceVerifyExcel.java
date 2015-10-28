/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月27日下午5:17:58
 * @Description: TODO
 *
 **/

package com.rongyi.settle.excel;

import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
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
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.service.PaymentStatementService;

/**
 * @Author: 柯军
 * @Description: 财务审核报表导出
 * @datetime:2015年10月8日下午4:36:48
 * 
 **/
@Component
public class ExportFinanceVerifyExcel extends ExportBase {

	@Autowired
	PaymentStatementService paymentStatementService;

	public void exportExcel(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		try {
			List<Byte> statusList = new ArrayList<Byte>();
			statusList.add( ConstantEnum.STATUS_0.getCodeByte());
			map.put("statusList",statusList);
			String path = request.getSession().getServletContext().getRealPath("/");
			InputStream myxls = new FileInputStream(path + "excel/financeVerifyExcel.xlsx");
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
				for (int j = 0; j <= 11; j++) {
					sheet.getRow(i).createCell(j);
					sheet.getRow(i).getCell(j).setCellStyle(bodyStyle);
				}
			}
			PaymentStatementDto paymentStatementDto = new PaymentStatementDto();
			for (int i = 0; i < statementList.size(); i++) {
				paymentStatementDto = statementList.get(i);
				sheet.getRow(i + 2).getCell(0).setCellValue(paymentStatementDto.getBatchNo());
				sheet.getRow(i + 2).getCell(1).setCellValue(getBizType(paymentStatementDto.getBussinessType()));
				sheet.getRow(i + 2).getCell(2).setCellValue(DateUtil.dateToString(paymentStatementDto.getCycleStartTime()) + " - " + DateUtil.dateToString(paymentStatementDto.getCycleEndTime()));
				sheet.getRow(i + 2).getCell(3).setCellValue(paymentStatementDto.getBussinessName());
				sheet.getRow(i + 2).getCell(4).setCellValue(getPayChannel(paymentStatementDto.getPayChannel()));
				sheet.getRow(i + 2).getCell(5).setCellValue(paymentStatementDto.getBlankName());
				sheet.getRow(i + 2).getCell(6).setCellValue(paymentStatementDto.getPayAccount());
				sheet.getRow(i + 2).getCell(7).setCellValue(paymentStatementDto.getPayName());
				if (paymentStatementDto.getPayTotal() != null){
					BigDecimal totalFee = new BigDecimal(paymentStatementDto.getPayTotal() + "").divide(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP);
					sheet.getRow(i + 2).getCell(8).setCellValue(totalFee.toString());
				}
				sheet.getRow(i + 2).getCell(9).setCellValue(paymentStatementDto.getBussinessEmail());
				sheet.getRow(i + 2).getCell(10).setCellValue(DateUtil.dateToString(paymentStatementDto.getCreateAt()));
				sheet.getRow(i + 2).getCell(11).setCellValue("初始状态");
			}
			String outFile = "对账审核记录_财务_" + DateUtil.getCurrentDateYYYYMMDD() + ".xlsx";
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

	private String getBizType(Byte bizType) {
		if (ConstantEnum.BIZ_TYPE0.getCodeByte().equals(bizType))
			return ConstantEnum.BIZ_TYPE0.getValueStr();
		else if (ConstantEnum.BIZ_TYPE1.getCodeByte().equals(bizType))
			return ConstantEnum.BIZ_TYPE1.getValueStr();
		else if (ConstantEnum.BIZ_TYPE2.getCodeByte().equals(bizType))
			return ConstantEnum.BIZ_TYPE2.getValueStr();
		else if (ConstantEnum.BIZ_TYPE3.getCodeByte().equals(bizType))
			return ConstantEnum.BIZ_TYPE3.getValueStr();
		return ConstantEnum.BIZ_TYPE4.getValueStr();
	}
}
