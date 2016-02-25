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
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.service.PaymentStatementService;

import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.math.BigDecimal;
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
	private PaymentStatementService paymentStatementService;

//	@SuppressWarnings("unchecked")
//	public Map<String, Object> getParamMap(HttpServletRequest request) {
//		Map<String, Object> map = new HashMap<>();
//		try {
//			String paramsJson = new String(request.getParameter("paramsJson").getBytes("iso8859-1"), "UTF-8");
//			map = JsonUtil.getMapFromJson(paramsJson);
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		return map;
//	}

	/**
	 * 导出付款清单
	 * 
	 * @param request
	 * @param response
	 * @param
	 */
	public void exportPaymentScheduleExcel(HttpServletRequest request, HttpServletResponse response, String[] idArray) {
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("idArray", idArray);
			map.put("status", 6);
			List<PaymentStatementDto> payments = paymentStatementService.selectPageList(map, null, null);
			List<Integer> ids = new ArrayList<>();
			Set<String> businessIds = null;
			if (CollectionUtils.isNotEmpty(payments)) {
				businessIds = new HashSet<>();
				for (PaymentStatementDto dto : payments) {
					businessIds.add(dto.getBussinessId());
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
			// titleStyle.setFillBackgroundColor(Colour);

			bodyStyle.setFont(bodyFont);
			titleStyle.setWrapText(true);
			bodyStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);// 指定单元格居中对齐
			bodyStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐

			List<List<PaymentStatementDto>> parentsDtoList = new ArrayList<>();
			if (businessIds!=null && CollectionUtils.isNotEmpty(businessIds)) {
				for (String businessId : businessIds) {
					List<PaymentStatementDto> sonDtoList = new ArrayList<>();
					for (PaymentStatementDto p : payments) {
						if (businessId != null && businessId.equals(p.getBussinessId())) {
							//已下载的不允许重复下载
							if (p.getStatus().equals(ConstantEnum.STATUS_11.getCodeByte())) {
								XSSFSheet sheet = wb.createSheet(sonDtoList.get(0).getBussinessName() + "-" + System.currentTimeMillis());
								sheet.createRow(0);
								sheet.getRow(0).createCell(0);
								sheet.getRow(0).getCell(0).setCellValue("存在重复下载数据，请刷新页面后再操作。");
								String outFile = "付款清单_" + DateUtil.getCurrentDateYYYYMMDD() + ".xlsx";
								ExcelUtil.exportExcel(response, wb, outFile);
								return;
							}
							sonDtoList.add(p);
						}
					}
					parentsDtoList.add(sonDtoList);
				}
			}

			if (CollectionUtils.isNotEmpty(parentsDtoList)) {
				for (List<PaymentStatementDto> sonDtoList : parentsDtoList) {
					XSSFSheet sheet = wb.createSheet(sonDtoList.get(0).getBussinessName() + "-" + System.currentTimeMillis());
					for (int i = 0; i <= sonDtoList.size(); i++) {
						sheet.createRow(i);
						for (int j = 0; j <= 10; j++) {
							sheet.getRow(i).createCell(j);
							if (i == 0)
								sheet.getRow(i).getCell(j).setCellStyle(titleStyle);
							else
								sheet.getRow(i).getCell(j).setCellStyle(bodyStyle);
						}
					}
					PaymentStatementDto dto;
					for (int i = 0; i < sonDtoList.size() + 1; i++) {
						if (i == 0) {
							sheet.getRow(i).getCell(0).setCellValue("对账单批次");
							sheet.getRow(i).getCell(1).setCellValue("商户类型");
							sheet.getRow(i).getCell(2).setCellValue("对账单周期");
							sheet.getRow(i).getCell(3).setCellValue("名称");
							sheet.getRow(i).getCell(4).setCellValue("结算方式");
							sheet.getRow(i).getCell(5).setCellValue("账户");
							sheet.getRow(i).getCell(6).setCellValue("账户姓名");
							sheet.getRow(i).getCell(7).setCellValue("开户行名称");
							sheet.getRow(i).getCell(8).setCellValue("应付总金额");
							sheet.getRow(i).getCell(9).setCellValue("对账单状态");
						} else {
							dto = sonDtoList.get(i - 1);
							ids.add(dto.getId());
							sheet.getRow(i).getCell(0).setCellValue(dto.getBatchNo());
							String businessType = "";
							switch (dto.getBussinessType()) {
							case 0:
								businessType = "店铺";
								break;
							case 1:
								businessType = "商场";
								break;
							case 2:
								businessType = "品牌";
								break;
							case 3:
								businessType = "分公司";
								break;
							case 4:
								businessType = "集团公司";
								break;
							}
							sheet.getRow(i).getCell(1).setCellValue(businessType);
							sheet.getRow(i).getCell(2)
									.setCellValue(DateTool.date2String(dto.getCycleStartTime(), DateTool.FORMAT_DATE_2) + "-" + DateTool.date2String(dto.getCycleEndTime(), DateTool.FORMAT_DATE_2));
							sheet.getRow(i).getCell(3).setCellValue(dto.getBussinessName());
							sheet.getRow(i).getCell(4).setCellValue(convertPayChannel(dto.getPayChannel()));
							sheet.getRow(i).getCell(5).setCellValue(dto.getPayAccount());
							sheet.getRow(i).getCell(6).setCellValue(dto.getPayName());
							sheet.getRow(i).getCell(7).setCellValue(dto.getBlankName());
							if (dto.getPayTotal() != null){
								BigDecimal totalFee = new BigDecimal(dto.getPayTotal() + "").divide(new BigDecimal(100), 2, 4);
								sheet.getRow(i).getCell(8).setCellValue(totalFee.toString());
							}
							sheet.getRow(i).getCell(9).setCellValue("已下载");
						}
					}
					//更改付款单状态，记录操作日志
					String userName = request.getSession().getAttribute("userName") != null ? request.getSession().getAttribute("userName").toString() : null;
					paymentStatementService.updatePaymentStatusByIds(ids,11, "下载对账单", userName);
				}
				String outFile = "付款清单_" + DateUtil.getCurrentDateYYYYMMDD() + ".xlsx";
				ExcelUtil.exportExcel(response, wb, outFile);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String convertPayChannel(Byte payChannel) {
		String result = "";
		if (payChannel != null) {
			switch (payChannel){
                case 3: result=ConstantEnum.PAY_CHANNEL_CASH.getValueStr(); break;
                case 4: result=ConstantEnum.PAY_CHANNEL_TRANSFER.getValueStr(); break;
            }
		}
		return result;
	}
}
