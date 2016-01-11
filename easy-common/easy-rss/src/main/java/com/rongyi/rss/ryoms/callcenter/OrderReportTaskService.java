package com.rongyi.rss.ryoms.callcenter;
/**
 * 
* @ClassName: OrderReportTaskService 
* @Description: 报表定时任务service层
* @author shaozhou 
* @date 2016年1月11日 下午2:05:04
 */
public interface OrderReportTaskService {
	/**
	 * 
	* @Title: createOrderReportDay 
	* @Description: 生成每日报表数据
	* @param     设定文件 
	* @return void    返回类型 
	* @author shaozhou
	* @date 2016年1月11日 下午2:06:24
	* @throws
	 */
	public void createOrderReportDay();
}
