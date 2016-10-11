/**   
* @Title: ExcelFileUtil.java 
* @Package com.rongyi.settle.util 
* @Description: TODO
* @author ZhengYl   
* @date 2015年12月10日 上午10:56:27 
* @version V1.0   
*/
package com.rongyi.settle.util;

import com.rongyi.core.common.PropertyConfigurer;

import java.util.Date;

/**
 * @author ZhengYl
 *
 */
public class ReportFilesUtil {

	/**
	 * 获取报表文件的完整路径
	 * 
	 * @param name
	 *            报表文件名title
	 * @param date
	 *            日期
	 * @param propertyConfigurer
	 *            配置
	 * @param businessId
	 *            报表收件单位的Id，作为报表文件存放的子文件夹
	 * @return
	 */
	public static String getSettlememtExcelFilePath(String name, Date date, PropertyConfigurer propertyConfigurer, String businessId,String ruleCode) {
		String dateStr = DateUtils.getDateStr(date);
		String fileName = "容易网商户对账单-" + name.replaceAll(" ","").trim() + "-" + ruleCode.trim() + "-" + dateStr + ".xlsx";

		String fileFolder = propertyConfigurer.getProperty("settle.file.path") + businessId;
		String pathname = fileFolder + "/" + fileName;

		return pathname;
	}

	/**
	 * 获取报表文件的文件名 
	 * 
	 * @param name
	 * @param date
	 * @return
	 */
	public static String getFileName(String name, String date) {
		return "容易网商户对账单-" + name + "-" + date + ".xlsx";
	}
	
}
