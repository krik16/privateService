/**
 * 
 */
package com.rongyi.rss.malllife.service;

import com.rongyi.easy.entity.UserPopEntity;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：验码成功弹窗记录 
 * time ：2015年8月17日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年8月17日               1.0              创建文件
 */
public interface IUserPopService {
	

	/**
	 * 添加弹窗记录
	 * @param userId
	 * @param shopMid
	 * @throws Exception
     */
	public void addUserPop(String userId, String shopMid) throws Exception;
	
	/**
	 * 查询弹窗记录
	 * @param userId
	 * @param shopMid
	 * @return
	 * @throws Exception
	 */
	public UserPopEntity selectUserPop(String userId, String shopMid) throws Exception;

}
