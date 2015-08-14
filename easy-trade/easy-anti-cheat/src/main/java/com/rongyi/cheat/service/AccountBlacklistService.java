/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年8月12日上午10:25:55
 * @Description: TODO
 *
 **/

package com.rongyi.cheat.service;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.cheat.AccountBlacklist;

/**
 * @Author: 柯军
 * @Description: 黑名单列表接口
 * @datetime:2015年8月12日上午10:25:55
 * 
 **/

public interface AccountBlacklistService {

	/**
	 * @Description: 新增
	 * @param blackRoll
	 * @Author: 柯军
	 * @datetime:2015年8月12日上午10:29:37
	 **/
	public abstract void insert(AccountBlacklist accountBlacklist);

	/**
	 * @Description: 更新
	 * @param accountBlacklist
	 * @Author: 柯军
	 * @datetime:2015年8月12日上午10:29:47
	 **/
	public abstract void update(AccountBlacklist accountBlacklist);

	/**
	 * @Description: 查询账号记录
	 * @param payAccout
	 * @param payType
	 * @param status
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年8月12日下午7:46:00
	 **/
	public AccountBlacklist selectByPayAccount(String payAccout, Byte payType,Byte status);

	/**
	 * @Description: 检查支付账号是否满足加入黑名单条件
	 * @param map
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年8月12日下午12:03:00
	 **/
	public abstract void valadatePayAccount(Map<String, Object> map);
	
	
	/**	
	 * @Description: 分页查询黑名单列表 
	 * @param currentPage
	 * @param pageSize
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年8月13日下午7:40:03
	 **/
	public abstract Map<String,Object> selectPageList(Integer currentPage,Integer pageSize,Map<String,Object> map);
	
}
