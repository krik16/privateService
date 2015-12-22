/**
 * 
 */
package com.rongyi.rss.msob;

import java.util.Map;

import com.rongyi.easy.rmmm.param.MyDealParam;
import com.rongyi.easy.rmmm.vo.DetailVO;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年5月27日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年5月27日               1.0              创建文件
 */
public interface ICommodityCommissionService {
	
	/**
	 * 根据不同的佣金事件，发送不同的数据
	 * @param map {"orderNumber":"大订单号","commission":"佣金或者奖励佣金","eventType":"事件类型"}
	 * @throws Exception
	 */
	public void sendBodyByOrderEventType(Map<String,String> map) throws Exception;
	
//	/**
//	 * 我的交易金额列表
//	 * 
//	 * @return
//	 * @throws Exception
//	 */
//	public DetailVO getMyDealAmount(MyDealParam param) throws Exception;
//	
//	/**
//	 * 我的交易佣金列表
//	 * 
//	 * @return
//	 * @throws Exception
//	 */
//	public DetailVO getMyDealCommission(MyDealParam param) throws Exception;

}
