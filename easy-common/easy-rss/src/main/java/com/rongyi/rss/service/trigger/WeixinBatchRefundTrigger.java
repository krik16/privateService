/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年8月27日下午3:43:12
 * @Description: TODO
 *
 **/

package com.rongyi.rss.service.trigger;

/**	
 * @Author:  柯军
 * @Description: 微信定时批量退款 
 * @datetime:2015年8月27日下午3:43:12
 *
 **/

public interface WeixinBatchRefundTrigger {
	
	/**	
	 * @Description: 定时批量退款 	
	 * @Author:  柯军
	 * @datetime:2015年8月27日下午3:43:54
	 **/
	public abstract void batchRefundTrigger();

}
