package com.rongyi.settle.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.StringUtils;

import com.rongyi.settle.dto.CouponCodeExcelDto;
import com.rongyi.settle.dto.CouponExcelDto;
import com.rongyi.settle.dto.PaymentStatementExcelDto;

/**
 * Created by xgq on 2015/9/29.
 */
public class ExcelUtils {

	public static void write(String templateFile, String targetFilePath, String targetFileName, PaymentStatementExcelDto excelDto) throws Exception {
		String pathname = templateFile;
		String pathname2 = targetFilePath + targetFileName;
		InputStream in = new FileInputStream(new File(pathname));
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
		XSSFCell mallName = row6.getCell(6);
		mallName.setCellValue(excelDto.getMallName());

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

		XSSFRow row12 = sheet.getRow(12);
		XSSFCell payTotal = row12.getCell(4);
		payTotal.setCellValue(AmountUtil.changFenToYuan(excelDto.getPayTotal().intValue()));

		XSSFRow row27 = sheet.getRow(27);
		XSSFCell total = row27.getCell(10);
		total.setCellValue(AmountUtil.changFenToYuan(excelDto.getPayTotal().intValue()));

		XSSFCell rongyiDiscount = row12.getCell(10);
		rongyiDiscount.setCellValue(AmountUtil.changFenToYuan(excelDto.getRongyiDiscount().intValue()));

		for (int i = 0; i < excelDto.getCouponExcelDtoList().size(); i++) {
			CouponExcelDto couponExcelDto = excelDto.getCouponExcelDtoList().get(i);
			XSSFRow row15 = sheet.getRow(15 + i);
			XSSFCell couponName = row15.getCell(1);
			couponName.setCellValue(couponExcelDto.getCouponName());

			XSSFCell revenueType = row15.getCell(3);
			revenueType.setCellValue(couponExcelDto.getRevenueType());

			XSSFCell couponCount = row15.getCell(5);
			couponCount.setCellValue(couponExcelDto.getCouponCount());

			XSSFCell origPrice = row15.getCell(7);
			origPrice.setCellValue(couponExcelDto.getCouponPrice() == null ? 0 : AmountUtil.changFenToYuan(couponExcelDto.getCouponPrice().intValue()));

			XSSFCell discount = row15.getCell(9);
			if (couponExcelDto.getCouponTotalAmount() != null && couponExcelDto.getCouponPayAmount() != null) {
				Double discountValue = couponExcelDto.getCouponTotalAmount() - couponExcelDto.getCouponPayAmount();
				discount.setCellValue(AmountUtil.changFenToYuan(discountValue.intValue()));
			} else
				discount.setCellValue(0);

			XSSFCell totalAmount = row15.getCell(11);
			totalAmount.setCellValue(couponExcelDto.getCouponTotalAmount() == null ? 0 : AmountUtil.changFenToYuan(couponExcelDto.getCouponTotalAmount().intValue()));
		}

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

		FileOutputStream out = new FileOutputStream(pathname2);
		work.write(out);
		out.close();
	}

	private static String encryptPhone(String phone) {
		return StringUtils.isEmpty(phone) ? "" : phone.substring(0, 3) + "****" + phone.substring(7, phone.length());
	}

}
