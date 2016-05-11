package com.rongyi.tms.excel;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.ExcelUtil;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.osm.vo.OrderCartFormVO;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.tradecenter.osm.IOrderCartService;
import com.rongyi.tms.moudle.vo.ParentOrderCartVO;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 导出购物车订单
 */
@Component
public class ExportCartOrderExcel {

    @Autowired
    private IOrderCartService iOrderCartService;


    @Autowired
    private ROAMalllifeUserService roaMalllifeUserService;


    public void exportExcel(HttpServletRequest request, HttpServletResponse response, Map<String, Object> paramsMap) {
        try {
            String path = request.getSession().getServletContext().getRealPath("/");
            InputStream myxls = new FileInputStream(path + "excel/CartOrderExcel.xlsx");
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

            List<ParentOrderCartVO> cartOrderAllList = getPageDataList(paramsMap);
            if (CollectionUtils.isNotEmpty(cartOrderAllList)) {
                for (int i = 2; i <= cartOrderAllList.size() + 2; i++) {
                    sheet.createRow(i);
                    for (int j = 0; j <= 9; j++) {
                        sheet.getRow(i).createCell(j);
                        sheet.getRow(i).getCell(j).setCellStyle(bodyStyle);
                    }
                }
                for (int i = 0; i < cartOrderAllList.size(); i++) {
                    ParentOrderCartVO vo = cartOrderAllList.get(i);
                    sheet.getRow(i + 2).getCell(0).setCellValue(vo.getOrderNo());
                    sheet.getRow(i + 2).getCell(1).setCellValue(vo.getBuyerAccount());
                    sheet.getRow(i + 2).getCell(2).setCellValue(vo.getRealAmount().toString());
                    sheet.getRow(i + 2).getCell(3).setCellValue(vo.getPayAmount().toString());
                    sheet.getRow(i + 2).getCell(4).setCellValue(vo.getStatus() != null ? convertStatus(vo.getStatus().toString()) : "其他");
//                    sheet.getRow(i + 2).getCell(5).setCellValue(convertOrderSource(vo.getOrderSource()));
                    sheet.getRow(i + 2).getCell(5).setCellValue(convertPayChannel(vo.getPayChannel()));
                    sheet.getRow(i + 2).getCell(6).setCellValue(DateTool.date2String(vo.getCreateAt(), DateTool.FORMAT_DATETIME2));
                    sheet.getRow(i + 2).getCell(7).setCellValue(DateTool.date2String(vo.getPayAt(), DateTool.FORMAT_DATETIME2));
                }
            }
            String outFile = "母订单记录_" + DateUtil.getCurrentDateYYYYMMDD() + ".xlsx";
            ExcelUtil.exportExcel(response, wb, outFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<ParentOrderCartVO> getPageDataList(Map<String, Object> paramsMap) throws Exception {
        List<ParentOrderCartVO> cartOrderAllList = new ArrayList<>();
        int pageSize = 500;
        int TOTAL_SIZE = paramsMap.containsKey("pageSize") ? Integer.valueOf(paramsMap.get("pageSize").toString()) : 5000;
        int currentPage = 1;
        for (int i = 0; i < TOTAL_SIZE / pageSize; i++) {
            paramsMap.put("pageSize", pageSize);
            paramsMap.put("currPage", currentPage);
            PagingVO<OrderCartFormVO> page = iOrderCartService.searchListByMap(paramsMap);
            List<ParentOrderCartVO> orderCartVOList = convertToOrderCart(page.getDataList());
            if (orderCartVOList != null) {
                cartOrderAllList.addAll(orderCartVOList);
                if (orderCartVOList.size() < pageSize)
                    break;
            } else
                break;
            currentPage++;
        }
        return cartOrderAllList;
    }


    private String convertPayChannel(Byte payChannel) {
        String result = "--";
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
        String result = "--";
        if (orderSource != null) {
            switch (orderSource) {
                case 0:
                    result = "微网站";
                    break;
                case 1:
                    result = "容易逛";
                    break;
                case 2:
                    result = "终端机";
                    break;
                case 3:
                    result = "其他";
                    break;
            }
        }
        return result;
    }

    private String convertStatus(String status) {
        String result = "--";
        if (StringUtils.isNotBlank(status))
            switch (status) {
                case "1":
                    result = "未付款";
                    break;
                case "2":
                    result = "已付款";
                    break;
                case "3":
                    result = "超时关闭";
                    break;
                case "4":
                    result = "买家关闭";
                    break;
                case "5":
                    result = "失效";
                    break;
            }
        return result;
    }

    private List<ParentOrderCartVO> convertToOrderCart(List<OrderCartFormVO> dataList) throws Exception {
        if (CollectionUtils.isEmpty(dataList)) {
            return null;
        }
        List<ParentOrderCartVO> orderCartVOs = new ArrayList<>();
        for (OrderCartFormVO orderCartVO : dataList) {
            ParentOrderCartVO orderCart = new ParentOrderCartVO();
            orderCart.setId(orderCartVO.getId());
            orderCart.setOrderNo(orderCartVO.getOrderNo());
            orderCart.setRealAmount(orderCartVO.getRealAmount());
            orderCart.setPayAmount(orderCartVO.getPayAmount());
            orderCart.setStatus(orderCartVO.getStatus());
//            orderCart.setOrderSource(0);
            orderCart.setPayChannel(orderCartVO.getPayChannel());
            orderCart.setCreateAt(orderCartVO.getCreateAt());
            orderCart.setPayAt(orderCartVO.getPayAt());
            UserInfoVO userInfo = roaMalllifeUserService.getByUid(orderCartVO.getBuyerId());
            if (userInfo != null) {
                orderCart.setBuyerAccount(userInfo.getUserPhone());
                orderCart.setBuyerPhone(userInfo.getUserPhone());
                orderCart.setBuyerName(userInfo.getUserName());
            }
            orderCartVOs.add(orderCart);
        }
        return orderCartVOs;
    }

}
