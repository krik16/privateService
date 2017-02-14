package com.rongyi.tms.excel;

import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.ExcelUtil;
import com.rongyi.core.util.AmountConversion;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.rss.coupon.RoaCouponService;
import com.rongyi.tms.Exception.BizException;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.moudle.vo.CouponOrderVO;
import com.rongyi.tms.service.CouponOrderService;
import com.rongyi.tms.util.DisCountMap;
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
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 导出卡券订单
 */
@Component
public class ExportCouponOrderExcel {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExportCouponOrderExcel.class);
    @Autowired
    CouponOrderService couponOrderService;

    @Autowired
    RoaCouponService roaCouponService;

    public void exportExcel(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
        try {
            String path = request.getSession().getServletContext().getRealPath("/");
            InputStream myxls = new FileInputStream(path + "excel/CouponOrderExcel.xlsx");
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
            List<CouponOrderVO> list = couponOrderService.selectPageList(null, null, map);
            if (list.size() > 5000) {
                throw new BizException(ConstantEnum.EXCEPTION_LIMIT_COUNT.getCodeStr(), ConstantEnum.EXCEPTION_LIMIT_COUNT.getValueStr());
            }
            if (CollectionUtils.isNotEmpty(list)) {
                for (int i = 2; i <= list.size() + 2; i++) {
                    sheet.createRow(i);
                    for (int j = 0; j <= 16; j++) {
                        sheet.getRow(i).createCell(j);
                        sheet.getRow(i).getCell(j).setCellStyle(bodyStyle);
                    }
                }
                CouponOrderVO detailVo;
                for (int i = 0; i < list.size(); i++) {
                    CouponOrderVO vo = list.get(i);
                    sheet.getRow(i + 2).getCell(0).setCellValue(vo.getOrderNo());
                    sheet.getRow(i + 2).getCell(1).setCellValue(vo.getUserPhone());
                    try {
                        Coupon coupon = roaCouponService.getCouponById(vo.getCouponId());
                        if (coupon != null) {
                            sheet.getRow(i + 2).getCell(2).setCellValue(coupon.getCreateUser());
                            sheet.getRow(i + 2).getCell(4).setCellValue(AmountConversion.fenToYuan(coupon.getOrigPrice()));
                        }
                    } catch (Exception e) {
                        LOGGER.warn("roaCouponService.getCouponById provide fail,ignore...errMsg={}", e.getMessage());
                    }

                    sheet.getRow(i + 2).getCell(3).setCellValue(vo.getTitle());
                    sheet.getRow(i + 2).getCell(5).setCellValue(vo.getTotalAmount());
                    //平台补贴红包
                    if (vo.getHbDiscount() != null && vo.getCouponDiscountType() == 0) {
                        sheet.getRow(i + 2).getCell(6).setCellValue(new BigDecimal(vo.getHbDiscount()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).toString());
                    } else {
                        sheet.getRow(i + 2).getCell(6).setCellValue("0.00");
                    }
                    //商家补贴红包
                    if (vo.getHbDiscount() != null && vo.getCouponDiscountType() == 1) {
                        sheet.getRow(i + 2).getCell(7).setCellValue(new BigDecimal(vo.getHbDiscount()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).toString());
                    } else {
                        sheet.getRow(i + 2).getCell(7).setCellValue("0.00");
                    }

                    if (vo.getDiscountBitmap() > 0) {
                        detailVo = couponOrderService.selectById(vo.getId().intValue());
                        if (DisCountMap.hasRebate(vo.getDiscountBitmap()) && detailVo.getRebateDiscount() > 0) {
                            sheet.getRow(i + 2).getCell(8).setCellValue(detailVo.getRebateDiscount());
                        } else {
                            sheet.getRow(i + 2).getCell(8).setCellValue("0.00");
                        }

                        if (vo.getCouponDiscountType() == 1) {
                            sheet.getRow(i + 2).getCell(9).setCellValue("商家");
                        } else {
                            sheet.getRow(i + 2).getCell(9).setCellValue("平台");
                        }

                        if (DisCountMap.hasUsedScore(vo.getDiscountBitmap()) && vo.getScore() > 0) {
                            sheet.getRow(i + 2).getCell(10).setCellValue(new BigDecimal(vo.getScore()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).toString());
                        } else {
                            sheet.getRow(i + 2).getCell(10).setCellValue("0.00");
                        }
                    } else {
                        sheet.getRow(i + 2).getCell(8).setCellValue("0.00");
                        sheet.getRow(i + 2).getCell(9).setCellValue("平台");
                        sheet.getRow(i + 2).getCell(10).setCellValue("0.00");
                    }
                    sheet.getRow(i + 2).getCell(11).setCellValue(vo.getPayAmount());
                    sheet.getRow(i + 2).getCell(12).setCellValue(convertStatus(vo.getStatus()));
                    sheet.getRow(i + 2).getCell(13).setCellValue(convertOrderSource(vo.getSource()));
                    sheet.getRow(i + 2).getCell(14).setCellValue(convertPayChannel(vo.getPayChannel()));
                    sheet.getRow(i + 2).getCell(15).setCellValue(DateTool.date2String(vo.getCreateAt(), DateTool.FORMAT_DATETIME2));
                }
            }
            String outFile = "卡券订单记录_" + DateUtil.getCurrentDateYYYYMMDD() + ".xlsx";
            ExcelUtil.exportExcel(response, wb, outFile);
        } catch (BizException biz) {
            throw biz;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private String convertPayChannel(Integer payChannel) {
        String result = "其他";
        if (payChannel != null) {
            switch (payChannel) {
                case 1:
                case 3:
                    result = "支付宝";
                    break;
                case 5:
                    result = "微信";
                    break;
            }
        }
        return result;
    }

    private String convertOrderSource(Integer orderSource) {
        String result = "其他";
        if (orderSource != null) {
            switch (orderSource) {
                case 0:
                    result = "容易逛";
                    break;
                case 1:
                    result = "微网站";
                    break;
                case 2:
                    result = "终端机";
                    break;
            }
        }
        return result;
    }

    private String convertStatus(Byte status) {
        String result = "其他";
        if (status != null) {
            switch (status) {
                case 0:
                    result = "待付款";
                    break;
                case 1:
                    result = "已付款";
                    break;
                case 2:
                    result = "已取消";
                    break;
                case 3:
                    result = "已删除";
                    break;
                case 4:
                    result = "退款中";
                    break;
                case 5:
                    result = "已退款";
                    break;
            }
        }
        return result;
    }
}
