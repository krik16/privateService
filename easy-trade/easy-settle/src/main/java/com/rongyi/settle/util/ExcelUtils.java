package com.rongyi.settle.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.DecimalFormat;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.StringUtils;

import com.rongyi.settle.constants.SettleConstant;
import com.rongyi.settle.dto.CouponCodeExcelDto;
import com.rongyi.settle.dto.CouponExcelDto;
import com.rongyi.settle.dto.OrderSettlementDetailVO;
import com.rongyi.settle.dto.OrderSettlementTopDto;
import com.rongyi.settle.dto.PaymentStatementExcelDto;

/**
 * Created by xgq on 2015/9/29.
 */
public class ExcelUtils {

	public static void write(String templateFile, String targetFilePath, String folder, String targetFileName, PaymentStatementExcelDto excelDto) throws Exception {
		String pathname = templateFile;
		String fileFolder = targetFilePath + folder;
		String pathname2 = fileFolder + "/" + targetFileName;
		InputStream in = new FileInputStream(new File(pathname));
		DecimalFormat df = new DecimalFormat("#.00");
		XSSFWorkbook work = new XSSFWorkbook(in);
		in.close();
		XSSFSheet sheet = work.getSheetAt(0);
		XSSFRow row3 = sheet.getRow(3);
		XSSFCell batchNo = row3.getCell(6);
		batchNo.setCellValue(excelDto.getBatchNo());

		XSSFRow row4 = sheet.getRow(4);
		XSSFCell shopName = row4.getCell(6);
		shopName.setCellValue(excelDto.getShopName());

		XSSFRow row5 = sheet.getRow(5);
		XSSFCell cycleTime = row5.getCell(6);
		cycleTime.setCellValue(excelDto.getCycleTime());

		XSSFRow row6 = sheet.getRow(6);
		XSSFCell unitName = row6.getCell(6);
		unitName.setCellValue(excelDto.getMallName());
		if (excelDto.getUnitType().equals(SettleConstant.BussinessType.BRAND)) {
			XSSFCell unitTitle = row6.getCell(5);
			unitTitle.setCellValue("品牌：");
		} else if (excelDto.getUnitType().equals(SettleConstant.BussinessType.BRANCH)) {
			XSSFCell unitTitle = row6.getCell(5);
			unitTitle.setCellValue("分公司：");
		} else if (excelDto.getUnitType().equals(SettleConstant.BussinessType.GROUP)) {
			XSSFCell unitTitle = row6.getCell(5);
			unitTitle.setCellValue("集团公司：");
		}

		XSSFRow row8 = sheet.getRow(8);
		XSSFCell shopAccountName = row8.getCell(6);
		String shopAccountNameBegin = shopAccountName.getStringCellValue();
		shopAccountName.setCellValue(shopAccountNameBegin + excelDto.getShopAccountName());

		XSSFRow row9 = sheet.getRow(9);
		XSSFCell shopAccountNo = row9.getCell(6);
		String shopAccountNoBegin = shopAccountNo.getStringCellValue();
		shopAccountNo.setCellValue(shopAccountNoBegin + excelDto.getShopAccountNo());

		XSSFRow row10 = sheet.getRow(10);
		XSSFCell shopBank = row10.getCell(6);
		String shopBankBegin = shopBank.getStringCellValue();
		shopBank.setCellValue(shopBankBegin + excelDto.getShopBank());

		XSSFRow row11 = sheet.getRow(11);
		XSSFCell payChannel = row11.getCell(6);
		String payChannelBegin = payChannel.getStringCellValue();
		payChannel.setCellValue(payChannelBegin + excelDto.getPayChannel());

		int couponCountSum = 0;
		double couponHbSum = 0;
		double couponScoreSum = 0;
		double couponDiscountSum = 0;
		double couponPriceSum = 0;

		int orderCountSum = 0;
		double orderHbSum = 0;
		double orderScoreSum = 0;
		double orderDiscountSum = 0;
		double orderPriceSum = 0;

		// 券汇总数据
		for (int i = 0; i < excelDto.getCouponExcelDtoList().size(); i++) {
			CouponExcelDto couponExcelDto = excelDto.getCouponExcelDtoList().get(i);
			XSSFRow row15 = sheet.getRow(15 + i);
			XSSFCell couponName = row15.getCell(1);
			couponName.setCellValue(couponExcelDto.getCouponName());

			XSSFCell revenueType = row15.getCell(3);
			revenueType.setCellValue(couponExcelDto.getRevenueType());

			XSSFCell couponCount = row15.getCell(4);
			couponCount.setCellValue(couponExcelDto.getCouponCount());
			couponCountSum += couponExcelDto.getCouponCount();

			XSSFCell hbPrice = row15.getCell(6);
			hbPrice.setCellValue(df.format(AmountUtil.changFenToYuan(couponExcelDto.getCouponHbTotal())));
			couponHbSum += AmountUtil.changFenToYuan(couponExcelDto.getCouponHbTotal());

			XSSFCell scorePrice = row15.getCell(8);
			scorePrice.setCellValue(df.format(AmountUtil.changFenToYuan(couponExcelDto.getCouponScoreTotal())));
			couponScoreSum += AmountUtil.changFenToYuan(couponExcelDto.getCouponScoreTotal());

			XSSFCell disCountPrice = row15.getCell(10);
			disCountPrice.setCellValue(df.format(AmountUtil.changFenToYuan(couponExcelDto.getCouponDiscountTotal())));
			couponDiscountSum += AmountUtil.changFenToYuan(couponExcelDto.getCouponDiscountTotal());

			XSSFCell totalPrice = row15.getCell(12);
			totalPrice.setCellValue(df.format(AmountUtil.changFenToYuan(couponExcelDto.getCouponPriceTotal())));
			couponPriceSum += AmountUtil.changFenToYuan(couponExcelDto.getCouponPriceTotal());
		}
		// 券小计
		XSSFRow row24 = sheet.getRow(24);
		XSSFCell couponCountSumCell = row24.getCell(4);
		couponCountSumCell.setCellValue(couponCountSum);
		XSSFCell couponHbSumCell = row24.getCell(6);
		couponHbSumCell.setCellValue(couponHbSum);
		XSSFCell couponScoreSumCell = row24.getCell(8);
		couponScoreSumCell.setCellValue(couponScoreSum);
		XSSFCell couponDiscountSumCell = row24.getCell(10);
		couponDiscountSumCell.setCellValue(couponDiscountSum);
		XSSFCell couponPriceSumCell = row24.getCell(12);
		couponPriceSumCell.setCellValue(couponPriceSum);

		// 商品订单汇总数据
		for (int i = 0; i < excelDto.getOrderSettlementTopDtoList().size(); i++) {
			OrderSettlementTopDto orderTop = excelDto.getOrderSettlementTopDtoList().get(i);
			XSSFRow row26 = sheet.getRow(26 + i);
			XSSFCell orderType = row26.getCell(1);
			orderType.setCellValue(orderTop.getOrderType());

			XSSFCell revenueType = row26.getCell(3);
			revenueType.setCellValue(orderTop.getIncomeType());

			XSSFCell orderCount = row26.getCell(4);
			orderCount.setCellValue(orderTop.getOrderCount());
			orderCountSum += orderTop.getOrderCount() == null ? 0 : orderTop.getOrderCount();

			XSSFCell hbPrice = row26.getCell(6);
			hbPrice.setCellValue(df.format(orderTop.getHbDiscountTotal() == null ? 0 : orderTop.getHbDiscountTotal()));
			orderHbSum += orderTop.getHbDiscountTotal() == null ? 0 : orderTop.getHbDiscountTotal();

			XSSFCell scorePrice = row26.getCell(8);
			scorePrice.setCellValue(df.format(orderTop.getScoreDiscountTotal() == null ? 0 : orderTop.getScoreDiscountTotal()));
			orderScoreSum += orderTop.getScoreDiscountTotal() == null ? 0 : orderTop.getScoreDiscountTotal();

			XSSFCell disCountPrice = row26.getCell(10);
			disCountPrice.setCellValue(df.format(orderTop.getOrderDiscountTotal() == null ? 0 : orderTop.getOrderDiscountTotal()));
			orderDiscountSum += orderTop.getOrderDiscountTotal() == null ? 0 : orderTop.getOrderDiscountTotal();

			XSSFCell totalPrice = row26.getCell(12);
			totalPrice.setCellValue(df.format(orderTop.getOrderAmountTotal() == null ? 0 : orderTop.getOrderAmountTotal()));
			orderPriceSum += orderTop.getOrderAmountTotal() == null ? 0 : orderTop.getOrderAmountTotal();
		}
		// 商品小计
		XSSFRow row29 = sheet.getRow(29);
		XSSFCell orderCountSumCell = row29.getCell(4);
		orderCountSumCell.setCellValue(orderCountSum);
		XSSFCell orderHbSumCell = row29.getCell(6);
		orderHbSumCell.setCellValue(orderHbSum);
		XSSFCell orderScoreSumCell = row29.getCell(8);
		orderScoreSumCell.setCellValue(orderScoreSum);
		XSSFCell orderDiscountSumCell = row29.getCell(10);
		orderDiscountSumCell.setCellValue(orderDiscountSum);
		XSSFCell orderPriceSumCell = row29.getCell(12);
		orderPriceSumCell.setCellValue(orderPriceSum);

		// 合计
		XSSFRow row30 = sheet.getRow(30);
		XSSFCell hbSumCell = row30.getCell(6);
		hbSumCell.setCellValue(orderHbSum + couponHbSum);
		XSSFCell scoreSumCell = row30.getCell(8);
		scoreSumCell.setCellValue(orderScoreSum + couponScoreSum);
		XSSFCell discountSumCell = row30.getCell(10);
		discountSumCell.setCellValue(orderDiscountSum + couponDiscountSum);
		XSSFCell priceSumCell = row30.getCell(12);
		priceSumCell.setCellValue(orderPriceSum + couponPriceSum);

		// 总金额/总补贴
		XSSFRow row12 = sheet.getRow(12);
		XSSFCell totalPayCell = row12.getCell(4);
		totalPayCell.setCellValue(orderPriceSum + couponPriceSum);
		XSSFCell totalDiscountCell = row12.getCell(10);
		totalDiscountCell.setCellValue(orderHbSum + orderScoreSum + orderDiscountSum + couponHbSum + couponScoreSum + couponDiscountSum);

		// sheet1: 券明细数据
		XSSFSheet sheet1 = work.getSheetAt(1);
		for (int i = 0; i < excelDto.getCouponCodeExcelDtoList().size(); i++) {
			CouponCodeExcelDto couponCodeExcelDto = excelDto.getCouponCodeExcelDtoList().get(i);
			XSSFRow row15 = sheet1.createRow(1 + i);

			XSSFCell orderNo = row15.createCell(0);
			orderNo.setCellValue(couponCodeExcelDto.getOrderNo());

			XSSFCell payNo = row15.createCell(1);
			payNo.setCellValue(couponCodeExcelDto.getPayNo());

			XSSFCell validTime = row15.createCell(2);
			validTime.setCellValue(couponCodeExcelDto.getValidTime());

			XSSFCell orderTime = row15.createCell(3);
			orderTime.setCellValue(couponCodeExcelDto.getOrderTime());

			XSSFCell couponCode = row15.createCell(4);
			couponCode.setCellValue(couponCodeExcelDto.getCouponCode());

			XSSFCell couponName = row15.createCell(5);
			couponName.setCellValue(couponCodeExcelDto.getCouponName());

			XSSFCell revenueType = row15.createCell(6);
			revenueType.setCellValue(couponCodeExcelDto.getRevenueType());

			XSSFCell payChannelName = row15.createCell(7);
			payChannelName.setCellValue(couponCodeExcelDto.getPayChannel());

			XSSFCell couponPrice = row15.createCell(8);
			couponPrice.setCellValue(couponCodeExcelDto.getOrigPrice());

			XSSFCell unitPrice = row15.createCell(9);
			unitPrice.setCellValue(couponCodeExcelDto.getOrigPrice() - couponCodeExcelDto.getDiscountAmount());

			XSSFCell payAmount = row15.createCell(10);
			payAmount.setCellValue(couponCodeExcelDto.getPayAmount());

			XSSFCell hbDiscount = row15.createCell(11);
			hbDiscount.setCellValue(couponCodeExcelDto.getHbAmount());

			XSSFCell discount = row15.createCell(12);
			discount.setCellValue(couponCodeExcelDto.getDiscountAmount());

			XSSFCell buyerPhone = row15.createCell(13);
			buyerPhone.setCellValue(encryptPhone(couponCodeExcelDto.getBuyerPhone()));

			XSSFCell guidePhone = row15.createCell(14);
			guidePhone.setCellValue(encryptPhone(couponCodeExcelDto.getGuidePhone()));

			XSSFCell buyerName = row15.createCell(15);
			buyerName.setCellValue(couponCodeExcelDto.getBuyerName());

			XSSFCell guideName = row15.createCell(16);
			guideName.setCellValue(couponCodeExcelDto.getGuideName());

			XSSFCell mallNameStr = row15.createCell(17);
			mallNameStr.setCellValue(couponCodeExcelDto.getMallName());

			XSSFCell shopNameStr = row15.createCell(18);
			shopNameStr.setCellValue(couponCodeExcelDto.getShopName());
		}

		// sheet2: 商品订单明细数据
		XSSFSheet sheet2 = work.getSheetAt(2);
		for (int i = 0; i < excelDto.getOrderSettlementDetailVOList().size(); i++) {
			OrderSettlementDetailVO orderDetail = excelDto.getOrderSettlementDetailVOList().get(i);
			XSSFRow rowOrder = sheet2.createRow(1 + i);

			XSSFCell orderDate = rowOrder.createCell(0);
			orderDate.setCellValue(orderDetail.getCreateAt());

			XSSFCell orderStatus = rowOrder.createCell(1);
			orderStatus.setCellValue(orderDetail.getOrderStatus());

			XSSFCell orderNo = rowOrder.createCell(2);
			orderNo.setCellValue(orderDetail.getOrderNo());

			XSSFCell commodity = rowOrder.createCell(3);
			commodity.setCellValue(orderDetail.getCommodityName());

			XSSFCell mall = rowOrder.createCell(4);
			mall.setCellValue(orderDetail.getMallName());

			XSSFCell shop = rowOrder.createCell(5);
			shop.setCellValue(orderDetail.getShopName());

			XSSFCell price = rowOrder.createCell(6);
			price.setCellValue(orderDetail.getOrigPrice());

			XSSFCell pay = rowOrder.createCell(7);
			pay.setCellValue(orderDetail.getPayAmount());

			XSSFCell score = rowOrder.createCell(8);
			score.setCellValue(orderDetail.getScoreDiscount());

			XSSFCell hb = rowOrder.createCell(9);
			hb.setCellValue(orderDetail.getHbDiscount());

			XSSFCell channel = rowOrder.createCell(10);
			channel.setCellValue(orderDetail.getPaymentChannel());

			XSSFCell payTime = rowOrder.createCell(11);
			payTime.setCellValue(orderDetail.getPaymentTime());

			XSSFCell dlvTime = rowOrder.createCell(12);
			dlvTime.setCellValue(orderDetail.getDeliveryTime());

			XSSFCell rcptTime = rowOrder.createCell(13);
			rcptTime.setCellValue(orderDetail.getReceiptTime());

			XSSFCell phone = rowOrder.createCell(14);
			phone.setCellValue(encryptPhone(orderDetail.getBuyerPhone()));
		}

		File file = new File(fileFolder);
		if (!file.exists() && !file.isDirectory()) {
			file.mkdir();
		}
		FileOutputStream out = new FileOutputStream(pathname2);
		work.write(out);
		out.close();
	}

	private static String encryptPhone(String phone) {
		return StringUtils.isEmpty(phone) ? "" : phone.substring(0, 3) + "****" + phone.substring(7, phone.length());
	}

}
