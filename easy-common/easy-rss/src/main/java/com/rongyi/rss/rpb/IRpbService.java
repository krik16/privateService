/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年6月4日下午2:55:06
 * @Description: TODO
 *
 **/

package com.rongyi.rss.rpb;

import java.util.Map;

import com.rongyi.easy.rpb.domain.PaymentLogInfo;

/**
 * @Author: 柯军
 * @Description: 支付账单系统接口
 * @datetime:2015年6月4日下午2:55:06
 * 
 **/

public interface IRpbService {
    /**
     * @Description: 根据付款单id验证打款账号是否被禁用
     * @param paymentIds 多个付款单号用逗号隔开
     * @return
     * @Author: 柯军
     * @datetime:2015年6月4日下午3:46:18
     **/
    public Map<Integer,String> validateAccount(String paymentIds) throws Exception;
    
    /**	
     * @Description: 根据交易流水号查询对应的付款记录
     * @param id
     * @return	
     * @Author:  柯军
     * @datetime:2015年6月11日下午3:48:36
     **/
    public PaymentLogInfo selectByTradeNo(String tradeNo);

	/**
	 * @Description: 收到操作微信退款
	 * @param id
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年7月12日下午1:12:12
	 **/
	public abstract Map<String, Object> operateWeixinRefund(Integer id);
    
}
