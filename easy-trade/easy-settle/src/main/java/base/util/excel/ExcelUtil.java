package base.util.excel;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.rongyi.core.common.util.DateTool;
import com.rongyi.easy.coupon.entity.CouponRecord;
/**
 * 导出Excel文档工具类
 * @author lqy
 * @date 2015-05-15
 * */
public class ExcelUtil {

    /**
     * 创建excel文档，
     * @param list 数据
     * @param keys list中map的key数组集合
     * @param columnNames excel的列名
     * */
    public static Workbook createWorkBook(List<CouponRecord> list, String columnNames[]) {
        // 创建excel工作簿
        Workbook wb = new HSSFWorkbook();
        // 创建第一个sheet（页），并命名
        Sheet sheet = wb.createSheet("sheet");
        // 手动设置列宽。第一个参数表示要为第几列设；，第二个参数表示列的宽度，n为列高的像素数。
        /*for(int i=0;i<keys.length;i++){
            sheet.setColumnWidth((short) i, (short) (35.7 * 150));
        }*/

        // 创建第一行
        Row row = sheet.createRow((short) 0);

        // 创建两种单元格格式
        CellStyle cs = wb.createCellStyle();
        CellStyle cs2 = wb.createCellStyle();

        // 创建两种字体
        Font f = wb.createFont();
        Font f2 = wb.createFont();

        // 创建第一种字体样式（用于列名）
        f.setFontHeightInPoints((short) 10);
        f.setColor(IndexedColors.BLACK.getIndex());
        f.setBoldweight(Font.BOLDWEIGHT_BOLD);

        // 创建第二种字体样式（用于值）
        f2.setFontHeightInPoints((short) 10);
        f2.setColor(IndexedColors.BLACK.getIndex());

//	      Font f3=wb.createFont();
//	      f3.setFontHeightInPoints((short) 10);
//	      f3.setColor(IndexedColors.RED.getIndex());

        // 设置第一种单元格的样式（用于列名）
        cs.setFont(f);
        cs.setBorderLeft(CellStyle.BORDER_THIN);
        cs.setBorderRight(CellStyle.BORDER_THIN);
        cs.setBorderTop(CellStyle.BORDER_THIN);
        cs.setBorderBottom(CellStyle.BORDER_THIN);
        cs.setAlignment(CellStyle.ALIGN_CENTER);

        // 设置第二种单元格的样式（用于值）
        cs2.setFont(f2);
        cs2.setBorderLeft(CellStyle.BORDER_THIN);
        cs2.setBorderRight(CellStyle.BORDER_THIN);
        cs2.setBorderTop(CellStyle.BORDER_THIN);
        cs2.setBorderBottom(CellStyle.BORDER_THIN);
        cs2.setAlignment(CellStyle.ALIGN_CENTER);
        //设置列名
        for(int i=0;i<columnNames.length;i++){
            Cell cell = row.createCell(i);
            cell.setCellValue(columnNames[i]);
            cell.setCellStyle(cs);
        }
        //设置每行每列的值
        for (short i = 1; i < list.size(); i++) {
        	CouponRecord cr = list.get(i);
            // Row 行,Cell 方格 , Row 和 Cell 都是从0开始计数的
            // 创建一行，在页sheet上
            Row row1 = sheet.createRow((short) i);
            //现金券
            Cell cell = row1.createCell(0);
            cell.setCellValue(cr.getTitle() == null ? "" : cr.getTitle());
            cell.setCellStyle(cs2);
            //抵扣金额（元）
            cell = row1.createCell(1);
            cell.setCellValue((cr.getDiscount() == null ? "" : cr.getDiscount().toString()));
            cell.setCellStyle(cs2);
            //领用券码帐号
            cell = row1.createCell(2);
            cell.setCellValue((cr.getBuyerAccount() == null ? "" : cr.getBuyerAccount()));
            cell.setCellStyle(cs2);
            //状态
            cell = row1.createCell(3);
            String status = "";
            switch (cr.getStatus()) {
			case 1:
				status = "已领用";
				break;
			case 2:
				status = "已使用";
				break;
			case 3:
				status = "已过期";
				break;
			default:
				status = "";
				break;
			}
            cell.setCellValue(status);
            cell.setCellStyle(cs2);
            //领用时间
            cell = row1.createCell(4);
            cell.setCellValue(cr.getProvideTime() == null ? "" : DateTool.date2String(cr.getProvideTime(), DateTool.FORMAT_DATETIME2));
            cell.setCellStyle(cs2);
            //使用时间
            cell = row1.createCell(5);
            cell.setCellValue(cr.getUseTime() == null ? "" : DateTool.date2String(cr.getUseTime(), DateTool.FORMAT_DATETIME2));
            cell.setCellStyle(cs2);
            //订单号
            cell = row1.createCell(6);
            cell.setCellValue(cr.getOrderNo() == null ? "" : cr.getOrderNo());
            cell.setCellStyle(cs2);
            //卖家帐号
            cell = row1.createCell(7);
            cell.setCellValue(cr.getSellerAccount() == null ? "" : cr.getSellerAccount());
            cell.setCellStyle(cs2);
            //卖家姓名
            cell = row1.createCell(8);
            cell.setCellValue(cr.getSellerName() == null ? "" : cr.getSellerName());
            cell.setCellStyle(cs2);
            //卖家支付宝帐号
            cell = row1.createCell(9);
            cell.setCellValue(cr.getSellerAlipayAccount() == null ? "" : cr.getSellerAlipayAccount());
            cell.setCellStyle(cs2);
            //卖家支付宝姓名
            cell = row1.createCell(10);
            cell.setCellValue(cr.getSellerAlipayName() == null ? "" : cr.getSellerAlipayName());
            cell.setCellStyle(cs2);
            //卖家开户银行
            cell = row1.createCell(11);
            cell.setCellValue(cr.getSellerBankName() == null ? "" : cr.getSellerBankName());
            cell.setCellStyle(cs2);
            //卖家卡号
            cell = row1.createCell(12);
            cell.setCellValue(cr.getSellerBankAccount() == null ? "" : cr.getSellerBankAccount());
            cell.setCellStyle(cs2);
            //卖家持卡人姓名
            cell = row1.createCell(12);
            cell.setCellValue(cr.getSellerCardName() == null ? "" : cr.getSellerCardName());
            cell.setCellStyle(cs2);


            // 在row行上创建一个方格

            /*for(short j=0;j<columnNames.length;j++){
                Cell cell = row1.createCell(j);
                cell.setCellValue(list.get(i).get(keys[j]) == null?" ": list.get(i).get(keys[j]).toString());
                cell.setCellStyle(cs2);
            }*/
        }
        return wb;
    }

}
