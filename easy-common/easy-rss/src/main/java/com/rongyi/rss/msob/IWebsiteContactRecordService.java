/**
 * 
 */
package com.rongyi.rss.msob;

import com.rongyi.easy.usercenter.entity.WebsiteContactRecordEntity;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：官网联系我们
 * time ：2016年9月13日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年9月13日               1.0              创建文件
 */
public interface IWebsiteContactRecordService {
	
	/**
	 * 添加联系我们记录
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	public boolean addContactRecord(WebsiteContactRecordEntity entity) throws Exception;

}
