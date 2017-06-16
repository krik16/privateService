/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月27日下午5:25:59
 * @Description: TODO
 *
 **/

package com.rongyi.core.common.util;

import org.apache.poi.ss.usermodel.Workbook;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

/**	
 * @Author:  柯军
 * @Description: 报表导出工具类
 * @datetime:2015年5月27日下午5:25:59
 *
 **/

public class ExcelUtil {

    public static void exportExcel(HttpServletResponse response, Workbook wb, 
            String fileName) throws IOException { 
        // 如果文件名有中文，必须URL编码 
        fileName = URLEncoder.encode(fileName, "UTF-8"); 
        response.reset(); 
        // ContentType 可以不设置 
        response.setContentType("application/vnd.ms-excel;charset=UTF-8"); 
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName); 
        wb.write(response.getOutputStream()); 
        response.getOutputStream().flush(); 
        response.getOutputStream().close();
    }


    public static void exportSSHExcel(HttpServletResponse response, Workbook wb,
                                   String fileName) {
        try{
            // 如果文件名有中文，必须URL编码
            fileName = URLEncoder.encode(fileName, "UTF-8");
            response.reset();
            // ContentType 可以不设置
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
            wb.write(response.getOutputStream());
            response.getOutputStream().flush();
            response.getOutputStream().close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void exportSSHFExl(HttpServletResponse response, Workbook wb,
                                     String fileName) throws IOException {
        OutputStream os = null;
        try {
            fileName = URLEncoder.encode(fileName, "UTF-8");
            response.setContentType("application/force-download"); // 设置下载类型
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName); // 设置文件的名称
            os = response.getOutputStream(); // 输出流
            wb.write(os);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
