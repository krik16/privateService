/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月6日下午4:37:04
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.tms.entity.InviteCommission;

/**	
 * @Author:  柯军
 * @Description: 邀请佣金接口 
 * @datetime:2015年9月6日下午4:37:04
 *
 **/

public interface InviteCommissionService {
	
	/**	
	 * @Description: 新增 
	 * @param inviteCommission	
	 * @Author:  柯军
	 * @datetime:2015年9月6日下午4:37:59
	 **/
	public abstract void insert(InviteCommission inviteCommission);
	
	/**	
	 * @Description: 更新 
	 * @param inviteCommission	
	 * @Author:  柯军
	 * @datetime:2015年9月6日下午4:38:47
	 **/
	public abstract void update(InviteCommission inviteCommission);
	
	/**	
	 * @Description: 分页查询 
	 * @param currentPage
	 * @param pageSize
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月6日下午4:40:54
	 **/
	public abstract List<InviteCommission> selectPageList(Integer currentPage,Integer pageSize,Map<String,Object> map);
	
	/**	
	 * @Description: 分页查询总记录数 
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月6日下午4:41:58
	 **/
	public abstract Integer selectPageListCount(Map<String,Object> map);
	
	/**	
	 * @Description: 根据MQ消息插入待审邀请佣金 
	 * @param messageEvent	
	 * @Author:  柯军
	 * @datetime:2015年9月6日下午5:01:10
	 **/
	public abstract void insertByMQ(MessageEvent messageEvent);
	
}
