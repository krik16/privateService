/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年7月17日下午3:04:10
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.tms.entity.CouponCommission;

/**	
 * @Author:  柯军
 * @Description: 优惠券码接口 
 * @datetime:2015年7月17日下午3:04:10
 *
 **/

public interface CouponCommissionService {
	
	/**	
	 * @Description: 通过MQ消息新增 
	 * @param messageEvent	
	 * @Author:  柯军
	 * @datetime:2015年7月17日下午3:11:50
	 **/
	public abstract void insertByMq(MessageEvent messageEvent);
	
	/**	
	 * @Description: 发送导购获得的佣金信息到虚拟账号中	
	 * @Author:  柯军
	 * @datetime:2015年7月17日下午5:06:12
	 **/
	public abstract void sendCommissionToVa();
	
	/**	
	 * @Description: 分页查询优惠券佣金列表 
	 * @param currentPage
	 * @param pageSize
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年7月17日下午5:12:52
	 **/
	public abstract List<CouponCommission> selectPageList(Integer currentPage,Integer pageSize,Map<String,Object> map);
	
	/**	
	 * @Description: 查询优惠券总数 
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年7月17日下午5:13:09
	 **/
	public abstract int selectPageListCount(Map<String,Object> map);
	
	/**	
	 * @Description: 批量更新 
	 * @param list	
	 * @Author:  柯军
	 * @datetime:2015年7月20日下午3:26:59
	 **/
	public abstract void batchUpdate(List<CouponCommission> list);

}
