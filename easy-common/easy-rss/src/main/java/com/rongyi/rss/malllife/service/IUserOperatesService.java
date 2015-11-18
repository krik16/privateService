/**
 * 
 */
package com.rongyi.rss.malllife.service;

import java.util.Date;
import java.util.Map;

import com.rongyi.easy.entity.UserOperateEntity;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年11月18日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月18日               1.0              创建文件
 */
public interface IUserOperatesService {
	
	/**
	 * 修改操作记录
	 * @param userId
	 * @param type
	 */
	public void updateUserOperateEntity(String userId,String type)  throws Exception;
	
	/**
	 * 查询操作记录
	 * @param userId
	 * @param type
	 * @return
	 */
	public UserOperateEntity getUserOperateEntityByUserId(String userId,String type)  throws Exception;
	
	/**
	 * 查询操作记录时间
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public Map<String,Date> getUserOperateDate(String userId) throws Exception ;

}
