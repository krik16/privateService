package com.rongyi.settle.util;

import com.rongyi.settle.dto.CouponCodeExcelDto;
import com.rongyi.settle.dto.CouponExcelDto;
import com.rongyi.settle.dto.PaymentStatementExcelDto;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xgq on 2015/9/29.
 */
public class ExcelUtils {

    public static void write(String templateFile, String targetFilePath, String targetFileName, PaymentStatementExcelDto excelDto) {
        try {
            String pathname = templateFile;
            String pathname2 = targetFilePath + targetFileName;
            InputStream in = new FileInputStream(new File(pathname));
            XSSFWorkbook work = new XSSFWorkbook(in);
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
            payTotal.setCellValue(excelDto.getPayTotal());

            XSSFRow row27 = sheet.getRow(27);
            XSSFCell total = row27.getCell(10);
            total.setCellValue(excelDto.getPayTotal());

            XSSFCell rongyiDiscount = row12.getCell(10);
            rongyiDiscount.setCellValue(excelDto.getRongyiDiscount());

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
                origPrice.setCellValue(couponExcelDto.getCouponPrice());

                XSSFCell discount = row15.getCell(9);
                discount.setCellValue(couponExcelDto.getCouponTotalAmount() - couponExcelDto.getCouponPayAmount());

                XSSFCell totalAmount = row15.getCell(11);
                totalAmount.setCellValue(couponExcelDto.getCouponTotalAmount());
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
                buyerPhone.setCellValue(couponCodeExcelDto.getBuyerPhone());

                XSSFCell guidePhone = row15.createCell(14);
                guidePhone.setCellValue(couponCodeExcelDto.getGuidePhone());

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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PaymentStatementExcelDto excelDto = new PaymentStatementExcelDto();
        excelDto.setBatchNo("55552015092901");
        excelDto.setShopName("阿迪达斯");
        excelDto.setCycleTime("2015-09-28 00:00:00 - 2015-09-28 23:59:59");
        excelDto.setMallName("大宁国际");
        excelDto.setShopAccountName("大牛网");
        excelDto.setShopAccountNo("13245673645");
        excelDto.setShopBank("建设银行上海徐家汇支行");
        excelDto.setPayChannel("支付宝");
        excelDto.setPayTotal(new Double(2334.44));
        excelDto.setRongyiDiscount(new Double(232.44));

        List<CouponExcelDto> couponExcelDtoList = new ArrayList<>();
        CouponExcelDto couponExcelDto1 = new CouponExcelDto();
        couponExcelDto1.setCouponCount(5);
        couponExcelDto1.setCouponName("七十抵扣一百元");
        couponExcelDto1.setRevenueType("收入");
        couponExcelDto1.setCouponPrice(new Double(100));
        couponExcelDto1.setCouponTotalAmount(new Double(500));
        couponExcelDto1.setCouponPayAmount(new Double(20.33));
        couponExcelDtoList.add(couponExcelDto1);
        CouponExcelDto couponExcelDto2 = new CouponExcelDto();
        couponExcelDto2.setCouponCount(2);
        couponExcelDto2.setCouponName("四十抵扣五十元");
        couponExcelDto2.setRevenueType("收入");
        couponExcelDto2.setCouponPrice(new Double(50));
        couponExcelDto2.setCouponTotalAmount(new Double(100));
        couponExcelDto2.setCouponPayAmount(new Double(58.55));
        couponExcelDtoList.add(couponExcelDto2);
        excelDto.setCouponExcelDtoList(couponExcelDtoList);

        List<CouponCodeExcelDto> couponCodeExcelDtoList = new ArrayList<>();
        CouponCodeExcelDto couponCodeExcelDto = new CouponCodeExcelDto();
        couponCodeExcelDto.setOrderNo("39434793");
        couponCodeExcelDto.setPayNo("5678456784567");
        couponCodeExcelDto.setValidTime("2013-03-03 23:44:33");
        couponCodeExcelDto.setOrderTime("2013-12-12 23:33:22");
        couponCodeExcelDto.setCouponCode("2342324");
        couponCodeExcelDto.setCouponName("七十抵扣一百元");
        couponCodeExcelDto.setRevenueType("收入");
        couponCodeExcelDto.setPayChannel("支付宝");
        couponCodeExcelDto.setOrigPrice(new Double(100));
        couponCodeExcelDto.setDiscountAmount(new Double(40));
        couponCodeExcelDto.setPayAmount(new Double(20));
        couponCodeExcelDto.setHbAmount(new Double(10));
        couponCodeExcelDto.setBuyerPhone("13437363746");
        couponCodeExcelDto.setBuyerName("胜多负");
        couponCodeExcelDto.setGuidePhone("12337363736");
        couponCodeExcelDto.setGuideName("分隔符");
        couponCodeExcelDto.setMallName("美罗城");
        couponCodeExcelDto.setShopName("DQ");
        couponCodeExcelDtoList.add(couponCodeExcelDto);
        CouponCodeExcelDto couponCodeExcelDto2 = new CouponCodeExcelDto();
        couponCodeExcelDto2.setOrderNo("139434793");
        couponCodeExcelDto2.setPayNo("56718456784567");
        couponCodeExcelDto2.setValidTime("2015-03-03 23:44:33");
        couponCodeExcelDto2.setOrderTime("2015-12-12 23:33:22");
        couponCodeExcelDto2.setCouponCode("234432324");
        couponCodeExcelDto2.setCouponName("七十抵扣一百元111");
        couponCodeExcelDto2.setRevenueType("收入");
        couponCodeExcelDto2.setPayChannel("微信");
        couponCodeExcelDto2.setOrigPrice(new Double(200));
        couponCodeExcelDto2.setDiscountAmount(new Double(100));
        couponCodeExcelDto2.setPayAmount(new Double(30));
        couponCodeExcelDto2.setHbAmount(new Double(20));
        couponCodeExcelDto2.setBuyerPhone("13437363226");
        couponCodeExcelDto2.setBuyerName("胜多负1");
        couponCodeExcelDto2.setGuidePhone("12337363733");
        couponCodeExcelDto2.setGuideName("分隔符1");
        couponCodeExcelDto2.setMallName("美罗城1");
        couponCodeExcelDto2.setShopName("DQ1");
        couponCodeExcelDtoList.add(couponCodeExcelDto2);
        excelDto.setCouponCodeExcelDtoList(couponCodeExcelDtoList);
        write("c:\\test.xlsx", "c:\\", "test2.xlsx", excelDto);
    }
}
