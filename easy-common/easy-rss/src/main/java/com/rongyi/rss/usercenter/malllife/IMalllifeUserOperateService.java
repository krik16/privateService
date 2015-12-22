/**
 * 
 */
package com.rongyi.rss.usercenter.malllife;

import java.util.List;

import com.rongyi.easy.rmmm.entity.MalllifeUserOperateEntity;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：用户操作我的代金券、红包、抵扣券记录
 * time ：2015年11月24日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月24日               1.0              创建文件
 */
public interface IMalllifeUserOperateService {
	
	/**
	 * 添加操作记录
	 * @param userId
	 * @param type
	 */
	public void addUserOperateEntity(String userId,Integer type)  throws Exception;
	
	/**
	 * 查询操作记录
	 * @param userId
	 * @param type
	 * @return
	 */
	public MalllifeUserOperateEntity getUserOperateEntityByUserId(String userId,Integer type)  throws Exception;
	
	/**
	 * 查询操作记录
	 * @param userId
	 * @param type
	 * @return
	 */
	public List<MalllifeUserOperateEntity> getUserOperateEntityByUserId(String userId)  throws Exception;
	
	/**
	 * 修改操作记录
	 * @param userId
	 * @param type
	 */
	public void updateUserOperateEntity(String userId,Integer type)  throws Exception;

}
