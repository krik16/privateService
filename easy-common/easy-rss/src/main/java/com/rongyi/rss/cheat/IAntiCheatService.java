/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年8月13日下午3:01:46
 * @Description: TODO
 *
 **/

package com.rongyi.rss.cheat;

import java.util.Map;


/**	
 * @Author:  柯军
 * @Description: 反作弊提供接口 
 * @datetime:2015年8月13日下午3:01:46
 *
 **/

public interface IAntiCheatService {
	

	/**
	 * @Description:验证账号是否已加入黑名单
	 * @param payAccout 支付账号
	 * @param payType 支付类型（0:支付宝，1:微信）
	 * @param status 是否冻结（0：整除，1：冻结）
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年8月12日下午7:46:00
	 **/
	public abstract boolean valdateAccountInBlackList(String payAccout, Byte payType,Byte status);
	
	
	/**	
	 * @Description: 分页获取黑名单列表 
	 * @param currentPage
	 * @param pageSize
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年8月14日上午9:54:12
	 **/
	public abstract Map<String,Object> getPageMap(Integer currentPage, Integer pageSize, Map<String, Object> map);
	
	/**	
	 * @Description: 冻结黑名单账号 
	 * @param ids
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年8月14日上午11:35:09
	 **/
	public abstract Map<String,Object> updateFrozenAccount(String[] ids,Byte status);
}
