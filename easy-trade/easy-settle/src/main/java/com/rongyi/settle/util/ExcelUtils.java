package com.rongyi.settle.util;

import com.rongyi.settle.constants.SettleConstant;
import com.rongyi.settle.dto.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.DecimalFormat;

/**
 * Created by xgq on 2015/9/29.
 * Modified by erliang on 2015/12/02
 */
public class ExcelUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelUtils.class);

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
        if (excelDto.getShopAccountName() != null) {
            shopAccountName.setCellValue(shopAccountNameBegin + excelDto.getShopAccountName());
        }

        XSSFRow row9 = sheet.getRow(9);
        XSSFCell shopAccountNo = row9.getCell(6);
        String shopAccountNoBegin = shopAccountNo.getStringCellValue();
        if (excelDto.getShopAccountNo() != null) {
            shopAccountNo.setCellValue(shopAccountNoBegin + excelDto.getShopAccountNo());
        }

        XSSFRow row10 = sheet.getRow(10);
        XSSFCell shopBank = row10.getCell(6);
        String shopBankBegin = shopBank.getStringCellValue();
        if (excelDto.getShopBank() != null) {
            shopBank.setCellValue(shopBankBegin + excelDto.getShopBank());
        }

        XSSFRow row11 = sheet.getRow(11);
        XSSFCell payChannel = row11.getCell(6);
        String payChannelBegin = payChannel.getStringCellValue();
        if (excelDto.getPayChannel() != null) {
            payChannel.setCellValue(payChannelBegin + excelDto.getPayChannel());
        }

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
        // 单元格向下延展的偏移量
        int offset = 0;

        // 券汇总数据
        for (int i = 0; i < excelDto.getCouponExcelDtoList().size(); i++) {
            offset++;
            CouponExcelDto couponExcelDto = excelDto.getCouponExcelDtoList().get(i);

            sheet.shiftRows(15 + i, sheet.getLastRowNum(), 1, true, false);
            XSSFRow row15 = sheet.createRow(15 + i);

            //在sheet里增加合并单元格
            sheet.addMergedRegion(new CellRangeAddress(15 + i, 15 + i, 4, 5));
            sheet.addMergedRegion(new CellRangeAddress(15 + i, 15 + i, 6, 7));
            sheet.addMergedRegion(new CellRangeAddress(15 + i, 15 + i, 8, 9));
            sheet.addMergedRegion(new CellRangeAddress(15 + i, 15 + i, 10, 11));
            sheet.addMergedRegion(new CellRangeAddress(15 + i, 15 + i, 12, 13));

            XSSFCell couponShopName = row15.createCell(1);
            couponShopName.setCellStyle(sheet.getRow(16 + i).getCell(1).getCellStyle());
            couponShopName.setCellValue(couponExcelDto.getShopName());

            XSSFCell couponName = row15.createCell(2);
            couponName.setCellStyle(sheet.getRow(16 + i).getCell(2).getCellStyle());
            couponName.setCellValue(couponExcelDto.getCouponName());

            XSSFCell revenueType = row15.createCell(3);
            revenueType.setCellStyle(sheet.getRow(16 + i).getCell(3).getCellStyle());
            revenueType.setCellValue(couponExcelDto.getRevenueType());

            XSSFCell couponCount = row15.createCell(4);
            couponCount.setCellStyle(sheet.getRow(16 + i).getCell(4).getCellStyle());
            row15.createCell(5).setCellStyle(sheet.getRow(16 + i).getCell(5).getCellStyle());
            couponCount.setCellValue(couponExcelDto.getCouponCount());
            couponCountSum += couponExcelDto.getCouponCount();

            XSSFCell hbPrice = row15.createCell(6);
            hbPrice.setCellStyle(sheet.getRow(16 + i).getCell(6).getCellStyle());
            row15.createCell(7).setCellStyle(sheet.getRow(16 + i).getCell(7).getCellStyle());
            hbPrice.setCellValue(AmountUtil.changFenToYuan(couponExcelDto.getCouponHbTotal()));
            couponHbSum += AmountUtil.changFenToYuan(couponExcelDto.getCouponHbTotal());

            XSSFCell scorePrice = row15.createCell(8);
            scorePrice.setCellStyle(sheet.getRow(16 + i).getCell(8).getCellStyle());
            row15.createCell(9).setCellStyle(sheet.getRow(16 + i).getCell(9).getCellStyle());
            scorePrice.setCellValue(AmountUtil.changFenToYuan(couponExcelDto.getCouponScoreTotal()));
            couponScoreSum += AmountUtil.changFenToYuan(couponExcelDto.getCouponScoreTotal());

            XSSFCell disCountPrice = row15.createCell(10);
            disCountPrice.setCellStyle(sheet.getRow(16 + i).getCell(10).getCellStyle());
            row15.createCell(11).setCellStyle(sheet.getRow(16 + i).getCell(11).getCellStyle());
            disCountPrice.setCellValue(AmountUtil.changFenToYuan(couponExcelDto.getCouponDiscountTotal()));
            couponDiscountSum += AmountUtil.changFenToYuan(couponExcelDto.getCouponDiscountTotal());

            XSSFCell totalPrice = row15.createCell(12);
            totalPrice.setCellStyle(sheet.getRow(16 + i).getCell(12).getCellStyle());
            row15.createCell(13).setCellStyle(sheet.getRow(16 + i).getCell(13).getCellStyle());
            totalPrice.setCellValue(AmountUtil.changFenToYuan(couponExcelDto.getCouponPriceTotal()));
            couponPriceSum += AmountUtil.changFenToYuan(couponExcelDto.getCouponPriceTotal());
        }

        // 券小计
        XSSFRow row16 = sheet.getRow(16 + offset);
        XSSFCell couponCountSumCell = row16.getCell(4);
        couponCountSumCell.setCellValue(couponCountSum);
        XSSFCell couponHbSumCell = row16.getCell(6);
        couponHbSumCell.setCellValue(couponHbSum);
        XSSFCell couponScoreSumCell = row16.getCell(8);
        couponScoreSumCell.setCellValue(couponScoreSum);
        XSSFCell couponDiscountSumCell = row16.getCell(10);
        couponDiscountSumCell.setCellValue(couponDiscountSum);
        XSSFCell couponPriceSumCell = row16.getCell(12);
        couponPriceSumCell.setCellValue(couponPriceSum);

        // 商品订单汇总数据
        int orderStartRow = 18 + offset;
        for (int i = 0; i < excelDto.getOrderSettlementTopDtoList().size(); i++) {
            offset++;
            OrderSettlementTopDto orderTop = excelDto.getOrderSettlementTopDtoList().get(i);

            sheet.shiftRows(orderStartRow + i, sheet.getLastRowNum(), 1, true, false);
            XSSFRow row18 = sheet.createRow(orderStartRow + i);

            //在sheet里增加合并单元格
            sheet.addMergedRegion(new CellRangeAddress(orderStartRow + i, orderStartRow + i, 4, 5));
            sheet.addMergedRegion(new CellRangeAddress(orderStartRow + i, orderStartRow + i, 6, 7));
            sheet.addMergedRegion(new CellRangeAddress(orderStartRow + i, orderStartRow + i, 8, 9));
            sheet.addMergedRegion(new CellRangeAddress(orderStartRow + i, orderStartRow + i, 10, 11));
            sheet.addMergedRegion(new CellRangeAddress(orderStartRow + i, orderStartRow + i, 12, 13));

            XSSFCell orderShopName = row18.createCell(1);
            orderShopName.setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(1).getCellStyle());
            orderShopName.setCellValue(orderTop.getShopName());

            XSSFCell orderType = row18.createCell(2);
            orderType.setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(2).getCellStyle());
            orderType.setCellValue(orderTop.getOrderType());

            XSSFCell incomeType = row18.createCell(3);
            incomeType.setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(3).getCellStyle());
            incomeType.setCellValue(orderTop.getIncomeType());

            XSSFCell orderCount = row18.createCell(4);
            orderCount.setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(4).getCellStyle());
            row18.createCell(5).setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(5).getCellStyle());
            orderCount.setCellValue(orderTop.getOrderCount());
            orderCountSum += orderTop.getOrderCount() == null ? 0 : orderTop.getOrderCount();

            XSSFCell hbPrice = row18.createCell(6);
            hbPrice.setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(6).getCellStyle());
            row18.createCell(7).setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(7).getCellStyle());
            hbPrice.setCellValue(orderTop.getHbDiscountTotal() == null ? 0 : orderTop.getHbDiscountTotal());
            orderHbSum += orderTop.getHbDiscountTotal() == null ? 0 : orderTop.getHbDiscountTotal();

            XSSFCell scorePrice = row18.createCell(8);
            scorePrice.setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(8).getCellStyle());
            row18.createCell(9).setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(9).getCellStyle());
            scorePrice.setCellValue(orderTop.getScoreDiscountTotal() == null ? 0 : orderTop.getScoreDiscountTotal());
            orderScoreSum += orderTop.getScoreDiscountTotal() == null ? 0 : orderTop.getScoreDiscountTotal();

            XSSFCell disCountPrice = row18.createCell(10);
            disCountPrice.setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(10).getCellStyle());
            row18.createCell(11).setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(11).getCellStyle());
            disCountPrice.setCellValue(orderTop.getOrderDiscountTotal() == null ? 0 : orderTop.getOrderDiscountTotal());
            orderDiscountSum += orderTop.getOrderDiscountTotal() == null ? 0 : orderTop.getOrderDiscountTotal();

            XSSFCell totalPrice = row18.createCell(12);
            totalPrice.setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(12).getCellStyle());
            row18.createCell(13).setCellStyle(sheet.getRow(orderStartRow + 1 + i).getCell(13).getCellStyle());
            totalPrice.setCellValue(orderTop.getOrderAmountTotal() == null ? 0 : orderTop.getOrderAmountTotal());
            orderPriceSum += orderTop.getOrderAmountTotal() == null ? 0 : orderTop.getOrderAmountTotal();
        }

        // 商品小计
        XSSFRow row19 = sheet.getRow(19 + offset);
        XSSFCell orderCountSumCell = row19.getCell(4);
        orderCountSumCell.setCellValue(orderCountSum);
        XSSFCell orderHbSumCell = row19.getCell(6);
        orderHbSumCell.setCellValue(orderHbSum);
        XSSFCell orderScoreSumCell = row19.getCell(8);
        orderScoreSumCell.setCellValue(orderScoreSum);
        XSSFCell orderDiscountSumCell = row19.getCell(10);
        orderDiscountSumCell.setCellValue(orderDiscountSum);
        XSSFCell orderPriceSumCell = row19.getCell(12);
        orderPriceSumCell.setCellValue(orderPriceSum);

        // 合计
        XSSFRow row20 = sheet.getRow(20 + offset);
        XSSFCell hbSumCell = row20.getCell(6);
        hbSumCell.setCellValue(orderHbSum + couponHbSum);
        XSSFCell scoreSumCell = row20.getCell(8);
        scoreSumCell.setCellValue(orderScoreSum + couponScoreSum);
        XSSFCell discountSumCell = row20.getCell(10);
        discountSumCell.setCellValue(orderDiscountSum + couponDiscountSum);
        XSSFCell priceSumCell = row20.getCell(12);
        priceSumCell.setCellValue(orderPriceSum + couponPriceSum);

        // 总金额/总补贴
        XSSFRow row12 = sheet.getRow(12);
        XSSFCell totalPayCell = row12.getCell(4);
        totalPayCell.setCellValue(orderPriceSum + couponPriceSum);
        XSSFCell totalDiscountCell = row12.getCell(10);
        totalDiscountCell.setCellValue(orderHbSum + orderScoreSum + orderDiscountSum + couponHbSum + couponScoreSum + couponDiscountSum);

        // sheet1: 券明细数据
        int sheetCountC = (int) Math.ceil(excelDto.getCouponCodeExcelDtoList().size() / 60000d);
        for (int j = 0; j < sheetCountC; j++) {
            int toIndex = 0;
            int fromIndex = j * 60000;
            if (j == sheetCountC - 1) {
                toIndex = excelDto.getCouponCodeExcelDtoList().size();
            } else {
                toIndex = (j + 1) * 60000;
            }

            XSSFSheet sheet1;
            if (j == 0) {
                sheet1 = work.getSheetAt(1);
            } else {
                sheet1 = work.createSheet("卡券账务明细续表-" + j);
            }

            for (int i = fromIndex; i < toIndex; i++) {
                CouponCodeExcelDto couponCodeExcelDto = excelDto.getCouponCodeExcelDtoList().get(i);
                XSSFRow row15 = sheet1.createRow(1 + i - fromIndex);

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

                XSSFCell hbDiscountType = row15.createCell(12);
                hbDiscountType.setCellValue(couponCodeExcelDto.getCouponDiscountType());

                XSSFCell scoreDiscount = row15.createCell(13);
                scoreDiscount.setCellValue(couponCodeExcelDto.getScoreAmount());

                XSSFCell discount = row15.createCell(14);
                discount.setCellValue(couponCodeExcelDto.getDiscountAmount());

                XSSFCell buyerPhone = row15.createCell(15);
                buyerPhone.setCellValue(encryptPhone(couponCodeExcelDto.getBuyerPhone()));

                XSSFCell guidePhone = row15.createCell(16);
                guidePhone.setCellValue(encryptPhone(couponCodeExcelDto.getGuidePhone()));

                XSSFCell buyerName = row15.createCell(17);
                buyerName.setCellValue(couponCodeExcelDto.getBuyerName());

                XSSFCell guideName = row15.createCell(18);
                guideName.setCellValue(couponCodeExcelDto.getGuideName());

                XSSFCell mallNameStr = row15.createCell(19);
                mallNameStr.setCellValue(couponCodeExcelDto.getMallName());

                XSSFCell shopNameStr = row15.createCell(20);
                shopNameStr.setCellValue(couponCodeExcelDto.getShopName());

                XSSFCell sourceStr = row15.createCell(21);
                sourceStr.setCellValue(couponCodeExcelDto.getSource());
            }
        }


        // sheet2: 商品订单明细数据
        int sheetCountO = (int) Math.ceil(excelDto.getOrderSettlementDetailVOList().size() / 60000d);
        for (int j = 0; j < sheetCountO; j++) {
            int toIndex = 0;
            int fromIndex = j * 60000;
            if (j == sheetCountO - 1) {
                toIndex = excelDto.getOrderSettlementDetailVOList().size();
            } else {
                toIndex = (j + 1) * 60000;
            }

            XSSFSheet sheet2;
            if (j == 0) {
                sheet2 = work.getSheetAt(2);
            } else {
                sheet2 = work.createSheet("订单账务明细续表-" + j);
            }

            for (int i = fromIndex; i < toIndex; i++) {
                OrderSettlementDetailVO orderDetail = excelDto.getOrderSettlementDetailVOList().get(i);
                XSSFRow rowOrder = sheet2.createRow(1 + i - fromIndex);
                rowOrder.setHeightInPoints(16.50F);

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

                XSSFCell hbDiscountType = rowOrder.createCell(10);
                hbDiscountType.setCellValue(orderDetail.getCouponDiscountType());

                XSSFCell channel = rowOrder.createCell(11);
                channel.setCellValue(orderDetail.getPaymentChannel());

                XSSFCell payTime = rowOrder.createCell(12);
                payTime.setCellValue(orderDetail.getPaymentTime());

                XSSFCell dlvTime = rowOrder.createCell(13);
                dlvTime.setCellValue(orderDetail.getDeliveryTime());

                XSSFCell rcptTime = rowOrder.createCell(14);
                rcptTime.setCellValue(orderDetail.getReceiptTime());

                XSSFCell phone = rowOrder.createCell(15);
                phone.setCellValue(encryptPhone(orderDetail.getBuyerPhone()));

                XSSFCell source = rowOrder.createCell(16);
                source.setCellValue(orderDetail.getOrderSource());
            }
        }


        LOGGER.info("创建对账单文件,path={}",fileFolder);
        File file = new File(fileFolder);
        if (!file.exists() && !file.isDirectory()) {
            file.mkdir();
        }
        FileOutputStream out = new FileOutputStream(pathname2);
        work.write(out);
        out.close();
    }

    /**
     * 加密手机号，中间四位显示为*
     *
     * @param phone
     * @return
     * @author erliang
     * @date 2015年12月16日
     */
    private static String encryptPhone(String phone) {
        if (phone != null && phone.length() > 8) {
            return phone.substring(0, 3) + "****" + phone.substring(7, phone.length());
        } else {
            return phone;
        }
    }

}
