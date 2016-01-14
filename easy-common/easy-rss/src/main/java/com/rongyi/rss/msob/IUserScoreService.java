/**
 * 
 */
package com.rongyi.rss.msob;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年10月13日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年10月13日               1.0              创建文件
 */
public interface IUserScoreService {
	
	/**
	 * 获得卖家评分
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public Double getScore(Integer userId) throws Exception;

}
